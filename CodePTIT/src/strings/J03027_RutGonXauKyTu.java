/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
 * Cho một xâu S. Mỗi bước, bạn được phép xóa đi 2 kí tự liền nhau mà giống nhau. Chẳng hạn xâu “aabcc” có thể trở thành “bcc” hoặc “aab” sau 1 lần xóa.

Hỏi xâu cuối cùng thu được là gì? Nếu xâu rỗng, in ra “Empty String”.

Input:

Một xâu S chỉ gồm các chữ cái thường, có độ dài không vượt quá 100.

Output: 

In ra đáp án tìm được.
* Input:
aaabccddd
Output:
abd
Input:
abba
Output:
Empty String
 */
public class J03027_RutGonXauKyTu {
    public static String dequyRutGon(String input){
        if(input.length() <= 1) return input;
        if(input.charAt(0) == input.charAt(1)) return dequyRutGon(input.substring(2));
        else return input.charAt(0) + dequyRutGon(input.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine();
        int n = dequyRutGon(sin).length();
        String s = dequyRutGon(sin);
        boolean empty = false;
        while(true){
            int tmp = dequyRutGon(s).length();
            if(tmp == 0){
                empty = true;
                break;
            }else if(tmp < n){
                s = dequyRutGon(s);
                n = tmp;
            }else if(tmp == n) break;
        }
        if(empty == true) System.out.print("Empty String");
        else System.out.print(s);
    }
}
