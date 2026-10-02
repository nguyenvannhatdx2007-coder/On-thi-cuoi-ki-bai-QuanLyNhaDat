package GiaoDichNhaDat;

public class GiaoDichDat extends GiaoDich {
    private String LoaiDat;

    public String getLoaiDat() {
        return LoaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        if (!loaiDat.equals("A") &&
            !loaiDat.equals("B") &&
            !loaiDat.equals("C")) {

            throw new IllegalArgumentException(
                "Loi Phai Dien Ki Tu A, B Hoac C!"
            );
        }

        this.LoaiDat = loaiDat;
    }

    public double TinhTienDat() {
        if (LoaiDat.equals("A")) {
            return getDienTich() * getDonGia() * 1.5;
        } else {
            return getDienTich() * getDonGia();
        }
    }
}
