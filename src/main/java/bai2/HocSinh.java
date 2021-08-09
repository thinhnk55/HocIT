/**
 * package để nhóm các lớp lại với nhau để dễ quản lí và sử dụng
 */
package bai2;

public class HocSinh {
    /**
     * Khai báo một thuộc tính bao gồm:
     * Tiền tố Modifier (public, protected, private)
     * Tên Lớp hoặc kiểu của thuộc tính (String, int)
     * Tên thuộc tính (ten, tuoi)
     */
    public String ten;//String là một lớp được định nghĩa sẵn trong ngôn ngữ Java, nó là dạng chuỗi kí tự
    public int tuoi;//int (integer -> số nguyên: -n, ... -1, 0, 1, ... n -2^32 -> 2^32

    /**
     * Khai báo một phương thức (hàm) bao gồm:
     * Tiền tố Modifier (public, protected, private)
     * Tên Lớp hoặc kiểu của thuộc tính mà hàm đó trả về (void, int)
     * Tên hàm
     * chuỗi tham số đặt giữa hai dấu ()
     */

    /**
     * Hàm khởi tạo Constructor
     */
    public HocSinh(){

    }

    public HocSinh(String ten, int tuoi){
        //Dấu = là phép gán giá trị
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void doc(){
        System.out.println("Toi dang doc");
    }
    public int cong(int a, int b){
        return a + b;
    }
}
