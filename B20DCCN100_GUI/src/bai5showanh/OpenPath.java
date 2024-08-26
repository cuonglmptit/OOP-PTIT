/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5showanh;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author DarkShadowDemon200x
 */
public class OpenPath extends JFrame implements ActionListener {

    JButton button;
    String duongdan = "";
    public OpenPath() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("Chon File");
        button.addActionListener(this);
        button.setSize(300, 300);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    public String getDuongDan(){
        return this.duongdan;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                String p = "";
                for (int i = 0; i < file.toString().length(); i++) {
                    if(file.toString().charAt(i) == '\\'){
                        p += "\\";
                    }
                    p+=file.toString().charAt(i);
                }
                System.out.println(p);
                new OpenImage(p);
            }
        }
    }

}
