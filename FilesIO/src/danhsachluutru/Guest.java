/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachluutru;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author cle13
 */
public class Guest implements Comparable<Guest>{
    private String name, gID, roomID;
    private Date comeDate, leaveDate;
    private long stayDate;
    public Guest(int n, String name, String roomID, String comeDate, String leaveDate) throws ParseException{
        this.gID = "KH" + String.format("%02d", n);
        this.name = name;
        this.roomID = roomID;
        this.comeDate = new SimpleDateFormat("dd/MM/yyyy").parse(comeDate);
        this.leaveDate = new SimpleDateFormat("dd/MM/yyyy").parse(leaveDate);
        this.stayDate = getDifferenceDays(this.comeDate, this.leaveDate);
    }
    private long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
//        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return TimeUnit.MILLISECONDS.toDays(diff);
    }
    @Override
    public int compareTo(Guest o) {
        if(this.stayDate > o.stayDate) return -1;
        if(this.stayDate < o.stayDate) return 1;
        return 0;
    }
    @Override
    public String toString(){
        return this.gID+" "+this.name+" "+this.roomID+" "+this.stayDate;
    }
}
