/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_9_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S7_MoiQuanHeGiuaCacThread {

  double TienTrongVi = 500000;

  public static void main(String[] args) {
    S7_MoiQuanHeGiuaCacThread t1 = new S7_MoiQuanHeGiuaCacThread();
    Thread th1 = new Thread() {
      @Override
      public void run() {
        try {
          t1.RutTien(50000);
        } catch (InterruptedException ex) {          
        }
      }

    };
    th1.start();
    Thread th2 = new Thread() {
      @Override
      public void run() {
        try {
          t1.NapTien(10000);
        } catch (InterruptedException ex) {          
        }
      }
    };
    th2.start();
  }

  public synchronized void RutTien(double tienMuonRut) throws InterruptedException {
    System.out.println("Bạn đang thực hiện rút tiền.......");
    Thread.sleep(2000);
    if (TienTrongVi < tienMuonRut) {
      Thread.sleep(2000);
      System.out.println("Số tiền của bạn không đủ để rút");
      wait();
    }
    TienTrongVi = TienTrongVi - tienMuonRut;
    System.out.println("Số tiền còn lại trong tài khoản: " + TienTrongVi);
    System.out.println("Chúc mừng đã rút thành công: " + tienMuonRut);
  }

  public synchronized void NapTien(double soTienMuonNap) throws InterruptedException {
    Thread.sleep(2000);
    System.out.println("Bạn đang nạp tiền");
    Thread.sleep(1000);
    TienTrongVi = TienTrongVi + soTienMuonNap;
    System.out.println("Số tiền còn lại trong tài khoản: " + TienTrongVi);
    notify();
  }
}
