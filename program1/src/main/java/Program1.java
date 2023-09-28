/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program1;

/**
 *
 * @author HOANG
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Lựa chọn 1");
            System.out.println("2. Lựa chọn 2");
            System.out.println("3. Lựa chọn 3");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.println("Bạn đã chọn lựa chọn 1");
                        double num1, num2;
                        boolean validInput = false;
                        do {
                            System.out.println("Nhập số thứ nhất: ");
                            try {
                                num1 = scanner.nextDouble();
                                validInput = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại số.");
                                scanner.nextLine(); // Consume the invalid input
                                num1 = 0; // Set num1 to an invalid value to continue the loop
                            }
                        } while (!validInput);

                        validInput = false;
                        do {
                            System.out.println("Nhập số thứ hai: ");
                            try {
                                num2 = scanner.nextDouble();
                                validInput = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại số.");
                                scanner.nextLine(); // Consume the invalid input
                                num2 = 0; // Set num2 to an invalid value to continue the loop
                            }
                        } while (!validInput);

                        System.out.println("Kết quả cộng: " + (num1 + num2));
                        System.out.println("Kết quả trừ: " + (num1 - num2));
                        System.out.println("Kết quả nhân: " + (num1 * num2));
                        if (num2 != 0) {
                            System.out.println("Kết quả chia: " + (num1 / num2));
                        } else {
                            System.out.println("Không thể chia cho 0");
                        }
                        break;
                    case 2:
                        System.out.println("Bạn đã chọn lựa chọn 2");
                        System.out.println("Nhập họ: ");
                        String lastName = scanner.nextLine();
                        System.out.println("Nhập tên: ");
                        String firstName = scanner.nextLine();
                        System.out.println("Tên đầy đủ: " + lastName + " " + firstName);
                        break;
                    case 3:
                                                System.out.println("Bạn đã chọn lựa chọn 3");
                        System.out.println("Nhập một chuỗi: ");
                        String input = scanner.nextLine();
                        System.out.println("Chuỗi đã nhập: " + input);
                        break;
                    case 0:
                        System.out.println("Bạn đã chọn thoát");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                scanner.nextLine(); // Consume the invalid input
                choice = -1; // Set choice to an invalid value to continue the loop
            }
        } while (choice != 0);
    }
}