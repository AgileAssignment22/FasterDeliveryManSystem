/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasterdeliverymansystem;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Food implements Serializable{
String foodName;
double foodPrice;

    void getFoodName() {
        this.foodName = foodName;
    }
    
    void getFoodPrice() {
        this.foodPrice = foodPrice;
    }
    
   String setFoodName(String str) {
       return str;
   }
   
   double setFoodPrice(double price) {
       return price;
   }
   
   public String toString() {
       return String.format("%-20s  RM%-10.2f", foodName, foodPrice);
   }
   public Food(String name,double price) {
       this.foodName = name;
       this.foodPrice = price;
   }
   
}
