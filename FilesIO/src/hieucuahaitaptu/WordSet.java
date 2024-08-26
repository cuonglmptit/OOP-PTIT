/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hieucuahaitaptu;
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
