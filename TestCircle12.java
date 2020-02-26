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
public class TestCircle12 {
    public static void main(String[] args) {
        Circle12 c1 = new Circle12();
        c1.setRadius(3.3);
        System.out.println("The Radius of circle is " + c1.getRadius() + ", The Area of Circle is " + c1.getArea() + ", The Cirumference of Circle is " + c1.getCirumference());
        System.out.println(c1.toString());
        
        Circle12 c2 = new Circle12(5.6);
        c2.setRadius(3.4);
        System.out.println("The radius of Circle is " + c2.getRadius() + ", The Area of circle is " + c2.getArea() + ", The Cirumference of Circle is " + c2.getCirumference() );
        System.out.println(c2.toString());
    } 
    
}
