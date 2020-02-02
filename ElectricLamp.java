/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author User
 */
public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {
        status = false;
    }
    public void turnOn(){
        status = true;      
    }
    public void turnOff(){
        status = false;      
    }
}
