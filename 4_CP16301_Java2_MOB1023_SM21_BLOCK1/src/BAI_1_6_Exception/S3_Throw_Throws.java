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
public class S3_Throw_Throws {

    /*
     Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ (exception) cụ thể.
     */
    public static void main(String[] args) {
        
        try {
            dangKyClubJava("dung", 17);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    static void dangKyClubJava(String ten, int tuoi) {
        if (ten == "dung") {
            NullPointerException exception = new NullPointerException("Bạn không được để null tên");
            throw exception;
        }
        if (tuoi < 18) {
            throw new ArithmeticException("Bạn chưa đủ tuổi tham gia Club Java");
        }
        System.out.println("Chào mừng bạn đến với Club JAVA: " + ten + tuoi);
    }
}
