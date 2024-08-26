/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.child;


/**
 *
 * @author CuongAcQuy
 */
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 2);

        // Truy cập phương thức public từ lớp con
        System.out.println("Name: " + myDog.getName()); // OK

        // Không thể truy cập thuộc tính private từ lớp con
        // System.out.println("Name: " + myDog.name); // Lỗi biên dịch

        // Truy cập thuộc tính protected từ lớp con
        System.out.println("Age: " + myDog.age); // OK
        myDog.age=1;
        System.out.println("Age: " + myDog.superage); // KO OK
        
        System.out.println("Super age: "+myDog.getSuperAge());
    }
}