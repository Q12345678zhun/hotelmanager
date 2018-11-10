package com.dao;

import java.util.List;

import com.bean.User;

public interface UserDao {
	public void saveUser(User user);//保存客户信息
	public List<User> findAllUsers();//查找所有客户
	public void removeUser(User user);//删除客户信息
	public void updateUser(User user);//修改客户信息
	public User findUserById(Integer id);//按id值查找指定客户
	public User loginUser(User user);//客户登录
	
	

}
