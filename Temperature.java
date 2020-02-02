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
public class Temperature {
    private double Ctemp;

    public Temperature(double Ctemp) {
        this.Ctemp = Ctemp;
    }
    
    public double getCTemp(){
        return Ctemp;
    }
    
   public void setCTemp(double c){
        this.Ctemp = c;       
   }  
    
   public double getFTemp(){
        return  1.8 * Ctemp + 32;
   }
  
   public double getKTemp(){
        return Ctemp + 275.15;
  }
}
