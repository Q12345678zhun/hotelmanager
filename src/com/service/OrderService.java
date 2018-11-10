package com.service;

import java.util.List;

import com.bean.Order;
import com.bean.User;

public interface OrderService {
	
	public void saveOrder(Order order);
	public List<Order>findAllOrder();//��ѯ����Ԥ������
	public void removeOrder(Order order);//ȡ��Ԥ������
	public void updateOrder(Order order);//�޸�Ԥ������
	public Order findOrderById(Integer id);//��id����ָ��Ԥ������
	public List<Order> getUserOrder(User user);//����ָ���û��Ķ���
	public Order findOrderByUseridAndRoomid(int userid,int roomid);//���û���ʶ�ͷ���Ų��Ҷ���

}
