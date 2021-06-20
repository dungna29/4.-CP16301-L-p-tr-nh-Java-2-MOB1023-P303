/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_2_Generic;

import java.lang.reflect.Array;

/**
 *
 * @author DungnaPC
 */
public class S2_ArrayService<T> implements S2_IArrayService<T> {
  private T[] arrs;//Mảng chưa xác định kiểu

  public S2_ArrayService(Class<T> temp,int size) {//Contructor
   arrs = (T[])Array.newInstance(temp, size);
  }
  public S2_ArrayService(int size) {//Contructor  
  }

  
  @Override
  public T[] getArrs() {
    return arrs;
  }

  @Override
  public void setArrs(T[] arrs) {
    this.arrs = arrs;
  }
  
  public <T> T[] getArr(int size){
    //T[] tempArr = new T[size];
    return null;
  }
  
  
  @Override
  public T GeValueByIndex(int index){//Phương thức lấy giá tị trong mảng
    if (index < 0 || index >= arrs.length) {
      System.out.println("Lỗi index");
      return null;
    }
    return arrs[index];
  }
  
  @Override
  public void SetValueByIndex(int index,T giatri){//Phương thức gán giá trị trong mảng
    if (index < 0 || index >= arrs.length) {
      System.out.println("Lỗi index");
      return;
    }
    arrs[index] = giatri;
  }
  
}
