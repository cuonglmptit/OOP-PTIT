/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thoigianonlinelientuc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author cle13
 */
public class UserOnline implements Comparable<UserOnline>{
    private String name;
    private Date start, end;
    private long onlineTime;
    public UserOnline(String name, String start, String end) throws ParseException{
        this.name = name;
        this.start = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(start);
        this.end = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(end);
        this.onlineTime = calcOnlineTime();
    }

    private long calcOnlineTime() {
        return this.onlineTime = TimeUnit.MILLISECONDS.toMinutes(Math.abs(this.end.getTime() - this.start.getTime()));
    }

    @Override
    public int compareTo(UserOnline o) {
        if(this.onlineTime > o.onlineTime) return -1;
        if(this.onlineTime < o.onlineTime) return 1;
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return this.name+" "+this.onlineTime;
    }
}
