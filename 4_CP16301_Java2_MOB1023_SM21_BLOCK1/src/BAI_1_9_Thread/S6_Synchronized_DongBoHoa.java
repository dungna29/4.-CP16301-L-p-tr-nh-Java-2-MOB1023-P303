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
public class S6_Synchronized_DongBoHoa implements Runnable{
    public static void main(String[] args) {
        /*
        ĐỒNG BỘ HÓA THREAD
        ❑Nếu nhiều thread đang hoạt động đồng thời mà
        sử dụng chung một tài nguyên nào đó thì sẽ xảy
        ra xung đột
        ❑Đồng bộ hóa chính là việc sắp xếp thứ tự các
        thread khi truy xuất vào cùng đối tượng sao cho
        không có sự xung đột dữ liệu.
        ❑Để đảm bảo rằng một nguồn tài nguyên chia sẻ
        được sử dụng bởi một thread tại một thời điểm,
        chúng ta sử dụng đồng bộ hóa
        (synchronization).
        */
      S6_Synchronized_DongBoHoa run = new S6_Synchronized_DongBoHoa();
      Thread t1 = new Thread(run);
      Thread t2 = new Thread(run);
      t1.start();
      t2.start();
    }

  @Override
  public synchronized void run() {
    int i = 0;
    while (true) {
      try {
        System.out.println(i++ + 1600);
        Thread.sleep(1000);
        if (i == 2) {
          break;
        }
      } catch (InterruptedException ex) {
        break;
      }
    }
  }

    
}
