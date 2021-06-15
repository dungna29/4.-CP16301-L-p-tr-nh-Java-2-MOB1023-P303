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
//enum NgayTrongTuan{
//  MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
//}
public class S1_Enum {

  enum NgayTrongTuan {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
  }

  public static void main(String[] args) {
    //Lấy 1 gia trị trong Enum
    NgayTrongTuan thuTrongTuan = NgayTrongTuan.SUNDAY;
    System.out.println(thuTrongTuan);
    System.out.println("================");
    //Lấy 1 tập giá trị trong Enum
    for (NgayTrongTuan x : NgayTrongTuan.values()) {
      System.out.print(x + " ");
    }
    System.out.println("");
    //So sánh với Enum
    NgayTrongTuan homNay = NgayTrongTuan.TUESDAY;
    if (homNay.equals(NgayTrongTuan.SUNDAY)) {
      System.out.println("Hôm nay là ngày nghỉ cuối tuần");
    } else {
      System.out.println("Hôm nay là ngày đi học");
    }
    //Với Enum có thể sử dụng toán tử == để so sánh
     if (homNay == NgayTrongTuan.SUNDAY) {
      System.out.println("Hôm nay là ngày nghỉ cuối tuần");
    } else {
      System.out.println("Hôm nay là ngày đi học");
    }
  }
}
