/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05064_bang_thu_nhap_giao_vien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //Có nhiều cách để xem là đã có hiểu trưởng chưa;
        //Có thể dùng 2 biến static hiệu trưởng và hiệu phó trong class GiaoVien để kiểm tra
        //hoặc trong lúc nhập thì sẽ xử lý luôn, ở đây thì sẽ dùng cách dùng 2 biển ở class driven (main) này
        boolean ht = false;
        int hp = 0;
        ArrayList<GiaoVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //lưu biến mã ngạch để kiểm tra hiệu trưởng, hiệu phó
            String maNgach = sc.nextLine();
            String chucvu = maNgach.substring(0,2);
            if(chucvu.equals("HT")){//nếu nhập vào là hiệu trưởng
                if(ht == false){//nếu hiệu trưởng chưa có thì sẽ tạo hiệu trưởng và cho biến = true
                    ds.add(new GiaoVien(maNgach, sc.nextLine(), Long.parseLong(sc.nextLine())));
                    ht = true;
                }else{//nếu có hiệu trưởng thì bỏ qua 2 dòng thông tin
                    sc.nextLine();
                    sc.nextLine();
                }
            }else if(chucvu.equals("HP")){//nếu là hiệu phó
                if(hp < 2){//nếu hiệu phó đang ít hơn 2 người thì
                    ds.add(new GiaoVien(maNgach, sc.nextLine(), Long.parseLong(sc.nextLine())));
                    hp++;// tăng số lượng hiệu phó  
                }else{//nếu đã đủ 2 hiệu phó thì bỏ qua 2 gòn thông tin
                    sc.nextLine();
                    sc.nextLine();
                }
            }else{//nếu không phải là hiệu trưởng hay hiệu phó thì chỉ cẩn add vào dánh sách thôi
                ds.add(new GiaoVien(maNgach, sc.nextLine(), Long.parseLong(sc.nextLine())));
            }
        }
        // in ra danh sách vừa nhập
        for (GiaoVien gv : ds) {
            System.out.println(gv);
        }
    }
}
