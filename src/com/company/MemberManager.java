package com.company;

public class MemberManager {

    private Logger logger;

    public MemberManager(Logger logger){
        this.logger = logger;
    }

    public void register(Member member){
        System.out.println(member.getUsername() + " successfully registered.");
        logger.log(member);
    }

    public void updateCredentials(Member member){
        checkCredentials(member);
        System.out.println("User credentials updated.");
    }

    public void unregister(Member member){
        checkCredentials(member);
        System.out.println("User " + member.getUsername() + " successfully unregistered.");
    }

    public void checkCredentials(Member member){
        System.out.println("Credential check successful.");
    }
}
