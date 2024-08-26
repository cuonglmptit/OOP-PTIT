/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepthoigian;

/**
 *
 * @author cle13
 */
public class Time implements Comparable<Time>{
    private int hh, mm, ss;
    public Time(String s){
        String[] tmp = s.split(" ");
        this.hh = Integer.parseInt(tmp[0]);
        this.mm = Integer.parseInt(tmp[1]);
        this.ss = Integer.parseInt(tmp[2]);
    }

    @Override
    public int compareTo(Time o) {
        if(this.hh > o.hh) return 1;
        if(this.hh < o.hh) return -1;
        if(this.mm > o.mm) return 1;
        if(this.mm < o.mm) return -1;
        if(this.ss > o.ss) return 1;
        if(this.ss < o.ss) return -1;
        return 0;
    }
    public String toString(){
        return this.hh+" "+this.mm+" "+this.ss;
    }
}
