package com.company;

public class Game {

    public Game(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Game(int id, String name, double price, String description, Sale sale){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    int id;
    String name;
    double price;
    String description;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
