package entity;

import java.time.LocalDateTime;
import java.util.Set;

public class Meeting {

	private Long id;
    private String title;
    private LocalDateTime meetingDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String meetingType; // Classroom Training, Online Training, etc.
    
   // @ManyToOne
   // @JoinColumn(name = "organizer_id")
    private User organizer; // Organized by(User ID)

   // @ManyToMany
   // @JoinTable(
//        name = "meeting_members",
//        joinColumns = @JoinColumn(name = "meeting_id"),
//        inverseJoinColumns = @JoinColumn(name = "member_id")
//    )
    private Set<Member> members; // List of members attending the meeting

  //  @OneToOne(mappedBy = "meeting")
    private BookingInfo bookingInfo; // Information of meeting room booking

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(LocalDateTime meetingDate) {
		this.meetingDate = meetingDate;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getMeetingType() {
		return meetingType;
	}

	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}

	public User getOrganizer() {
		return organizer;
	}

	public void setOrganizer(User organizer) {
		this.organizer = organizer;
	}

	public Set<Member> getMembers() {
		return members;
	}

	public void setMembers(Set<Member> members) {
		this.members = members;
	}

	public BookingInfo getBookingInfo() {
		return bookingInfo;
	}

	public void setBookingInfo(BookingInfo bookingInfo) {
		this.bookingInfo = bookingInfo;
	}

	public Meeting(Long id, String title, LocalDateTime meetingDate, LocalDateTime startTime, LocalDateTime endTime,
			String meetingType, User organizer, Set<Member> members, BookingInfo bookingInfo) {
		super();
		this.id = id;
		this.title = title;
		this.meetingDate = meetingDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.meetingType = meetingType;
		this.organizer = organizer;
		this.members = members;
		this.bookingInfo = bookingInfo;
	}

	public Meeting() {
		super();
	}
    
    
}
