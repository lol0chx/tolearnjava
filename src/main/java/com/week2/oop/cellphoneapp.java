package com.week2.oop;

import java.util.Scanner;

public class cellphoneapp {
    public static void main() {
        cellphone c1 = new cellphone();
        cellphone c2 = new cellphone();
        cellphone c3 = new cellphone();

         c2.setSerialnumber("234242 ");
         c2.setOwner("lenok ");
         c2.setCarrier("verizon ");
         c2.setModel("samsung ");
         c2.setPhonenumber("206-4524-8521");

        c3.setSerialnumber("2857845 ");
        c3.setOwner("sol ");
        c3.setCarrier("at&t ");
        c3.setModel("iphone x ");
        c3.setPhonenumber("352-8798-4578");
        // c2.setPhonenumber("234234543 ");

        Scanner scanner = new Scanner(System.in);
       // System.out.println("\nenter phone number 2");
        //c2.setPhonenumber(scanner.nextLine());
        System.out.println("what is the serial number?");
        c1.setSerialnumber(scanner.nextLine());
        System.out.println("what model is the phone?");
        c1.setModel(scanner.nextLine());
        System.out.println("who is the carrier?");
        c1.setCarrier(scanner.nextLine());
        System.out.println("what is the phone number");
        c1.setPhonenumber(scanner.nextLine());
        System.out.println("who is the owner of the phone");
        c1.setOwner(scanner.nextLine());
      display(c1);
        System.out.println("********************");
      display(c2);
        System.out.println("********************");
        display(c3);
        System.out.println("********************");
      //display(c2);
        //System.out.println("+++++++++++++++"+c2.getPhonenumber());
      c1.dial(c2.getOwner(),c2.getPhonenumber());
      c2.dial(c3.getOwner(),c3.getPhonenumber());


       // System.out.println(cp.getSerialnumber()+"\n"+cp.getModel()+"\n"+cp.getCarrier()+"\n"+cp.getPhonenumber()+"\n"+cp.getOwner());


    }
   public static void display(cellphone phone){
       System.out.println("serial number: "+phone.getSerialnumber()+"\n" +"Model:"+phone.getModel() +"\n" +"Carrier: "+phone.getCarrier()+ "\n" +"Phone number:"+phone.getPhonenumber()+"\n" +"Owner: "+phone.getOwner());
   }
}
