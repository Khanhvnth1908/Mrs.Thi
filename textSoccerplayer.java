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
public class textSoccerplayer {
      public static void main (String[] args){
      
       Soccerplayer p1 = new Soccerplayer(10 ,"Lionel Messi", 6, 10);
       Soccerplayer p2 = new Soccerplayer(7 ,"Christiano Ronaldo", 7, 10);
        
       
       p1.run();
       p2.kickball();
    }
}
