/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_06;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CircleCompuation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area,diameter,circumfference;
        double radius;
        System.out.print("Input radius :");
        radius = scanner.nextInt();
        
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
        circumfference = 2 * Math.PI * radius;
        System.out.println("Diameter = " + diameter);
        System.out.println("Area = " + area);
        System.out.println("Circumfence = " + circumfference);
    }
}
