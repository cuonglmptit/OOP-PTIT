/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachgiangvientheobomon;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Teacher {
    private String  tID, name, major, majorAcronym;

    public Teacher(int n, String name, String teaches) {
        this.tID = "GV"+String.format("%02d", n);
        this.name = name;
        this.major = teaches;
        this.majorAcronym = aCronym(this.major);
    }

    @Override
    public String toString(){
        return this.tID+" "+this.name+" "+this.majorAcronym;
    }
    public boolean checkMajor(String s){
        String major = aCronym(s);
        return this.majorAcronym.equals(major);
    }
    private String aCronym(String s) {
        String acr = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            acr += String.valueOf(tmp.charAt(0)).toUpperCase();
        }
        return acr;
    }
}
