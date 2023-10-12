/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teacherandstudentmanagement;

/**
 *
 * @author HOANG
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Teacherandstudentmanagement {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
           List<Student> students = new ArrayList<>();
           List<Teacher> teachers = new ArrayList<>();
           int choice = 0;
           while (choice != 3){
               try {
                System.out.println("|----------------------------------|");
                System.out.println("|MENU:                             |");
                System.out.println("|----------------------------------|");
                System.out.println("|1. quan ly sinh vien              |");
                System.out.println("|2. quan ly giao vien              |");
                System.out.println("|3. Ket thuc chuong trinh          |");
                System.out.println("|----------------------------------|");
                System.out.print("->Nhap lua chon cua ban: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                switch (choice){
                case 1 -> {
                    int choice1 = 0;
                    while (choice1 != 6) {
                    System.out.println("|----------------------------------|");
                    System.out.println("|MENU:                             |");
                    System.out.println("|----------------------------------|");
                    System.out.println("|1. Them sinh vien                 |");
                    System.out.println("|2. Tim kiem sinh vien             |");
                    System.out.println("|3. Hien thi toan bo sinh vien     |");
                    System.out.println("|4. xoa sinh vien ra khoi danh sach|");
                    System.out.println("|5. xoa toan bo du lieu            |");
                    System.out.println("|6. Thoat                          |");
                    System.out.println("|----------------------------------|");
                    System.out.print("->Nhap lua chon cua ban: ");
                    choice1 = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character    
                    switch (choice1){
                    case 1 -> {
                        int choice2 = 0;
                        while (choice2 != 2){
                            System.out.println("1. nhap thong tin");
                            System.out.println("2. ket thuc nhap thong tin");
                            System.out.print("->Nhap lua chon cua ban: ");
                            choice2 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice2) {
                                case 1 -> {
                                    System.out.print("Nhập email: ");
                                    String email = scanner.nextLine();
                        
                                    System.out.print("Nhập họ và tên: ");
                                    String fullName = scanner.nextLine();
                        
                                    System.out.print("Nhập năm sinh: ");
                                    int birthYear = scanner.nextInt();
                                    scanner.nextLine(); // Consume the newline character
                        
                                    System.out.print("Nhập giới tính: ");
                                    String gender = scanner.nextLine();
                        
                                    System.out.print("Nhập số điện thoại: ");
                                    String phoneNumber = scanner.nextLine();
                        
                                    System.out.print("Nhập địa chỉ: ");
                                    String address = scanner.nextLine();
                        
                                    System.out.print("Nhập mã sinh viên: ");
                                    String id = scanner.nextLine();
                                    System.out.print("nhap ten lop hoc");
                                    String Class = scanner.nextLine();
                                    System.out.print("nhap ten mon hoc");
                                    String Subject = scanner.nextLine();
                        
                                    System.out.print("Nhập điểm chuyen can: ");
                                    double mark1 = scanner.nextDouble();
                                    System.out.print("nhap diem giưa ki: ");
                                    double mark2 = scanner.nextDouble();
                                    System.out.print("nhap diem cuoi ki: ");
                                    double mark3 = scanner.nextDouble();
                                    scanner.nextLine(); // Consume the newline character
                        
                                    Student student = new Student(email, fullName, birthYear, gender, phoneNumber, address, id, Class, Subject, mark1, mark2, mark3);
                                    students.add(student);
                                    System.out.println("Sinh viên đã được thêm.");
                                    
                                    break;
                                    }
                                case 2 -> {
                                    System.out.println("ket thuc phien nhap");
                                    break;
                                    }
                                default -> System.out.println("lua chon khong hop le vui long chon lai");
                            }
                        }
                        
                        break;
                        
                    }
                    case 2 -> {
                        int choice3 = 0;
                        while (choice3 != 3) {
                        System.out.println("1. tim bang ten");
                        System.out.println("2. tim bang id sinh vien");
                        System.out.println("3. ket thuc");
                        System.out.print("->Nhập lựa chọn của bạn: ");
                        choice3 = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        switch (choice3){
                            case 1 -> {
                                System.out.println("Nhập tên sinh viên:");
                                String ten = scanner.nextLine();
                                Student sv1 = Student.timKiemTheoTen1(ten, students);
                                if (sv1 != null) {
                                    sv1.displayInfo();
                                } else {
                                    System.out.println("Không tìm thấy sinh viên.");
                                }  
                                break;
                                }
                            case 2 -> {
                                System.out.println("Nhap id:");
                                String id = scanner.nextLine();
                                Student sv2 = Student.timKiemTheoMaSV1(id, students);
                                if (sv2 != null) {
                                    sv2.displayInfo();
                                } else {
                                    System.out.println("Khong tim thay sinh vien.");
                                }  
                                break;
                                }
                                default -> System.out.println("lua chon khong hop le vui long chon lai");
    
                        }
                        }
                        
                        break;
                    }
                    case 3 -> {
                        
                    }
                    case 4 -> {
                        int choice4 = 0;
                        while (choice4 != 3){
                        System.out.println("1. xoa bang ten");
                        System.out.println("2. xoa bang ma sinh vien");
                        System.out.println("3. ket thuc");
                        System.out.print("->Nhap lua chon cua ban: ");
                        choice4 = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character 
                        switch (choice4){
                        case 1 -> {
                        System.out.print("Nhap ten sinh vien can xoa: ");
                        String fullName = scanner.nextLine();
                        Student.xoaTheoTen1(fullName, students);
                        break;
                        }
                        case 2 -> {
                        System.out.print("Nhap id sinh vien can xoa: ");
                        String studentid = scanner.nextLine();
                        Student.xoaTheoid1(studentid, students);
                        break;
                        }
                        default -> System.out.println("lua chon khong hop le vui long chon lai");
                        }
     
                        }
                        
                        break;
                    }
                    case 5 ->{
                        
                    }
                    case 6 -> System.out.println("Chương trình kết thúc.");
                    default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");                       
                    }
                    }
                    }
                case 2 -> {
                    int choice5 = 0;
                    while (choice5 != 6) {
                    System.out.println("|----------------------------------|");
                    System.out.println("|MENU:                             |");
                    System.out.println("|----------------------------------|");
                    System.out.println("|1. Them giao vien                 |");
                    System.out.println("|2. Tim kiem giao vien             |");
                    System.out.println("|3. Hien thi toan bo giao vien     |");
                    System.out.println("|4. xoa giao ra khoi danh sach     |");
                    System.out.println("|5. xoa toan bo du lieu            |");
                    System.out.println("|6. Thoat                          |");
                    System.out.println("|----------------------------------|");
                    System.out.print("->Nhap lua chon cua ban: ");
                    choice5 = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character    
                    switch (choice5){
                    case 1 -> {
                        int choice6 = 0;
                        while (choice6 != 2){
                            System.out.println("1. nhap thong tin");
                            System.out.println("2. ket thuc nhap thong tin");
                            System.out.print("->Nhap lua chon cua ban: ");
                            choice6 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice6) {
                                case 1 -> {
                                    System.out.print("Nhập email: ");
                                    String email = scanner.nextLine();
                        
                                    System.out.print("Nhập họ và tên: ");
                                    String fullName = scanner.nextLine();
                        
                                    System.out.print("Nhập năm sinh: ");
                                    int birthYear = scanner.nextInt();
                                    scanner.nextLine(); // Consume the newline character
                        
                                    System.out.print("Nhập giới tính: ");
                                    String gender = scanner.nextLine();
                        
                                    System.out.print("Nhập số điện thoại: ");
                                    String phoneNumber = scanner.nextLine();
                        
                                    System.out.print("Nhập địa chỉ: ");
                                    String address = scanner.nextLine();
                        
                                    System.out.print("Nhập mã giao vien: ");
                                    String id = scanner.nextLine();
                                    System.out.print("nhap ten lop hoc");
                                    String Class = scanner.nextLine();
                                    System.out.print("nhap ten mon hoc");
                                    String Subject = scanner.nextLine();
                        
                                    
                                    scanner.nextLine(); // Consume the newline character
                        
                                    Teacher teacher = new Teacher(email, fullName, birthYear, gender, phoneNumber, address, id, Class, Subject) {};
                                    teachers.add(teacher);
                                    System.out.println("giao vien đã được thêm.");
                                    
                                    break;
                                    }
                                case 2 -> {
                                    System.out.println("ket thuc phien nhap");
                                    break;
                                    }
                                default -> System.out.println("lua chon khong hop le vui long chon lai");
                            }
                        }
                        
                        break;
                        
                    }
                    case 2 -> {
                        int choice7 = 0;
                        while (choice7 != 3) {
                        System.out.println("1. tim bang ten");
                        System.out.println("2. tim bang id giao vien");
                        System.out.println("3. ket thuc");
                        System.out.print("->Nhập lựa chọn của bạn: ");
                        choice7 = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        switch (choice7){
                            case 1 -> {
                                System.out.println("Nhập tên giao vien:");
                                String ten = scanner.nextLine();
                                Teacher sv1 = Teacher.timKiemTheoTen2(ten, teachers);
                                if (sv1 != null) {
                                    sv1.displayInfo();
                                } else {
                                    System.out.println("Không tìm thấy giao vien.");
                                }  
                                break;
                                }
                            case 2 -> {
                                System.out.println("Nhap id:");
                                String id = scanner.nextLine();
                                Teacher sv2 = Teacher.timKiemTheoMaSV2(id, teachers);
                                if (sv2 != null) {
                                    sv2.displayInfo();
                                } else {
                                    System.out.println("Khong tim thay giao vien.");
                                }  
                                break;
                                }
                                default -> System.out.println("lua chon khong hop le vui long chon lai");
    
                        }
                        }
                        
                        break;
                    }
                    case 3 -> {
                        
                    }
                    case 4 -> {
                        int choice4 = 0;
                        while (choice4 != 3){
                        System.out.println("1. xoa bang ten");
                        System.out.println("2. xoa bang id giao vien");
                        System.out.println("3. ket thuc");
                        System.out.print("->Nhap lua chon cua ban: ");
                        choice4 = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character 
                        switch (choice4){
                        case 1 -> {
                        System.out.print("Nhap ten giao vien can xoa: ");
                        String fullName = scanner.nextLine();
                        Teacher.xoaTheoTen2(fullName, teachers);
                        break;
                        }
                        case 2 -> {
                        System.out.print("Nhap id sinh vien can xoa: ");
                        String id = scanner.nextLine();
                        Teacher.xoaTheoid2(id, teachers);
                        break;
                        }
                        default -> System.out.println("lua chon khong hop le vui long chon lai");
                        }
     
                        }
                        
                        break;
                    }
                    case 5 ->{
                        
                    }
                    case 6 -> System.out.println("Chương trình kết thúc.");
                    default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");                       
                    
                    }
                    }                        
                    }
                case 3 -> {
                        System.out.println("see you later");
                    }
                    default -> System.out.println("lua chon khong hop le vui long chon lai");                   
                    }
                    } catch (Exception e) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    }
              scanner.nextLine(); // Consume the newline character
            }
            scanner.close();
        }
    }
}
  