package com.comtrollers;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.sql.Result;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.dao.LoginDetailsDao;
import com.dao.UserInfoDao;
import com.entity.LoginDetails;
import com.entity.UserInfo;

@Controller
public class Mycontroller {
	@Autowired
	private LoginDetailsDao logindao;
	@Autowired
	private UserInfoDao users;
	@RequestMapping("/form")
	public String form(@ModelAttribute User user) {
		return "Register";
	}
	@RequestMapping(path="/view",method = RequestMethod.POST	)
	public String viewto(@RequestParam("loginid") int id,Model model) {
		LoginDetails logind= logindao.fetch(id);
		UserInfo infos=users.fetch(id);
		model.addAttribute("login", logind);
		model.addAttribute("info",infos);
		return "viewto";
	}
	@RequestMapping(path="/registerform", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute User user,BindingResult result,HttpSession session,Model model) {
		if(result.hasErrors()) {
			System.out.println("my form  has errors");
			List<ObjectError> list=result.getAllErrors();
			for (ObjectError objectError : list) {
				System.out.println(objectError);
			}
			return "Register";
		}
		else {
			System.out.println(user.getFilename().getSize());
			System.out.println(user.getFilename().getContentType());
			System.out.println(user.getFilename().getName());
			System.out.println(user.getFilename().getOriginalFilename());
			System.out.println(user.getFilename().getStorageDescription());
			byte[] data=user.getFilename().getBytes();
			//we have to save this file to server
			String path=session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+user.getFilename().getOriginalFilename();
			System.out.println(path);
			try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded");
			model.addAttribute("filename",user.getFilename().getOriginalFilename());
			}catch (Exception e) {
				System.out.println(e);
			}
			UserInfo userInfo=new UserInfo(user.getUser_lastname(),user.getUser_email(),user.getUser_address(),user.getUser_number(),user.getFilename().getOriginalFilename());
			users.insert(userInfo);
			LoginDetails login=new LoginDetails(user.getUser_name(),user.getUser_password(),userInfo);
			logindao.insert(login);
			model.addAttribute("loginid",login.getId());
		}
		return "success";
	}
	
		
}
