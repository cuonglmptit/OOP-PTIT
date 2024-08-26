/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachcanh;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Pair implements Comparable<Pair>{
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    @Override
    public int compareTo(Pair o) {
        if(this.x == o.x&&this.y == o.y||this.x == o.y&&this.y == o.x ) return 0;
        if(this.x < o.x) return -1;
        if(this.x > o.x) return 1;
        if(this.y < o.y) return -1;
        if(this.y > o.y) return 1;
        return 0;
    }
    
}
