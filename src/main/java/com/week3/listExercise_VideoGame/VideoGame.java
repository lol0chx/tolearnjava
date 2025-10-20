package com.week3.listExercise_VideoGame;

public class VideoGame {
    private String title;
    private  String platform;
    private String genre;
    private int year;
    private double rating;

    public VideoGame(double rating, int year, String genre, String platform, String title) {
        this.rating = rating;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.title = title;
    }

    public VideoGame() {

    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String toCsvPay(){
        return title +","+platform+","+genre+","+year+","+rating;
    }
    public void display(){
        System.out.println(title+platform+genre+year+rating);
    }
}
