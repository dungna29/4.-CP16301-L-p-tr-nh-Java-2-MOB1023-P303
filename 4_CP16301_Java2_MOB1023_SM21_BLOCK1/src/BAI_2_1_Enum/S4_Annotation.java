/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_1_Enum;

import java.util.Date;

/**
 *
 * @author DungnaPC
 */
@interface MyAnnotation {

  String value();

  String owner();
}

public class S4_Annotation {

  /*
    Annotation (Chú thích) được sử dụng để cung cấp thông tin dữ liệu cho mã Java của bạn. Là thông tin dữ liệu,
    các Annotation không trực tiếp ảnh hưởng đến việc thực hiện các mã của bạn, mặc dù một số loại chú thích thực sự có thể được sử dụng cho mục đích đó.
    
    Annotation được sử dụng cho các mục đích:
    1.Chỉ dẫn cho trình biên dịch (Compiler)
    2.Chỉ dẫn trong thời điểm xây dựng (Build-time)
    3.Chỉ dẫn trong thời gian chạy (Runtime)
    
    Java có sẵn 3 Annotation mà bạn có thể sử dụng để cung cấp cho các hướng dẫn để trình biên dịch Java.
    @Deprecated
    Đây là một Annotation dùng để chú thích một cái gì đó bị lỗi thời, tốt nhất không nên sử dụng nữa, chẳng hạn như class, hoặc method.

    @Override
    Annotation @Override được sử dụng cho các method ghi đè của method trong một class cha (superclass). 
    Nếu method này không hợp lệ với một method trong class cha, trình biên dịch sẽ thông báo cho bạn một lỗi.
    
    @SuppressWarnings
    @SuppressWarnings làm cho các trình biên dịch thôi không cảnh báo một vấn đề của method nào đó.
    Ví dụ, nếu trong một method có gọi tới một method khác đã lỗi thời, hoặc bên trong method có một ép kiểu không an toàn,
    trình biên dịch có thể tạo ra một cảnh báo. Bạn có thể tắt các cảnh báo này bằng cách chú thích method này bằng @SuppressWarnings.
    
    Tự viết Anotation của mình
    @interface là từ khóa khai báo một Annotation, annotation khá giống một interface. Annotation có hoặc không có các phần tử (element) trong nó.
    Đặc điểm của các phần tử (element) của annotation:
    Không có thân hàm
    Không có tham số hàm
    Khai báo trả về phải là một kiểu cụ thể:
    Các kiểu nguyên thủy (boolean, int, float, ...)
    Enum
    Annotation
    Class (Ví dụ String.class)
    Có thể có giá trị mặc định
    
    "@" được khai báo trước interface để đánh dấu đó là một annotation
    
    Annotation là một tính năng rất hay và được sử dụng rất nhiều trong Java. Có thể bạn đã gặp các Annotation trong các ứng dụng Java như:
    Java Core: @Deprecated, @Override, @SuppressWarnings, …
    Spring Framework: @Controller, @Service, @Repository, @Component, …
    Hibernate: @Table, @Id, @Column, @OneToMany, @ManyToOne, 
   */
  @MyAnnotation(owner = "Dũng", value = "JAVA2")
  static void print() {
    System.out.println("Ví dụ về Annotation");
  }

  @Deprecated
  static void dungnaLoiThoi() {
    //Muốn miêu tả cái phương thức này đã lỗi thời
    System.out.println("Phương thức đã lỗi thời");
  }

  @SuppressWarnings("deprecation")
  static Date getDate() {
    //@SuppressWarnings(“deprecation”) để thông báo trình biên dịch không cảnh báo việc sử dụng phương thức có sử dụng @Deprecation.
    //@SuppressWarnings(“unchecked”) để thông báo trình biên dịch không cảnh báo việc sử một ép kiểu không an toàn.
    //@SuppressWarnings(“rawtypes”) để thông báo trình biên dịch không cảnh báo việc khai báo kiểu dữ liệu không tường minh.
    Date date = new Date(2021, 06, 15);
    return date;
  }

  public static void main(String[] args) {
    print();
    dungnaLoiThoi();
    System.out.println(getDate());
  }
}
