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
public abstract class Person implements Serializable{
    private String _FirstName;
    private String _MidleName;
    private String _LastName;
    private int _YearOfBird;
    private String _Address;
    private String School;

    public Person() {
    }

    public Person(String _FirstName, String _MidleName, String _LastName, int _YearOfBird, String _Address, String School) {
        this._FirstName = _FirstName;
        this._MidleName = _MidleName;
        this._LastName = _LastName;
        this._YearOfBird = _YearOfBird;
        this._Address = _Address;
        this.School = School;
    }

    public String getFirstName() {
        return _FirstName;
    }

    public void setFirstName(String _FirstName) {
        this._FirstName = _FirstName;
    }

    public String getMidleName() {
        return _MidleName;
    }

    public void setMidleName(String _MidleName) {
        this._MidleName = _MidleName;
    }

    public String getLastName() {
        return _LastName;
    }

    public void setLastName(String _LastName) {
        this._LastName = _LastName;
    }

    public int getYearOfBird() {
        return _YearOfBird;
    }

    public void setYearOfBird(int _YearOfBird) {
        this._YearOfBird = _YearOfBird;
    }

    public String getAddress() {
        return _Address;
    }

    public void setAddress(String _Address) {
        this._Address = _Address;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }
    
    abstract String ValuatePerson();
    abstract void OutputPerson();
    
}
