/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachthuctap2;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String sID, name, sClass, email, ePractice;
    private int order;

    public Student(int order, String sID, String name, String sClass, String email, String ePractice) {
        this.order = order;
        this.sID = sID;
        this.name = name;
        this.sClass = sClass;
        this.email = email;
        this.ePractice = ePractice;
    }
    @Override
    public int compareTo(Student o){
        return this.sID.compareTo(o.sID);
    }
    @Override
    public String toString(){
        return this.order+" "+this.sID+" "+this.name+" "+this.sClass+" "+this.email+" "+this.ePractice;
    }
}
