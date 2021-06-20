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
public class S2_Main {
  public static void main(String[] args) {
    S2_ArrayService temp;
    S2_IArrayService<Integer> arr = new S2_ArrayService<>(5);    
    Integer arrTuoi[] = {1999,2000,2001};
    arr.setArrs(arrTuoi);//Truyền mảng tuổi vào Class ArrayService
    //System.out.println(arr.GeValueByIndex(1));
    arr.SetValueByIndex(1, 9999);
    for (int i = 0; i < arr.getArrs().length; i++) {
      System.out.println(arr.GeValueByIndex(i));
    }
    int[] arrr = new int[2];
    
  }
}
