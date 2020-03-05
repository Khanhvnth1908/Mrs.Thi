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
public class Array {
    private static Scanner scanner = new Scanner(System.in);
    
    public static int[] initArray(int size){
        System.out.println("Enter " + "Size " + "Integer values.\r");
        int[] values = new int[size];
        for (int i = 0; i < values.length; i++) {             // nhap cac co trong mang
            values[i] = scanner.nextInt();
            System.out.println();
        }
        return values;      
    }
    
    public static double getAverage(int[] array){
        int sum= 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];                                     // trung binh cong cac so trong mang
        }
        return (double)sum / array.length;
    }
    
 public static int Max(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Element " + i +", typed values was " + a[i]);
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
}
      public static int Min(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Element " + i +", typed values was " + a[i]);
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
}  
    public static void main(String[] args) {
        int[] myIntegers = initArray(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i +", typed values was " + myIntegers[i]);
        }
        System.out.println("The verage is " + getAverage(myIntegers));                       // in ra gia tri
        for (int i = myIntegers.length - 1; i >=0 ; i--) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println();
         System.out.println("Max: " + Max(myIntegers));
        System.out.println("Min: " + Min(myIntegers));
       
    }
}
