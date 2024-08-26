/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05057_bang_diem_tuyen_sinh;

import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Candidate {
    private String cID, name;
    private float math, physic, chemistry, extraMark, testMark, total;
    private static float baseMark = 24;
    private String matriculate;
    public Candidate(String cID, String name, float math, float physic, float chemistry) {
        this.cID = cID;
        this.name = chuanHoa(name);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.extraMark = extraMarkCalculate(cID);
        this.testMark = this.math*2 + this.physic + this.chemistry;
        this.total = this.math*2 + this.physic + this.chemistry + this.extraMark;
        setMatriculate();
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
    private void setMatriculate(){
        if(this.total >= Candidate.baseMark) this.matriculate = "TRUNG TUYEN";
        else this.matriculate = "TRUOT";
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
    public String toString(){
        return this.cID+" "+this.name+" "+fmt(this.extraMark)+" "+fmt(this.testMark)+" "+this.matriculate;
    }
}
