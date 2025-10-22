package com.week5.hoteloperations;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked=0;
    private double startTime;

    public Employee(long employeeId, String name, String department, double payRate, double hoursWorked, double startTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
    }

    public Employee() {

    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        if(hoursWorked < 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if(hoursWorked - 40 > 0) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        return hoursWorked * payRate;
    }

    // regular methods
    public void punchIn(double time) {
        startTime = time;
    }
    LocalTime time = LocalTime.now();
    LocalDate date = LocalDate.now();
    double timeC;
    double clockInTime;
    LocalTime startTimee ;
    public void punchIn(){
        //startTime= time.getHour()+ (time.getMinute()/60);
       // clockInTime= startTime;

        startTimee = LocalTime.now();
        System.out.println("start time: "+startTimee);
    }
    public void punchOut(){
        LocalTime endTime = LocalTime.now();
        double hours = Duration.between(startTimee, endTime).toMinutes() / 60.0;

    }
    public void punchOut(double time) {

        hoursWorked += (time - startTime);
    }

}
