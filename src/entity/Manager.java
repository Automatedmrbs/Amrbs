package entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Manager extends User{

	private LocalDateTime lastLoggedIn;
    private int credits; // Available credits

   // @OneToMany(mappedBy = "manager")
    private Set<BookingInfo> bookedMeetings = new HashSet<>(); // Meetings booked by this manager

    
    // Constructors, getters, and setters

    public LocalDateTime getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(LocalDateTime lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Set<BookingInfo> getBookedMeetings() {
        return bookedMeetings;
    }

    public void setBookedMeetings(Set<BookingInfo> bookedMeetings) {
        this.bookedMeetings = bookedMeetings;
    }

    public void addBookedMeeting(BookingInfo bookingInfo) {
        this.bookedMeetings.add(bookingInfo);
        bookingInfo.setManager(this);
    }

    public void removeBookedMeeting(BookingInfo bookingInfo) {
        this.bookedMeetings.remove(bookingInfo);
        bookingInfo.setManager(null);
    }

	public Manager(LocalDateTime lastLoggedIn, int credits, Set<BookingInfo> bookedMeetings) {
		super();
		this.lastLoggedIn = lastLoggedIn;
		this.credits = credits;
		this.bookedMeetings = bookedMeetings;
	}

	public Manager() {
		super();
	}

    
}
