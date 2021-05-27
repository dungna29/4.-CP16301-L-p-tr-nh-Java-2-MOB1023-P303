/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_1_7_FileReader_FileWriter;

import java.io.Serializable;

/**
 *
 * @author LegendNguyen
 */
public class Teacher extends Person implements Serializable{ // Cho tất các các thuộc tính khi ghi vào sẽ được thứ tự và ko gây lộn xộn dữ liệu

    private String TeacherID;
    private double hours;

    public Teacher() {
    }

    public Teacher(String TeacherID, double hours, String _FirstName, String _MidleName, String _LastName, int _YearOfBird, String _Address, String School) {
        super(_FirstName, _MidleName, _LastName, _YearOfBird, _Address, School);
        this.TeacherID = TeacherID;
        this.hours = hours;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String TeacherID) {
        this.TeacherID = TeacherID;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    String ValuatePerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void OutputPerson() {
        System.out.printf("tên GV :  %s %s %s năm sinh GV: %d mã GV : %s số giờ giảng dạy : %f \n địa chỉ : %s\n", getFirstName(), getMidleName(), getLastName(), getYearOfBird(), getTeacherID(), getHours(), getAddress());
        System.out.println("------------------------------------------");
    }

}
