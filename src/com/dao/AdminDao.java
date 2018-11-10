package com.dao;

import java.util.List;

import com.bean.Admin;

public interface AdminDao {
	//更新update，删除removeAdmin，更新updateAdmin使用的是void，查找用的是admin
	public void saveAdmin(Admin admin);//保存管理员信息
	public List<Admin> findAllAdmin();//查找所有管理员信息
	public void removeAdmin(Admin admin);//删除管理员信息
	public void updateAdmin(Admin admin);//更新管理员信息
	public Admin findAdminById(Integer id);//按id查找指定的管理员
	public Admin loginAdmin(Admin admin);//管理员登录

}
