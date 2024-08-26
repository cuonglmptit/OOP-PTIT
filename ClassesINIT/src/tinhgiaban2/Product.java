/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhgiaban2;

/**
 *
 * @author cle13
 */
public class Product implements Comparable<Product>{
    private String pID, pName, unit;
    private float purchase, amount, sellPrice, total, transportfee;

    public Product(int n, String pName, String unit, float purchase, float amount) {
        this.pID = "MH"+String.format("%02d", n);
        this.pName = pName;
        this.unit = unit;
        this.purchase = purchase;
        this.amount = amount;
        this.transportfee = calcTransportFee();
        this.total = calcTotal();
        this.sellPrice = calcSellPrice();
    }

    private float calcTransportFee() {
        return Math.round((this.purchase*this.amount)*0.05);
    }

    private float calcTotal() {
        return Math.round((this.purchase*this.amount) + this.transportfee);
    }
    private float calcSellPrice(){
        return (int) (Math.ceil(((this.total + this.total*0.02)/this.amount)/100.0))*100;
    }
    @Override
    public String toString(){
        return this.pID+" "+this.pName+" "+this.unit+" "+String.format("%.0f", this.transportfee)+ " "
                +String.format("%.0f", this.total)+" "+String.format("%.0f", this.sellPrice);
    }

    @Override
    public int compareTo(Product o) {
        if(this.sellPrice > o.sellPrice) return -1;
        if(this.sellPrice < o.sellPrice) return 1;
        return 0;
    }
}
