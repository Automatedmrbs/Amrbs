package service;

import java.sql.SQLException;

import Dao.MeetingRoomDAO;
import entity.MeetingRoom;

public interface AdminService {
	MeetingRoom createMeetingRoom(MeetingRoom meetingRooms) throws SQLException;

	int configureMeetingRoom(long roomId, MeetingRoom meetingRoom) throws SQLException;
}
