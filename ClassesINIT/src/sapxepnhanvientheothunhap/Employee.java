/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepnhanvientheothunhap;

/**
 *
 * @author cle13
 */
public class Employee implements Comparable<Employee>{
    private String eID, name, position;
    private float salary, baseSalary, days, advance, remain;

    public Employee(int n, String name, String position, float baseSalary, float days) {
        this.eID = "NV"+String.format("%02d", n);
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.days = days;
        this.salary = calcSalary();
        this.advance = calcAdvance();
        this.remain = calcRemain();
    }

    private float calcSalary() {
        float sum = 0;
        sum += this.baseSalary*this.days;
        return sum;
    }
    
    private float calcPos(String pos){
        if(pos.equals("GD")) return 500;
        else if(pos.equals("PGD")) return 400;
        else if(pos.equals("TP")) return 300;
        else if(pos.equals("KT")) return 250;
        return 100;
    }
    
    private float calcAdvance() {
        float a = 2, b = 3;
        if((this.salary + calcPos(this.position))*a/b < 25000) return Ceil((this.salary + calcPos(this.position))*a/b);
        return 25000;
    }
    //hàm làm tròn, mệt nhất với cái này hóa ra là ko dùng đc cách mathceil, làm luôn hàm làm tròn =)) 
    private float Ceil(float n){
        int a = (int) n;
        a/=1000;
        a*=1000;
        if(n-a >= 500) return a+1000;
        return a;
    }
    private float calcRemain() {
        return this.salary - this.advance + calcPos(this.position);
    }
    @Override
    public String toString(){
        return this.eID+" "+this.name+" "+String.format("%.0f", this.calcPos(this.position))+" "
                +String.format("%.0f", this.salary)+" "+String.format("%.0f", this.advance)+" "+String.format("%.0f", this.remain);
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary + calcPos(this.position) > o.salary + calcPos(o.position)) return -1;
        if(this.salary + calcPos(this.position) < o.salary + calcPos(o.position)) return 1;
        return this.eID.compareTo(o.eID);
    }
}
