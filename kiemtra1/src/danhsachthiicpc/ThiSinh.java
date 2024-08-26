/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachthiicpc;

/**
 *
 * @author DarkShadowDemon200x
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String tenTS, maTS, maTeam;

    public ThiSinh(int i, String tenTS, String maTeam) {
        this.maTS = "C"+String.format("%03d", i);
        this.tenTS = tenTS;
        this.maTeam = maTeam;
    }
    @Override
    public String toString(){
        return this.maTS+" "+this.tenTS+" "+Team.getTeams().get(this.maTeam);
    }

    @Override
    public int compareTo(ThiSinh o) {
        return this.tenTS.compareTo(o.tenTS);
    }
}
