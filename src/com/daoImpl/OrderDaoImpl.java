package com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Order;
import com.bean.User;
import com.dao.OrderDao;

public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao{

	@Override
	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(order);
		
	}

	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		String hql="from Order order";
		return (List<Order>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(order);
		
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(order);
		
	}

	@Override
	public Order findOrderById(Integer id) {
		// TODO Auto-generated method stub
		return (Order)this.getHibernateTemplate().get(Order.class,id);
	}

	@Override
	public List<Order> getUserOrder(User user) {
		// TODO Auto-generated method stub
		String hql="from Order order where order.userid='"+user.getUserid()+"'";
		return (List<Order>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public Order findOrderByUseridAndRoomid(int userid, int roomid) {
		// TODO Auto-generated method stub
		String hql="from Order order where order.userid='"+userid+"'and order.roomid='"+roomid+"'";
		List<Order> orders=this.getHibernateTemplate().find(hql);
		return orders==null?null:orders.get(0);
	}

}
