/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author cle13
 * Cho một xâu ký tự S chỉ có các chữ cái Tiếng Anh viết thường. Hãy đếm xem có bao nhiêu ký tự chữ cái khác nhau trong S.

Input: Có duy nhất một dòng chứa xâu ký tự S, độ dài không quá 100.

Output: Ghi ra số ký tự chữ cái khác nhau
* Input                 Output
* banana                3
* idea 1: cho 1 mảng 26 ký lưu giá trị xong cho chạy từng chữ, chữ nào xuất hiện thì cho giá trị = true, k xuất hiện thì false
* in ra số phần tử có giá trị true;
* idea 2: cho chạy rồi add vào set, in ra số phần tử của set
 */
public class J03038_DanhDauChuCai {
    //method 1(idea 1)
    private static int soKyTu1(String s){
        boolean[] a = new boolean[26];
        for(int i = 0; i < s.length(); i++) a[s.charAt(i)-'a'] = true;
        int count = 0;
        for(int i = 0; i < 26; i++) if(a[i] == true) count++;
        return count;
    }
    //method 2(idea 2)
    private static int soKyTu2(String s){
        HashSet<Character> st = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) st.add(s.charAt(i));
        return st.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(soKyTu1(s));
    }
}
