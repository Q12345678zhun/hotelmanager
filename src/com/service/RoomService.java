package com.service;

import java.util.List;

import com.bean.Room;

public interface RoomService {
	public void saveRoom(Room room);
	public List<Room> findAllRoom();
	public void removeRoom(Room room);
	public void updateRoom(Room room);
	public Room findRoomById(Integer id);

	

}
