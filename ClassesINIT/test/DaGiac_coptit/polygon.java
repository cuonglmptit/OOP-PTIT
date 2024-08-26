/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaGiac_coptit;

import java.util.Scanner;


/**
 *
 * @author acer
 */
public class polygon {
    private point[] p;
    private int n;
    private float Area;

    public polygon(int n) {
        this.n = n;
        this.Area=0;
        p = new point[n];
    }

   

    public void setP(Scanner sc) {
        float a,b;
        for(int i=0;i<n;i++){
            a = sc.nextFloat();
            b = sc.nextFloat();
            p[i]=new point(a, b);
        }
        float x = p[0].getX();
        float y = p[0].getY();
        point d = new point(x, y);
        
        for(int i=0;i<n-1;i++){
            float t = d.calculateAreTriangle(p[i],p[i+1]);
            Area=t + Area;
        }
    }

    public point[] getP() {
        return p;
    }

    public int getN() {
        return n;
    }

    public float getArea() {
        return Area;
    }
    
}
