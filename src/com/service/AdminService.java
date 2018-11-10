package com.service;

import java.util.List;

import com.bean.Admin;

public interface AdminService {
	public void saveAdmin(Admin admin);
	public List<Admin> findAllAdmin();
	public void removeAdmin(Admin admin);
	public void updateAdmin(Admin admin);
	public Admin findUserById(Integer id);
	public Admin loginAdmin(Admin admin);
}


