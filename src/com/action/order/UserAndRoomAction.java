package com.action.order;



import java.util.List;
import java.util.Map;

import com.bean.Order;
import com.bean.Room;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;
import com.service.RoomService;

public class UserAndRoomAction extends ActionSupport{
	private Room room;
	private Order order;
	private RoomService roomService;
	private OrderService orderService;
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
	public String execute() throws Exception{
		List <Order> orders=this.orderService.findAllOrder();
		
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list", orders);
		return SUCCESS;
		
	}

}
