/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtiendien;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class ElectricityBill implements Comparable<ElectricityBill>{
    private String name, cID;
    private float quota, before, after, total, exceeded, inQuotaPay, totalPay, exceededPay, VAT;
    public ElectricityBill(int n, String name, String qba){//qba = quota, b4, after
        this.cID = "KH"+String.format("%02d", n);
        this.name = chuanHoa(name);
        String[] tmp = qba.split(" ");
        this.quota = calcQuota(tmp[0]);
        this.before = Float.parseFloat(tmp[1]);
        this.after = Float.parseFloat(tmp[2]);
        this.total = this.after - this.before;
        this.exceeded = this.total - this.quota;
        this.inQuotaPay = calcInQuotaPay();
        this.exceededPay = calcExceededPay();
        this.VAT = calcVAT();
        this.totalPay = calcTotalPay();
    }

    private String chuanHoa(String s) {
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
    
    private float calcInQuotaPay() {
        if(this.total < this.quota) return this.total*450;
        return this.quota*450;
    }
    
    private float calcQuota(String s) {
        if(s.equals("A")) return 100;
        else if(s.equals("B")) return 500;
        else return 200;
    }

    private float calcExceededPay() {
        if(this.exceeded > 0){
            return (float) this.exceeded*1000;
        }
        return 0;
    }
    private float calcVAT() {
        if(this.exceeded > 0) return (float) (this.exceeded*1000*0.05);
        return 0;
    }
    private float calcTotalPay() {
        if(this.total <= this.quota) return this.inQuotaPay;
        return this.inQuotaPay + this.exceededPay + this.VAT;
    }
    @Override
    public String toString(){
        return this.cID+" "+this.name+" "+String.format("%.0f", this.inQuotaPay)+" "+String.format("%.0f", this.exceededPay)
                +" "+String.format("%.0f", this.VAT)+" "+String.format("%.0f", this.totalPay);
    }

    @Override
    public int compareTo(ElectricityBill o) {
        if(this.totalPay > o.totalPay) return -1;
        if(this.totalPay < o.totalPay) return 1;
        return 0;
    }

    

    
}
