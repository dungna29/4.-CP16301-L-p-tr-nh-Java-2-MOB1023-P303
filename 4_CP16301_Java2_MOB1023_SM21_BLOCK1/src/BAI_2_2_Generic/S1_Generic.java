/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_2_Generic;

/**
 *
 * @author DungnaPC
 */
public class S1_Generic {
  /*
    Generics là một tính năng của Java giúp cho lập trình viên có thể chỉ định rõ kiểu dữ liệu 
    mà họ muốn làm việc với một class, một interface hay một phương thức nào đó.
    Đặt tên kiểu tham số là rất quan trọng để học Genericics. Nó không bắt buộc, 
    tuy nhiên chúng ta nên đặt theo quy ước chung để dễ đọc, dễ bảo trì. 
    Các kiểu tham số thông thường như sau:
   
    Một số quy ước đặt tên kiểu tham số Generic
    E- Element (phần tử – được sử dụng phổ biến trong Collection Framework)
    K – Key (khóa)
    V – Value (giá trị)
    N – Number (kiểu số: Integer, Double, Float, …)
    T – Type (Kiểu dữ liệu bất kỳ thuộc Wrapper class: String, Integer, Long, Float, …)
    S, U, V … – được sử dụng để đại diện cho các kiểu dữ liệu (Type) thứ 2, 3, 4, …
    */
  public static void main(String[] args) {
    
    //Khi nào dùng thì bắt đầu định nghĩa cho T là kiểu dữ liệu mà mình muốn
    GenericDungna<String> generic = new GenericDungna<>();
    generic.Add("Dungna29");
    System.out.println(generic.Get());
    
    //Không được sử dụng kiểu dữ liệu nguyên thủy
    //GenericDungna<int> generic1 = new GenericDungna<>();
    GenericDungna<Integer> generic1 = new GenericDungna<>();
    generic1.Add(Integer.SIZE);
    System.out.println(generic1.Get());
    
    //Không định kiểu cho ClassGeneric
    GenericDungna genericDungnaKhongDinhKieu = new GenericDungna();
    genericDungnaKhongDinhKieu.Add("Không định kiểu");
    System.out.println(genericDungnaKhongDinhKieu.Get());
  }
}
