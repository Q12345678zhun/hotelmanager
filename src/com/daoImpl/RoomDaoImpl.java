package com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Room;
import com.dao.RoomDao;

public class RoomDaoImpl extends HibernateDaoSupport implements RoomDao{

	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(room);
		
	}

	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		String hql="from Room room order by room.roomid desc";
		return (List<Room>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public void removeRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(room);
		
	}

	@Override
	public void update(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(room);
		
	}

	@Override
	public Room findRoomById(Integer id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Room.class,id);
	}

}
