/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachthiicpc;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Team {
    private String maTeam, tenTeam, tenTruong;
    private static Map<String, String> map = new HashMap<>();
    public Team(int i, String tenTeam, String tenTruong){
        this.maTeam = "Team"+String.format("%02d", i);
        this.tenTeam = tenTeam;
        this.tenTruong = tenTruong;
        map.put(this.maTeam, this.tenTeam+" "+this.tenTruong);
    }

    public static Map<String, String> getTeams() {
        return map;
    }
}
