package com.action.room;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;

public class ListRoomAction extends ActionSupport{
	private RoomService roomService;

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	public String execute() throws Exception{
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list", this.roomService.findAllRoom());
		return SUCCESS;
		
	}
	

}
