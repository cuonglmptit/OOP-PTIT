/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachdoituongnhanvien;
import java.util.*;
import java.text.*;
/**
 *
 * @author cle13
 */
public class Employee implements Comparable<Employee> {
    private String emID, name, gender, address, taxID;
    private Date birth, signDate;
    public Employee(int n, String name, String gender, String birth, String address, String taxID, String signDate) throws ParseException{
        this.emID = String.format("%05d", n);
        this.name = chuanHoa(name);
        this.gender = gender;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.address = address;
        this.taxID = taxID;
        this.signDate = new SimpleDateFormat("dd/MM/yyyy").parse(signDate);
    }
    private String chuanHoa(String s){
        String name = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken().toLowerCase();
            name += String.valueOf(tmp.charAt(0)).toUpperCase();
            name += tmp.substring(1);
            name += " ";
        }
        return name;
    }
    @Override
    public String toString(){
        return emID+" "+name+" "+gender+" "+new SimpleDateFormat("dd/MM/yyyy").format(birth)+" "+address+" "+taxID+" "+new SimpleDateFormat("dd/MM/yyyy").format(signDate);
    }
    @Override
    public int compareTo(Employee o) {
        return this.birth.compareTo(o.birth);
    }
}
