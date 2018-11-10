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

public class OrderServiceAction extends ActionSupport{
	private Room room;
	private RoomService roomService;
	private OrderService orderService;
	private String message;
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
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
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		List <Order>orders=this.orderService.getUserOrder(user);
		List<Room> rooms=new ArrayList<Room>();
		if(orders.size()>0) {
			for(Order order:orders) {
				rooms.add((Room)this.roomService.findRoomById(order.getRoomid()));
			}
			
		}
		Map requestList=(Map) ActionContext.getContext().get("request");
		requestList.put("listUserRoom", rooms);
		return SUCCESS;
		
	}
	public String delete() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		Order order= this.orderService.findOrderByUseridAndRoomid(user.getUserid(), room.getRoomid());
		this.orderService.removeOrder(order);
		Room roomUser=this.roomService.findRoomById(room.getRoomid());
		roomUser.setStatus(0);
		this.roomService.updateRoom(roomUser);
		
		message = "退订房间成功。";
		return "delSuc";
		
	}
		

}
