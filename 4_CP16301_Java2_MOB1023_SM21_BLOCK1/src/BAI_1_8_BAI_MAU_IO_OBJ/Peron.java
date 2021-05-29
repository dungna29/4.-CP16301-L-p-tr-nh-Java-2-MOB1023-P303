/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_8_BAI_MAU_IO_OBJ;

import java.io.Serializable;

/**
 *
 * @author Dungna29
 */
public class Peron implements Serializable{//Giúp cho các thuộc tính khi vào sẽ được thứ tự và không gây lộn xộn dữ liệu
    private int id;
    private String ten;
    private String sdt;

    public Peron() {
    }

    public Peron(int id, String ten, String sdt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
