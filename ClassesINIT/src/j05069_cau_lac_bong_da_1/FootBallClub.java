/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05069_cau_lac_bong_da_1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DarkShadowDemon200x
 */
public class FootBallClub {
    private static Map<String, FootBallClub> map = new HashMap<>();
    private String id, name;
    private double ticketPrice;

    public FootBallClub(String id, String name, double ticketPrice) {
        this.id = id;
        this.name = name;
        this.ticketPrice = ticketPrice;
        map.put(id, this);
    }
    public static FootBallClub getFBClubById(String id){
        return map.get(id);
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    
}
