/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_1_ONTAP_JAVA1_NANG_CAO;

import BAI_1_0_ONTAP_JAVA1.*;

/**
 *
 * @author DungNAPC
 */
public class Student extends Person{
    
    private String msv;
    private String nganhHoc;

    public Student() {
    }

    public Student(String msv, String nganhHoc, int id, String name, String phone, int sex) {
        super(id, name, phone, sex);
        this.msv = msv;
        this.nganhHoc = nganhHoc;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }
    
    @Override
    void inRaManHinh() {
        System.out.printf("ID = %d | Tên: %s | Đt: %s | Giới tính: %s \n"
                ,getId(),getName(),getPhone(),getSex() == 1?"Nam":"Nữ");
    }
}
