package DesignPrinciples;

import com.sun.security.jgss.GSSUtil;

class MusicPlayer{
    String company;
    int price;


    public MusicPlayer(String company,int price){
        this.company=company;
        this.price=price;

    }

    public void start(){
        System.out.println("Music player started");
    }

    public  void stop(){
        System.out.println("Music player stopped");
    }
}

class Vehicle{
    String company;
    String model;
    MusicPlayer musicPlayer;

    public Vehicle(String company,String mode){
        this.company  =company;
        this.model=model;
        this.musicPlayer=null;
    }

    public void start(){
        System.out.println("Car started");
    }

    public void stop(){
        System.out.println("Car stopped");
    }

    public void playMusic(){
        if(musicPlayer==null){
            System.out.println("Cant play music because not installed in car.");
            return;
        }
        musicPlayer.start();
    }
}


public class AggregationRelationship {
    public static void main(String[] args) {

    Vehicle car=new Vehicle("maruti suzuki","swift" );
    car.playMusic();
    car.start();





    }
}
