/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cle13
 * Cho dãy A[] chỉ bao gồm các số nguyên dương không quá 105 nhưng không biết trước số phần tử của dãy. Người ta gọi dãy A[] là dãy ưu thế nếu thỏa mãn 1 trong 2 điều kiện sau đây:

Dãy gọi là ưu thế chẵn nếu số phần tử của dãy là chẵn và số lượng số chẵn trong dãy nhiều hơn số lượng số lẻ.
Dãy gọi là ưu thế lẻ nếu số phần tử của dãy là lẻ và số lượng số lẻ trong dãy nhiều hơn số lượng số chẵn.
Hãy kiểm tra xem dãy A[] có phải là dãy ưu thế hay không.

Input:

Dòng đầu ghi số bộ test, không quá 10
Mỗi bộ test là một dãy các số nguyên dương (không quá 104) và có không quá 200 số, các số cách nhau 1 khoảng trống, không biết trước số lượng phần tử.
Output:

Nếu dãy A[] thỏa mãn là dãy ưu thế thì in ra YES, nếu không in ra NO
* Input                                                     Output
2
11 22 33 44 55 66 77                                        YES
23 34 45 56 67 78 89 90 121 131 141 151 161 171             NO
* IDEA: dùng StringTokenizer, mỗi token thì sẽ cho số phần tử n++, dùng parseInt() để chuyển về int và kiển tra chẵn lẻ
 */
public class J02037_DayUuThe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            StringTokenizer s = new StringTokenizer(sc.nextLine());
            int n = 0, cnt_even = 0, cnt_odd = 0;
            while(s.hasMoreTokens()){
                String tmp = s.nextToken();
                n++;
                if(Integer.parseInt(tmp)%2 == 0) cnt_even++;
                else cnt_odd++;
            }
            if(n%2 == 0 && cnt_even > cnt_odd) System.out.println("YES");
            else if(n%2 != 0 && cnt_even < cnt_odd) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
