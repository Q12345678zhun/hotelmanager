package com.bean;

public class Order {
	//订单把房间号（表room）与人（表user）对应起来
	private int orderid;//订单id
	private int roomid;//房间id
	private int userid;//用户id
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	

}
