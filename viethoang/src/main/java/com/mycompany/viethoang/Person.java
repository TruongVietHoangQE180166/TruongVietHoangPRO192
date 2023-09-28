/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viethoang;

/**
 *
 * @author HOANG
 */
public class Person {
    private final String email;
    private final String fullName;
    private final int birthYear;
    private final String gender;
    private String phoneNumber;
    private String address;
    private String studentid;

    public Person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address, String studentid) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.studentid = studentid;
    }

    public void displayInfo() {
        System.out.println("Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("studentid: "+ studentid);
    }

    public void changePhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
    }
}

