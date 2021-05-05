package com.company;

public class Member {

    private int memberId;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String nationalId;
    private String birthYear;

    public Member(int memberId, String username, String email, String firstName, String lastName,
                  String nationalId, String birthYear) {
        this.memberId = memberId;
        this.setUsername(username);
        this.setEmail(email);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalId(nationalId);
        this.setBirthYear(birthYear);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public int getMemberId() {
        return memberId;
    }
}
