/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachtrungtuyen;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Candidate implements Comparable<Candidate>{
    private String cID, name;
    private float math, physic, chemistry, extraMark, total;
    private static float baseMark;
    private String matriculate;
    public Candidate(String cID, String name, float math, float physic, float chemistry) {
        this.cID = cID;
        this.name = chuanHoa(name);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.extraMark = extraMarkCalculate(cID);
        this.total = this.math*2 + this.physic + this.chemistry + this.extraMark;
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
    public void setMatriculate(){
        if(this.total >= Candidate.baseMark) this.matriculate = "TRUNG TUYEN";
        else this.matriculate = "TRUOT";
    }
    public void setBaseMark(){
        baseMark = this.total;
    }
    public static String getBaseMark(){
        return String.format("%.1f", baseMark);
    }
    private float extraMarkCalculate(String cID){
        //cách 1, dùng substring lấy 3 chữ đầu của mã rồi so sánh
        //String area = cID.substring(0, 3);
        //cách 2: dùng startWith()
        if(cID.startsWith("KV1")) return (float) 0.5;
        else if(cID.startsWith("KV2")) return (float) 1.0;
        else return (float) 2.5;
    }
    private static String fmt(float d){
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
    @Override
    public int compareTo(Candidate o) {
        if(this.total > o.total) return -1;
        if(this.total < o.total) return 1;
        return 0;
    }
    @Override
    public String toString(){
        return this.cID+" "+this.name+" "+fmt(this.extraMark)+" "+fmt(this.total)+" "+this.matriculate;
    }
}
