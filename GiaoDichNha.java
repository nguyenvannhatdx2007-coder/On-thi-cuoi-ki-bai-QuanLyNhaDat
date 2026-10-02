package GiaoDichNhaDat;

public class GiaoDichNha extends GiaoDich {
    private String LoaiNha;
    private String DiaChi;

    public String getLoaiNha() {
        return LoaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        if (!loaiNha.equals("Cao Cap") &&
            !loaiNha.equals("Thuong")) {

            throw new IllegalArgumentException(
                "Loi Phai Dien Dung Gia Tri Cua Nha (Cao Cap hoac Thuong)!"
            );
        }

        this.LoaiNha = loaiNha;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        this.DiaChi = diaChi;
    }

    public double TinhTienNha() {
        if (LoaiNha.equals("Cao Cap")) {
            return getDienTich() * getDonGia();
        } else {
            return getDienTich() * getDonGia() * 90 / 100;
        }
    }
}
