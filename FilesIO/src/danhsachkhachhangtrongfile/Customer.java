/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachkhachhangtrongfile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Customer implements Comparable<Customer>{
    private String cID, name, gender, address;
    private Date birth;
    public Customer(int n, String name, String gender, String birth, String address) throws ParseException{
        this.cID = "KH" + String.format("%03d", n);
        this.name = chuanHoa(name);
        this.gender = gender;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.address = address;
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
        return this.cID+" "+this.name+" "+this.gender+" "+this.address+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.birth);
    }
    @Override
    public int compareTo(Customer o) {
        return this.birth.compareTo(o.birth);
    }
}
