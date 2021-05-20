/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_3_BaiTapTongHop_CRUD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DungNAPC
 */
public class ServiceStudent {

    List<Student> _lstStudents;
    Student _student;

    public ServiceStudent() {
        _lstStudents = new ArrayList<>();
    }
    public void get10Student(){
        _student = new Student("PH00123", "Nguyễn Văn A", "012345", 0, 1999);
        _lstStudents.add(_student);
        _student = new Student("PH00124", "Nguyễn Văn B", "012345", 1, 2000);
        _lstStudents.add(_student);
        _student = new Student("PH00125", "Nguyễn Văn C", "012345", 0, 2001);
        _lstStudents.add(_student);
        _student = new Student("PH00126", "Nguyễn Văn D", "012345", 1, 2002);
        _lstStudents.add(_student);
        _student = new Student("PH00127", "Nguyễn Văn E", "012345", 0, 2003);
        _lstStudents.add(_student);
        _student = new Student("PH00128", "Nguyễn Văn F", "012345", 1, 2004);
        _lstStudents.add(_student);
        _student = new Student("PH00129", "Nguyễn Văn G", "012345", 0, 2005);
        _lstStudents.add(_student);
        _student = new Student("PH00130", "Nguyễn Văn H", "012345", 0, 2006);
        _lstStudents.add(_student);
    }
    //Tìm kiếm 1 sinh viên theo msv
    public Student findOneStudent(String msv){
        int temp = getIndexStudent(msv);
        if (getIndexStudent(msv) == -1) {
           return null;//Không tìm thấy return null
        }
        return _lstStudents.get(temp);//Tìm thấy thì return 1 đối tượng
    }

    //Sửa sinh viên truyền 1 đối tượng
    public String editStudent(Student student) {
        int temp = getIndexStudent(student.getMsv());
        if (temp >= 0) {
            return "Mã sinh viên đã tồn tại";
        }
        _lstStudents.set(temp, student);
        return "Bạn sửa thành công";
    }

    public String removeStudent(String msv) {
        if (getIndexStudent(msv) == -1) {
            return "Mã sinh viên không tồn tại";
        }
        if (msv.isBlank() && msv.isEmpty() && msv == null) {
            return "Xóa không thành công";
        }
        return "Xóa thành công";
    }

    public String addStudent(Student student) {
        if (getIndexStudent(student.getMsv()) == -1) {
            return "Mã sinh viên trùng";
        }
        if (student != null) {
            _lstStudents.add(student);
            return "Đã thêm thành công";
        }
        return "Không thành công";
    }

    public List<Student> getLstStudent() {
        return _lstStudents;
    }

    private int getIndexStudent(String msv) {
        for (int i = 0; i < _lstStudents.size(); i++) {
            if (_lstStudents.get(i).getMsv().equals(msv)) {
                return i;
            }
        }
        return -1;
    }
    //Phương thức trả về năm sinh để hiển thị trên giao diện
    public String[] getNamSinhCombobox(){
        int start = 1600,end = 2021;
        String[] arrYears = new String[2021-1600];
        for (int i = 0; i < 2021-1600; i++) {
            arrYears[0] = String.valueOf(start);
            start++;
        }
        return arrYears;
    }
}
