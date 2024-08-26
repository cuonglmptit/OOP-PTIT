package strings;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cle13
 * Địa chỉ email của các cán bộ, giảng viên PTIT được tạo ra bằng cách viết đầy đủ tên và ghép với các chữ cái đầu của họ và tên đệm. Nếu có nhiều người cùng email thì từ người thứ 2 sẽ thêm số thứ tự vào email đó.

Cho trước các xâu họ tên (có thể không chuẩn). Hãy tạo ra các địa email tương ứng.

Dữ liệu vào:
* Input:                            Output:
4
    nGUYEn    quaNG   vInH          vinhnq@ptit.edu.vn
   tRan   thi THU    huOnG          huongttt@ptit.edu.vn
   nGO   quoC  VINH                 vinhnq2@ptit.edu.vn
 lE            tuAn    aNH          anhlt@ptit.edu.vn
Dòng 1 ghi số N là xâu họ tên trong danh sách
N dòng tiếp theo ghi lần lượt các xâu họ tên (không quá 50 ký tự)
Kết quả: Ghi ra các email được tạo ra.
* 
 * main idea:
 * 1)Tạo 1 map để lưu các email đã đc dùng với key là String value là Integer để lưu tiền email và số lần email đó đã xuất hiện
 * 2)Lọc theo theo cách lấy chữ đầu mỗi từ đồng thời cho 1 biến để cho biết vị trí từ cuối cùng( sẽ là vị trí
 * bắt đầu của last name, rồi tạo 1 string mới lưu họ trừ kí tự cuối(ký tự cuối là chữ bắt đầu của tên nên k cần)
 * lấy string đó cộng thêm last name là đc 1 tiền email;
 * 3)So sánh tiền email vừa tạo đc với các email trong map xem có k 
 * (lưu ý k thể dùng == vì nó là object nên phải dùng .equals()), nếu có thì tăng giá trị(số lần) xuất hiện 
 * của email và cho tiền email cộng thêm số lần nó đã xuất hiện, 
 * nếu chưa xuất hiện thì cho email mới vào map với key = email, value = 2
 * 4)In ra tiền email đã đc thêm số lần nó xuất hiện rồi thêm đuôi @ptit.edu.vn là xong
 * 
 * 
 */
public class J03010_DiaChiEmail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> stored = new Hashtable<>();
        while(t-- >0){
            String s = sc.nextLine();
            boolean state = false;
            String firstname = "";
            int index_name = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '||s.charAt(i) == '\t'||s.charAt(i) == '\n'){
                    state  = false;
                }else if(state == false){
                    firstname += s.charAt(i);
                    index_name = i;
                    state = true;
                }
            }
            String email_not_lowered = "";
            for(int i = index_name; i < s.length(); i++){
                if(s.charAt(i) != '\n'&&s.charAt(i) != ' '&&s.charAt(i) != '\t')email_not_lowered += s.charAt(i);
            }
            for(int i = 0; i < firstname.length()-1; i++){
                email_not_lowered += firstname.charAt(i);
            }
            String email = email_not_lowered.toLowerCase();
            boolean appeared = false;
            for (Map.Entry<String, Integer> entry : stored.entrySet()){
                String tmp = entry.getKey();
                int cnt = stored.get(tmp);
                if(tmp.equals(email)){
                    appeared = true;
                    email += cnt;
                    stored.put(tmp, cnt+1);
                }
            }
            if(appeared == false) stored.put(email,2);   
            System.out.println(email+"@ptit.edu.vn");
        }
    }
}
