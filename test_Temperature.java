/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author User
 */
public class test_Temperature {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(25);
        
        System.out.println("CTemp " + t1.getCTemp());
        System.out.println("FTemp " + t1.getFTemp());
        System.out.println("KTemp " + t1.getKTemp());
    }
}
