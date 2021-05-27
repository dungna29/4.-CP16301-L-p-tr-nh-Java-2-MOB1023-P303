/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_6_Exception;

import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DungNAPC
 */
public class S1_Exception {

    /*
        Exception là một sự kiện xảy ra trong quá trình thực thi một chương trình Java, 
        nó làm phá vỡ cái flow (luồng xử lý) bình thường của một chương trình, thậm chí chết chương trình.
        
        Một ngoại lệ có thể xảy ra với nhiều lý do khác nhau, nó nằm ngoài dự tính của chương trình.
        Một vài ngoại lệ xảy ra bởi lỗi của người dùng, 
        một số khác bởi lỗi của lập trình viên và số khác nữa đến từ lỗi của nguồn dữ liệu vật lý. 
        Chẳng hạn như:
            Người dùng nhập dữ liệu không hợp lệ.
            Truy cập ngoài chỉ số mảng.
            Một file cần được mở nhưng không thể tìm thấy.
            .......
        
        Phân cấp của Exception trong java.
            + Class ở mức cao nhất là Throwable
            + Hai class con trực tiếp là Error và Exception.
     */
    public static void main(String[] args) {
        viDu7();
    }

    //Ví dụ 1: ArithmeticException: / by zero
    static void viDu1() {
        int a = 9, b = 0, c;
        c = a / b;
        System.out.println("kết quả 9/0 = " + c);
        System.out.println("Chương trình kết thúc");
    }

    //Ví dụ 2: sử dụng try catch
    static void viDu2() {
        int a = 9, b = 0, c;
        try {
            c = a / b;
            System.out.println("kết quả 9/0 = " + c);
        } catch (ArithmeticException e) {//Sử dụng thẳng Class ArithmeticException
            System.out.println("Lỗi rồi");
            //System.out.println(e); //ArithmeticException: / by zero 
            e.printStackTrace();//Truy dấu lỗi nằm vị trí nào
        }
        System.out.println("Chương trình kết thúc");
    }
    //Ví dụ 3: sử dụng try catch

    static void viDu3() {
        try {
            int a = Integer.parseInt("dung");
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
        System.out.println("Chương trình kết thúc");
    }

    static void viDu4() {
        /* UnCheckedExceptions Là loại exception xảy ra tại thời điểm thực thi chương trình, 
        nó cũng có thể gọi là runtime exceptions đó là programming bugs, lỗi logic của chương trình… 
        Loại exception này được bỏ qua trong quá trình compile, không bắt buộc ta phải handle nó.
        Ví dụ: NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, DivideByZeroException
         */
        String temp = null;
        System.out.println(temp.length());
        System.out.println("Chương trình kết thúc");
    }

    static void viDu5() {
        /* CheckedExceptions Là loại exception xảy ra trong lúc compile time, nó cũng có thể được gọi là compile time exceptions. 
        Loại exception này không thể bỏ qua được trong quá trình compile,  bắt buộc ta phải handle nó.
        Các lớp extends từ lớp Throwable ngoại trừ RuntimeException và Error được gọi là checked exception. 
           Ví dụ: IOException, FileNotFoundException, NoSuchFieldException, */
        //FileReader f = new FileReader("Không có đường dẫn");//yêu cầu phải sử dụng try catch
        System.out.println("Chương trình kết thúc");
    }

    static void viDu6() {
        int[] arr = new int[5];
        arr[5] = 88;//ArrayIndexOutOfBoundsException
        System.out.println("Chương trình kết thúc");
    }

    static void viDu7() {
        //ParseException 
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        String tempDate = "27-05-2021";
        dateFormat.applyPattern("dd-MM-yyyy");
        try {
            Date date = dateFormat.parse(tempDate);
            System.out.println(dateFormat.format(date));
            dateFormat.applyPattern("EEEE,dd,MM,yyyy");
            System.out.println(dateFormat.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(S1_Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Chương trình kết thúc");
    }

}
