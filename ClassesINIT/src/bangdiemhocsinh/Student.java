/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangdiemhocsinh;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String[] diem;
    private String name, ranking, sID;
    private float gpa;
    public Student(int n, String name, String diem){
        this.sID = "HS"+String.format("%02d", n);
        this.name = name;
        this.diem = diem.split("\\s+");
        this.gpa = calcGPA();
        this.ranking = calcRank();
    }
    private float calcGPA(){
        float sum = 0;
        sum += Float.parseFloat(this.diem[0])*2 + Float.parseFloat(this.diem[1])*2;
        for (int i = 2; i < this.diem.length; i++) {
            sum += Float.parseFloat(this.diem[i]);
        }
        return (float) (Math.round((sum/12)*10)/10.0);
    }
    @Override
    public int compareTo(Student o) {
        if(this.gpa > o.gpa) return -1;
        if(this.gpa < o.gpa) return 1;
        return this.sID.compareTo(o.sID);
    }
    
    @Override
    public String toString(){
        return this.sID+" "+this.name+" "+String.format("%.1f", this.gpa)+" "+this.ranking;
    }

    private String calcRank() {
        if(this.gpa >= 9) return "XUAT SAC";
        if(this.gpa >= 8) return "GIOI";
        if(this.gpa >= 7) return "KHA";
        if(this.gpa >= 5) return "TB";
        return "YEU";
    }
}
