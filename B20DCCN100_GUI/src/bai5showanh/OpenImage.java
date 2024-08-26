/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5showanh;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author DarkShadowDemon200x
 */
public class OpenImage {
    
    public OpenImage(String duongdan) {
        SwingUtilities.invokeLater(new Runnable(){
           @Override
           public void run(){
               JFrame frame = new JFrame(duongdan);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               BufferedImage img = null;
               try{
                   img = ImageIO.read(new File(duongdan));
               }catch(Exception e){
                   System.err.println("Ko the mo anh");
               }
               JLabel lb = new JLabel();
               lb.setIcon(new ImageIcon(img));
               frame.getContentPane().add(lb, BorderLayout.CENTER);
               frame.pack();
               frame.setLocationRelativeTo(null);
               frame.setVisible(true);
           }
        });
    }
}
