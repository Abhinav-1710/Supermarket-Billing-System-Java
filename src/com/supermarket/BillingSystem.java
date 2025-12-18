package com.supermarket;

import java.util.ArrayList;

public class BillingSystem {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void generateBill() {
        double total = 0;
        System.out.println("\n------ BILL ------");
        for (Product p : products) {
            System.out.println(p.name + " x " + p.quantity + " = " + p.getTotalPrice());
            total += p.getTotalPrice();
        }
        System.out.println("------------------");
        System.out.println("Total Amount: ₹" + total);
    }
}
