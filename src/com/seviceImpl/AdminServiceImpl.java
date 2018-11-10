package com.seviceImpl;

import java.util.List;

import com.bean.Admin;
import com.dao.AdminDao;
import com.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;
	public AdminDao getAdminDao() {
		return adminDao;
	}
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	public List<Admin> findAllAdmin() {
		return this.adminDao.findAllAdmin();
	}
	public Admin findUserById(Integer id) {
		return this.adminDao.findAdminById(id);
	}
	public void removeAdmin(Admin admin) {
		this.adminDao.removeAdmin(admin);	}
	public void saveAdmin(Admin admin) {
		this.adminDao.saveAdmin(admin);
	}
	public void updateAdmin(Admin admin) {
		this.adminDao.updateAdmin(admin);
	}
	public Admin loginAdmin(Admin admin) {
		return this.adminDao.loginAdmin(admin);
	}
}
