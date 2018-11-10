package com.action.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bean.Order;
import com.bean.Room;
import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;
import com.service.RoomService;
import com.service.UserService;

public class ListOrderAction extends ActionSupport{
	private User user;
	private Room room;
	private Order order;
	private RoomService roomService;
	private OrderService orderService;
	private UserService userService;
    private String  message;
    
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		
		this.room = room;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() throws Exception{
		
		//得到所有用户的订单
		List <Order> orders=(List<Order>) this.orderService.findAllOrder();
				//先构建一个数组rooms，里面存放订单的roomid   所对应的房间信息。
		List<Room>rooms=new ArrayList<Room>();
		if(orders.size()>0) {
			for(Order order:orders) {
			rooms.add((Room)this.roomService.findRoomById(order.getRoomid()));
					
			}
		}
		Map requestList=(Map) ActionContext.getContext().get("request");
		requestList.put("list", rooms);
		return SUCCESS;
	}
	

}
