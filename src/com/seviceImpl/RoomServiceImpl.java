package com.seviceImpl;

import java.util.List;

import com.bean.Room;
import com.dao.RoomDao;
import com.service.RoomService;

public class RoomServiceImpl implements RoomService{
	private RoomDao roomDao;

	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.saveRoom(room);
		
	}

	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		return this.roomDao.findAllRoom();
	}

	@Override
	public void removeRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.removeRoom(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.update(room);
	}

	@Override
	public Room findRoomById(Integer id) {
		// TODO Auto-generated method stub
		return this.roomDao.findRoomById(id);
	}

}
