/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmonthi;

/**
 *
 * @author cle13
 */
public class Subject implements Comparable<Subject>{
    private String sbjID, name, examMethod;
    public Subject(String sbjID, String name, String examMethod){
        this.sbjID = sbjID;
        this.name = name;
        this.examMethod = examMethod;
    }

    @Override
    public int compareTo(Subject o) {
        return this.sbjID.compareTo(o.sbjID);
    }
    @Override
    public String toString(){
        return this.sbjID+" "+this.name+" "+this.examMethod;
    }
}
