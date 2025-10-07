package com.week3.payrollcalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class emp_main {
    static void main() {
        //employee Emp1 = new employee();
       // inventory[0]= new Books(1,"9780451524935","Digital Fortress",false,"");
        try
        {
        FileReader fileReader = new FileReader("employeedata.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);


            String employeestring;

            while((employeestring = bufReader.readLine()) != null) {
                String[] parts = employeestring.split("\\|");
                Employee employee = new Employee(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
                System.out.printf("The employee %s with id %d pay is $%.2f\n", employee.getName(), employee.getEmployeeid(), employee.getGrossPay());
            }
            // close the stream and release the resources
            bufReader.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
