/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaGiac_coptit;

/**
 *
 * @author acer
 */
public class point {
    private float x,y;

    public point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float calculateAreTriangle(point B,point C){
        return (float) (0.5*Math.abs((C.x-this.x)*(B.y-this.y)-(B.x-this.x)*(C.y-this.y)));
    }

   
}
