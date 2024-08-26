/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachcathi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author cle13
 */
public class ExamTimeTable implements Comparable<ExamTimeTable>{
    private String exID, roomID;
    private Date exDate, exTime;
    public ExamTimeTable(int n, String exDate, String exTime, String roomID) throws ParseException{
        this.exID = "C"+String.format("%03d", n);
        this.exDate = new SimpleDateFormat("dd/MM/yyyy").parse(exDate);
        this.exTime = new SimpleDateFormat("HH:mm").parse(exTime);
        this.roomID = roomID;
    }

    @Override
    public int compareTo(ExamTimeTable o) {
        if(this.exDate.compareTo(o.exDate) != 0) return this.exDate.compareTo(o.exDate);
        if(this.exTime.compareTo(o.exTime) != 0) return this.exTime.compareTo(o.exTime);
        return this.exID.compareTo(o.exID);
    }
    public String toString(){
        return this.exID+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.exDate)
                +" "+new SimpleDateFormat("HH:mm").format(this.exTime)+" "+this.roomID;
    }
}
