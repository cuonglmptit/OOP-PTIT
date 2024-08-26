/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songuyentolonnhattrongfile;

/**
 *
 * @author cle13
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class SoNguyenToLonNhatTrongFile {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer integer : a) {
            if(isPrime(integer)){
                if(map.containsKey(integer)) map.put(integer, map.get(integer)+1);
                else map.put(integer, 1);
            }
        }
        Map<Integer, Integer> rmap = map.descendingMap();
        int q = 0;
        for (Map.Entry<Integer, Integer> entry : rmap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
            q++;
            if(q == 10) break;
        }
    }
}
