package com.company;

public class MySqlLogger implements Logger{
    @Override
    public void log(Member member) {
        System.out.println(member.getUsername() + " successfully logged to MySQL Server.");
    }
}
