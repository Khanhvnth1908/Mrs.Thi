/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author User
 */
public class Soccerplayer {
    private int number;
    private String name;
    private int x,y;
 
    
    //
    public Soccerplayer(int number,String name,int x,int y){
    this.number = number;
    this.name = name;
    this.x = x;
    this.y = y;
    System.out.println(" number " + number + " name " + name + " x " + x  + " y " + y);
    }
    
    public void run(){
        System.out.println("10km/h");
    }
    public void kickball(){
        System.out.println("500");
    }
}
