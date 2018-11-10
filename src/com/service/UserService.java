package com.service;

import java.util.List;

import com.bean.User;

public interface UserService {
	public void saveUser(User user);//保存客户信息
	public List<User> findAll();//查找所有客户
	public void delete(User user);//删除客户信息
	public void update(User user);//修改客户信息
	public User findById(Integer id);//按id值查找指定客户
	public User loginUser(User user);//客户登录

}
