/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author User
 */
public class test_Soccerplayer {
    public static void main(String[] args){
        
        Soccerplayer s2 = new Soccerplayer(7, "Christiano Ronaldo", 6, 9);
        System.out.println(s2.toString());
        Soccerplayer s1 = new Soccerplayer(10, 2.8, 500);
        
        Soccerplayer s3 = new Soccerplayer(10, "lionel Messi", 9, 4);
        System.out.println(s3.toString());
         Soccerplayer s4 = new Soccerplayer(15, 1.8, 700);
    }
}
