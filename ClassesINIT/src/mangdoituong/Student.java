/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangdoituong;

/**
 *
 * @author cle13
 */
public class Student implements Comparable<Student>{
    private String name;
    private int ac, total;
    public Student(String name, String AcTotal){
        this.name = name;
        String[] tmp = AcTotal.split(" ");
        this.ac = Integer.parseInt(tmp[0]);
        this.total = Integer.parseInt(tmp[1]);
    }

    @Override
    public int compareTo(Student o) {
        if(this.ac > o.ac) return -1;
        if(this.ac < o.ac) return 1;
        if(this.total > o.total) return 1;
        if(this.total < o.total) return -1;
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return this.name+" "+this.ac+" "+this.total;
    }
}
