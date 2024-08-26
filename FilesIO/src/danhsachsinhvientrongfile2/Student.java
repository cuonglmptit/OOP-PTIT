/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvientrongfile2;

import java.util.*;
import java.text.*;
/**
 *
 * @author cle13
 */
public class Student {
    private String name, lop, sID;
    private Date birth;
    private float gpa;
    public Student(int i, String name, String lop, String birth, float gpa) throws ParseException{
        this.name = chuanHoa(name);
        this.sID = "B20DCCN" + String.format("%03d", i);
        this.lop = lop;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.gpa = gpa;
    }
    private String chuanHoa(String s){
        String name = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken().toLowerCase();
            name += String.valueOf(tmp.charAt(0)).toUpperCase();
            name += tmp.substring(1);
            if(st.hasMoreTokens()) name += " ";
        }
        return name;
    }
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+this.lop+" "+new SimpleDateFormat("dd/MM/yyy").format(birth)+" "+String.format("%.2f", this.gpa);
    }
}
