/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoantinhcong;

/**
 *
 * @author cle13
 */
public class Employee {
    String name, emID, chucvu;
    int phucap, base_salary, ngaycong, salary, thuong;
    public Employee(int i, String name, int luong1ngay, int ngaycong, String chucvu){
        this.emID = "NV" + String.format("%02d", i);
        this.name = name;
        this.ngaycong = ngaycong;
        this.base_salary = luong1ngay*this.ngaycong;
        this.salary = base_salary;
        this.chucvu = chucvu;
        if(this.ngaycong >= 25){
            this.salary += this.base_salary*0.2;
            this.thuong = (int) (this.base_salary*0.2);
        }
        else if(this.ngaycong >= 22){
            this.salary += this.base_salary*0.1;
            this.thuong = (int) (this.base_salary*0.1);
        }
        switch (this.chucvu) {
            case "GD":
                this.salary += 250000;
                this.phucap = 250000;
                break;
            case "PGD":
                this.salary += 200000;
                this.phucap = 200000;
                break;
            case "TP":
                this.salary += 180000;
                this.phucap = 180000;
                break;
            case "NV":
                this.salary += 150000;
                this.phucap = 150000;
                break;
            default:
                break;
        }
    }
    @Override
    public String toString(){
        return this.emID+" "+this.name+" "+this.base_salary+" "+this.thuong+" "+this.phucap+" "+this.salary;
    }
}
