package bai2;

/**
 *
 *
 *
 */
public class ChuongTrinhBai2 {
    public static void main(String[] args){
        /**
         * Tạo ra đối tượng học sinh tên Tuấn 6 tuổi
         * Cho học sinh đó đọc
         * Cho học sinh đó cộng
         */
        HocSinh hocSinh1 = new HocSinh("Tuan", 6);//Day la mot bieu thuc (expression)
        hocSinh1.doc();
        System.out.println("Ket qua cua phep cong la: " + hocSinh1.cong(1, 2));

        SinhVien sinhVien = new SinhVien();
        sinhVien.ten = "Lan";
        sinhVien.tuoi = 19;
        sinhVien.gioithieu();
    }
}
