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
public class Add2Integer {
   
    public static void main(String[] args) {
        int number1,number2,sum;
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        System.out.println();
        System.out.print("Number1: ");
        number1 = sc.nextInt();
        System.out.print("Number2: ");
        number2 = sc.nextInt();
        sum = number1 + number2;
        
        System.out.println("Total " + sum);
    }
}
