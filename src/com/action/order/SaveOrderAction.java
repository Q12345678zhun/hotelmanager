package com.action.order;

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

public class SaveOrderAction extends ActionSupport{
	private User user;
	private Room room;
	private Order order;
	private RoomService roomService;
	private OrderService orderService;
	private String message;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
		//先获取所有的房间
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list", this.roomService.findAllRoom());
		return SUCCESS;
		
	}
	
	public String add() throws Exception{
		Room roomUser=this.roomService.findRoomById(room.getRoomid());
		if(roomUser.getStatus()==0) {
			HttpServletRequest request=ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			User user=(User) session.getAttribute("user");
			order.setUserid(user.getUserid());
			this.orderService.saveOrder(order);
			roomUser.setStatus(1);
			this.roomService.updateRoom(roomUser);
			return "addSuc";
			
		}else {
			message = "该房间已经有客人入住了。";
			return "addFail";
		}
		
	}
	
	
	
	
	

}
