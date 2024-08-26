/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_init;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Teacher {
    private
    String name;
    String quota_code;//quota_code = mã ngạch
    double allowance;//phụ cấp
    String position;//vị trí
    double salary_scale;//bậc lương
    double base_salary;//lương cơ bản
    double salary;//lương sau khi cộng các thứ
    public
    Teacher(){
        
    }
    Teacher(String quota_code, String name, double base_salary){
        this.quota_code = quota_code;
        this.position = quota_code.substring(0,2);
        this.name = name;
        this.salary_scale = Double.parseDouble(quota_code.substring(2,quota_code.length()));
        if(this.position.equals("HT")) this.allowance = 2000000;
        else if(this.position.equals("HP")) this.allowance = 900000;
        else if(this.position.equals("GV")) this.allowance = 500000;
        this.base_salary = base_salary;
        this.salary = this.base_salary*this.salary_scale + this.allowance;
    }
    void Print(){
        System.out.printf("%s %s %.0f %.0f %.0f", quota_code, name, salary_scale, allowance, salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher a = new Teacher(sc.nextLine(),sc.nextLine(),sc.nextDouble());
        a.Print();
//        String a = "HP04";
//        System.out.println(a.substring(0,2) + "     " + a.substring(2,a.length())+"   "+Double.parseDouble("04"));
    }
}
