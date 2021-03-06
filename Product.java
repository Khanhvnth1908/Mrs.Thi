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
public class Product {
    private int id;
    private String name;
    private double price;
    private double qty;
    private String decription;
    
    //
    public Product(int id,String name,double price,double qty,String decription){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.decription = decription;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, double price, double qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product(int id, String name, double price, String decription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.decription = decription;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getQty(){
        return qty;
    }
   
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + '}';
    }
}
