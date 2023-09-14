package Dao;

import java.util.List;
import java.util.ArrayList;

import entity.Meeting;

public class ScheduleMeetingImpl implements ScheduleMeeting{
        static List<Meeting> list = new ArrayList<Meeting>();

        @Override
         public List<Meeting> addBookedMeeting(Meeting m){
            list.add(m);
            return list;
         }

    @Override

    public List<Meeting> viewBookedMeeting(){
        return list;
    }
    
}
