/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentaplaptrinh;

/**
 *
 * @author cle13
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String name;
    private int ac, total;

    public ThiSinh(String name, String actotal) {
        this.name = name;
        String[] tmp = actotal.split(" ");
        this.ac = Integer.parseInt(tmp[0]);
        this.total = Integer.parseInt(tmp[1]);
    }

    @Override
    public int compareTo(ThiSinh o) {
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
