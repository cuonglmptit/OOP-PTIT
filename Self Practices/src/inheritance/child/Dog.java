/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.child;

import inheritance.parent.Animal;

/**
 *
 * @author CuongAcQuy
 */
public class Dog extends Animal {
    protected int age; // Thuộc tính protected

    // Phương thức khởi tạo
    public Dog(String name, int age) {
        super(name, age); // Gọi phương thức khởi tạo của lớp cha
        this.age = age;
    }

    // Phương thức public để lấy tuổi
    public int getAge() {
        return this.age;
    }
    
    public int getSuperAge() {
        return this.superage;
    }
}
