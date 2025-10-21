package com.week3.payrollcalculator;

import java.io.*;
import java.util.Scanner;


public class main_calculator2 {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        boolean done= false;
        double[] grosspay;
        String[] name;
        int[] id;
        //employee Emp1 = new employee();
        // inventory[0]= new Books(1,"9780451524935","Digital Fortress",false,"");
        try
        {

            System.out.println("Enter the name of file you want to process");
            String Filename = scanner.nextLine();
            System.out.println("Enter the name of the payroll file to create (.csv):");
            String payrollfile = scanner.nextLine();



            // crate a file reader and read file
            FileReader fileReader = new FileReader(Filename);
            BufferedReader bufReader = new BufferedReader(fileReader);
            // create a file writer and write a file
            FileWriter fileWriter = new FileWriter(payrollfile);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            String employeestring;
            bufWriter.write("id|name|grosspay");
            while((employeestring = bufReader.readLine()) != null) {
                String[] parts = employeestring.split("\\|");
                Employee employee = new Employee(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));

                //System.out.printf("The employee %s with id %d pay is $%.2f\n", employee.getName(), employee.getEmployeeid(), employee.getGrossPay());
                bufWriter.write("\n"+employee.getEmployeeid()+" "+employee.getName()+" "+employee.getGrossPay());


            }
            // close the stream and release the resources

            bufWriter.close();

            System.out.println("Do you want to create a file with the total gorss pay per employee aswell? Y or N");
            String yearlygross = scanner.nextLine();
            if (yearlygross.equalsIgnoreCase("y")){
                FileReader fileReader2 = new FileReader(Filename);
                BufferedReader bufReader2 = new BufferedReader(fileReader2);

                FileWriter fileWriter2 = new FileWriter("yearly total gross pay per employee.csv");
                BufferedWriter bufWriter2 = new BufferedWriter(fileWriter2);
                bufWriter2.write("id"+" name "+ "yearlygrosspay");
                while((employeestring = bufReader2.readLine()) != null) {
                    String[] parts = employeestring.split("\\|");
                    Employee employee = new Employee(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));

                    //System.out.printf("The employee %s with id %d pay is $%.2f\n", employee.getName(), employee.getEmployeeid(), employee.getGrossPay());

                    bufWriter2.write("\n"+employee.getEmployeeid()+" "+employee.getName()+" "+(employee.getGrossPay()*12));


                }

                bufReader.close();
                bufWriter2.close();
            }


        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
