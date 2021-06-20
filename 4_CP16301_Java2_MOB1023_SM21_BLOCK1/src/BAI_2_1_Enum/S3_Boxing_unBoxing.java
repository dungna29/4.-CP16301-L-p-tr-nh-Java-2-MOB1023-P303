/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_1_Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungnaPC
 */
public class S3_Boxing_unBoxing {
  public static void main(String[] args) {
    //QUá trình boxing là đưa 1 giá trị vào trong 1 đối tượng
    Integer objInt = new Integer(123);//Boxing
    Integer objInt2 = 123;//Boxing
    
    //Quá trình unboxing là lấy 1 giá trị từ obj
    int a = objInt.intValue();//Unboxing
    int b = Integer.valueOf(objInt);//Unboxing
    
    List<Double> lst = new ArrayList<>();
    List<String> lst2 = new ArrayList<>();
    //List<double> lst1 = new ArrayList<double>(); Không làm việc đc với kiểu dữ liệu nguyên thủy
    Double d1 = 21.2;
    System.out.println(d1.toString() + 10);
    double d2 = 21.2;
    System.out.println(String.valueOf(d2) + 10);
    
    Scanner sc = new Scanner(System.in);
    String temp1 = "123";
    char[] temp3 = {'1','2','3'};
    String temp2 = sc.nextLine();
    System.out.println(temp2);
    System.out.println(temp1.equals(temp2));
    System.out.println(temp1==temp2);
  }
  
}
