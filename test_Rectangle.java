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
public class test_Rectangle {
    public static void main(String[] args){
        
        
        Rectangle r1;        
        r1 = new Rectangle(3, 6);
        System.out.println("Area" + r1.getArea());
        System.out.println("Peremeter" + r1.getPeremeter());
        r1.display();
       
          
        System.out.println("After ------------------");
        r1.setWidth(4);
        r1.setHeight(9);
        System.out.println("width " + r1.getWidth() + " height " + r1.getHeight());
        System.out.println(r1.getArea());
        System.out.println(r1.getPeremeter());
        r1.display();
    }
}
