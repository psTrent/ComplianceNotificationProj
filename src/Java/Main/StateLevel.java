package Java.Main;

import java.util.Date;

/**
 * Created by BartowB on 4/5/2016.
 */
public class StateLevel {
    private int ID;
    private String state;
    private String repName;
    private String cycle; //submission cycle
    private Date last_sub;
    private Date next_sub;
    private String typeRep;
    private int reportID;
    private int notifyTimeFrame; //in days
    private boolean isSent;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getRepName() {
        return repName;
    }

    public void setCycle(String cycle){
        this.cycle = cycle;
    }

    public String getCycle(){
        return cycle;
    }

    public void setLast_sub(Date last_sub){
        this.last_sub = last_sub;
    }

    public Date getLast_sub(){
        return last_sub;
    }

    public void setNext_sub(Date next_sub){
        this.next_sub = next_sub;
    }

    public Date getNext_sub(){
        return next_sub;
    }

    public void setTypeRep(String typeRep){
        this.typeRep = typeRep;
    }

    public String getTypeRep(){
        return typeRep;
    }

    public void setReportID(int reportID){
        this.reportID = reportID;
    }

    public int getReportID(){
        return reportID;
    }

    public void setNotifyTimeFrame(int notifyTimeFrame){
        this.notifyTimeFrame = notifyTimeFrame;
    }

    public int getNotifyTimeFrame(){
        return notifyTimeFrame;
    }

    public void setIsSent(boolean isSent){
        this.isSent = isSent;
    }

    public boolean getIsSent(){
        return isSent;
    }
}
}
