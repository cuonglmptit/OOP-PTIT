/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxeptheomasinhvien;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String sID, name, sClass, email;

    public Student(String sID, String name, String sClass, String email) {
        this.sID = sID;
        this.name = name;
        this.sClass = sClass;
        this.email = email;
    }

    @Override
    public int compareTo(Student o) {
        return this.sID.compareTo(o.sID);
    }
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+this.sClass+" "+this.email;
    }
}
