package com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.User;
import com.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
		
		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		String hql="from User user";
		
		return (List<User>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
		
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		
		return (User)this.getHibernateTemplate().get(User.class,id);
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		String hql="from User user where user.username='"+user.getUsername()+"'and user.password='"+user.getPassword()+"'";
		List<User> users=this.getHibernateTemplate().find(hql);
		if(users.size()>0) {
			return users.get(0);
		}
		return null;
	}

}
