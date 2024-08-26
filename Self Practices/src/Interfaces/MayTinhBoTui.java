/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author DarkShadowDemon200x
 */
public interface MayTinhBoTui {
    public abstract double cong(double a, double b);
//  vì các phương thức trong interface mặc định là abstract cho nên cái code bên trên
//  và cái dưới này như nhau
//  public double cong(double a, double b);
    public double tru(double a, double b);
    public double nhan(double a, double b);
    public double chia(double a, double b);
    //*nếu có thuộc tính trong interface thì nó sẽ là 1 hằng, mặc định là public static final
    //vd int a = 1; tương đương public static final a = 1;
}
