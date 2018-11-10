package com.action.user;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
@SuppressWarnings("serial")
public class ListUserAction extends ActionSupport{
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception{
		//List <User>list=this.userService.findAll();
		//HttpServletRequest request=ServletActionContext.getRequest();
		//HttpSession session=request.getSession();
		//session.setAttribute("user",list);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("list", this.userService.findAll());
		return SUCCESS;
	}
	

}
