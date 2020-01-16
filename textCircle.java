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
public class textCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(0 ,"red");
        Circle c3 = new Circle(3 ,"yellow");
        
        //goi phuong thuc
        c2.moves();
        c3.says();
    }
}
