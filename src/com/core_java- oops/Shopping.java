package com.core_java;

class ShoppingCart {
    String productName;
    int quantity;
    int price;

    ShoppingCart(String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    
    ShoppingCart(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
        
    }
    
    ShoppingCart(String productName) {
        this.productName = productName; 
    }
    
    void displayItems() {
        int total = quantity * price;
        System.out.println("Product: " + productName);
        if(quantity!=0) {
        System.out.println("Quantity: " + quantity);
        }
        if(price!=0) {
        System.out.println("Price: " + price);
        }
        if(total!=0) {
        	System.out.println("Total: " + total);
        }
        System.out.println("-------------------");
    }

}
public class Shopping {

	 public static void main(String[] args) {
	        ShoppingCart p1 = new ShoppingCart("Lays", 4, 10);
	        ShoppingCart p2 = new ShoppingCart("Oreo", 2, 30);
	        ShoppingCart p3 = new ShoppingCart("Biscuit", 30, 20);
	        ShoppingCart p4 = new ShoppingCart("Lays");
	        ShoppingCart p5 = new ShoppingCart("Dairy Milk", 5);
	     
	        p1.displayItems();
	        p2.displayItems();
	        p3.displayItems();
	        p4.displayItems();
	        p5.displayItems();
	    }

}
