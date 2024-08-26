/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_initialization;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Student {
    private String name = "";
    private String Class = "";
    private String birth = "";
    private String student_id = "B20DCCN001"; 
    float GPA;
    Student(){
        
    }
    Student(String name, String Class, String birth , float GPA){
        this.name = name;
        this.Class = Class;
        String[] tmp = birth.split("/");
        String birth_fixed = "";
        if(tmp[0].length() < 2) birth_fixed += "0"+tmp[0]+"/";
        else birth_fixed += tmp[0]+"/";
        if(tmp[1].length() < 2) birth_fixed += "0"+tmp[1]+"/";
        else birth_fixed += tmp[1]+"/";
        birth_fixed += tmp[2];
        this.birth = birth_fixed;
        this.GPA = GPA;
    }
    void Print(){
        String[] tmp = birth.split("/");
        String birth_fixed = "";
        if(tmp[0].length() < 2) birth_fixed += "0"+tmp[0]+"/";
        else birth_fixed += tmp[0]+"/";
        if(tmp[1].length() < 2) birth_fixed += "0"+tmp[1]+"/";
        else birth_fixed += tmp[1]+"/";
        birth_fixed += tmp[2];
        System.out.printf("%s %s %s %s %.2f", student_id, name, Class, birth_fixed, GPA);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(),Class = sc.nextLine(), birth = sc.nextLine();
        float GPA = sc.nextFloat();
        Student a = new Student(name, Class, birth, GPA);
        a.Print();
    }
}
