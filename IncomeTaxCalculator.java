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
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double seconds = 0.2;
        double thrice = 0.4;
        double fourth = 0.6;
        int income;
        System.out.print("Enter your income: ");
        income = sc.nextInt();
        double result = 0;
        
        if(0<=income&& income<=20000){
            result = 0;
        }
        if(20000<income && income<=40000){
           result =  (income - 20000) * seconds;
        }
        if (40000<income&& income<=60000) {
           result =   (income -40000) * thrice;
        }
        if(income>60000){
             result =   (income - 60000) * fourth;
        }
        String a = String.format("The income tax payable is: %.2f",result);
        System.out.println(a);
    }
}
