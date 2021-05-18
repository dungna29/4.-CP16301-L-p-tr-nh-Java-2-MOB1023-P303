/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_1_ONTAP_JAVA1_NANG_CAO;

import BAI_1_0_ONTAP_JAVA1.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungNAPC
 */
public class ServiceStudent implements IServiceStudent{

    Scanner _sc = new Scanner(System.in);
    String _input;
    Student _Student;
    List<Student> _lstStudent;

    public ServiceStudent() {
        _lstStudent = new ArrayList<>();
    }

    public boolean addStudent() {
        do {
            System.out.println("Mời bạn nhập số lượng SV: ");
            _input = _sc.nextLine();
            for (int i = 0; i < Integer.parseInt(_input); i++) {
                _Student = new Student();
                _Student.setId(i);
                _Student.setName(getInputValue("tên: "));
                System.out.println("Mời bạn nhập sđt: ");
                _Student.setPhone(_sc.nextLine());
                System.out.println("Mời bạn nhập giới tính: ");
                _Student.setSex(Integer.parseInt(_sc.nextLine()));
                _lstStudent.add(_Student);
            }
            System.out.println("Bạn có muốn nhập tiếp hay không? y/n: ");
            _input = _sc.nextLine();
        } while (!(_input.equalsIgnoreCase("n")));
        return true;
    }

    public void getLstStudents() {
        for (Student x : _lstStudent) {
            x.inRaManHinh();
        }
    }

    public void removeStudent() {
        //Cách 1: Giải cơ bản
//        System.out.println("Mời bạn nhập mã: ");
//        _input = _sc.nextLine();
//        for (int i = 0; i < _lstStudent.size(); i++) {
//            if (_lstStudent.get(i).getId() == Integer.parseInt(_input)) {
//                _lstStudent.remove(i);
//            }
//        }
        
        //Cách 2: Sử dụng getIndex
        System.out.println("Mời bạn nhập mã xóa: ");
        _input = _sc.nextLine();
         _lstStudent.remove(getIndexByStudentID(Integer.parseInt(_input)));
        
         //Cách 3: Rút gọn hơn nữa nhưng lồng 2 phương thức vào và vẫn xóa theo index
        _lstStudent.remove(getIndexByStudentID(Integer.parseInt(getInputValue("mã cần xóa: "))));
    }

    public void findStudent() {
//        System.out.println("Mời bạn nhập mã: ");
//        _input = _sc.nextLine();
//        for (int i = 0; i < _lstStudent.size(); i++) {
//            if (_lstStudent.get(i).getId() == Integer.parseInt(_input)) {
//                _lstStudent.get(i).inRaManHinh();
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy");

          //Cách 2: Sử dụng getIndex
        System.out.println("Mời bạn nhập mã tìm: ");
        _input = _sc.nextLine();
        int temp = getIndexByStudentID(Integer.parseInt(_input));
        if (temp == -1) {
            System.out.println("Mã bạn nhập không tồn tại");
            return;
        }
         _lstStudent.get(temp).inRaManHinh();
        
         //Cách 3: Rút gọn hơn nữa nhưng lồng 2 phương thức vào và vẫn xóa theo index
        _lstStudent.get(getIndexByStudentID(Integer.parseInt(getInputValue("mã cần xóa: ")))).inRaManHinh();
    }

    //Đây là phương thức trả về và kết quả trả về là index của đối tượng nằm trong danh sách
    private int getIndexByStudentID(int idStudent) {
        for (int i = 0; i < _lstStudent.size(); i++) {
            if (_lstStudent.get(i).getId() == idStudent) {
                return i;
            }
        }
        return -1;
    }

    private String getInputValue(String mess) {
        System.out.println("Mời bạn nhập " + mess);
        return _sc.nextLine();
    }
}
