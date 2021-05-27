/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_6_Exception;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DungNAPC
 */
public class S4_Throws {
        /*
          Lưu ý:
        Nếu bạn đang gọi một phương thức khai báo throws một ngoại lệ, bạn phải catch hoặc throws ngoại lệ đó. 
        Có hai trường hợp:
        Trường hợp bắt ngoại lệ, tức là xử lý ngoại lệ bằng cách sử dụng try/catch.
        Trường hợp khai báo ném ngoại lệ, tức là sử dụng từ khóa throws với phương thức.
         */
    public static void main(String[] args) {
        try {
            method1(null);
        } catch (IOException ex) {
            Logger.getLogger(S4_Throws.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   static void method1(String path)throws IOException {
        if (path == null) {
            throw new IOException("Đường dẫn sai rồi bạn ơi");
        }
    }
   static void method2(){
        try {
            method1("");//Phải đóng try catch hoặc chuển thành throws phương thức mới được phép sử dụng
        } catch (IOException ex) {
            Logger.getLogger(S4_Throws.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

}
