/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhgio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author cle13
 */
public class User implements Comparable<User>{
    private String uID, name;
    private Date start, end;
    private long timeUsedInHH, timeUsedInmm;
    public User(String uID, String name, String start, String end) throws ParseException {
        this.uID = uID;
        this.name = name;
        this.start = new SimpleDateFormat("HH:mm").parse(start);
        this.end = new SimpleDateFormat("HH:mm").parse(end);
        this.timeUsedInHH = calcTimeUsed("HH");
        this.timeUsedInmm = calcTimeUsed("mm");
    }

    private long calcTimeUsed(String type) {
        long durationInmm = TimeUnit.MILLISECONDS.toMinutes(Math.abs(this.start.getTime() - this.end.getTime()));
        if(type.compareTo("mm") == 0) return durationInmm%60;
        return durationInmm/60;
    }

    @Override
    public int compareTo(User o) {
        if(this.timeUsedInHH > o.timeUsedInHH) return -1;
        if(this.timeUsedInHH < o.timeUsedInHH) return 1;
        if(this.timeUsedInmm > o.timeUsedInmm) return -1;
        if(this.timeUsedInmm < o.timeUsedInmm) return 1;
        return 0;
    }
    
    @Override
    public String toString(){
        return this.uID+" "+this.name+" "+this.timeUsedInHH+" gio "+this.timeUsedInmm+" phut";
    }
}
