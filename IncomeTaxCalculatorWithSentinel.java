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
public class IncomeTaxCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double seconds = 0.2;
        double thrice = 0.4;
        double fourth = 0.6;
        int income;
        double result = 0;
        int x;
        System.out.println("Nhap gia tri cua x");
        x = scanner.nextInt();
       
        while(x!=-1){
            System.out.print("Enter your income(or -1 to end):");
          income = scanner.nextInt();
           if(income==-1){
                System.out.println("Byee!");
                break;
          }
          if(income<=20000){
              result = 0;
          }else if(income>20000 && income <=40000){
              result = (income - 20000) * seconds;
          }else if(income>40000 && income<=60000){
              result = (income - 40000) * thrice;
          }else if(income>60000){
              result = (income - 60000) * fourth;
          }
            String a = String.format("The income tax payable is: %.2f",result);
            System.out.println(a);
          }
        }
    }
