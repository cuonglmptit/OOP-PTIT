/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientichtamgiac;

/**
 *
 * @author cle13
 */
public class KhongTheTaoTamGiacException extends Exception {
    private String error;
    public KhongTheTaoTamGiacException(String invalid) {
        this.error = invalid;
    }
    public String getError(){
        return this.error;
    }
}
