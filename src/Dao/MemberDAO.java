package Dao;

import java.util.List;

import entity.Meeting;
import entity.Member;

public interface MemberDAO {
	Member login(String email, String password);
    List<Meeting> getScheduledMeetings(Member member);
    boolean joinMeeting(Member member, Meeting meeting);
}