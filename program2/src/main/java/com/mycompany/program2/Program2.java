/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program2;

/**
 *
 * @author HOANG
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        
public class Program2 {
    public static void main(String[] args) {
        List<String> danhSachHoTen = new ArrayList<>();
        List<Double> danhSachDiem = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice=1;

        do {
            try {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Nhập thông tin");
                System.out.println("2. Thêm thông tin");
                System.out.println("3. Tìm kiếm");
                System.out.println("4. xóa thong tin khỏi danh sách");
                System.out.println("0. Thoát");
                System.out.print("Nhập lựa chọn của bạn: ");

                choice = scanner.nextInt();

                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Nhập số người trong danh sách: ");
                        int soNguoi = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        for (int i = 0; i < soNguoi; i++) {
                            System.out.print("Nhập họ tên người thứ " + (i + 1) + ": ");
                            String hoTen = scanner.nextLine();
                            danhSachHoTen.add(hoTen);

                            System.out.print("Nhập điểm giữa kì của người thứ " + (i + 1) + ": ");
                            double diem1 = scanner.nextDouble();
                            System.out.print("nhập điểm chuyên cần của người thứ " + (i + 1) + ": ");
                            double diem2 = scanner.nextDouble();
                            System.out.print("nhap diem cuoi ki cua nguoi thu " + (i + 1) + ": ");
                            double diem3 = scanner.nextDouble();
                            double diem4 = diem1*10/100 + diem2*20/100 + diem3*70/100;
                            danhSachDiem.add(diem4);
                        }
                        break;
                    case 2:
                        System.out.print("Nhập họ tên: ");
                        String hoTen = scanner.nextLine();
                        danhSachHoTen.add(hoTen);

                             System.out.print("Nhập điểm giữa kì: ");
                            double diem1 = scanner.nextDouble();
                            System.out.print("nhập điểm chuyên cần: ");
                            double diem2 = scanner.nextDouble();
                            System.out.print("nhap diem cuoi ki: ");
                            double diem3 = scanner.nextDouble();
                            double diem4 = diem1*10/100 + diem2*20/100 + diem3*70/100;
                        danhSachDiem.add(diem4);

                        System.out.println("Thông tin đã được thêm thành công.");
                        break;
                    case 3:
                        System.out.print("Nhập họ tên người cần tìm: ");
                        String nguoiCanTim = scanner.nextLine();

                        int index = danhSachHoTen.indexOf(nguoiCanTim);
                        if (index != -1) {
                            double diemtrungbinh = danhSachDiem.get(index);
                            System.out.println( nguoiCanTim + " có trong danh sách với diem trung binh la " + diemtrungbinh + " điểm.");
                        } else {
                            System.out.println( nguoiCanTim + " không có trong danh sách.");
                        }
                        break;
                    case 4:
                        System.out.print("Nhập họ tên người cần xóa: ");
                        String nguoiCanXoa = scanner.nextLine();

                        int indexXoa = danhSachHoTen.indexOf(nguoiCanXoa);
                        if (indexXoa != -1) {
                        danhSachHoTen.remove(indexXoa);
                        danhSachDiem.remove(indexXoa);
                        System.out.println("Thông tin của người " + nguoiCanXoa + " đã được xóa khỏi danh sách.");
                        } else {
                        System.out.println("Người " + nguoiCanXoa + " không có trong danh sách.");
                        }
                        break;
                    case 0:
                        System.out.println("Thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
                
            } catch (Exception e) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
                scanner.nextLine(); // Consume the newline character

        } while (choice != 0);
                scanner.close();
    }
}
                    
                    
                