/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
Cho một số nguyên dương lớn có nhiều hơn 20 chữ số nhưng không quá 1000 chữ số.
Một số nguyên dương được coi là “số ưu thế chẵn” nếu số chữ số của nó là chẵn và số chữ số chẵn nhiều hơn số chữ số lẻ.
Một số nguyên dương được coi là “số ưu thế lẻ” nếu số chữ số của nó là lẻ và số chữ số lẻ nhiều hơn số chữ số chẵn.
Hãy kiểm tra xem số đó có phải là số ưu thế (chẵn hoặc lẻ) hay không.
Chú ý: trường hợp số lượng chữ số chẵn và số lượng chữ số lẻ bằng nhau thì không được coi là số ưu thế.
Dữ liệu vào:
Dòng đầu ghi số bộ test, không quá 10
Mỗi bộ test là một dãy ký tự có độ dài không quá 1000, không có khoảng trống
Kết quả:
Nếu dữ liệu vào không phải là một số nguyên hợp lệ (có ký tự không phải số hoặc bắt đầu bằng chữ số 0) thì in ra INVALID
Nếu dữ liệu vào thỏa mãn là số ưu thế thì in ra YES, nếu không in ra NO
Input                               Output
01234aa32432432432534545b987978     INVALID
1234567890123456789000              YES
999999999999999999999999999999      NO   
* main idea: nhập vào string, kiểm tra xem có INVALID ko, kếu ko thì làm 
 */
public class J03024_SoUuThe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            int n = a.length();
            boolean invalid = false;
            int chan = 0, le = 0;
            for(int i = 0; i < n; i++){
                if(a.charAt(i) > '9' || a.charAt(i) <'0'){
                    invalid = true;
                    break;
                }else{
                    if((a.charAt(i)-'0')%2 == 0) chan++;
                    else le++;
                }
            }
            if(invalid == true) System.out.println("INVALID");
            else{
                if(n%2 == 0&& chan > le) System.out.println("YES");
                else if(n%2 != 0&& le > chan) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
