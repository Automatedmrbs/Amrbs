package service;

import entity.Meeting;

//import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;




import Dao.ScheduleMeetingImpl;

public class ManagerServiceImpl implements ManagerService{
   /* try{
    MeetingRoomDAO m = new MeetingRoomDAOImpl();}
    catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

    @Override
    public void organizingMeeting(Meeting mR){

            
            ScheduleMeetingImpl sM = new ScheduleMeetingImpl();
            sM.addBookedMeeting(mR);


            
        }
    
    @Override
    public int resetCreditScore(int currentCreditScore){
            LocalDate today = LocalDate.now();
        if (today.getDayOfWeek() == DayOfWeek.MONDAY) {
            // Reset credit score to 2000 on Monday
            return 2000;
        } else {
            // Keep the current credit score on other days
            return currentCreditScore;


    }
}

    @Override
    public List<Meeting> displayScheduledMeeting(){
        ScheduleMeetingImpl s = new ScheduleMeetingImpl();
        List<Meeting> result = s.viewBookedMeeting();
        return result;
    }

    
}
