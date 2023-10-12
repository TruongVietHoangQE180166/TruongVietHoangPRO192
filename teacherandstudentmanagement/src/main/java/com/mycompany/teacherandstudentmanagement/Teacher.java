/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teacherandstudentmanagement;

/**
 *
 * @author HOANG
 */
import java.util.List;

public abstract class Teacher extends Person {
    public Teacher(String email, String fullName, int birthYear, String gender, String phoneNumber, String address, String Class, String id, String Subject) {
    
        super(email, fullName, birthYear, gender, phoneNumber, address, Class, id, Subject);
    }
    @Override
    public void displayInfo() {
      System.out.println("|------------------------------------------|");
      System.out.println("|INFORMATION:                              |");
      System.out.println("|------------------------------------------|");
        System.out.println("|Email: " + email);
        System.out.println("|Full Name: " + fullName);
        System.out.println("|Birth Year: " + birthYear);
        System.out.println("|Gender: " + gender);
        System.out.println("|Phone Number: " + phoneNumber);
        System.out.println("|Address: " + address);
        System.out.println("|Class: "+ Class);
        System.out.println("|ID: "+ id);
        System.out.println("|Subject: "+ Subject);
      System.out.println("|------------------------------------------|");
    }
            public static Teacher timKiemTheoTen2(String fullName, List<Teacher> teachers) {
        for (Teacher s : teachers) {
            if (s.fullName.equals(fullName)) {
                return s;
            }
        }
        return null; 
    }

    public static Teacher timKiemTheoMaSV2(String id, List<Teacher> teachers) {
        for (Teacher s : teachers) {
            if (s.id.equals(id)) {
                return s;
            }
        }
        return null; 
    }
    
    public static void xoaTheoTen2(String fullName, List<Teacher> teachers) {
        Teacher teacherToRemove = null;
    for (Teacher s : teachers) {
        if (s.fullName.equals(fullName)) {
            teacherToRemove = s;
            break;
        }
    }
    if (teacherToRemove != null) {
        teachers.remove(teacherToRemove);
        System.out.println("->Sinh vien đa đuoc xoa.");
    } else {
        System.out.println("->Khong tim thay sinh vien.");
    }
    }

    public static void xoaTheoid2(String id, List<Teacher> teachers) {
        Teacher teacherToRemove = null;
    for (Teacher s : teachers) {
        if (s.id.equals(id)) {
            teacherToRemove = s;
            break;
        }
    }
    if (teacherToRemove != null) {
        teachers.remove(teacherToRemove);
        System.out.println("->Sinh vien đa đuoc xoa.");
    } else {
        System.out.println("->Không tim thay sinh vien.");
    }
    }
}