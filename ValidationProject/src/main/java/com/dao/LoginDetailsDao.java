package com.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.entity.LoginDetails;
@Component
public class LoginDetailsDao {
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernatetemplate) {
		this.hibernateTemplate = hibernatetemplate;
	}
	@Transactional
	public int insert(LoginDetails user) {
	Integer i=(Integer)this.hibernateTemplate.save(user);
	return i;
		
	}
	@Transactional
	public LoginDetails fetch(int loginid) {
		LoginDetails login=this.hibernateTemplate.get(LoginDetails.class, loginid);
		return login;
	}
}
