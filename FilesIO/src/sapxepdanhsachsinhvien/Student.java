/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachsinhvien;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String sID, name, pNumber, email;
    public Student(String sID, String name, String pNumber, String email){
        this.sID = sID;
        this.name = chuanHoa(name);
        this.pNumber = pNumber;
        this.email = email;
    }
    private String chuanHoa(String s){
        String name = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            name += String.valueOf(tmp.charAt(0)).toUpperCase() + tmp.substring(1);
            if(st.hasMoreTokens()) name += " ";
        }
        return name;
    }

    @Override
    public int compareTo(Student o) {
        String[] tmp1 = this.name.split(" ");
        String lastname1 = tmp1[tmp1.length-1];
        String surname1 = tmp1[0];
        String surnamebuffer1 = "";
        for(int i = 1; i < tmp1.length-1; i++) surnamebuffer1 += tmp1[i];
        
        String[] tmp2 = o.name.split(" ");
        String lastname2 = tmp2[tmp2.length-1];
        String surname2 = tmp2[0];
        String surnamebuffer2 = "";
        for(int i = 1; i < tmp2.length-1; i++) surnamebuffer2 += tmp2[i];
        
        int con1 = lastname1.compareTo(lastname2); 
        int con2 = surname1.compareTo(surname2);   
        int con3 = surnamebuffer1.compareTo(surnamebuffer2);
        
        if(con1 != 0) return con1;
        else if(con2 != 0) return con2;
        else if(con3 != 0) return con3;
        return this.sID.compareTo(o.sID);
    }
    
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+this.pNumber+" "+this.email;
    }
}
