/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhdiemtrungbinh;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String name, sID;
    private float m1, m2, m3, gpa;
    private int rank;
    public Student(int n, String name, float m1, float m2, float m3){
        this.sID = "SV"+String.format("%02d", n);
        this.name = chuanHoa(name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.gpa = (m1*3+m2*3+m3*2)/8;
    }
    private String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        String name = "";
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            name += String.valueOf(tmp.charAt(0)).toUpperCase();
            name += tmp.substring(1);
            if(st.hasMoreTokens()) name += " ";
        }
        return name;
    }
    public float getGPA(){
        return this.gpa;
    }
    public void setRank(int n){
        this.rank = n;
    }
    public int getRank(){
        return this.rank;
    }
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+String.format("%.2f", this.gpa)+" "+this.rank;
    }

    @Override
    public int compareTo(Student o) {
        if(this.gpa > o.gpa) return -1;
        if(this.gpa < o.gpa) return 1;
        return this.sID.compareTo(o.sID);
    }
}
