/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorframe;

/**
 *
 * @author Dell
 */
import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        NewFrame f = new NewFrame("To mau cho vui");
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
