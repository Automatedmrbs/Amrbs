package View;

import entity.Manager;
import service.ManagerService;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entity.Meeting;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ManagerView {
        Scanner sc;
        private ManagerService mS;
        

        public ManagerView(ManagerService mS) {
        this.sc = new Scanner(System.in);
        this.mS = mS;
    }
    
    public void run(){
        Manager m = new Manager();
        System.out.println("Manager details:");
        System.out.println(m.getId()+" "+m.getName()+" "+m.getEmail()+" "+m.getPhone()+" "+m.getCredits());
        int c = m.getCredits();
        mS.resetCreditScore(c);
        while(true){
                int choice;
                System.out.println("Enter the choice: 1. ScheduleMeeting \n 2. View Scheduled Meeting \n ");
                choice = sc.nextInt();
                if(choice  == 1){
                    Meeting m1 = new Meeting();
                    Long id;
                    String title;
                    String mDate;
                    String sTime;
                    String eTime;

                    String meetingType;

                    System.out.println("Enter the details for the meeting:");
                    id = sc.nextLong();
                    title = sc.nextLine();
                    mDate = sc.nextLine();
                    sTime = sc.nextLine();
                    eTime = sc.nextLine();
                    meetingType = sc.nextLine();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");

                    m1.setId(id);
                    m1.setTitle(title);
                    m1.setMeetingDate(LocalDateTime.parse(mDate, formatter));
                    m1.setStartTime(LocalDateTime.parse(sTime, formatter));
                    m1.setEndTime(LocalDateTime.parse(eTime,formatter));
                    m1.setMeetingType(meetingType);
                    

                    mS.organizingMeeting(m1);



                }
                if(choice == 2){
                    List<Meeting> list = new ArrayList<Meeting>();
                    list = mS.displayScheduledMeeting();
                    for (Meeting meet:list){
                        System.out.println(meet.getId()+" "+meet.getTitle()+" "+meet.getMeetingDate()+" "+meet.getStartTime()+" "+meet.getEndTime()+" "+meet.getMeetingType());
                    }

                }

                System.out.println("Wanna Continue?");
                String s = sc.nextLine();
                if(s.equalsIgnoreCase("no")){
                        break;
                }


        
}
        

    
}
}
