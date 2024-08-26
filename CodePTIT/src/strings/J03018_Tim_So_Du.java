/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 * Hãy tính giá trị biểu thức (1^n + 2^n + 3^n + 4^n ) mod 5
 * main idea: (source geeksforgeeks: https://www.geeksforgeeks.org/find-value-1n-2n-3n-4n-mod-5/)
Basic Approach : If you will solve this question with a very basic approach of finding value of (1n +2n + 3n + 4n ) and then finding its modulo value for 5, you will certainly get your answer but for the larger value of n we must got wrong answer as you will be unable to store value of (1n +2n + 3n + 4n ) properly. 
Better and Proper Approach : Before proceeding to solution lets go through some of periodical properties of power of 2, 3 & 4. 

f(n) = 2n is periodical for n = 4 in terms of last digit. i.e. last digit of 2n always repeat for next 4th value of n. (ex: 2, 4, 8, 16, 32, 64…)
f(n) = 3n is periodical for n = 4 in terms of last digit. i.e. last digit of 3n always repeat for next 4th value of n.(ex: 3, 9, 27, 81, 243, 729…)
f(n) = 4n is periodical for n = 2 in terms of last digit. i.e. last digit of 4n always repeat for next 2nd value of n.(ex: 4, 16, 64, 256..)
1n is going to be 1 always, independent of n.
So, If we will have a close look for periodicity of f(n) = (1n +2n + 3n + 4n ) we will get that its periodicity is also 4 and its last digits occurs as : 
 

for n = 1, f(n) = 10
for n = 2, f(n) = 30
for n = 3, f(n) = 100
for n = 4, f(n) = 354
for n = 5, f(n) = 1300
Observing above periodicity we can see that if (n%4==0) result of f(n)%5 is going to be 4 other wise result = 0. So, rather than calculating actual value of f(n) and then obtaining its value with mod 5 we can easily get result only be examine value of n. 
* muốn tính số có chia hết cho 4 hay ko thì xét 2 số cuối xem có chia hết cho 4 ko , nếu có thì là chia hết
* do số lớn đến 100000 chữ số nên dùng cách này cho nhanh, ko thì có thể dùng big integer
* xem cách nhận biết 1 số có chia hết cho các số từ 1->13 ko tại đây: https://byjus.com/maths/divisibility-rules/
 */
public class J03018_Tim_So_Du {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
//            //cách dùng big integer(0.55s-0.66s)
//            BigInteger a = new BigInteger(s);
//            if(a.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) System.out.println("4");
//            else System.out.println("0");

            //cách dùng dấu hiệu chia hết cho 4 (0.19s)
            if(s.length()>=2){
                if(Integer.parseInt(s.substring(s.length()-3))%4 == 0) System.out.println("4");
                else System.out.println("0");
            }else{
                if(Integer.parseInt(s)%4 == 0) System.out.println("4");
                else System.out.println("0");
            }
        }
    }
}
