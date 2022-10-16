package com.dao;

import javax.transaction.Transactional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.comtrollers.User;
import com.entity.UserInfo;
import com.entity.LoginDetails;
@Component
@ComponentScan
public class UserInfoDao {
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernatetemplate) {
		this.hibernateTemplate = hibernatetemplate;
	}
	@Transactional
	public int insert(UserInfo user ) {
	Integer i=(Integer)this.hibernateTemplate.save(user);
	return i;
		
	}
	@Transactional
	public UserInfo fetch(int loginid) {
		UserInfo info=this.hibernateTemplate.get(UserInfo.class, loginid);
		return info;
	}
}
