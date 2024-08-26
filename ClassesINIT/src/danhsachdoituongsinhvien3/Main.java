package danhsachdoituongsinhvien3;

import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++){
            SinhVien tmp = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(), Float.parseFloat(in.nextLine()));
            ds.add(tmp);
        }
//        Collections.sort(ds);
        for(SinhVien tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
