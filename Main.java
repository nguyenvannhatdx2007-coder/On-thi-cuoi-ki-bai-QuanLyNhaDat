package GiaoDichNhaDat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<GiaoDichDat> dsDat = new ArrayList<>();
        ArrayList<GiaoDichNha> dsNha = new ArrayList<>();
      //Array list : Dung de luu nhiu gio dich cung luc
        //neu ko dung array thi tu tao ca bien rieng
        //GiaoDichDat dat1 = newGiaoDichDat();
        //GiaoDichDat dat2 = newGiaoDichDat();
        //GiaoDichDat dat3 = newGiaoDichDat();
        System.out.print("Nhap so luong giao dich dat: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap giao dich dat thu " + (i + 1) + " ---");
            GiaoDichDat dat = new GiaoDichDat();
            System.out.print("Ma giao dich: ");
            dat.setMaGiaoDich(sc.nextInt());
            System.out.print("Ngay giao dich (yyyy-mm-dd): ");
            dat.setNgayGiaoDich(LocalDate.parse(sc.next()));
            System.out.print("Don gia: ");
            dat.setDonGia(sc.nextDouble());
            System.out.print("Dien tich: ");
            dat.setDienTich(sc.nextDouble());
            System.out.print("Loai dat (A/B/C): ");
            dat.setLoaiDat(sc.next());
            dsDat.add(dat);
        }
        System.out.print("\nNhap so luong giao dich nha: ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("\n--- Nhap giao dich nha thu " + (i + 1) + " ---");
            GiaoDichNha nha = new GiaoDichNha();
            System.out.print("Ma giao dich: ");
            nha.setMaGiaoDich(sc.nextInt());
            System.out.print("Ngay giao dich (yyyy-mm-dd): ");
            nha.setNgayGiaoDich(LocalDate.parse(sc.next()));
            System.out.print("Don gia: ");
            nha.setDonGia(sc.nextDouble());
            System.out.print("Dien tich: ");
            nha.setDienTich(sc.nextDouble());
            sc.nextLine();
            System.out.print("Loai nha (Cao Cap/Thuong): ");
            nha.setLoaiNha(sc.nextLine());
            System.out.print("Dia chi: ");
            nha.setDiaChi(sc.nextLine());
            dsNha.add(nha);
        }
        System.out.println("\n========== SO LUONG ==========");
        System.out.println("So luong giao dich dat: " + dsDat.size());
        System.out.println("So luong giao dich nha: " + dsNha.size());
        double tongTienDat = 0;
        for (GiaoDichDat dat : dsDat) {
            tongTienDat += dat.TinhTienDat();
        }
        if (dsDat.size() > 0) {
            double trungBinh = tongTienDat / dsDat.size();
            System.out.printf(
                "Trung binh thanh tien dat: %.2f%n",
                trungBinh
            );
        }
        System.out.println("\n========== GIAO DICH DAT THANG 9/2013 ==========");
        System.out.printf(
            "%-10s %-15s %-10s %-15s %-12s %-15s%n",
            "Ma GD",
            "Ngay",
            "Loai dat",
            "Don gia",
            "Dien tich",
            "Thanh tien"
        );
        System.out.println(
            "--------------------------------------------------------------------------"
        );
        for (GiaoDichDat dat : dsDat) {

            if (dat.getNgayGiaoDich().getMonthValue() == 9
                    && dat.getNgayGiaoDich().getYear() == 2013) {
                System.out.printf(
                    "%-10d %-15s %-10s %-15.2f %-12.2f %-15.2f%n",
                    dat.getMaGiaoDich(),
                    dat.getNgayGiaoDich(),
                    dat.getLoaiDat(),
                    dat.getDonGia(),
                    dat.getDienTich(),
                    dat.TinhTienDat()
                );
            }
        }
        System.out.println("\n========== GIAO DICH NHA THANG 9/2013 ==========");
        System.out.printf(
            "%-10s %-15s %-12s %-25s %-15s %-12s %-15s%n",
            "Ma GD",
            "Ngay",
            "Loai nha",
            "Dia chi",
            "Don gia",
            "Dien tich",
            "Thanh tien"
        );
        System.out.println(
            "------------------------------------------------------------------------------------------------"
        );
        for (GiaoDichNha nha : dsNha) {
            if (nha.getNgayGiaoDich().getMonthValue() == 9
                    && nha.getNgayGiaoDich().getYear() == 2013) {
                System.out.printf(
                    "%-10d %-15s %-12s %-25s %-15.2f %-12.2f %-15.2f%n",
                    nha.getMaGiaoDich(),
                    nha.getNgayGiaoDich(),
                    nha.getLoaiNha(),
                    nha.getDiaChi(),
                    nha.getDonGia(),
                    nha.getDienTich(),
                    nha.TinhTienNha()
                );
            }
        }
        sc.close();
    }
}
