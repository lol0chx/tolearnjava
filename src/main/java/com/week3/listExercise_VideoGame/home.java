package com.week3.listExercise_VideoGame;

import com.week3.payrollcalculator.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class home {
    static Scanner scanner = new Scanner(System.in);

    static void main() {
        List<VideoGame> videoGameList= new ArrayList<>();
        //VideoGame videoGame= new VideoGame();
        try{
            FileReader file = new FileReader("videogames.csv");
            BufferedReader bufreader = new BufferedReader(file);
            bufreader.readLine();

            String input;
            while((input = bufreader.readLine())!=null){
             String[] parts = input.split(",");
             if(parts.length==5) {
                 //Employee employee = new Employee(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
                 VideoGame game = new VideoGame(Double.parseDouble(parts[4]), Integer.parseInt(parts[3]), parts[2], parts[1], parts[0]);
                 // System.out.println(parts[0]);
                 videoGameList.add(game);
             }else {
                 System.out.println("file not in write format");
             }
            }
            bufreader.close();

        }catch (IOException e ){
            throw new RuntimeException(e);
        }
        //System.out.println("blal");
        try {
            FileWriter fileWriter2 = new FileWriter("videogames.csv" , true);
            BufferedWriter bufWriter2 = new BufferedWriter(fileWriter2);
            bufWriter2.write("\nSIFU,"+"ps5, "+ "adventure,"+"2020,"+"9.5");

            bufWriter2.close();
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }



        double avgrating=0;
        int oldgameyr = 199999999;
        int pcgamecount=0;

        for(VideoGame video: videoGameList) {
            avgrating+=video.getRating();
            if(video.getYear()<oldgameyr){
                oldgameyr=video.getYear();
            }
            //video.display();
        }
        for(VideoGame vgame: videoGameList){

           if( vgame.getPlatform().equalsIgnoreCase("pc")){
               pcgamecount+=1;
           }
        }
        avgrating= avgrating/videoGameList.size();
        System.out.println("The total number of games loaded is: "+videoGameList.size());
        System.out.println("The average rating is:"+ avgrating);
        System.out.println(("the oldest release year is: "+ oldgameyr));
        System.out.println("The number of PC titles is :"+ pcgamecount);


        //FileReader file = null;
        for(VideoGame vgame: videoGameList){

            vgame.display();
        }

    }
}
