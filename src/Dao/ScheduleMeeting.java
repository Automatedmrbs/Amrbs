package Dao;
import entity.Meeting;

import java.util.List;


public interface ScheduleMeeting {
    public List<Meeting> addBookedMeeting(Meeting m);

    public List<Meeting> viewBookedMeeting();



    
}
