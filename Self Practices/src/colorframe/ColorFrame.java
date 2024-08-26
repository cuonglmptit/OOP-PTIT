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
import java.awt.event.*;
public class ColorFrame extends JFrame implements ActionListener{
    private JPanel p = new JPanel();
    private JButton OK = new JButton("OK");
    private JButton newOK = new JButton("Green");
    private JComboBox<String> chon = new JComboBox<>();
    public ColorFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        
        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(OK); ps.add(newOK); ps.add(chon); 
        chon.addItem("Xanh");
        chon.addItem("Do");
        chon.addItem("Tim");
        chon.addItem("Vang");
        chon.addItem("Trang");
        chon.addItem("Den");
        add(ps, BorderLayout.SOUTH);
        OK.addActionListener(this);
        newOK.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(OK)){
            String s = chon.getSelectedItem().toString();
            if(s.equals("Xanh")) p.setBackground(Color.blue);
            if(s.equals("Do")) p.setBackground(Color.red);
            if(s.equals("Tim")) p.setBackground(Color.magenta);
            if(s.equals("Vang")) p.setBackground(Color.yellow);
            if(s.equals("Trang")) p.setBackground(Color.white);
            if(s.equals("Den")) p.setBackground(Color.black);
        }
        else p.setBackground(Color.green);
    }
    
}
