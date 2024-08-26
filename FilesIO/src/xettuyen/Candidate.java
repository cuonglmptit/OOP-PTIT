/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xettuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Candidate {
    private String cID, name, rating;
    private Date birth;
    private long age;
    private float theory, practice, bonus, gpa;
    public Candidate(int n, String name, String birth, float theory, float pratice) throws ParseException{
        this.cID = "PH" + String.format("%02d", n);
        this.name = chuanHoa(name);
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.theory = theory;
        this.practice = pratice;
        this.bonus = bonusCal();
        this.gpa = gpaCal();
        this.rating = ratingCal();
        this.age = ageCal()-1;
    }
    private float bonusCal(){
        if(this.theory >= 8&& this.practice >=8) return 1;
        if(this.theory >= 7.5&& this.practice >=7.5) return (float) 0.5;
        return 0;
    }
    private float gpaCal(){
        float total = 0;
        total = Math.round((this.theory + this.practice)/2 + this.bonus);
        if(total >= 10) return 10;
        else return total;
    }
    private long ageCal(){
        Date curDate = new Date();
        return Math.abs(this.birth.getYear() - curDate.getYear());
    }
    private String ratingCal(){
        if(this.gpa < 5) return "Truot";
        if(this.gpa <= 6) return "Trung binh";
        if(this.gpa == 7) return "Kha";
        if(this.gpa == 8) return "Gioi";  
        return "Xuat sac"; 
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
    public String toString(){
        return this.cID+" "+this.name+" "+this.age+" "+String.format("%.0f", this.gpa)+" "+this.rating;
    }
}
