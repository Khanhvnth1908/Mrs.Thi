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
public class test_Car {
    public static void main(String[] args){
        
        Car c1 = new Car("1000km", "Thu le", "bla bla");
        
        Car c2 = new Car("17-MD&-382", "360km/h", 6, 8);
        System.out.println(c2.toString());
        
        Car c3 = new Car("17-MD8-3238", "480km/h", 8, 9);
        System.out.println(c3.toString());
        
    }
}
