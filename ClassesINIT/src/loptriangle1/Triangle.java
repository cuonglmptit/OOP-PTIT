/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loptriangle1;

/**
 *
 * @author cle13
 */
public class Triangle {
        private Point p1, p2, p3;
    private double a, b, c;
    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1.distance(p2);
        this.b = p2.distance(p3);
        this.c = p1.distance(p3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid(){
        if(a == 0||b == 0|| c == 0) return false;
        else if(a+b <= c||a+c <= b||b+c <= a) return false;
        return true;
    }
    public String getPerimeter(){
        return String.format("%.3f", a+b+c);
    }
}
