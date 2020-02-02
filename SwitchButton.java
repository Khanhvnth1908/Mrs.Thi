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
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    
    //constructor de khoi tao doi tuong
    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }
    
    public void switchOn(){
        status = true;
        lamp.turnOn();
    }
    public void switchOff(){
        status = false;
        lamp.turnOff();
    } 
    public static void main(String[] args) {
        ElectricLamp l = new ElectricLamp();   //doi tuong 1
        SwitchButton s = new SwitchButton();   // doi tuong 2
        s.connectToLamp(l);                  //ket noi 2 class bang 2 doi tuong
        int a = 0;
        for(int i=0;i<10;i++){
            a = i + 1;
            System.out.println(" TurnOff " + a);
        }
    }
}
