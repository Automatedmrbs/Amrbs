package View;

import java.util.Scanner;

import entity.Meeting;
import entity.Member;
import service.MemberService;

public class MemberView {
	private Scanner scanner;
    private MemberService memberService; // Inject the MemberService

    public MemberView(MemberService memberService) {
        this.scanner = new Scanner(System.in);
        this.memberService = memberService;
    }

    public void run() {
        boolean loggedIn = false;
        Member currentMember = null;

        while (!loggedIn) {
            System.out.println("Member Login");
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Attempt to log in
            currentMember = memberService.login(email, password);

            if (currentMember != null) {
                loggedIn = true;
                System.out.println("Login successful. Welcome, " + currentMember.getName() + "!");
            } else {
                System.out.println("Invalid email or password. Please try again.");
            }
        }

        while (true) {
            System.out.println("\nMember Menu:");
            System.out.println("1. View Scheduled Meetings");
            System.out.println("2. Join Meeting");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    viewScheduledMeetings(currentMember);
                    break;
                case 2:
                    joinMeeting(currentMember);
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private void viewScheduledMeetings(Member member) {
        System.out.println("\nScheduled Meetings:");
        for (Meeting meeting : member.viewScheduledMeetings()) {
            System.out.println("Meeting ID: " + meeting.getId());
            System.out.println("Title: " + meeting.getTitle());
            System.out.println("Date and Time: " + meeting.getStartTime());
            System.out.println("Organized by: " + meeting.getOrganizer().getName());
            System.out.println("------------------------------");
        }
    }

    private void joinMeeting(Member member) {
        System.out.print("Enter the Meeting ID to join: ");
        int meetingId = scanner.nextInt();
        scanner.nextLine();
        }
}
