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
public class S3_MainLimited {
  public static void main(String[] args) {
    //S3_Limited<String> temp = new S3_Limited<String>();//Lỗi
    S3_Limited<Integer> temp = new S3_Limited<>();
    temp.setNumber(33);
    System.out.println(temp.getNumber());
    System.out.println(temp.Nhan100());
    
    S3_Limited<Integer> temp1 = new S3_Limited<>(2000);
    System.out.println(temp1.getNumber());
    System.out.println(temp1.Nhan100());
    
    S3_Limited<Integer> temp2 = new S3_Limited<>(2000);
    S3_Limited<Double> temp3 = new S3_Limited<>(2000.1);
    System.out.println(temp3.SoSanh2So(temp2));
  }
}
