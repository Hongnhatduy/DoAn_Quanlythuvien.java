package model.factory;

import model.connguoi.ConNguoi;
import model.connguoi.DocGia;
import model.connguoi.NhanVien;
import model.connguoi.ThuThu;
import model.enums.LoaiConNguoi;

public class ConNguoiFactory {


    public static ConNguoi getConNguoi(LoaiConNguoi loai) {
        if (loai == null) {
            return null;
        }

        switch (loai) {
            case DOCGIA:
                return new DocGia();
            case NHANVIEN:
                return new NhanVien();
            case THUTHU:
                return new ThuThu();
            default:
                throw new IllegalArgumentException("Loại con người không hợp lệ: " + loai);
        }
    }
}