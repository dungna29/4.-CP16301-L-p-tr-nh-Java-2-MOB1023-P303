/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_6_Exception;

/**
 *
 * @author DungNAPC
 */
public class S2_Try_Catch_Finally {
    /*
        try {
             code có thể ném ra ngoại lệ
        } catch (Exception_class_Name ex) {
             code xử lý ngoại lệ
        }finally {
             code trong khối này luôn được thực thi
        }
    */
     static void viDu1() {
        int a = 9, b = 1, c;
        try {
            c = a / b;
            System.out.println("kết quả 9/0 = " + c);
        } catch (ArithmeticException e) {//Sử dụng thẳng Class ArithmeticException
            System.out.println("Lỗi rồi");
            //System.out.println(e); //ArithmeticException: / by zero 
            e.printStackTrace();//Truy dấu lỗi nằm vị trí nào
        } finally{
            System.out.println("Đã chạy vào Finally");
        }
        System.out.println("Chương trình kết thúc");
          //       try {
        //    // code có thể ném ra ngoại lệ
        //} catch(Exception_class_Name_1 ex) {
        //    // code xử lý ngoại lệ 1
        //} catch(Exception_class_Name_2 ex) {
        //    // code xử lý ngoại lệ 2
        //} catch(Exception_class_Name_n ex) {
        //    // code xử lý ngoại lệ n
        //} finally {
        //    // code trong khối này luôn được thực thi
        //}
    }
     public static void main(String[] args) {
        viDu1();
    }
}
