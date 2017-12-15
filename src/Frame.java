import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class Frame extends JFrame{
    public JPanel buyPanel1;
    public Frame(){
        setTitle("PaperNet");
        buyPanel1 = new BuyMenu();
        setSize(new Dimension(1280, 720));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        //setLayout(null);
        add(buyPanel1,BorderLayout.CENTER);
        //add(new BuyPanel2());
        setVisible(true);
    }


    public static void main(String[] args) {
        new Frame();
    }

}
