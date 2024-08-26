/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class XuLyXau {
    private String s;

    public XuLyXau() {
      
    }
    public XuLyXau(String s) {
        this.s = s;
    }
    public long soTu(){
        String[] tmp = this.s.split("\\s+");
        return tmp.length;
    }
    public String chuanHoa(){
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
}
