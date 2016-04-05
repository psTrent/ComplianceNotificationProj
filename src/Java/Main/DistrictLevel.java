package Java.Main;

import java.util.Date;

/**
 * Created by BartowB on 4/5/2016.
 */
public class DistrictLevel {
    private String state;
    private int freq; //in days
    private Date last_sub;
    private Date next_sub;
    private String typeRep;
    private int reportID;
    private int notifyTimeFrame; //in days
    private boolean isSent;
    private int districtID;
    private String roleRequired; //role level that will get the notifications

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setFreq(int freq){
        this.freq = freq;
    }

    public int getFreq(){
        return freq;
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

    public void setisSent(boolean isSent){
        this.isSent = isSent;
    }

    public boolean getisSent(){
        return isSent;
    }

    public void setDistrictID(int districtID){
        this.districtID = districtID;
    }

    public int getDistrictID(){
        return districtID;
    }

    public void setRoleRequired(String roleRequired){
        this.roleRequired = roleRequired;
    }

    public String getRoleRequired(){
        return roleRequired;
    }
}
