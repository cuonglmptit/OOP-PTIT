package lietketheothutuxuathien;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cle13
 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> arl = (ArrayList<String>) ois.readObject();
        LinkedHashSet<String> vb = new LinkedHashSet<>();
        Set<String> np = new HashSet<>();
        while(sc.hasNext()){
            String tmp = sc.next().toLowerCase();
            vb.add(tmp);
        }
        for (String i : arl) {
            StringTokenizer st = new StringTokenizer(i);
            while(st.hasMoreTokens()){
                String tmp = st.nextToken().toLowerCase();
                np.add(tmp);
            }
        }
        for (String tmpvb : vb) {
            for (String tmpnp : np) {
                if(tmpvb.equals(tmpnp)) System.out.println(tmpvb);
            }
        }
    }
}
