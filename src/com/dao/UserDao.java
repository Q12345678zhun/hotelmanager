package com.dao;

import java.util.List;

import com.bean.User;

public interface UserDao {
	public void saveUser(User user);//����ͻ���Ϣ
	public List<User> findAllUsers();//�������пͻ�
	public void removeUser(User user);//ɾ���ͻ���Ϣ
	public void updateUser(User user);//�޸Ŀͻ���Ϣ
	public User findUserById(Integer id);//��idֵ����ָ���ͻ�
	public User loginUser(User user);//�ͻ���¼
	
	

}
