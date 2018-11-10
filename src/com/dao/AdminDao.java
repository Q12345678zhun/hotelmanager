package com.dao;

import java.util.List;

import com.bean.Admin;

public interface AdminDao {
	//����update��ɾ��removeAdmin������updateAdminʹ�õ���void�������õ���admin
	public void saveAdmin(Admin admin);//�������Ա��Ϣ
	public List<Admin> findAllAdmin();//�������й���Ա��Ϣ
	public void removeAdmin(Admin admin);//ɾ������Ա��Ϣ
	public void updateAdmin(Admin admin);//���¹���Ա��Ϣ
	public Admin findAdminById(Integer id);//��id����ָ���Ĺ���Ա
	public Admin loginAdmin(Admin admin);//����Ա��¼

}
