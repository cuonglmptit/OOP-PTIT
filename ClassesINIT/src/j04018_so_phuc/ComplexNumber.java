/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04018_so_phuc;

/**
 *
 * @author DarkShadowDemon200x
 */
public class ComplexNumber {
    private float a, b;

    public ComplexNumber(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public ComplexNumber add(ComplexNumber o){
        ComplexNumber tmp = new ComplexNumber(this.a + o.a, this.b + o.b);
        return tmp;
    }
    
    public ComplexNumber multiply(ComplexNumber o){
        ComplexNumber tmp = new ComplexNumber(this.a*o.a - this.b*o.b, this.a*o.b + this.b*o.a);
        return tmp;
    }
    
    @Override
    public String toString(){
        if(this.b < 0){
            return String.format("%.0f", this.a)+" - "+String.format("%.0f", (-this.b))+"i";
        }else{
            return String.format("%.0f", this.a)+" + "+String.format("%.0f", this.b)+"i";
        }
    }
}
