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
public class Student {
    private String name;
    private double gpa;
    
    public Student(){
        System.out.println("Grade Point Average");
    }
    
    public Student(String name,double gpa){
        this.name = name;
        this.gpa = gpa;
        System.out.println(" name " + name + " gpa " + gpa);
    }
    
    public void getStudent(){
        System.out.println("I'm Iron man");
    }
    
    public void getGpa(){
        System.out.println("No,I'm not");
    }
    
}
