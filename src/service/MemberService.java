package service;

import java.util.List;

import entity.Meeting;
import entity.Member;

public interface MemberService {
	Member login(String email, String password);
    List<Meeting> getScheduledMeetings(Member member);
    boolean joinMeeting(Member member, Meeting meeting);
}
