/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teacherandstudentmanagement;

/**
 *
 * @author HOANG
 */
    public abstract class Person {
    String email;
    String fullName;
    int birthYear;
    String gender;
    String phoneNumber;
    String address;
    String Class;
    String id;
    String Subject;


    

    public Person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address, String Class, String id, String Subject) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.Class = Class;
        this.id = id;
        this.Subject = Subject;
    }

    public abstract void displayInfo();
}
