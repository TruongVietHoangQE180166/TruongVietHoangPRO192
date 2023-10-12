

package com.mycompany.viethoang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viethoang {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Student> students = new ArrayList<>();
            
            int choice = 0;
            while (choice != 6) {
                try {
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
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                
                switch (choice) {
                    case 1 -> {
                        int choice3 = 0;
                        while (choice3 != 2){
                            System.out.println("1. nhap thong tin");
                            System.out.println("2. ket thuc nhap thong tin");
                            choice3 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice3) {
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
                                    String studentId = scanner.nextLine();
                        
                                    System.out.print("Nhập điểm chuyen can: ");
                                    double mark1 = scanner.nextDouble();
                                    System.out.print("nhap diem giưa ki: ");
                                    double mark2 = scanner.nextDouble();
                                    System.out.print("nhap diem cuoi ki: ");
                                    double mark3 = scanner.nextDouble();
                                    scanner.nextLine(); // Consume the newline character
                        
                                    Student student = new Student(email, fullName, birthYear, gender, phoneNumber, address, studentId, mark1, mark2, mark3);
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
                        try {
                            try (FileWriter writer = new FileWriter("students.txt", true)) {
                                for (Student student : students) {
                                    writer.write(student.toString() + "\n");
                                }
                            }
                            System.out.println("Successfully wrote to the file.");
                            } catch (IOException e) {
                            System.out.println("An error occurred.");
                            }
                        break;
                        
                    }
                    case 2 -> {
                        int choice1 = 0;
                        while (choice1 != 3) {
                        System.out.println("1. tim bang ten");
                        System.out.println("2. tim bang id sinh vien");
                        System.out.println("3. ket thuc");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        switch (choice1){
                            case 1 -> {
                                System.out.println("Nhập tên sinh viên:");
                                String ten = scanner.nextLine();
                                Student sv1 = Student.timKiemTheoTen(ten, students);
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
                                Student sv2 = Student.timKiemTheoTen(id, students);
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
                        try {
                            try (FileReader reader = new FileReader("students.txt")) {
                                BufferedReader bufferedReader = new BufferedReader(reader);
                                String line;
                                while ((line = bufferedReader.readLine()) != null) {
                                    System.out.println(line);
                                }
                            }
                        } catch (IOException e) {
                        }
                    }
                    case 4 -> {
                        int choice2 = 0;
                        while (choice2 != 3){
                        System.out.println("1. xoa bang ten");
                        System.out.println("2. xoa bang ma sinh vien");
                        System.out.println("3. ket thuc");
                        System.out.print("Nhap lua chon cua ban: ");
                        choice2 = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character 
                        switch (choice2){
                        case 1 -> {
                        System.out.print("Nhap ten sinh vien can xoa: ");
                        String fullName = scanner.nextLine();
                        Student.xoaTheoTen(fullName, students);
                        break;
                        }
                        case 2 -> {
                        System.out.print("Nhap id sinh vien can xoa: ");
                        String studentid = scanner.nextLine();
                        Student.xoaTheoid(studentid, students);
                        break;
                        }
                        default -> System.out.println("lua chon khong hop le vui long chon lai");
                        }
     
                        }
                        try {
                            FileWriter writer = new FileWriter("students.txt", false);
                            try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                                for (Student student : students) {
                                    bufferedWriter.write(student.toString());
                                    bufferedWriter.newLine();
                                }
                            }
                        } catch (IOException e) {
                        }
                        break;
                    }
                    case 5 ->{
                        try {
                            FileWriter writer = new FileWriter("students.txt", false);
                            BufferedWriter bufferedWriter = new BufferedWriter(writer);
                            bufferedWriter.close();
                        } catch (IOException e) {
                        }
                    }
                    case 6 -> System.out.println("Chương trình kết thúc.");
                    default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
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

               
               
  