
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cle13
 */
public class test {
    public static void main(String[] args) {
        String a = "aa";
        String b = "aaaaa";
        for (int i = 0; i < b.length(); i++) {
            if(b.substring(i).startsWith(a)) System.out.println(i);
        }
    }
}
