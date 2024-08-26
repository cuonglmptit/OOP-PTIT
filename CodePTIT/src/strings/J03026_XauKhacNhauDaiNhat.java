/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
 * Cho 2 xâu A và B. Bạn hãy tìm xâu C dài nhất sao cho C chỉ là xâu con của A hoặc B, chứ không phải là xâu con của cả A và B.

Input:

Dòng đầu tiên là số lượng bộ test T (T <= 20).

Mỗi test gồm 2 dòng, mô tả xâu A và B, mỗi xâu có độ dài không có 500 kí tự và chỉ gồm các chữ cái thường.

Output: 

Với mỗi test, in ra độ dài của xâu con khác nhau dài nhất tìm được.

Nếu không có đáp án, in ra -1.
* Input            Output
2
abcd
defgh               5
a                   
a                   -1
* TIP: nếu s1 == s2 => -1 else max(s1.length() , s2.length())
 */

public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            if(s1.equals(s2)) System.out.println("-1");
            else System.out.println(Integer.max(s1.length(), s2.length()));
        }
    }
}
