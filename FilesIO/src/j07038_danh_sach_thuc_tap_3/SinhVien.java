/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07038_danh_sach_thuc_tap_3;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SinhVien implements Comparable<SinhVien> {

    private String msv, hoten, lop, email;
    private static HashMap<String, SinhVien> map = new HashMap<>();
    public SinhVien(String msv, String hoten, String lop, String email) {
        this.msv = msv;
        this.hoten = chuanHoa(hoten);
        this.lop = lop;
        this.email = email;
        map.put(msv, this);
    }
    public static SinhVien getSVbyID(String msv){
        return map.get(msv);
    }
    private String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s);
        String name = "";
        while(st.hasMoreTokens()){
            String tmp = st.nextToken().toLowerCase();
            name += String.valueOf(tmp.charAt(0)).toUpperCase();
            name += tmp.substring(1);
            if(st.hasMoreTokens()) name += " ";
        }
        return name;
    }
    @Override
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv);
    }

    @Override
    public String toString() {
        return msv + " " + hoten + " " + lop;
    }
    
}
