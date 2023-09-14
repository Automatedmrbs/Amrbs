package service;

import java.sql.SQLException;
import java.util.Optional;

import Dao.AdminDAO;
import Dao.MeetingRoomDAO;
import Dao.MeetingRoomDAOImpl;
import Dao.MeetingRoomRepository;
import entity.MeetingRoom;

public class AdminServiceImpl implements AdminService {
	 private AdminDAO adminDAO; // Admin Data Access Object for interacting with the database

	    public AdminServiceImpl(AdminDAO adminDAO) {
	        this.adminDAO = adminDAO;
	    }
	    

	    public AdminServiceImpl() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
	    public MeetingRoom createMeetingRoom(MeetingRoom meetingRoom) throws SQLException {
	        // Convert MeetingRoomDAO to MeetingRoom entity
	       // MeetingRoom meetingRoom = convertToMeetingRoomEntity(roomDAO);

	        // Create the meeting room in the database using the DAO layer

	        // Convert the created MeetingRoom entity back to MeetingRoomDAO
	        return adminDAO.createMeetingRoom(meetingRoom);
	    }

		@Override
		public int configureMeetingRoom(long roomId, MeetingRoom meetingRoom) throws SQLException {
			return adminDAO.configureMeetingRoom(roomId, meetingRoom);
		}

	    // Additional methods and error handling can be added here

}
