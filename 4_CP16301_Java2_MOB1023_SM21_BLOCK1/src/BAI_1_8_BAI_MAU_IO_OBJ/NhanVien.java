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
public class NhanVien extends Peron implements Serializable{
    private int chuVu;

    public NhanVien() {
    }

    public NhanVien(int chuVu, int id, String ten, String sdt) {
        super(id, ten, sdt);
        this.chuVu = chuVu;
    }

    public int getChuVu() {
        return chuVu;
    }

    public void setChuVu(int chuVu) {
        this.chuVu = chuVu;
    }

   
    
}
