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
public class SumProductMinMax3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("nhap so thu 1");
        number1 = scanner.nextInt();
          System.out.println("nhap so thu 2");
        number2 = scanner.nextInt();
          System.out.println("nhap so thu 3");
        number3 = scanner.nextInt();
        int[] number = {number1,number2,number3};
        int sum = 0,product = 1;
        int min = number[0];
        int max = number[1];
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
            product*=number[i];
            if(max < number[i]){
                max = number[i];
            }
            if(min>number[i]){
                min = number[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("The Product = " + product );
    }
}
