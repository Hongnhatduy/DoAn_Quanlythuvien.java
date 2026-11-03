package model.connguoi;

import java.util.*;

public abstract class ConNguoi {
    private String hoTen;
    private String ngaySinh;
    private boolean gioiTinh;
    private String sdt;

    public ConNguoi() {
    }

    public ConNguoi(String hoTen, String ngaySinh, boolean gioiTinh, String sdt) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public ConNguoi(ConNguoi cn) {
        this.hoTen = cn.hoTen;
        this.ngaySinh = cn.ngaySinh;
        this.gioiTinh = cn.gioiTinh;
        this.sdt = cn.sdt;
    }


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    // Sửa Getter thành camelCase
    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    protected void nhapChung(Scanner sc) {
        System.out.println("Nhap Ho va Ten : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay thang nam sinh : ");
        ngaySinh = sc.nextLine();

        while (true) {
            System.out.print("Nhap gioi tinh (1.Nam | 2.Nu) : ");
            int luaChon = sc.nextInt();
            if (luaChon == 1) {
                gioiTinh = true;
                break;
            } else if (luaChon == 2) {
                gioiTinh = false;
                break;
            } else {
                System.out.print("Nguoi dung nhap khong hop le! Vui long nhap lai so 1 hoac 2 : ");
            }
        }

        sc.nextLine();
        System.out.println("Nhap so dien thoai : ");
        sdt = sc.nextLine();
    }


    protected void xuatChung() {
        System.out.println("Ho va ten : " + hoTen);
        System.out.println("Ngay sinh : " + ngaySinh);
        String chuGioiTinh = gioiTinh ? "Nam" : "Nữ";
        System.out.println("Gioi tinh : " + chuGioiTinh);
        System.out.println("So dien thoai : " + sdt);
    }


    public abstract void nhap(Scanner sc);

    public abstract void xuat();
    public abstract String toFileString();
}