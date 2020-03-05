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
public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Nhap so nguyen a: ");
        number = scanner.nextInt();
        int reversedNumber = 0;
        int temp;
        while (number >0){
        temp = number%10;
        reversedNumber = temp + reversedNumber*10;
        number = number/10;
    }
    System.out.println("Số ngược lại là: " + reversedNumber);
    }
}
