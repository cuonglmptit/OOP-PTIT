/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diemtuyensinh;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Candidate implements Comparable<Candidate>{
    private String cID, name, ethnic/*(sắc tộc)*/, status;
    private int district;
    private float testMark, totalMark;
    private static float admissionMark = (float) 20.5;
    public Candidate(int n, String name, float testMark, String ethnic, int district){
        this.cID = "TS"+String.format("%02d", n);
        this.name = chuanHoa(name);
        this.testMark = testMark;
        this.ethnic = ethnic;
        this.district = district;
        this.totalMark = calcTotalMark();
        this.status = calcStatus();
    }


    private String chuanHoa(String s) {
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

    private float calcTotalMark() {
        float sum = this.testMark;
        if(this.district == 1) sum += 1.5;
        else if(this.district == 2) sum += 1;
        if(this.ethnic.equals("Kinh") == false) sum += 1.5;
        return sum;
    }

    private String calcStatus() {
        if(this.totalMark >= admissionMark) return "Do";
        return "Truot";
    }
    
    @Override
    public String toString(){
        return this.cID+" "+this.name+" "+String.format("%.1f", this.totalMark)+" "+this.status;
    }

    @Override
    public int compareTo(Candidate o) {
        if(this.totalMark > o.totalMark) return -1;
        if(this.totalMark < o.totalMark) return 1;
        return this.cID.compareTo(o.cID);
    }
}
