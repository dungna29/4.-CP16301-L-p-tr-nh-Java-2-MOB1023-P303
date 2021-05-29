/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_8_BAI_MAU_IO_OBJ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dungna29
 */
public class NhanVienService {
    List<NhanVien> _lstNhanVien;
    NhanVien _nhanVien;
    File file = new File("dataDungna.txt");
    public NhanVienService() {
        _lstNhanVien = new ArrayList<>();
        fake5NhanVien();
    }
    public void fake5NhanVien(){
        _nhanVien = new NhanVien(1, 1, "Nguyen Van A", "01234");
        _lstNhanVien.add(_nhanVien);
        _nhanVien = new NhanVien(1, 2, "Nguyen Van B", "01234");
        _lstNhanVien.add(_nhanVien);
        _nhanVien = new NhanVien(1, 3, "Nguyen Van C", "01234");
        _lstNhanVien.add(_nhanVien);
        _nhanVien = new NhanVien(1, 4, "Nguyen Van D", "01234");
        _lstNhanVien.add(_nhanVien);
        _nhanVien = new NhanVien(1, 5, "Nguyen Van E", "01234");
        _lstNhanVien.add(_nhanVien);
    }
    public String ghiFile() throws FileNotFoundException, IOException{
       
       //Kiểm tra sự tồn tại của file đó nếu chưa có thì tạo mới
        if (!file.exists()) {
           try {
               System.out.println("Tạo mới file thành thành công");
               file.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(NhanVienService.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (NhanVien x : _lstNhanVien) {
            oos.writeObject(x);
        }
        oos.close();
        fos.close();
        return "Ghi file thành công";
    }
    
    public List<NhanVien> docFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        //Kiểm tra sự tồn tại của file đó nếu chưa có thì tạo mới
        if (!file.exists()) {
           try {
               System.out.println("Tạo mới file thành thành công");
               file.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(NhanVienService.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (fis.available()>0) {
            _nhanVien = (NhanVien) ois.readObject();//Đọc object và ép về đúng kiể đối tượng
            _lstNhanVien.add(_nhanVien);//Thêm đối tượng đọc từ file add vào List
        }
        ois.close();
        fis.close();
        return _lstNhanVien;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        NhanVienService nvs = new NhanVienService();
        nvs.ghiFile();
        nvs.docFile();
    }
}
