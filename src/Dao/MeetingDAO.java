package Dao;

import java.util.List;

import entity.Meeting;
import entity.Member;

public interface MeetingDAO {
	Meeting createMeeting(Meeting meeting);
    Meeting getMeetingById(int meetingId);
    List<Meeting> getAllMeetings();
    List<Meeting> getMeetingsByMember(Member member);
    boolean updateMeeting(Meeting meeting);
    boolean deleteMeeting(int meetingId);
}
