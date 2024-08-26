/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangdiemthanhphan2;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String sID, name, sClass;
    private float m1, m2, m3;

    public Student(String sID, String name, String sClass, float m1, float m2, float m3) {
        this.sID = sID;
        this.name = name;
        this.sClass = sClass;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+this.sClass+" "+this.m1+" "+this.m2+" "+this.m3;
    }
}
