package manegement;
import model.connguoi.ConNguoi;
import model.connguoi.DocGia;
import model.connguoi.NhanVien;
import model.connguoi.ThuThu;

import java.util.*;
public class DSCN {
    private ConNguoi[] DSCN;
    private int n;

    public DSCN() {
        this.n = 0;
    }

    public DSCN(int n, ConNguoi[] DSCN) {
        this.DSCN = DSCN;
        this.n = n;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap so luong con nguoi : ");
        n = sc.nextInt();
        sc.nextLine();
        DSCN = new ConNguoi[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nguoi thu " + (i + 1) + " : ");
            System.out.print("Chon doi tuong nhap (1.DocGia|2.NhanVien) : ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                DSCN[i] = new DocGia();

            } else if (choice == 2) {
                DSCN[i] = new NhanVien();
            } else {
                System.out.println("Lua chon khong hop le! Vui long chon lai : ");
                i--;
                continue;
            }
            DSCN[i].Nhap(sc);


        }

    }

    public void Xuat() {
        for (int i = 0; i < n; i++) {

               System.out.println("Nguoi thu "+(i+1)+" : ");
            DSCN[i].Xuat();
            System.out.println();
           }
        }


    public void add(Scanner sc) {
        DSCN = Arrays.copyOf(DSCN, n + 1);
        while (true) {
            System.out.print("Chon doi tuong nhap (1.DocGia|2.NhanVien) : ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                DSCN[n] = new DocGia();
                break;

            } else if (choice == 2) {
                DSCN[n] = new NhanVien();
                break;
            } else {
                System.out.println("Lua chon khong hop le! Vui long chon lai : ");

            }
        }
        DSCN[n].Nhap(sc);
        n++;


    }
    public void Remove(Scanner sc){
        System.out.println("Nhap Ma Doc Gia hoac Nhan Vien muon xoa : ");
        String ma =sc.nextLine();
       for(int i=0;i<n;i++)
       {
           if (DSCN[i] instanceof DocGia) {
               DocGia dg=(DocGia) DSCN[i];
               if(dg.GetmaDocGia().equals(ma)){
                   for(int j=i;j<n-1;j++)
                   {
                       DSCN[j]=DSCN[j+1];
                   }
                   DSCN=Arrays.copyOf(DSCN,n-1);
                   n--;
                   break;
               }
           } else if(DSCN[i] instanceof NhanVien){
               NhanVien nv=(NhanVien) DSCN[i];
               if(nv.GetMaNhanVien().equals(ma)){
                   for(int j=i;j<n-1;j++)
                   {
                       DSCN[j]=DSCN[j+1];
                   }
                   DSCN=Arrays.copyOf(DSCN,n-1);
                   n--;
                   break;

               }
           }

       }


    }
    public ConNguoi search(Scanner sc){
        System.out.println("Nhap Ma Doc Gia hoac Nhan Vien muon xoa : ");
        String ma =sc.nextLine();
        for(int i=0;i<n;i++)
        {
            if (DSCN[i] instanceof DocGia) {
                DocGia dg=(DocGia) DSCN[i];
                if(dg.GetmaDocGia().equals(ma)){
                    return DSCN[i];

                }
            } else if(DSCN[i] instanceof NhanVien){
                NhanVien nv=(NhanVien) DSCN[i];
                if(nv.GetMaNhanVien().equals(ma)){
                   return DSCN[i];
                }
            }

        }
             return null;

    }
    public void sua(Scanner sc){

        ConNguoi cn=search(sc);
        if(cn==null) {
            System.out.print("Khong tim thay nguoi khop voi ma vua nhap");
                    return;
        }
        while(true){
        System.out.println("DA TIM THAY DOI TUONG");
        System.out.println("Hay chon mot trong cac lua chon sau");
        System.out.println("Hay chon mot trong cac lua chon sau");
        System.out.println("1.Sua Ho ten");
        System.out.println("2.Sua Ngay Sinh");
        System.out.println("3.Sua Gioi Tinh");
        System.out.println("4.Sua So Dien Thoai");
        if(cn instanceof DocGia)
        {
            System.out.println("5.Sua ngay het han the");
        }
        else if(cn instanceof ThuThu){
            System.out.println("5.Sua Chuc vu (Nhan Vien)");
            System.out.println("6.Sua Ca Lam Viec (Thu Thu)");
        }

        else if(cn instanceof NhanVien)
        {
            System.out.println("5.Sua Chuc vu");
        }
        System.out.print("0.THOAT KHOI CHE DO SUA.");System.out.println("Nhap lua chon cua ban : ");
        int chon =sc.nextInt();
        sc.nextLine();
        switch(chon)
        {
            case 0: System.out.println("Da thoat che do chinh sua.");
            return;
            case 1: System.out.println("Nhap Ten Moi : ");
            String TenMoi=sc.nextLine();
            cn.SethoTen(TenMoi);
            System.out.println("Sua Ho ten thanh cong.");
            break;
            case 2: System.out.println("Nhap Ngay Sinh Moi : ");
            String SinhMoi=sc.nextLine();
            cn.SetngaySinh(SinhMoi);
            System.out.println("Sua Ngay sinh thanh cong.");
            break;
            case 3: System.out.println("Nhap Gioi Tin Moi : ");
            boolean TinMoi=sc.nextBoolean();
            cn.SetgioiTinh(TinMoi);
            System.out.println("Sua Gioi Tinh Thanh Cong.");
            break;
            case 4: System.out.println("Nhap So Dien Thoai Moi: ");
            String somoi=sc.nextLine();
            cn.Setsdt(somoi);
            System.out.println("Sua So Dien Thoai Thanh Cong");
            break;
            case 5:if(cn instanceof DocGia)
            {
                System.out.println("Nhap Ngay Het Han The Moi : ");
                String NgayMoi=sc.nextLine();
                DocGia dg=(DocGia) cn;
                dg.SethanThe(NgayMoi);
                System.out.println("Sua Ngay Het Han The Thanh Cong.");
            }
            else if(cn instanceof NhanVien)
            {
                System.out.println("Nhap Chuc Vu Moi: ");
                String CVM=sc.nextLine();
                NhanVien nv =(NhanVien) cn;
                nv.SetChucVu(CVM);
                System.out.println("Sua Chuc Vu Thanh Cong.");
            }
            break;
            case 6:
                if(cn instanceof ThuThu){
                System.out.println("Nhap Ca lam viec moi : ");
                String camoi=sc.nextLine();
                ThuThu tt=(ThuThu) cn;
                tt.SetCaLamViec(camoi);
                System.out.println("Sua Ca Lam Viec Thanh Cong.");}
                else {
                    System.out.println("Lua chon khong hop le! Vui long nhap lai");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le! Vui long nhap lai dung so tren menu.");
                break;



        }
        }



    }
    public void Xem(Scanner sc) {
        ConNguoi cn = search(sc);
        if (cn == null) {
            System.out.print("Khong tim thay nguoi khop voi ma vua nhap");
            return;
        }

        while (true) {
            System.out.println("\n--- DA TIM THAY DOI TUONG ---");
            System.out.println("Hay chon thong tin muon xem:");
            System.out.println("1. Xem Ho ten");
            System.out.println("2. Xem Ngay Sinh");
            System.out.println("3. Xem Gioi Tinh");
            System.out.println("4. Xem So Dien Thoai");

            if (cn instanceof DocGia) {
                System.out.println("5. Xem ngay het han the");
            } else if (cn instanceof ThuThu) {
                System.out.println("5. Xem Chuc vu (Nhan Vien)");
                System.out.println("6. Xem Ca Lam Viec (Thu Thu)");
            } else if (cn instanceof NhanVien) {
                System.out.println("5. Xem Chuc vu");
            }

            System.out.print("0. THOAT KHOI CHE DO XEM.\nChon: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 0:
                    System.out.println("Da thoat che do xem.");
                    return;
                case 1:
                    System.out.println("-> Ho ten: " + cn.GethoTen());
                    break;
                case 2:
                    System.out.println("-> Ngay sinh: " + cn.GetngaySinh());
                    break;
                case 3:
                    System.out.println("-> Gioi tinh: " + (cn.GetgioiTinh() ? "Nam" : "Nu"));
                    break;
                case 4:
                    System.out.println("-> So dien thoai: " + cn.Getsdt());
                    break;
                case 5:
                    if (cn instanceof DocGia) {
                        DocGia dg = (DocGia) cn;
                        System.out.println("-> Ngay het han the: " + dg.GethanThe());
                    } else if (cn instanceof NhanVien) {
                        NhanVien nv = (NhanVien) cn;
                        System.out.println("-> Chuc vu: " + nv.GetChucVu());
                    }
                    break;
                case 6:
                    if (cn instanceof ThuThu) {
                        ThuThu tt = (ThuThu) cn;
                        System.out.println("-> Ca lam viec: " + tt.GetCaLamViec());
                    } else {
                        System.out.println("Lua chon khong hop le! Vui long nhap lai");
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai dung so tren menu.");
                    break;
            }
        }
    }




}