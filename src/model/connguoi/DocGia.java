package model.connguoi;

import java.util.*;

public class DocGia extends ConNguoi {
    private String maDocGia;
    private String ngayHetHanThe;

    public DocGia() {
        super();
    }

    public DocGia(String hoTen, String ngaySinh, boolean gioiTinh, String sdt, String maDocGia, String ngayHetHanThe) {
        super(hoTen, ngaySinh, gioiTinh, sdt);
        this.maDocGia = maDocGia;
        this.ngayHetHanThe = ngayHetHanThe;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public void setNgayHetHanThe(String ngayHetHanThe) {
        this.ngayHetHanThe = ngayHetHanThe;
    }


    public String getMaDocGia() {
        return maDocGia;
    }

    public String getNgayHetHanThe() {
        return ngayHetHanThe;
    }


    @Override
    public void nhap(Scanner sc) {
        super.nhapChung(sc);
        System.out.print("Nhap ma Doc Gia : ");
        maDocGia = sc.nextLine();
        System.out.print("Nhap ngay het han the : ");
        ngayHetHanThe = sc.nextLine();
    }


    @Override
    public void xuat() {
        super.xuatChung();
        System.out.println("Ma Doc Gia : " + maDocGia);
        System.out.println("Ngay het han the : " + ngayHetHanThe);
    }
    @Override
    public String toFileString() {

        return "DOCGIA|" + getHoTen() + "|" + getNgaySinh() + "|" + getGioiTinh() + "|"
                + getSdt() + "|" + maDocGia + "|" + ngayHetHanThe;
    }
}