package com.week2.oop;

public class cellphone {
    private String serialnumber;
    private String model;
    private String carrier;
    private String phonenumber;
    private String owner;

    public cellphone( ) {
        this.owner = owner;
        this.phonenumber = phonenumber;
        this.carrier = carrier;
        this.model = model;
        this.serialnumber = serialnumber;
    }

    public cellphone(String owner, String phonenumber, String carrier, String model, String serialnumber) {
        this.owner = owner;
        this.phonenumber = phonenumber;
        this.carrier = carrier;
        this.model = model;
        this.serialnumber = serialnumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void dial(String phonenumber, String caller ){
        System.out.println(owner + " phone is calling "+phonenumber +caller);
    }
    public void dialed(cellphone phonenumber){
        System.out.printf("%s's phone is calling %s\n", owner, phonenumber.getPhonenumber());
    }
}
