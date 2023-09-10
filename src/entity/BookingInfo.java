package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingInfo {

//	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
//	    
//	    @ManyToOne
//	    @JoinColumn(name = "meeting_room_id")
	    private MeetingRoom meetingRoom; // Meeting Room
//	    
//	    @ManyToOne
//	    @JoinColumn(name = "booking_user_id")
	    private User bookedBy; // Booked by(User ID)
	    
	    private LocalDate date;
	    private LocalDateTime startTime;
	    private LocalDateTime endTime;
		
//	    @ManyToOne
//	    @JoinColumn(name = "booking_user_id")
	    private Manager manager; // Booked by (Manager)
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public MeetingRoom getMeetingRoom() {
			return meetingRoom;
		}
		public void setMeetingRoom(MeetingRoom meetingRoom) {
			this.meetingRoom = meetingRoom;
		}
		public User getBookedBy() {
			return bookedBy;
		}
		public void setBookedBy(User bookedBy) {
			this.bookedBy = bookedBy;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
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
	    
		public void setManager(Manager manager) {
	        this.manager = manager;
	        manager.getBookedMeetings().add(this); // Bidirectional relationship
	    }
}
