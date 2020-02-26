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
public class TestCircle11{
    public static void main(String[] args) {        
        Circle11 c1 = new Circle11();    /*-1--*/
        System.out.println(" The circle has radius of: " + c1.getRadius() + " and Area of: " + c1.Area() + " The color is : " + c1.getColor());
        c1.setColor("Black");
        c1.setRadius(8);
        System.out.println(" The circle has radius of: " + c1.getRadius() + " and Area of: " + c1.Area() + " The color is : " + c1.getColor());
        System.out.println(c1.toString());
        
        Circle11 c2 = new Circle11(2);           /*--2---*/
        System.out.println("The circle has radius of: " + c2.getRadius() + " and Area of: " + c2.Area() + " The color is : " + c2.getColor());
        System.out.println(c2.toString());
        
        Circle11 c3 = new Circle11(6, "Green");   /*-4--*/
        System.out.println("Radius :" + c3.getRadius() + " Area :" + c3.Area() + " Color :" + c3.getColor());
        System.out.println(c3.toString());
        
        Circle11 c4 = new Circle11("Pink ", 3);   /*-3--*/
        System.out.println("Radius :" + c4.getRadius() + " Area :" + c4.Area() + " Color :" + c4.getColor());
        System.out.println(c4.toString());
    }
}
