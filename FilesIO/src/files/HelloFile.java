/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.io.*;
import java.util.*;

/**
 *
 * @author cle13
 */
public class HelloFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
        }
    }
}
