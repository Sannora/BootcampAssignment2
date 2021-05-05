package com.company;

public class Sale {

    int id;
    String name;
    double priceAfterSale;
    double saleDiscount;

    public Sale(int id, String name, double saleDiscount) {
        this.id = id;
        this.name = name;
        this.saleDiscount = saleDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public double getPriceAfterSale(Game game) {
        return game.getPrice() - (game.getPrice() * (saleDiscount/100));
    }

}
