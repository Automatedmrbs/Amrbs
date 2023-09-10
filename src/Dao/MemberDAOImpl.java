package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Meeting;
import entity.Member;

public class MemberDAOImpl implements MemberDAO {
	String url = "jdbc:mysql://localhost:3306/";
	String username = "root";
	String password = "root123";
    private Connection connection; // JDBC connection (initialized elsewhere)

    public MemberDAOImpl() throws SQLException {
        this.connection = DriverManager.getConnection(url, username, password);
    }

    @Override
    public Member login(String email, String password) {
        try {
            String sql = "SELECT * FROM members WHERE email = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Map the database record to a Member object
                Member member = new Member(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("password")
                    // Add more fields as needed
                );
                return member;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Meeting> getScheduledMeetings(Member member) {
        List<Meeting> meetings = new ArrayList<>();
        try {
            String sql = "SELECT * FROM meetings WHERE member_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setFloat(1, member.getId());

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                // Map each database record to a Meeting object
                Meeting meeting = new Meeting(
                    resultSet.getInt("id"),
                    resultSet.getString("title"),
                    resultSet.getTimestamp("date_time").toLocalDateTime(),
                    resultSet.getString("location")
                    // Add more fields as needed
                );
                meetings.add(meeting);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return meetings;
    }

    @Override
    public boolean joinMeeting(Member member, Meeting meeting) {
        try {
            String sql = "INSERT INTO meeting_attendees (member_id, meeting_id) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setFloat(1, member.getId());
            statement.setFloat(2, meeting.getId());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
