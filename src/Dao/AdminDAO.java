package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.MeetingRoom;

public interface AdminDAO {
	
	MeetingRoom createMeetingRoom(MeetingRoom meetingRoom) throws SQLException;
    
    int configureMeetingRoom(long roomId,MeetingRoom meetingRoom) throws SQLException;
}
