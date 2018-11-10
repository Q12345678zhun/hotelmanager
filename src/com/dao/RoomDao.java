package com.dao;

import java.util.List;

import com.bean.Room;

public interface RoomDao {
	public void saveRoom(Room room);//���淿����Ϣ
	public List<Room>findAllRoom();//�������з�����Ϣ
	public void removeRoom(Room room);//�³�������Ϣ
	public void update(Room room);//���·�����Ϣ
	public Room findRoomById(Integer id);//����id����ָ������

}
