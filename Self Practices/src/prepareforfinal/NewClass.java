/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepareforfinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DarkShadowDemon200x
 */
public class NewClass {

    public static void main(String[] args) throws ParseException {
        while(true){
           long t = 999999999;
           while(t-->0);
        long millis = System.currentTimeMillis();
        String s = "";
//        s += TimeUnit.MICROSECONDS.toHours(millis) + ":";
//        s += TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.MILLISECONDS.toMinutes(TimeUnit.MICROSECONDS.toHours(millis)) + ":";
//        s += TimeUnit.MILLISECONDS.toSeconds(millis);
        s += TimeUnit.MICROSECONDS.toHours(millis) + ":";
        s += TimeUnit.MILLISECONDS.toMinutes(millis)
                - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)) + ":";
        s += TimeUnit.MILLISECONDS.toSeconds(millis)
                - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis));
        Date b = new SimpleDateFormat("HH:mm:ss").parse(s);
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(b));
        
        String hms = String.format("%02d:%02d:%02d",
                millis/1000/60/60,
                (millis/1000/60)%(millis/1000/60/60), // The change is in this line
                (millis/1000)%(millis/1000/60));
        System.out.println(hms);
        String hms1 = String.format("%02d:%02d:%02d",
                TimeUnit.MILLISECONDS.toHours(millis),
                TimeUnit.MILLISECONDS.toMinutes(millis)
                - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)), // The change is in this line
                TimeUnit.MILLISECONDS.toSeconds(millis)
                - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
        System.out.println(hms1);

        }
    }
}
