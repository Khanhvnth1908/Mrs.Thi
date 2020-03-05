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
public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double below55_emlpoyee = 0.2;
        double below55_employer = 0.17;
        double above55_60_employee = 0.13;
        double above55_60_employer = 0.13;
        double above60_65_employee = 0.075;
        double above60_65_employer = 0.09;
        double above65_employee = 0.05;
        double above65_employer = 0.075;
        double result = 0;
        double equal = 0;
        System.out.print("Enter the monthy salary: ");
        double monthy_salary;
        monthy_salary = scanner.nextInt();
        System.out.print("Enter the age: ");
        int age;
        age = scanner.nextInt();
        
        if(age>=18 && age<=55){
            result = monthy_salary * below55_emlpoyee;
            equal = monthy_salary * below55_employer;
        }else if(age>55&&age<=60){
            result = monthy_salary *above55_60_employee;
            equal = monthy_salary * above55_60_employer;
        }else if(age>60&&age<=65){
            result = monthy_salary *above60_65_employee;
            equal = monthy_salary * above60_65_employee;
        }else if(age>65){
            result = monthy_salary * above65_employee;
            equal = monthy_salary * above65_employer;
        }
        System.out.println("The empolyee's contribution is: " + result);
        System.out.println("The empolyer's contribution is: " + equal);
    }
}
