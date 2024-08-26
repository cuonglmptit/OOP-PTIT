/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timthukhoacuakithi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cle13
 */
public class Candidate implements Comparable<Candidate>{
    private int cID;
    private String name, birth;
    private float m1, m2, m3, total;
    private static float maxOfAll;
    public Candidate(int n, String name, String birth, float m1, float m2, float m3){
        this.cID = n;
        this.name = name;
        this.birth = birth;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.total = m1+m2+m3;
    }
    public void setValedictorian(){
        maxOfAll = this.total;
    }
    public static float getmaxOfAll(){
        return maxOfAll;
    }
    public float getTotal(){
        return this.total;
    }
    @Override
    public int compareTo(Candidate o) {
        if(this.total > o.total) return -1;
        if(this.total < o.total) return 1;
        if(this.cID > o.cID) return 1;
        if(this.cID < o.cID) return -1;
        return 0;
    }
    @Override
    public String toString(){
        return this.cID+" "+this.name+" "+this.birth+" "+this.total;
    }
}
