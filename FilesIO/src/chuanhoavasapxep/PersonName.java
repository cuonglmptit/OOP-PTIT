/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuanhoavasapxep;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class PersonName implements Comparable<PersonName>{
    private String name;
    public PersonName(String name){
        this.name = chuanHoa(name);
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
    public int compareTo(PersonName o) {
        String[] tmp1 = this.name.split(" ");
        String[] tmp2 = o.name.split(" ");
        String firstname1 = tmp1[tmp1.length-1], firstname2 = tmp2[tmp2.length-1];
        String surname1 = tmp1[0], surname2 = tmp2[0];
        String surnamebuffer1 = "", surnamebuffer2 = "";
        for(int i = 1; i < tmp1.length-1; i++) surnamebuffer1 += tmp1[i];
        for(int i = 1; i < tmp2.length-1; i++) surnamebuffer2 += tmp2[i];
        
        int con1 = firstname1.compareTo(firstname2); 
        int con2 = surname1.compareTo(surname2);   
        int con3 = surnamebuffer1.compareTo(surnamebuffer2);
        
        if(con1 != 0) return con1;
        if(con2 != 0) return con2;
        return con3;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
