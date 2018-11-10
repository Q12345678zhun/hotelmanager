package com.seviceImpl;

import java.util.List;

import com.bean.Order;
import com.bean.User;
import com.dao.OrderDao;
import com.service.OrderService;

public class OrderServiceImpl implements OrderService{
	private OrderDao orderDao;
	

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.saveOrder(order);
		
	}

	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		return this.orderDao.findAllOrder();
	}

	@Override
	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.removeOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.updateOrder(order);
		
	}

	@Override
	public Order findOrderById(Integer id) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrderById(id);
	}

	@Override
	public List<Order> getUserOrder(User user) {
		// TODO Auto-generated method stub
		return this.orderDao.getUserOrder(user);
	}

	@Override
	public Order findOrderByUseridAndRoomid(int userid, int roomid) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrderByUseridAndRoomid(userid, roomid);
	}

}
