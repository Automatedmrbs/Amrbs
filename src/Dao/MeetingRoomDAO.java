package Dao;

import java.sql.SQLException;
import java.util.List;

import entity.MeetingRoom;

public interface MeetingRoomDAO {
	MeetingRoom createMeetingRoom(MeetingRoom meetingRoom) throws SQLException;
    
    MeetingRoom getMeetingRoomById(Long id) throws SQLException;
    
    List<MeetingRoom> getAllMeetingRooms() throws SQLException;
    
    MeetingRoom updateMeetingRoom(MeetingRoom meetingRoom) throws SQLException;
    
    void deleteMeetingRoom(Long id) throws SQLException;
}
