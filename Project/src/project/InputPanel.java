/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LAPTOP
 */
public class InputPanel {
    private JPanel mainPanel;
    private JPanel subPanel1;
    private ImageIcon img;
    private JTextField txtField1;
    private JTextField txtField2;
    private JButton button1;
    private JButton button2;
    
    public InputPanel() {
        mainPanel = new JPanel();
        txtField1 = new JTextField();
        txtField2 = new JTextField();
        button1 = new JButton("Search");
        button2 = new JButton("Quit");
        button1.setActionCommand("search");
        button1.setActionCommand("quit");
        mainPanel.setLayout(null);
        mainPanel.add(txtField1);
        txtField1.setBounds(10, 10, 100, 25);
        mainPanel.add(txtField2);
        txtField2.setBounds(10, 80, 100, 25);
        mainPanel.add(button1);
        mainPanel.add(button2);
        button1.setBounds(10, 300, 100, 25);
        button2.setBounds(100, 300, 100, 25);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPanel getSubPanel1() {
        return subPanel1;
    }

    public ImageIcon getImg() {
        return img;
    }

    public JTextField getTxtField1() {
        return txtField1;
    }

    public JTextField getTxtField2() {
        return txtField2;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void setSubPanel1(JPanel subPanel1) {
        this.subPanel1 = subPanel1;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public void setTxtField1(JTextField txtField1) {
        this.txtField1 = txtField1;
    }

    public void setTxtField2(JTextField txtField2) {
        this.txtField2 = txtField2;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }
    
}
