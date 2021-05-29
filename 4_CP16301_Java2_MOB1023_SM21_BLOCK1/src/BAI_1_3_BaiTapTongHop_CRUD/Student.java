/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_3_BaiTapTongHop_CRUD;

/**
 *
 * @author DungNAPC
 */
public class Student extends Person{
    private String msv;//Ctrl + shift mũi tên lên xuống

    public Student() {
    }

    public Student(String msv, String ten, String sdt, int gioiTinh, int namSinh) {
        super(ten, sdt, gioiTinh, namSinh);
        this.msv = msv;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
    
}
