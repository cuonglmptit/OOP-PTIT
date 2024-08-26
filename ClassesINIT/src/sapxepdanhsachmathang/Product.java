/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachmathang;

import java.text.ParseException;

/**
 *
 * @author cle13
 */
public class Product implements Comparable<Product>{
    private String pID, name, type;
    private float bought, sold, profit;
    public Product(int n, String name, String type, float bought, float sold) throws ParseException{
        this.pID = String.valueOf(n);
        this.name = name;
        this.type = type;
        this.bought = bought;
        this.sold = sold;
        this.profit = sold - bought; 
    }
    
    @Override
    public int compareTo(Product o) {
        if(this.profit > o.profit) return -1;
        if(this.profit < o.profit) return 1;
        return 0;
    }
    
    @Override
    public String toString(){
        return this.pID+" "+this.name+" "+this.type+" "+String.format("%.2f", this.profit);
    }
}
