package com.company;

public class GameManager {
    public void purchase(Game game, Member member){
        System.out.println(game.getName() + " successfully purchased.");
        System.out.println("Receipt sent to " + member.getEmail());
    }

    public void purchase(Game game, Member member, Sale sale){
        System.out.println(game.getName() + " successfully purchased using " + sale.name);
        System.out.println("Receipt sent to " + member.getEmail());
    }

    public void demandRefund(Game game, Member member){
        System.out.println("Refund form successfully created. \n Please check " + member.getEmail() + " inbox for your refund form.");
    }

}
