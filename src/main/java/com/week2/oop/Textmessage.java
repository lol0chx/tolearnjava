package com.week2.oop;
import java.time.LocalDate;

public class Textmessage {

    String sendernumber;
    String receivernumber;
    String body;
    LocalDate senton;

    public Textmessage(String sendernumber, String receivernumber, String body, LocalDate senton) {
        this.sendernumber = sendernumber;
        this.receivernumber = receivernumber;
        this.body = body;
        this.senton = senton;
    }
    public Textmessage(){

    }

    public String getSendernumber() {
        return sendernumber;
    }

    public void setSendernumber(String sendernumber) {
        this.sendernumber = sendernumber;
    }

    public String getReceivernumber() {
        return receivernumber;
    }

    public void setReceivernumber(String receivernumber) {
        this.receivernumber = receivernumber;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if (body.length()==0){
            this.body="--empty--";

        }
        else {
            this.body = body;
        }
    }

    public LocalDate getSenton() {
        return senton;
    }

    public void setSenton(LocalDate senton) {
        this.senton = senton;
    }

    public void display(){
        System.out.println(senton +"\n"+" SMS from: "+ "\n"+sendernumber +" to "+ receivernumber +": "+ "\n"+body);
    }
}
