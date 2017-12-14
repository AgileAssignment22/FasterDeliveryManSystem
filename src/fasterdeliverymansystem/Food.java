/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasterdeliverymansystem;

import java.io.Serializable;

/**
 *
 * @author SOH JIUN WEI
 */
public class Food implements Serializable{
String foodName;
double foodPrice;
String foodID;
    void getFoodName() {
        this.foodName = foodName;
    }
    void getFoodID() {
        this.foodID = foodID;
    }
    void getFoodPrice() {
        this.foodPrice = foodPrice;
    }
   String setFoodID(String id) {
       return id;
   }
   String setFoodName(String str) {
       return str;
   }
   
   double setFoodPrice(double price) {
       return price;
   }
   
   public String toString() {
       return String.format("%s#%s#%.2f", foodID, foodName, foodPrice);
   }
   public Food(String id, String name,double price) {
       this.foodID = id;
       this.foodName = name;
       this.foodPrice = price;
   }
   
   public Food() {
       
   }
   
}
