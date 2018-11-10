package com.action.admin;

import com.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;

public class SaveAdminAction extends ActionSupport{
	private Admin admin;
	private AdminService adminService;
	public Admin getAdmin()  {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String execute() throws Exception{
		this.adminService.saveAdmin(admin);
		return SUCCESS;
	}
	

}
