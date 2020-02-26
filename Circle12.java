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
public class Circle12 {
    private double radius;
    
    public Circle12(){
        radius = 1;
    }
    
    public Circle12(double radius) {
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCirumference(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle12{" + "radius=" + radius + '}';
    }
    
}
