package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.MeetingRoom;

public class AdminDAOImpl implements AdminDAO {

	String url = "jdbc:mysql://localhost:3306/";
	String username = "root";
	String password = "root123";
	private Connection connection;

    public AdminDAOImpl() throws SQLException {
        this.connection = DriverManager.getConnection(url, username, password);
    }

    @Override
    public MeetingRoom createMeetingRoom(MeetingRoom meetingRoom) throws SQLException {
        String insertQuery = "INSERT INTO meeting_room (unique_name, seating_capacity, ratings, per_hour_cost, " +
                "projector_available, wifi_available, conference_call_available, whiteboard_available, " +
                "water_dispenser_available, tv_available, coffee_machine_available) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING id";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, meetingRoom.getUniqueName());
            preparedStatement.setInt(2, meetingRoom.getSeatingCapacity());
            preparedStatement.setInt(3, meetingRoom.getRatings());
            preparedStatement.setDouble(4, meetingRoom.getPerHourCost());
            preparedStatement.setBoolean(5, meetingRoom.isProjectorAvailable());
            preparedStatement.setBoolean(6, meetingRoom.isWifiAvailable());
            preparedStatement.setBoolean(7, meetingRoom.isConferenceCallAvailable());
            preparedStatement.setBoolean(8, meetingRoom.isWhiteboardAvailable());
            preparedStatement.setBoolean(9, meetingRoom.isWaterDispenserAvailable());
            preparedStatement.setBoolean(10, meetingRoom.isTvAvailable());
            preparedStatement.setBoolean(11, meetingRoom.isCoffeeMachineAvailable());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                meetingRoom.setId(resultSet.getLong("id"));
                return meetingRoom;
            } else {
                throw new SQLException("Meeting room creation failed.");
            }
        }
    }

    @Override
    public int configureMeetingRoom(long roomId,MeetingRoom meetingRoom) throws SQLException {
    	String updateQuery = "UPDATE meeting_room SET unique_name = ?, seating_capacity = ?, ratings = ?, " +
                "per_hour_cost = ?, projector_available = ?, wifi_available = ?, " +
                "conference_call_available = ?, whiteboard_available = ?, " +
                "water_dispenser_available = ?, tv_available = ?, coffee_machine_available = ? " +
                "WHERE id = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, meetingRoom.getUniqueName());
            preparedStatement.setInt(2, meetingRoom.getSeatingCapacity());
            preparedStatement.setInt(3, meetingRoom.getRatings());
            preparedStatement.setDouble(4, meetingRoom.getPerHourCost());
            preparedStatement.setBoolean(5, meetingRoom.isProjectorAvailable());
            preparedStatement.setBoolean(6, meetingRoom.isWifiAvailable());
            preparedStatement.setBoolean(7, meetingRoom.isConferenceCallAvailable());
            preparedStatement.setBoolean(8, meetingRoom.isWhiteboardAvailable());
            preparedStatement.setBoolean(9, meetingRoom.isWaterDispenserAvailable());
            preparedStatement.setBoolean(10, meetingRoom.isTvAvailable());
            preparedStatement.setBoolean(11, meetingRoom.isCoffeeMachineAvailable());
            preparedStatement.setLong(12, meetingRoom.getId());
            
            int rowsAffected = preparedStatement.executeUpdate();
            
            if (rowsAffected > 0) {
               return 1;
            } else {
                throw new SQLException("Meeting room configuration failed.");
            }
        }
    }

}
