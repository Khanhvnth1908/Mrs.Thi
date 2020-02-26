/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlLap01;

/**
 *
 * @author User
 */
public class Circle11{
    private double radius;
    private String color;
    
    public Circle11(){                         /*-1--*/
        radius = 1;
        color = "red";
    }
    
      public Circle11(double r){               /*--2---*/
        radius = r;
        color = "Blue";
    }
    
     public Circle11(String c,double r){        /*-3--*/
          radius = r;
          color = c;
      }
      
    public Circle11(double radius, String color) {   /*--4--*/
        this.radius = radius;
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    
    public double Area(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
}
