/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmonhoc;

/**
 *
 * @author cle13
 */
public class Subject implements Comparable<Subject>{
    private String sbjID, name, courseCredit;
    public Subject(String sbjID, String name, String courseCredit){
        this.sbjID = sbjID;
        this.name = name;
        this.courseCredit = courseCredit;
    }
    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return this.sbjID+" "+this.name+" "+this.courseCredit;
    }
}
