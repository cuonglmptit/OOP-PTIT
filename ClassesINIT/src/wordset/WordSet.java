/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordset;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author cle13
 */
public class WordSet {
    private SortedSet<String> ss = new TreeSet<>();
    public WordSet(String vanban) {
        StringTokenizer st = new StringTokenizer(vanban.toLowerCase());
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            this.ss.add(tmp);
        }
    }
    
    public SortedSet<String> getSet(){
        return this.ss;
    }
    public String union(WordSet ws2){
        String uni = "";
        SortedSet<String> st = new TreeSet<>();
        for (String s : this.ss) {
            st.add(s);
        }
        for (String s : ws2.getSet()) {
            st.add(s);
        }
        for (String string : st) {
            uni += string+" ";
        }
        return uni.substring(0, uni.length()-1);
    }
    public String intersection(WordSet ws2){
        String inter = "";
        SortedSet<String> st = new TreeSet<>();
        for (String s : this.ss) {
            boolean isInter = false;
            for (String s1 : ws2.getSet()) {
                if(s.compareTo(s1) == 0){
                    isInter = true;
                }
            }
            if(isInter) st.add(s);
        }
        for (String string : st) {
            inter += string+" ";
        }
        return inter.substring(0, inter.length()-1);
    }
    @Override
    public String toString(){
        String s = "";
        int i = 1;
        for(String tmp : ss){
            if(i++ != ss.size())
            s += tmp +'\n';
            else s += tmp;
        }
        return s;
    }
}
