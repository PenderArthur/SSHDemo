package com.blog;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.TextDAO;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
@Component
public class Text extends ActionSupport {
	@Resource private TextDAO textDAO;
	public String execute(){
		textDAO.save(new User("123","123",(short) 1));
		System.out.println("text");
		return SUCCESS;
	}

}
