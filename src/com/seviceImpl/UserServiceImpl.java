package com.seviceImpl;

import java.util.List;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.saveUser(user);
		
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAllUsers();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		this.userDao.removeUser(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateUser(user);
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.findUserById(id);
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.loginUser(user);
	}

}
