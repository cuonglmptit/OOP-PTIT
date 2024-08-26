/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loaibosonguyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author cle13
 * Cho file dữ liệu dạng văn bản DATA.in có thể chứa cả số và ký tự.

Hãy loại bỏ các số nguyên int, sắp xếp các nội dung còn lại trong file theo thứ tự từ điển và in ra trên một dòng.

Chú ý: file dữ liệu có rất nhiều dòng với rất nhiều số và ký tự xen kẽ nhau.

Input

File văn bản DATA.in có không quá 1000 dòng. Dữ liệu đảm bảo số lượng các từ trong dãy kết quả nhỏ hơn 10000.

Output

Ghi ra các nội dung không thỏa mãn kiểu int trên một dòng, sắp xếp theo thứ tự từ điển, mỗi từ cách nhau một khoảng trống. 
 */
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arl = new ArrayList<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            try{
                Integer.parseInt(tmp);
            }catch(NumberFormatException e){
                arl.add(tmp);
            }
        }
        Collections.sort(arl);
        int i = 1;
        for(String tmp : arl){
            if(i++ != arl.size())
                System.out.print(tmp + " ");
            else System.out.print(tmp);
        }
    }
}
