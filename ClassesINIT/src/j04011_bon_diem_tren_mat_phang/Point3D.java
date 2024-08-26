/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04011_bon_diem_tren_mat_phang;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Point3D {
    int m, n, p;

    public Point3D(int a, int b, int c) {
        this.m = a;
        this.n = b;
        this.p = c;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int x1 = p1.m;
        int y1 = p1.n;
        int z1 = p1.p;
        int x2 = p2.m;
        int y2 = p2.n;
        int z2 = p2.p;
        int x3 = p3.m;
        int y3 = p3.n;
        int z3 = p3.p;
        int x4 = p4.m;
        int y4 = p4.n;
        int z4 = p4.p;
        int a1 = x2 - x1;
        int x = p4.m;
        int y = p4.n;
        int z = p4.p;
        int b1 = y2 - y1;
        int c1 = z2 - z1;
        int a2 = x3 - x1;
        int b2 = y3 - y1;
        int c2 = z3 - z1;

        int a = b1 * c2 - b2 * c1;
        int b = a2 * c1 - a1 * c2;
        int c = a1 * b2 - b1 * a2;
        int d = (-a * x1 - b * y1 - c * z1);
        if (a * x + b * y + c * z + d == 0) {
            return true;
        }
        return false;
    }
}
