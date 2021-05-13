/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_0_ONTAP_JAVA1;

/**
 *
 * @author DungNAPC
 */
public class Student {
    //Phần 1: Khai báo các thuộc tính mà đối tượng phải có
    private int id;
    private String name;
    private String phone;
    private int sex;
    
    //Phần 2: Khởi tạo Contructor
    //1. Contructor không tham số
    public Student() {
    }
    
    //2. Contructor có tham số
    public Student(int id, String name, String phone, int sex) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
    }
    
    //Phần 3: Getter và Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    
    //Phần 4: Các phương thức của đối tượng

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", sex=" + sex + '}';
    }
    
    public void inRaManHinh(){
        System.out.printf("ID = %d | Tên: %s | Đt: %s | Giới tính: %s \n"
                ,id,name,phone,sex == 1?"Nam":"Nữ");
    }
    
    
}
