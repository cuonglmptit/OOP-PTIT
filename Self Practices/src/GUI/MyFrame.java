/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author DarkShadowDemon200x
 */
import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{

    public MyFrame() {
//        add(new JButton("Food..."), BorderLayout.WEST);
//        add(new JButton("Time.."), BorderLayout.CENTER);
//        add(new JButton("1"), GridLayout);
        setLayout(new BorderLayout());
        add(new JButton("Food to be placed here"), BorderLayout.WEST);
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JTextField("Time to be placed here"), BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 3));
        for (int i = 1; i < 10; i++) {
            p2.add(new JButton(""+i));
        }
        p2.add(new JButton("0")); p2.add(new JButton("Start"));
        p2.add(new JButton("Stop"));
        p1.add(p2,BorderLayout.CENTER);
        add(p1, BorderLayout.CENTER);
    }

}
