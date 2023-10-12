package com.mycompany.viethoang;

import java.util.List;

public class Student extends Person {

    private final double mark1;
    private final double mark2;
    private final double mark3;

    public Student(String email, String fullName, int birthYear, String gender, String phoneNumber, String address, String studentid, double mark1, double mark2, double mark3) {
        super(email, fullName, birthYear, gender, phoneNumber, address, studentid);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public void displayInfo() {
      System.out.println("----------------------------------------------------");
      System.out.println("INFORMATION:                                        ");
      System.out.println("----------------------------------------------------");
        System.out.println("Email: " + email);
      System.out.println("----------------------------------------------------");
        System.out.println("Full Name: " + fullName);
      System.out.println("----------------------------------------------------");
        System.out.println("Birth Year: " + birthYear);
      System.out.println("----------------------------------------------------");
        System.out.println("Gender: " + gender);
      System.out.println("----------------------------------------------------");
        System.out.println("Phone Number: " + phoneNumber);
      System.out.println("----------------------------------------------------");
        System.out.println("Address: " + address);
      System.out.println("----------------------------------------------------");
        System.out.println("studentid: "+ studentid);
      System.out.println("----------------------------------------------------");
        System.out.println("mark1: "+ mark1);
      System.out.println("----------------------------------------------------");
        System.out.println("mark2: "+ mark2);
      System.out.println("----------------------------------------------------");
        System.out.println("mark3: "+ mark3);
      System.out.println("----------------------------------------------------");
    }
    @Override
    public String toString() {
    return"---------------------------------------------------------------------" + "\n" +
          "INFORMATION:                              " + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "email: " + this.email + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "Fullname: " + this.fullName + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "BirthYear: " + this.birthYear + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "gender: " + this.gender + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "PhoneNumber: " + this.phoneNumber + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "Address: " + this.address + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "studentid: " + this.studentid + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "mark1: " + this.mark1 + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "mark2: " + this.mark2 + "\n" +
          "---------------------------------------------------------------------" + "\n" +
          "mark3: " + this.mark3 + "\n" +
          "|--------------------------------------------------------------------";
}

    public static Student timKiemTheoTen(String fullName, List<Student> students) {
        for (Student s : students) {
            if (s.fullName.equals(fullName)) {
                return s;
            }
        }
        return null; 
    }

    public static Student timKiemTheoMaSV(String studentid, List<Student> students) {
        for (Student s : students) {
            if (s.studentid.equals(studentid)) {
                return s;
            }
        }
        return null; 
    }
    
    public static void xoaTheoTen(String fullName, List<Student> students) {
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

    public static void xoaTheoid(String studentid, List<Student> students) {
        Student studentToRemove = null;
    for (Student s : students) {
        if (s.studentid.equals(studentid)) {
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
