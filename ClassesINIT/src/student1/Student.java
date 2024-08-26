/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cle13
 */
public class Student {
    private String name, student_id, lop;
    private Date birth;
    private float gpa;
    public Student(int n, String name, String lop, String birth, float gpa) throws ParseException{
        this.student_id = "B20DCCN"+String.format("%03d", n);
        this.name = name;
        this.lop = lop;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return student_id + " " + name + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(birth) + " " + String.format("%.2f", gpa);
    }
}
