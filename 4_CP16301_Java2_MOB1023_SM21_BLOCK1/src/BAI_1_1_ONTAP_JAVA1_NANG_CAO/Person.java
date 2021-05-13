/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_1_ONTAP_JAVA1_NANG_CAO;

/**
 *
 * @author DungNAPC
 */
public abstract class Person {

    private int id;
    private String name;
    private String phone;
    private int sex;

    public Person() {
    }

    public Person(int id, String name, String phone, int sex) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
    }

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
    
    abstract void inRaManHinh();
}
