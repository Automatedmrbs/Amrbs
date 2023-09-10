package entity;

public class MeetingRoom {
	private Long id;
    
    private String uniqueName; // Unique Name
    private int seatingCapacity; // Seating Capacity
    private double perHourCost; // Per hour cost (in credits)
    
    private int ratings; // Ratings (based on feedback)
    
    private boolean projectorAvailable; // Amenities Available
    private boolean wifiAvailable;
    private boolean conferenceCallAvailable;
    private boolean whiteboardAvailable;
    private boolean waterDispenserAvailable;
    private boolean tvAvailable;
    private boolean coffeeMachineAvailable;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUniqueName() {
		return uniqueName;
	}
	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public double getPerHourCost() {
		return perHourCost;
	}
	public void setPerHourCost(double perHourCost) {
		this.perHourCost = perHourCost;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public boolean isProjectorAvailable() {
		return projectorAvailable;
	}
	public void setProjectorAvailable(boolean projectorAvailable) {
		this.projectorAvailable = projectorAvailable;
	}
	public boolean isWifiAvailable() {
		return wifiAvailable;
	}
	public void setWifiAvailable(boolean wifiAvailable) {
		this.wifiAvailable = wifiAvailable;
	}
	public boolean isConferenceCallAvailable() {
		return conferenceCallAvailable;
	}
	public void setConferenceCallAvailable(boolean conferenceCallAvailable) {
		this.conferenceCallAvailable = conferenceCallAvailable;
	}
	public boolean isWhiteboardAvailable() {
		return whiteboardAvailable;
	}
	public void setWhiteboardAvailable(boolean whiteboardAvailable) {
		this.whiteboardAvailable = whiteboardAvailable;
	}
	public boolean isWaterDispenserAvailable() {
		return waterDispenserAvailable;
	}
	public void setWaterDispenserAvailable(boolean waterDispenserAvailable) {
		this.waterDispenserAvailable = waterDispenserAvailable;
	}
	public boolean isTvAvailable() {
		return tvAvailable;
	}
	public void setTvAvailable(boolean tvAvailable) {
		this.tvAvailable = tvAvailable;
	}
	public boolean isCoffeeMachineAvailable() {
		return coffeeMachineAvailable;
	}
	public void setCoffeeMachineAvailable(boolean coffeeMachineAvailable) {
		this.coffeeMachineAvailable = coffeeMachineAvailable;
	}
	public MeetingRoom(Long id, String uniqueName, int seatingCapacity, double perHourCost, int ratings,
			boolean projectorAvailable, boolean wifiAvailable, boolean conferenceCallAvailable,
			boolean whiteboardAvailable, boolean waterDispenserAvailable, boolean tvAvailable,
			boolean coffeeMachineAvailable) {
		super();
		this.id = id;
		this.uniqueName = uniqueName;
		this.seatingCapacity = seatingCapacity;
		this.perHourCost = perHourCost;
		this.ratings = ratings;
		this.projectorAvailable = projectorAvailable;
		this.wifiAvailable = wifiAvailable;
		this.conferenceCallAvailable = conferenceCallAvailable;
		this.whiteboardAvailable = whiteboardAvailable;
		this.waterDispenserAvailable = waterDispenserAvailable;
		this.tvAvailable = tvAvailable;
		this.coffeeMachineAvailable = coffeeMachineAvailable;
	}
	public MeetingRoom(String roomName, int seatingCapacity2) {
		super();
	}
	
	public MeetingRoom() {
		
	}
	public MeetingRoom(int id2, String roomName, int seatingCapacity2) {
		// TODO Auto-generated constructor stub
	}
	public MeetingRoom(long id2, String roomName, int seatingCapacity2) {
		// TODO Auto-generated constructor stub
	}
    
	
    
}
