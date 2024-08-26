/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
 * Cho trước một xâu S. Bạn thay đổi đúng 1 kí tự. Hãy kiểm tra xem liệu bạn có thể tạo ra được xâu đối xứng hay không.

Input:

Dòng đầu tiên là số lượng bộ test T (T <= 20).

Mỗi test gồm 1 xâu S có độ dài không quá 15 kí tự.

Output: 

Với mỗi test, in ra “YES” nếu có thể biến đổi xâu S thành xâu đối xứng, in ra “NO” trong trường hợp ngược lại.
* Ví dụ:
Input:                  Output:
3                        
abccaa                  YES      
abbcca                  NO      
abcda                   YES
* idea: đề bắt buộc phải thay đổi 1 kí tự => xét xem xâu có phải là không đối xứng với 1 vị trí đối xứng bị khác nhau k?
* nếu có thì ok;
* Trường hợp 2: xâu đã đổi xứng nhưng độ dài là lẻ => đổi ở vị trí giữa sẽ vẫn đối xứng
* Trường hợp ouput NO: xâu đã đối xứng và độ dài chẵn || xâu chưa đối xứng mà có 2 vị trí đối xứng khác nhau 
 */
public class J03025_XauDoiXung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            boolean ok = true;
            int cnt = 0;
            int n = s.length();
            for(int  i = 0; i < n/2; i++){
                if(s.charAt(i) != s.charAt(n-1-i)) cnt ++;
            }
            if(cnt == 1)System.out.println("YES");
            else if(cnt == 0 && n%2 != 0)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
