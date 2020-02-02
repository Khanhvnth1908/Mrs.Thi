/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author User
 */
public class Car {
    private String plateNumber;
    private String speed;
    private int x;
    private int y;

    public Car(String plateNumber, String speed, int x, int y) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
    
    
    public Car(String move,String park,String accelerate){
        System.out.println(" move " + move + " park " + park + " accelerate" + accelerate);
    }

    @Override
    public String toString() {
        return "Car{" + "plateNumber=" + plateNumber + ", speed=" + speed + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
