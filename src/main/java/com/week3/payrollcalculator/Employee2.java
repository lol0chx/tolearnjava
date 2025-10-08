package com.week3.payrollcalculator;

public class Employee2 {
    private int employeeid;
    private String name;
    private double hoursworked;
    private double payRate;

    public Employee2(int employeeid, String name, double hoursworked, double payRate) {
        this.employeeid = employeeid;
        this.name = name;
        this.hoursworked = hoursworked;
        this.payRate = payRate;
    }

    public Employee2() {

    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(double hoursworked) {
        this.hoursworked = hoursworked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay( ){
        return payRate*hoursworked;


    }
}
