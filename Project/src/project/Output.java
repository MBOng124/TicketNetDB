/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JPanel;

/**
 *
 * @author LAPTOP
 */
public class Output {
    private Screen screen;
    private InputPanel ip;
    private JPanel panel;
    
    public Output(int xSize, int ySize){
        screen = new Screen(xSize, ySize);
        panel = new JPanel();
        ip = new InputPanel();
        panel = ip.getMainPanel();
        screen.getFrame().add(panel);
        panel.setBounds(10, 50, 900, 900);
        panel.setOpaque(true);
    }
}
