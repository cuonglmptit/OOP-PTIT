/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diachiemail;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Email {
    private String email, name;
    private static Map<String, Integer> map = new HashMap<>();

    public Email(String name) {
        this.email = taoEmail(name);
    }
    private String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        String name  = "";
        while(st.hasMoreTokens()){
            name += st.nextToken()+" ";
        }
        return name.trim();
    }
    private String taoEmail(String name) {
        String s = chuanHoa(name);
        String[] tmp = s.split(" ");
        String preEmail = tmp[tmp.length-1];
        for (int i = 0; i < tmp.length-1; i++) {
            preEmail += tmp[i].charAt(0);
        }
        if(Email.map.containsKey(preEmail)){
            Email.map.put(preEmail, Email.map.get(preEmail)+1);
        }else{
            Email.map.put(preEmail, 1);
        }
        if(Email.map.get(preEmail).equals(1)){
            return preEmail+"@ptit.edu.vn";
        }
        else {
            return preEmail+Email.map.get(preEmail)+"@ptit.edu.vn";
        }
    }
    @Override
    public String toString(){
        return this.email;
    }
}
