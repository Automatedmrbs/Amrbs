package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.MeetingRoom;

public interface AdminDAO {
	
	MeetingRoom createMeetingRoom(MeetingRoom meetingRoom) throws SQLException;
    
    MeetingRoom configureMeetingRoom(MeetingRoom meetingRoom) throws SQLException;

    MeetingRoom convertToMeetingRoom(ResultSet resultSet) throws SQLException;
}
