/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsanpham2;

import java.text.ParseException;

/**
 *
 * @author cle13
 */
public class Product implements Comparable<Product>{
    private String pID, name;
    private int price, warranty;
    public Product(String pID, String name, int price, int warranty) throws ParseException{
        this.pID = pID;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }
    @Override
    public String toString(){
        return pID + " " + name + " " + price + " " + warranty;
    }
    
    @Override
    public int compareTo(Product o) {
        if(this.price > o.price) return -1;
        if(this.price < o.price) return 1;
        return this.pID.compareTo(o.pID);    
    }
}
