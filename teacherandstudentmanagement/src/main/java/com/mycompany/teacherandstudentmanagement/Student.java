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

public class Student extends Person {

    private final double mark1;
    private final double mark2;
    private final double mark3;

    public Student(String email, String fullName, int birthYear, String gender, String phoneNumber, String address, String Class, String id, String Subject, double mark1, double mark2, double mark3) {
        super(email, fullName, birthYear, gender, phoneNumber, address, Class, id, Subject);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
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
        System.out.println("|Mark1: "+ mark1);
        System.out.println("|Mark2: "+ mark2);
        System.out.println("|Mark3: "+ mark3);
      System.out.println("|------------------------------------------|");
    }
        public static Student timKiemTheoTen1(String fullName, List<Student> students) {
        for (Student s : students) {
            if (s.fullName.equals(fullName)) {
                return s;
            }
        }
        return null; 
    }

    public static Student timKiemTheoMaSV1(String id, List<Student> students) {
        for (Student s : students) {
            if (s.id.equals(id)) {
                return s;
            }
        }
        return null; 
    }
    
    public static void xoaTheoTen1(String fullName, List<Student> students) {
        Student studentToRemove = null;
    for (Student s : students) {
        if (s.fullName.equals(fullName)) {
            studentToRemove = s;
            break;
        }
    }
    if (studentToRemove != null) {
        students.remove(studentToRemove);
        System.out.println("->Sinh vien đa đuoc xoa.");
    } else {
        System.out.println("->Khong tim thay sinh vien.");
    }
    }

    public static void xoaTheoid1(String id, List<Student> students) {
        Student studentToRemove = null;
    for (Student s : students) {
        if (s.id.equals(id)) {
            studentToRemove = s;
            break;
        }
    }
    if (studentToRemove != null) {
        students.remove(studentToRemove);
        System.out.println("->Sinh vien đa đuoc xoa.");
    } else {
        System.out.println("->Không tim thay sinh vien.");
    }
    }
}



