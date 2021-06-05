/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_9_Thread;

import javax.sound.midi.Soundbank;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S4_ThongTinTheard extends Thread {

  public static void main(String[] args) {
    S4_ThongTinTheard t1 = new S4_ThongTinTheard();
    t1.start();

    Thread t2 = Thread.currentThread();
    System.out.println("Định danh của Thread: " + t2.getId());
    System.out.println("Tên: " + t2.getName());
    System.out.println("Độ ưu tiên: " + t2.getPriority());
    System.out.println("Trạng thái: " + t2.getState());
    System.out.println("Đang hoạt động: " + t2.isAlive());
    System.out.println("Số lượng Thread: " + Thread.activeCount());
  }
}
