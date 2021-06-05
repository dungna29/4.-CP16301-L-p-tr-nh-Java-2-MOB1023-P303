/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_9_Thread;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S3_Tao_Thread_Implements implements Runnable {

  public static void main(String[] args) {
    //Tạo ra 2 luồng chạy song song
    //Tạo ra thread 1
    S2_Tao_Thread thread1 = new S2_Tao_Thread();
    thread1.run();
    //Tạo ra thread 1
    S2_Tao_Thread thread2 = new S2_Tao_Thread();
    thread2.run();
  }

  @Override
  public void run() {
    int i = 0;
    while (true) {
      try {
        System.out.println(i++ + 1600);
        Thread.sleep(2000);
      } catch (InterruptedException ex) {
        break;
      }
    }
  }

}
