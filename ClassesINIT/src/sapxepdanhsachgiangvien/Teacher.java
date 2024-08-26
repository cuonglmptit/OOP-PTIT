/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachgiangvien;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Teacher implements Comparable<Teacher>{
    private String  tID, name, major, majorAcronym;

    public Teacher(int n, String name, String teaches) {
        this.tID = "GV"+String.format("%02d", n);
        this.name = name;
        this.major = teaches;
        this.majorAcronym = aCronym();
    }

    @Override
    public int compareTo(Teacher o) {
        String[] tmp1 = this.name.split(" ");
        String[] tmp2 = o.name.split(" ");
        String firstname1 = tmp1[tmp1.length-1];
        String firstname2 = tmp2[tmp2.length-1];
        if(firstname1.compareTo(firstname2) != 0) return firstname1.compareTo(firstname2);
        return this.tID.compareTo(o.tID);
    }
    @Override
    public String toString(){
        return this.tID+" "+this.name+" "+this.majorAcronym;
    }

    private String aCronym() {
        String acr = "";
        StringTokenizer st = new StringTokenizer(this.major);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            acr += String.valueOf(tmp.charAt(0)).toUpperCase();
        }
        return acr;
    }
}
