/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pylogon;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Polygon {
    private ArrayList<Point> ds = new ArrayList<>();
    public Polygon(Point[] o) {
        for (Point point : o) {
            ds.add(point);
        }
    }
    public String getArea(){
        double sum = 0.0;
        int j = ds.size()-1;
        for (int i = 0; i < ds.size(); i++) {
            sum += (ds.get(j).getX()+ds.get(i).getX())*(ds.get(j).getY()-ds.get(i).getY());
            j = i;
        }
        return String.format("%.3f", Math.abs(sum/2.0));
    }
}
