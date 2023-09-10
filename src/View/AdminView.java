package View;
import java.sql.SQLException;
import java.util.Scanner;

import Dao.MeetingRoomDAO;
import Dao.MeetingRoomDAOImpl;
import entity.MeetingRoom;
import service.AdminService;

public class AdminView {
    private AdminService adminService;
    private Scanner scanner;

    public AdminView(AdminService adminService) {
        this.adminService = adminService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean isRunning = true;

        while (isRunning) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    createMeetingRoom();
                    break;
                case 2:
                    configureMeetingRoom();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner when done
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\nAdmin Menu:");
        System.out.println("1. Create Meeting Room");
        System.out.println("2. Configure Meeting Room");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private int getUserChoice() {
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            // Handle non-integer input
            scanner.nextLine(); // Consume the invalid input
        }
        return choice;
    }

    private void createMeetingRoom() {
    	// Prompt for meeting room details
        System.out.println("\n--Create Meeting Room--");
        
        System.out.println("Enter Meeting Room Id: ");
        long id = scanner.nextLong();

        // Collect user input for meeting room attributes
        System.out.print("Enter Meeting Room Name: ");
        String roomName = scanner.nextLine();
        scanner.next();
        System.out.print("Enter Seating Capacity: ");
        int seatingCapacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create a new MeetingRoom object with user input
        MeetingRoom meetingRoom = new MeetingRoom(id, roomName, seatingCapacity);

        // Set amenities for the meeting room
        System.out.print("Is Projector Available? (true/false): ");
        boolean projectorAvailable = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline character
        meetingRoom.setProjectorAvailable(projectorAvailable);

        System.out.print("Is Wi-Fi Available? (true/false): ");
        boolean wifiAvailable = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline character
        meetingRoom.setWifiAvailable(wifiAvailable);

        System.out.print("Is Conference Call Facility Available? (true/false): ");
        boolean conferenceCallAvailable = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline character
        meetingRoom.setConferenceCallAvailable(conferenceCallAvailable);

        // Add other amenities and attributes as needed

        // Call the service to create the meeting room
        //MeetingRoom createdRoom = (MeetingRoom) adminService.createMeetingRoom((MeetingRoomDAO) meetingRoom);

        // Display the result to the user
        System.out.println("Meeting Room created successfully.");
        // You can display the details of the created meeting room
    }

    private void configureMeetingRoom() {
        // Prompt for configuration details
        System.out.println("\nConfigure Meeting Room:");
        // You can add prompts for specific attributes to configure (capacity, amenities, etc.)
        System.out.print("Enter the Meeting Room ID to configure: ");
        long roomId = scanner.nextLong();
        scanner.nextLine(); // Consume newline character

        // Collect user input (use scanner)
        MeetingRoomDAO roomDAO = null;
		try {
			roomDAO = new MeetingRoomDAOImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Set attributes based on user input

        // Call the service to configure the meeting room
        MeetingRoomDAO configuredRoom = adminService.configureMeetingRoom(roomId, roomDAO);

        // Display the result to the user
        System.out.println("Meeting Room configured successfully.");
        // You can display the details of the configured meeting room
    }
}
