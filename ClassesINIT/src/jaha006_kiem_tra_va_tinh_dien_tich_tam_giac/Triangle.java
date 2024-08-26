/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaha006_kiem_tra_va_tinh_dien_tich_tam_giac;

/**
 *
 * @author cle13
 */
public class Triangle {
    private Point p1, p2, p3;
    private double a, b, c;
    public Triangle(Point p1, Point p2, Point p3) throws KhongTheTaoTamGiacException{
        this.a = p1.distance(p2);
        this.b = p2.distance(p3);
        this.c = p1.distance(p3);
        if(a == 0||b == 0|| c == 0) throw new KhongTheTaoTamGiacException("INVALID");
        else if(a+b <= c||a+c <= b||b+c <= a)throw new KhongTheTaoTamGiacException("INVALID");
        else{
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }
    public double triPerimeter(){
        return a+b+c;
    }
    public double triArea(){
        return 0.25*Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c) );
    }
}
