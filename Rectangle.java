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
public class Rectangle {
    private double width;
    private int height;
    
    public Rectangle(double width, int height) {
        this.width = width;
        this.height = height;
         System.out.println("width " + width + " height " + height);
    }
      
   public int getHeight(){
       return this.height;
   }
   
   public void setHeight(int rectangular){
       this.height = rectangular;
   }
    
   public double getWidth(){
       return this.width;
   }
   
   public void setWidth(int rectangular){
       this.width = rectangular;
   }
    
    public double getArea(){
        return width * height;
    }
    
    public double getPeremeter(){
        return  (width + height) * 2;
    }
    public void display(){
        for(int i=1;i<= width;i++){
            for(int j=1;j<=height;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
