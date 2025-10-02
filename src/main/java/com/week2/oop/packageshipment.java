package com.week2.oop;
import java.time.LocalDate;

public class packageshipment {
    String sendername;
    String receivername;
    String trackingnumber;
    String carrier;
    LocalDate shipdate;
    String status;

    public packageshipment(LocalDate shipdate, String carrier, String trackingnumber, String receivername, String sendername) {
        this.shipdate = shipdate;
        this.carrier = carrier;
        this.trackingnumber = trackingnumber;
        this.receivername = receivername;
        this.sendername = sendername;
    }

    public packageshipment() {


    }
    public void setstatus(String status){
        this.status= (status.length()==0?"created":status);
    }
    public String getStatus(){
        return status;

    }
    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getTrackingnumber() {
        return trackingnumber;
    }

    public void setTrackingnumber(String trackingnumber) {
        this.trackingnumber = trackingnumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public LocalDate getShipdate() {
        return shipdate;
    }

    public void setShipdate(LocalDate shipdate) {
        this.shipdate = shipdate;
    }
    public void printtracking(){
        System.out.println(carrier + " "+trackingnumber+"- "+ status + " (from "+ sendername+" to "+ receivername +" on "+ shipdate +")" );
    }


}

