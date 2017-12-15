import javax.swing.*;

public class BuyPanel2 extends JPanel {
    private JButton bBack;
    private JButton bExit;
    private Frame f;
    public BuyPanel2(Frame f){
        this.f = f;
        bBack = new JButton();
        bExit = new JButton();

        bBack.setBounds(100, 20, 500, 500);
        add(bBack);
    }
}
