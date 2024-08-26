/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microwave;

/**
 *
 * @author Dell
 */
import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        MyFrame f = new MyFrame("The Front View of a Microwave Oven");
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
