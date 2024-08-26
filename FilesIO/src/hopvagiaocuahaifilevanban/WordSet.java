/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hopvagiaocuahaifilevanban;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author cle13
 */
public class WordSet {
    private SortedSet<String> ss = new TreeSet<>();
    public WordSet(String vanban) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(vanban));
        while(sc.hasNext()){
            ss.add(sc.next().toLowerCase());
        }
    }
    
    public SortedSet<String> getSet(){
        return this.ss;
    }
    public String difference(WordSet ws2){
        String tapkhacnhau = "";
        for(String i : this.ss){
            boolean khongtrung = true;
            for(String j : ws2.getSet()){
                if(i.compareTo(j) == 0) khongtrung = false;
            }
            if(khongtrung) tapkhacnhau += i+" ";
        }
        return tapkhacnhau.substring(0,tapkhacnhau.length()-1);//bỏ đi dấu cách ở cuối string do vòng lặp cuối cùng vẫn cộng thêm dấu cách
                                                               // cho chuẩn =))
    }
    public String union(WordSet ws2){
        Set<String> set = new TreeSet<>();
        for (String i : this.ss) {
            set.add(i);
        }
        for (String i : ws2.getSet()) {
            set.add(i);
        }
        String s = "";
        for (String tmp : set) {
            s += tmp+" ";
        }
        return s.substring(0, s.length()-1);
    }
    public String intersection(WordSet ws2){
        String s = "";
        for (String s1 : this.ss) {
            for (String s2 : ws2.getSet()) {
                if(s1.equals(s2)) s += s1+" ";
            }
        }
        return s.substring(0, s.length()-1);
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
