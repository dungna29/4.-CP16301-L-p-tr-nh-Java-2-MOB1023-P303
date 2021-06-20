/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_2_Generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DungnaPC
 */
public class S4_Main {

  public static void main(String[] args) {
    S4_Pair<Integer, String> pair = new S4_Pair<>(1989, "Dũng");
    System.out.println("Năm sinh: " + pair.getKey() + "Chào bạn Tên: " + pair.getValue());
    S4_Pair<String, String> TiengAnhTuMoi = new S4_Pair<>("Dog", "Chó");//Từ mới Anh Việt
    List<S4_Pair<String, String>> lstTuDient = new ArrayList<>();//List Từ điển Anh Việt
    
  }
  
  public int TinhTong(int a, int b){
    return a+b;
  }
  public double TinhTong(double a, double b){
    return a+b;
  }
  public <T extends Number> float TinhTong(T a, T b){   //Phương thức tính tổng động
    return a.floatValue() + a.floatValue();
  }
}
