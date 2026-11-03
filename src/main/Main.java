package main;

import manegement.DSCN;
import java.util.*;
import model.connguoi.ConNguoi;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSCN danhSach = new DSCN();
        int choice;

        do {
            System.out.println("\n========== MENU QUAN LY CON NGUOI THU VIEN ==========");
            System.out.println("1. Nhập danh sách ban đầu");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Thêm đối tượng mới (Doc Gia / Nhan Vien)");
            System.out.println("4. Xóa đối tượng theo mã");
            System.out.println("5. Tìm kiếm đối tượng theo mã");
            System.out.println("6. Sửa thông tin đối tượng");
            System.out.println("7. Xem thông tin chi tiết đối tượng");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    danhSach.Nhap(sc);
                    break;
                case 2:
                    System.out.println("\n--- DANH SÁCH CON NGƯỜI TRONG THƯ VIỆN ---");
                    danhSach.Xuat();
                    break;
                case 3:
                    danhSach.add(sc);
                    break;
                case 4:
                    danhSach.Remove(sc);
                    break;
                case 5:
                    ConNguoi kq = danhSach.search(sc);
                    if (kq != null) {
                        System.out.println("=> Đã tìm thấy đối tượng!");
                        kq.Xuat(); // Gọi phương thức Xuat() của đối tượng tìm thấy
                    }
                    break;
                case 6:
                    danhSach.sua(sc);
                    break;
                case 7:
                    danhSach.Xem(sc);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 0 đến 7.");
            }
        } while (choice != 0);

        sc.close();
    }
}
