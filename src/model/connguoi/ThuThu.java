package model.connguoi;

import java.util.*;

public class ThuThu extends NhanVien {
    private String caLamViec;

    public ThuThu() {
        super();
    }

    public ThuThu(String hoTen, String ngaySinh, boolean gioiTinh, String sdt, String maNhanVien, String chucVu, double luong, String caLamViec) {
        super(hoTen, ngaySinh, gioiTinh, sdt, maNhanVien, chucVu, luong);
        this.caLamViec = caLamViec;
    }


    public String getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(String caLamViec) {
        this.caLamViec = caLamViec;
    }


    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap Ca Lam Viec : ");
        caLamViec = sc.nextLine();
    }


    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ca Lam Viec : " + caLamViec);
    }
}