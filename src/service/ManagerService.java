package service;

import entity.Meeting;
import java.util.List;



public interface ManagerService{
    public void organizingMeeting(Meeting mR);
    public int resetCreditScore(int currentCreditScore);
    public List<Meeting> displayScheduledMeeting();


}