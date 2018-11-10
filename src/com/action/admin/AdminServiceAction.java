package com.action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;

public class AdminServiceAction extends ActionSupport{
	private Admin admin;
	private AdminService adminSer;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminService getAdminSer() {
		return adminSer;
	}
	public void setAdminService(AdminService adminSer) {
		this.adminSer = adminSer;
	}
	public String execute() throws Exception{
		return super.execute();
		
	}
	public String login() {
		Admin adminLogin=this.adminSer.loginAdmin(this.admin);
		if(adminLogin!=null) {
			HttpServletRequest request=ServletActionContext.getRequest();
			HttpSession session=request.getSession();
		
			session.setAttribute("admin", adminLogin);
			return "loginSuc";		
		
		}
		return INPUT;
		
	}
	public String loginOut() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.removeAttribute("admin");
		return INPUT;
		
	}
}
	


