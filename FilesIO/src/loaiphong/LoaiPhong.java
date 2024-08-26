/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loaiphong;

/**
 *
 * @author cle13
 */
public class LoaiPhong implements Comparable<LoaiPhong> {
    private String sign, name, dayprice, service;
    public LoaiPhong(String s) {
        String[] tmp = s.split(" ");
        this.sign = tmp[0];
        this.name = tmp[1];
        this.dayprice = tmp[2];
        this.service = tmp[3];
    }
    @Override
    public String toString(){
        return this.sign+" "+this.name+" "+this.dayprice+" "+this.service;
    }
    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}
