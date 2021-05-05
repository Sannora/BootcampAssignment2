package com.company;

public class OracleLogger implements Logger{
    @Override
    public void log(Member member) {
        System.out.println(member.getUsername() + " successfully logged to Oracle Server.");
    }
}
