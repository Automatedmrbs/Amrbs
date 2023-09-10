package service;

import Dao.MeetingRoomDAO;

public interface AdminService {
	MeetingRoomDAO createMeetingRoom(MeetingRoomDAO roomDAO);

    MeetingRoomDAO configureMeetingRoom(Long roomId, MeetingRoomDAO roomDAO);
}
