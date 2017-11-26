/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author LAPTOP
 */
public class StartPanel {
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JPanel mainPanel;
    
    public StartPanel(){
        btn1 = new JButton("Shows");
        btn2 = new JButton("Sports");
        btn3 = new JButton("Concerts");
        btn4 = new JButton("Exit");
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.add(btn1);
        mainPanel.add(btn2);
        mainPanel.add(btn3);
        mainPanel.add(btn4);
        btn1.setBounds(20, 100, 125, 25);
        btn2.setBounds(130, 100, 125, 25);
        btn3.setBounds(20, 100, 125, 25);
        btn4.setBounds(20, 100, 125, 25);
        
        
        
        
    }
    
}
