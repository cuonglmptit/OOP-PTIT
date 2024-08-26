/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtienphong;
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
    private long stayDate, service, total;
    public Guest(int n, String name, String roomID, String comeDate, String leaveDate, long service) throws ParseException{
        this.gID = "KH" + String.format("%02d", n);
        this.name = chuanHoa(name);
        this.roomID = roomID.trim();
        this.comeDate = new SimpleDateFormat("dd/MM/yyyy").parse(comeDate);
        this.leaveDate = new SimpleDateFormat("dd/MM/yyyy").parse(leaveDate);
        this.stayDate = getDifferenceDays(this.comeDate, this.leaveDate);
        this.service = service;
        this.total = tongTien();
    }
    private long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)+1;
    }
    private long tongTien(){
        if(this.roomID.charAt(0) == '1'){
            return this.stayDate*25 + this.service;
        }else if(this.roomID.charAt(0) == '2'){
            return this.stayDate*34 + this.service;
        }else if(this.roomID.charAt(0) == '3'){
            return this.stayDate*50 + this.service;
        }
        return this.stayDate*80 + this.service;
    }
    private String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        String name = "";
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            name += String.valueOf(tmp.charAt(0)).toUpperCase() + tmp.substring(1);
            if(st.hasMoreTokens()) name += " ";
        }
        return name;
    }
    @Override
    public int compareTo(Guest o) {
        if(this.total > o.total) return -1;
        if(this.total < o.total) return 1;
        return 0;
    }
    @Override
    public String toString(){
        return this.gID+" "+this.name+" "+this.roomID+" "+this.stayDate+" "+this.total;
    }
}
