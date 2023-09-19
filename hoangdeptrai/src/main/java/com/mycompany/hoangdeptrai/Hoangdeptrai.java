/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoangdeptrai;

/**
 *
 * @author HOANG
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hoangdeptrai {

   
     private static Map<String, String> studentMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Tìm tên sinh viên bằng mã số");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    findStudent(scanner);
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Nhập mã số sinh viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        studentMap.put(id, name);
    }

    private static void findStudent(Scanner scanner) {
        System.out.print("Nhập mã số sinh viên cần tìm: ");
        String id = scanner.nextLine();
        String name = studentMap.get(id);
        if (name == null) {
            System.out.println("Không tìm thấy sinh viên với mã số " + id);
        } else {
            System.out.println("Tên sinh viên: " + name);
        }
    }
}