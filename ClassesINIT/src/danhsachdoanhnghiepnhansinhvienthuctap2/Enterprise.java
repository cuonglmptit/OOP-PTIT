/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiepnhansinhvienthuctap2;

/**
 *
 * @author cle13
 */
public class Enterprise implements Comparable<Enterprise>{
    private String eID, name;
    private int accept;

    public Enterprise(String eID, String name, int accept) {
        this.eID = eID;
        this.name = name;
        this.accept = accept;
    }
    
    public int getAccept(){
        return this.accept;
    }
    
    @Override
    public int compareTo(Enterprise o) {
        if(this.accept > o.accept) return -1;
        if(this.accept < o.accept) return 1;
        return this.eID.compareTo(o.eID);
    }
    
    @Override
    public String toString(){
        return this.eID+" "+this.name+" "+this.accept;
    }
}
