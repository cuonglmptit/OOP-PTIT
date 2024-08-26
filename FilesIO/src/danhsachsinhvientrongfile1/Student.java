/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvientrongfile1;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String sID, name, Class, email;
    public Student(String sID, String name, String Class, String email){
        this.sID = sID;
        this.name = chuanHoa(name);
        this.Class = Class;
        this.email = email;
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
    @Override
    public int compareTo(Student o) {
        return this.sID.compareTo(o.sID);
    }
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+this.Class+" "+this.email;
    }
}
