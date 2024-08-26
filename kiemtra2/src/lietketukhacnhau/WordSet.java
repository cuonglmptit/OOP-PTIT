/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietketukhacnhau;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class WordSet {
    private SortedSet<String> ss = new TreeSet<>();
    public WordSet(String vanban) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(vanban));
        while(sc.hasNext()){
            ss.add(sc.next().toLowerCase());
        }
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
