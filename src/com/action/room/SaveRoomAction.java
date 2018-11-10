package com.action.room;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.bean.Room;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;

public class SaveRoomAction extends ActionSupport{
	private Room room;
	private RoomService roomService;
    
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
	public String execute() throws Exception{
		this.roomService.saveRoom(room);
		return SUCCESS;
	}

}
