package service;

import java.util.List;

import Dao.MemberDAO;
import entity.Meeting;
import entity.Member;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO; // Initialize it with an instance of MemberDAOImpl

    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public Member login(String email, String password) {
        return memberDAO.login(email, password);
    }

    @Override
    public List<Meeting> getScheduledMeetings(Member member) {
        return memberDAO.getScheduledMeetings(member);
    }

    @Override
    public boolean joinMeeting(Member member, Meeting meeting) {
        return memberDAO.joinMeeting(member, meeting);
    }
}
