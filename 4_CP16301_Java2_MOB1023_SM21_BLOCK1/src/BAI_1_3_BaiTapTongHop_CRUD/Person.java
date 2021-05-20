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
public class Person {
    private String ten;
    private String sdt;
    private int gioiTinh;
    private int namSinh;

    public Person() {
    }

    public Person(String ten, String sdt, int gioiTinh, int namSinh) {
        this.ten = ten;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
}
