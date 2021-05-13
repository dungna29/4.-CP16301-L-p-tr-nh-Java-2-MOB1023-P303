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
public class Main {
    public static void main(String[] args) {
        ServiceStudent serviceStudent = new ServiceStudent();
        serviceStudent.addStudent();
        serviceStudent.getLstStudents();
    }
}
