package entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Member extends User{
	private List<Meeting> scheduledMeetings; // List of meetings scheduled for the member

    public Member(int i, String name, String email, String password) {
        super(i, name, email, password, Role.MEMBER);
        this.scheduledMeetings = new ArrayList<>();
    }

    // Implement login functionality (if needed)

    public List<Meeting> viewScheduledMeetings() {
        // Return the list of meetings scheduled for the member
        return scheduledMeetings;
    }

    public boolean joinMeeting(Meeting meeting) {
    	if (isEligibleToJoin(meeting)) {
            // Add the member to the meeting's list of attendees
            //meeting.addAttendee(this);
            return true; // Successfully joined the meeting
        } else {
            return false; // Unable to join the meeting
        }
        // Implement logic to join a meeting
        // Check if the member is eligible to join the meeting based on meeting details
        // Add the member to the meeting's list of attendees if eligible
        // Return true if the member successfully joins the meeting, false otherwise
    }

	private boolean isEligibleToJoin(Meeting meeting) {
		// TODO Auto-generated method stub
		if (meeting.getAttendees().size() >= meeting.getMaxCapacity()) {
	        return false;
	    }

	    // Check if the meeting date and time are in the future (prevent joining past meetings)
	    LocalDateTime currentDateTime = LocalDateTime.now();
	    if (meeting.getStartTime().isBefore(currentDateTime)) {
	        return false;
	    }

	    // You can add more eligibility checks here based on your application's requirements

	    // If none of the eligibility checks fail, the member is eligible to join
	    return true;
	}
}
