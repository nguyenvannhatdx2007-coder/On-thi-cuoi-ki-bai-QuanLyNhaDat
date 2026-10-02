package GiaoDichNhaDat;

import java.time.LocalDate;

public class GiaoDich {
    private int MaGiaoDich;
    private LocalDate NgayGiaoDich;
    private double DonGia;
    private double DienTich;

    public int getMaGiaoDich() {
        return MaGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.MaGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.NgayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        if (donGia <= 0) {
            throw new IllegalArgumentException(
                "Loi Don Gia Phai Lon Hon 0!"
            );
        }
        this.DonGia = donGia;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double dienTich) {
        if (dienTich <= 0) {
            throw new IllegalArgumentException(
                "Loi Dien Tich Phai Lon Hon 0!"
            );
        }
        this.DienTich = dienTich;
    }
}
