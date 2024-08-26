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
public class Employee {
    private String emp_id = "00001", name, gender, birth, address, tax_id, date;
    Employee(){
        
    }
    Employee(String name, String gender, String birth, String address, String tax_id, String date){
        this.name = name;
        this.gender = gender;
        // chuẩn hóa ngày sinh 
        String[] tmp = birth.split("/");
        String birth_fixed = "";
        if(tmp[0].length() < 2) birth_fixed += "0"+tmp[0]+"/";
        else birth_fixed += tmp[0]+"/";
        if(tmp[1].length() < 2) birth_fixed += "0"+tmp[1]+"/";
        else birth_fixed += tmp[1]+"/";
        birth_fixed += tmp[2];
        this.birth = birth_fixed;
        //
        this.address = address;
        this.tax_id = tax_id;
        this.date = date;
    }
    void Print(){
        System.out.printf("%s %s %s %s %s %s %s", emp_id, name, gender, birth, address, tax_id, date);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee a = new Employee(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine());
        a.Print();
    }
}
