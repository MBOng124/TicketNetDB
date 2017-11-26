/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LAPTOP
 */
public class Screen {
    private JFrame frame;
    private JPanel panel1;
    private JLabel label1;
    private JButton btn1;
    private JButton btn2;
    private ImageIcon img;
    
    public Screen(int xSize, int ySize){
        frame = new JFrame("new");
        frame.setPreferredSize(new Dimension(xSize, ySize));
        frame.setResizable(false);
        frame.setLayout(null);
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(xSize, ySize));
        panel1.setOpaque(false);
        panel1.setLayout(null);
//        btn1 = new JButton("BTN1");
//        btn2 = new JButton("BTN2");
//        panel1.add(btn1);
//        panel1.add(btn2);
//        btn1.setBounds(10, 10, 100, 25);
//        btn2.setBounds(10, 50, 100, 25);
//        frame.add(panel1);
//        panel1.setBounds(0, 0, xSize, ySize);
        frame.setVisible(true);
        frame.pack();
        
    }

    public JFrame getFrame() {
        return frame;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }
    
}
