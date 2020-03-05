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
public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double SALE_TAX_RATE = 0.07;
        double salary;
        double price;
        double sale_tax;
        int x;
        System.out.print("Nhap gia tri cua x: ");
        x = scanner.nextInt();
        
        while(x!=-1){
            System.out.print("Enter the tax-inclusive prices dollar(or -1 to end): ");
            salary = scanner.nextDouble();
            sale_tax = salary * SALE_TAX_RATE;
            price = salary - sale_tax;
            
            String result = String.format("%.2f", price);
            System.out.println("Actual price is: " + result);
             String result2 = String.format("%.2f",sale_tax);
            System.out.println("Sale tax is: " + result2);
            
            if (salary==-1) {
                double total_salary = 0;
                double total_price = 0;
                double total_sale_tax = 0;
                
                
                
                
            }
        }
    }
}
