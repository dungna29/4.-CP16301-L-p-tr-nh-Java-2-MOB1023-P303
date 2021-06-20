/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_2_Generic;

/**
 *
 * @author DungnaPC
 */
public class S3_Limited<T extends Number> {//Giới hạn T không cho phép đặt thoái mái chỉ đc phép là số
  
  private T number;

  public S3_Limited() {
  }

  public S3_Limited(T number) {
    this.number = number;
  }

  public T getNumber() {
    return number;
  }

  public void setNumber(T number) {
    this.number = number;
  }
  public int Nhan100(){//Đưa vào 1 phương thước trả đúng kiểu dữ liệu
    return number.intValue()*100;
  }
  
  public boolean SoSanh2So(S3_Limited<?> limited){//Dấu  ? đại diện cho tất cả các kiểu dữ liệu của number.
    if (number.doubleValue()== limited.getNumber().doubleValue()) {
      return true;
    }
    return false;
  }
}
