package entity;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
	private List<MeetingRoom> meetingRooms; // A list of meeting rooms

    // Constructors, additional methods, and other properties as needed

    public Admin() {
        // Default constructor
    }

    public Admin(String name, String email, String phone) {
        super();
        // Initialize other properties specific to Admin
        this.meetingRooms = new ArrayList<>();
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    // Method to create a new meeting room and add it to the list
    public void createMeetingRoom(MeetingRoom meetingRoom) {
        // Logic to create and add the meeting room to the list
        meetingRooms.add(meetingRoom);
    }

    // Method to configure an existing meeting room
    public void configureMeetingRoom(MeetingRoom room, MeetingRoom newConfiguration) {
        if (meetingRooms.contains(room)) {
            // Update the meeting room's properties based on the new configuration
            room.setSeatingCapacity(newConfiguration.getSeatingCapacity());
            room.setPerHourCost(newConfiguration.getPerHourCost());
            room.setProjectorAvailable(newConfiguration.isProjectorAvailable());
            room.setWifiAvailable(newConfiguration.isWifiAvailable());
            room.setConferenceCallAvailable(newConfiguration.isConferenceCallAvailable());
            room.setWhiteboardAvailable(newConfiguration.isWhiteboardAvailable());
            room.setWaterDispenserAvailable(newConfiguration.isWaterDispenserAvailable());
            room.setTvAvailable(newConfiguration.isTvAvailable());
            room.setCoffeeMachineAvailable(newConfiguration.isCoffeeMachineAvailable());
        } else {
            // Handle the case where the provided room is not managed by this admin
            throw new IllegalArgumentException("Admin does not manage this meeting room.");
        }
    }

	public Admin(List<MeetingRoom> meetingRooms) {
		super();
		this.meetingRooms = meetingRooms;
	}
    
    
}
