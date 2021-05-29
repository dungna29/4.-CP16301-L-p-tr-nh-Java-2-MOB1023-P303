/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_7_FileReader_FileWriter;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Anh Dung
 */
public class s5_DocVaGhiDoiTuong {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        ❑Cập luồng này giúp chúng ta đọc/ghi đối tượng
        ❑Sử dụng readObject() để đọc đối tượng từ
        DataInputStream
        ❑Sử dụng writeObject(Serializable) để ghi đối
        tượng lên DataOutputStream
        ❑Chú ý:
        ❖Chỉ các đối tượng được tạo từ các lớp có thực thi theo
        interface Serializable mới có thể đọc ghi được.
         */
        ghiFileObjectOutputStream();
        docFileObjectInputStream();
    }

    static void ghiFileObjectOutputStream() throws FileNotFoundException, IOException {

        File file = new File("dataObject.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(s5_DocVaGhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Lấy danh sách ảo
        List<Teacher> arrListTeacher = new ArrayList<>();
        Teacher tc1 = new Teacher("dungna29", 100, "Nguyen", "Anh", "Dung", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc2 = new Teacher("longnt25", 222, "Nguyen", "Thanh", "Long", 2000, "số 3 ngõ 125", "FPT POLY");
        Teacher tc3 = new Teacher("hoangnt99", 123, "Nguyen", "Dinh", "Hoang", 2001, "số 3 ngõ 125", "FPT POLY");
        Teacher tc4 = new Teacher("hungnq22", 355, "Nguyen", "Quang", "Hung", 2002, "số 3 ngõ 125", "FPT POLY");
        Teacher tc5 = new Teacher("hoang21", 666, "Nguyen", "Long", "Hoang", 1995, "số 3 ngõ 125", "FPT POLY");
        Teacher tc6 = new Teacher("linh32", 777, "Nguyen", "Quang", "Linh", 1996, "số 3 ngõ 125", "FPT POLY");
        //Add danh sách lên biến toàn cục ở trong Service
        arrListTeacher.add(tc1);
        arrListTeacher.add(tc2);
        arrListTeacher.add(tc3);
        arrListTeacher.add(tc4);
        arrListTeacher.add(tc5);
        arrListTeacher.add(tc6);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Teacher teacher : arrListTeacher) {
            oos.writeObject(teacher);
        }
        oos.close();
        fos.close();

    }

    static void docFileObjectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException {

        File file = new File("dataObject.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(s5_DocVaGhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

//        while (fis.available() > 0) {
//            teacherIn = (Teacher) ois.readObject();
//            System.out.println(teacherIn.getFirstName() + teacherIn.getLastName());
//        }
        Teacher teacherIn = new Teacher();
        List<Teacher> arrListTeacherinput = new ArrayList<>();       
        while (fis.available() > 0) {
            teacherIn = (Teacher) ois.readObject();
            arrListTeacherinput.add(teacherIn);

        }
        for (Teacher teacher : arrListTeacherinput) {
            teacher.OutputPerson();
        }
        ois.close();
        fis.close();


    }

}
