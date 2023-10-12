/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viethoang;

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
    String studentid;

    public Person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address, String studentid) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.studentid = studentid;
    }

    public abstract void displayInfo();
        
            }
 

 
