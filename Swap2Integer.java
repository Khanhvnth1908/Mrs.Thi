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
public class Swap2Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: " );   
        int number1;
        number1 = sc.nextInt();
        System.out.print("Nhap so thu hai: " );
        int number2;
        number2 = sc.nextInt();
        int a = number1;
        
        number1 = number2;
        number2 = a;
        System.out.println("Swap 2 Integer");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
