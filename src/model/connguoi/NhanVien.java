package model.connguoi;

import java.util.*;

public class NhanVien extends ConNguoi {
    private String maNhanVien;
    private String chucVu;
    private double luong;

    public NhanVien() {
        super();
    }

    public NhanVien(String hoTen, String ngaySinh, boolean gioiTinh, String sdt, String maNhanVien, String chucVu, double luong) {
        super(hoTen, ngaySinh, gioiTinh, sdt);
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public double getLuong() {
        return luong;
    }


    @Override
    public void nhap(Scanner sc) {
        super.nhapChung(sc);
        System.out.print("Nhap Ma Nhan Vien : ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhap Chuc Vu : ");
        chucVu = sc.nextLine();
        System.out.print("Nhap Luong : ");
        luong = sc.nextDouble();
        sc.nextLine();
    }


    @Override
    public void xuat() {
        super.xuatChung();
        System.out.println("Ma Nhan Vien : " + maNhanVien);
        System.out.println("Chuc Vu : " + chucVu);
        System.out.println("Luong : " + luong);
    }
    @Override
    public String toFileString() {

        return "NHANVIEN|" + getHoTen() + "|" + getNgaySinh() + "|" + getGioiTinh() + "|"
                + getSdt() + "|" + maNhanVien + "|" + chucVu + "|" + luong;
    }
}