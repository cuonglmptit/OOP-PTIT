/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
 * Biển số xe máy được quy định gồm các thành phần:

Hai chữ số đầu là mã quản lý theo tỉnh – thành phố (ví dụ mã của Hà Nội là 29 đến 31)
Sau đó là một chữ cái in hoa (từ A đến Z) và một chữ số. Cặp chữ cái và chữ số này được cấp theo khu vực quận – huyện.
Tiếp theo là dấu gạch ngang, rồi đến một dãy 5 số gồm 2 cụm: 3 chữ số đầu và hai chữ số sau, phân tách bởi dấu chấm.
Thông thường, người ta chỉ quan tâm đến 5 chữ số cuối. Giả sử các trường hợp sau được coi là đẹp:

-Cả 5 chữ số được sắp theo thứ tự tăng chặt từ trái qua phải.
-Cả 5 chữ số đều bằng nhau
-Ba chữ số đầu bằng nhau và hai chữ số cuối bằng nhau
-Cả 5 chữ số đều là 6 và/hoặc 8 (số lộc phát).
* Theo quy tắc trên, các biển số sau được coi là đẹp:

29T1-123.79
29T1-555.55
29T1-222.33
29T1-686.88
Và các biển số sau không đẹp:

29T1-123.33
29T1-555.54
29T1-606.88
* Viết chương trình kiểm tra xem các biển số xe có đẹp hay không.

Dữ liệu vào

Dòng đầu ghi số bộ test, không quá 50
Mỗi bộ test là một biển số. Dữ liệu vào đảm bảo biển số được viết đúng quy định. 
Kết quả

In ra kết quả kiểm tra với từng bộ test
* IDEA: lấy mấy số cuối rồi cho điều kiện vào thôi
 */
public class J03040_BienSoDep {
    private static boolean isBienSoDep(String s){
        String BienSo = "";
        // lấy 5 số cuối của biển
        BienSo += String.valueOf(s.charAt(5)) + String.valueOf(s.charAt(6)) + String.valueOf(s.charAt(7))
                    + String.valueOf(s.charAt(9)) + String.valueOf(s.charAt(10)); 
        // bắt đầu các điều kiện, nếu đúng 1 trong 5 số đẹp thì reuturn true ko thì hạy hết thì là biển xấu
        // tăng chặt và 5 chữ số bằng nhau cho cùng 1 vòng lặp đc
        boolean is_incresing = true, is_allsame = true;
        for(int i = 1; i < BienSo.length(); i++) {
            if(BienSo.charAt(i-1) >= BienSo.charAt(i))
                is_incresing = false;
            if(BienSo.charAt(0) != BienSo.charAt(i)) 
                is_allsame = false;
        }
        // 3 số đầu bằng nhau và 2 số cuối  bằng nhau
        boolean  is_3_2 = true;
        for(int i = 1; i < 3; i++) if(BienSo.charAt(0) != BienSo.charAt(i)) is_3_2 = false;
        if(BienSo.charAt(3) != BienSo.charAt(4)) is_3_2 = false;
        // cả 5 chữ số là 6 || 8
        boolean is_68 = true;
        for(int i = 0; i < BienSo.length(); i++) if(BienSo.charAt(i) != '6' && BienSo.charAt(i) != '8') is_68 = false;
        return (is_incresing || is_allsame || is_3_2 || is_68 );
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(isBienSoDep(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
