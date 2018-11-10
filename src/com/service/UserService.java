package com.service;

import java.util.List;

import com.bean.User;

public interface UserService {
	public void saveUser(User user);//����ͻ���Ϣ
	public List<User> findAll();//�������пͻ�
	public void delete(User user);//ɾ���ͻ���Ϣ
	public void update(User user);//�޸Ŀͻ���Ϣ
	public User findById(Integer id);//��idֵ����ָ���ͻ�
	public User loginUser(User user);//�ͻ���¼

}
