/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05069_cau_lac_bong_da_1;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Match implements Comparable<Match>{
    private String id;
    private int tickets;
    private double revenue;
    private FootBallClub fc;
    public Match(String id, int tickets, FootBallClub fc) {
        this.id = id;
        this.tickets = tickets;
        this.fc = fc;
        this.revenue = tickets*fc.getTicketPrice();
    }

    @Override
    public String toString() {
        return id +" "+ fc.getName()+" "+String.format("%.0f", revenue);
    }

    @Override
    public int compareTo(Match o) {
        if(this.revenue > o.revenue) return -1;
        if(this.revenue < o.revenue) return 1;
        return this.fc.getName().compareTo(o.fc.getName());
    }
    
}
