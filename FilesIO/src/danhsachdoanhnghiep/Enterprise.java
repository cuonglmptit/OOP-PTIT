/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiep;

/**
 *
 * @author cle13
 */
public class Enterprise implements Comparable<Enterprise> {
    private String eID, name;
    private int maxStudent;
    public Enterprise(String eID, String name, int maxStudent){
        this.eID = eID;
        this.name = name;
        this.maxStudent = maxStudent;
    }

    @Override
    public int compareTo(Enterprise o) {
        return this.eID.compareTo(o.eID);
    }
    @Override
    public String toString(){
        return this.eID+" "+this.name+" "+this.maxStudent;
    }
}
