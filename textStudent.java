/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author User
 */
public class textStudent {
    public static void main (String[] args){
        Student s = new Student();
        Student s2 = new Student("Paul Lee", 5.4);
        Student s3 = new Student("Petter Pan", 5.8);
        
        
        s2.getStudent();
        s3.getGpa();
    }
}
