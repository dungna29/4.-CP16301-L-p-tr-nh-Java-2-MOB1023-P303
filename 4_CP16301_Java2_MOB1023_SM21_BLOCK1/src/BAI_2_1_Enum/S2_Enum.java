/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_1_Enum;

/**
 *
 * @author DungnaPC
 */
public class S2_Enum {

  enum KyHoc {
    //Khởi tạo các phần tử từ contructor
    //Các phần tử luôn là static final
    SPRING(1), SUMMER(2);
    
    int value;

    //Khởi tạo contructor trong Enum
    KyHoc(int giatri) {
      value = giatri;
    }
    public static KyHoc getKyHoc(int temp){
      for (KyHoc x : KyHoc.values()) {
        if (x.value == temp) {
          return x;
        }
      }
      return null;
    }

  }

  public static void main(String[] args) {
    for (KyHoc x : KyHoc.values()) {
      System.out.println(x + " " + x.value);// x.value giá trị đi kèm với Enum
    }
    
    //Sử dụng phương thức bên trong Enum
    KyHoc kh = KyHoc.getKyHoc(1);
    System.out.println(kh);
  }
}
