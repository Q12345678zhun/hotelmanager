package com.dao;

import java.util.List;

import com.bean.Order;
import com.bean.User;

public interface OrderDao {
	public void saveOrder(Order order);//保存预订房间信息
	public List<Order>findAllOrder();//查询所有预定订单
	public void removeOrder(Order order);//取消预订订单
	public void updateOrder(Order order);//修改预订订单
	public Order findOrderById(Integer id);//按id查找指定预订订单
	public List<Order> getUserOrder(User user);//查找指定用户的订单
	public Order findOrderByUseridAndRoomid(int userid,int roomid);//按用户标识和房间号查找订单
	

}
