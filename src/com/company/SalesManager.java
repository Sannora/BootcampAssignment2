package com.company;

public class SalesManager {
    public void addSale(Sale sale){
        System.out.println(sale + " successfully added.");
    }

    public void endSale(Sale sale){
        System.out.println(sale + " ended.");
    }

    public void updateSale(Sale sale){
        System.out.println(sale + " successfully updated.");
    }
}
