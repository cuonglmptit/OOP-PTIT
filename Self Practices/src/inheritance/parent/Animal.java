/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.parent;

/**
 *
 * @author CuongAcQuy
 */
public class Animal {
    private String name; // Thuộc tính private
    protected int superage;
    // Phương thức khởi tạo

    public Animal(String name, int superage) {
        this.name = name;
        this.superage = superage;
    }
    

    // Phương thức public để lấy tên
    public String getName() {
        return this.name;
    }
}
