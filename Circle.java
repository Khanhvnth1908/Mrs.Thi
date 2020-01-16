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
public class Circle {          //class
    private double radius;     //variables
    private String color;
    
    
 public Circle(){
     System.out.println("Information about the Circle");
 }
//dinh nghia constructor de khoi tao doi tuong
public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
        System.out.println(" radius " + radius + " color " + color);
    }

//method
public void says(){
    System.out.println("This is one way");
    } 

public void moves(){
    System.out.println("Not a circle");
    }
}
