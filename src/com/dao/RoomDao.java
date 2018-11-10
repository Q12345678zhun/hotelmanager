package com.dao;

import java.util.List;

import com.bean.Room;

public interface RoomDao {
	public void saveRoom(Room room);//保存房间信息
	public List<Room>findAllRoom();//查找所有房间信息
	public void removeRoom(Room room);//陕厨房间信息
	public void update(Room room);//更新房间信息
	public Room findRoomById(Integer id);//根据id查找指定房间

}
