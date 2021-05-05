package com.company;

public class Main {

    public static void main(String[] args) {

        Member member = new Member(1,"melih","mmh.melih@gmail.com","Melih",
                "HOCAOĞLU","11111111111","2001");

        MemberManager memberManager = new MemberManager(new MySqlLogger());
        Game game1 = new Game(1,"game1",200,"game1");
        GameManager gameManager = new GameManager();

        Sale sale = new Sale(1,"sale1",30);
        gameManager.purchase(game1,member);
        gameManager.purchase(game1,member,sale);
    }
}
