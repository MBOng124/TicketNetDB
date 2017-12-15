import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class BuyMenu extends JPanel{
    private JButton bBuy1, bBuy2, bBuy3, bBuy4, bBuy5;
    private JLabel lLabel1, lLabel2, lLabel3, lLabel4, lLabel5; //first scene
    private JButton  bBack, bContShop, bCheckout;// second scene;
    private JLabel lLabel21, lLabel22, lLabel23, lLabel24, lLabel25;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6,
            txt7, txt8, txt9, txt10, txt11, txt12, txt13;//third scene
    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6,
            lbl7, lbl8, lbl9, lbl10,lbl11, lbl12, lbl13;//also third secne
    private JButton subtn;//third scene
    private boolean submit;
    private String first_name, last_name, email, title, sAddress, city, state,
            country, postal_code, phone_number, card_number, expiration_date,
            security_code;
    private ImageIcon icon1, icon2, icon3, icon4, icon5;


    //for all scenes
    private JButton bExit;

    public BuyMenu(){
        icon1 = new ImageIcon("C:/Baya/INTRODB/newshow_thumbnail/1.jpg");
        icon2 = new ImageIcon("C:/Baya/INTRODB/newshow_thumbnail/2.jpg");
        icon3 = new ImageIcon("C:/Baya/INTRODB/newshow_thumbnail/3.jpg");
        icon4 = new ImageIcon("C:/Baya/INTRODB/newshow_thumbnail/4.jpg");
        icon5 = new ImageIcon("C:/Baya/INTRODB/newshow_thumbnail/5.jpg");
        submit = false;
        bExit = new JButton("Exit");
        //11255
        bExit.setBounds(1150, 580, 80, 40);
        bExit.setVisible(true);
        add(bExit);
        setLayout(null);
        FirstSceneComponents();
        SecondSceneComponents();
        CheckoutComponents();
        actions();
    }

    /****************************
     SECOND SCENE
     ***************************/

    public void SecondSceneComponents(){

        bBack = new JButton("BACK");
        bContShop = new JButton("CONTINUE SHOPPING");
        bCheckout = new JButton("CHECKOUT");//v2
        bBack.setBounds(1060,580,80, 40);
        bContShop.setBounds(1070,530,160, 40);
        bCheckout.setBounds(50, 580, 140, 40);
        lLabel21 = new JLabel();
        lLabel22 = new JLabel();
        lLabel23 = new JLabel();
        lLabel24 = new JLabel();
        lLabel25 = new JLabel();
        lLabel21.setIcon(icon1);
        lLabel22.setIcon(icon2);
        lLabel23.setIcon(icon3);
        lLabel24.setIcon(icon4);
        lLabel25.setIcon(icon5);
        lLabel21.setBounds(400, 200, 174, 132);
        lLabel22.setBounds(400, 200, 174, 132);
        lLabel23.setBounds(400, 200, 174, 132);
        lLabel24.setBounds(400, 200, 174, 132);
        lLabel25.setBounds(400, 200, 174, 132);

        setComponentsVisible2(false);
        add(bCheckout);
        add(bBack);
        add(bContShop);
        add(lLabel21);
        add(lLabel22);
        add(lLabel23);
        add(lLabel24);
        add(lLabel25);
    }

    public void setComponentsVisible2(boolean b){
        bBack.setVisible(b);
        bContShop.setVisible(b);
        bCheckout.setVisible(b);
        lLabel21.setVisible(b);
        lLabel22.setVisible(b);
        lLabel23.setVisible(b);
        lLabel24.setVisible(b);
        lLabel25.setVisible(b);
    }
    public void setComponentsVisible21(boolean b){
        bBack.setVisible(b);
        bContShop.setVisible(b);
        bCheckout.setVisible(b);
        lLabel21.setVisible(b);
        System.out.println(b);
    }
    public void setComponentsVisible22(boolean b){
        bBack.setVisible(b);
        bContShop.setVisible(b);
        bCheckout.setVisible(b);
        lLabel22.setVisible(b);
    }
    public void setComponentsVisible23(boolean b){
        bBack.setVisible(b);
        bContShop.setVisible(b);
        bCheckout.setVisible(b);
        lLabel23.setVisible(b);
    }

    public void setComponentsVisible24(boolean b){
        bBack.setVisible(b);
        bContShop.setVisible(b);
        bCheckout.setVisible(b);
        lLabel24.setVisible(b);
    }
    public void setComponentsVisible25(boolean b){
        bBack.setVisible(b);
        bContShop.setVisible(b);
        bCheckout.setVisible(b);
        lLabel25.setVisible(b);
    }

    public void addLabel1(){

        lLabel21.setBounds(400, 200, 174, 132);
        add(lLabel21);
    }
    public void addLabel2(){

        lLabel22.setBounds(400, 200, 174, 132);
        add(lLabel22);
    }
    public void addLabel3(){

        lLabel23.setBounds(400, 200, 174, 132);
        add(lLabel23);
    }
    public void addLabel4(){

        lLabel24.setBounds(400, 200, 174, 132);
        add(lLabel24);
    }
    public void addLabel5(){
        lLabel25.setBounds(400, 200, 174, 132);
        add(lLabel25);
    }

    public void setComponentsVisible3(boolean b){
        bBack.setVisible(b);
        txt1.setVisible(b);
        txt2.setVisible(b);
        txt3.setVisible(b);
        txt4.setVisible(b);
        txt5.setVisible(b);
        txt6.setVisible(b);
        txt7.setVisible(b);
        txt8.setVisible(b);
        txt9.setVisible(b);
        txt10.setVisible(b);
        txt11.setVisible(b);
        txt12.setVisible(b);
        txt13.setVisible(b);
        lbl1.setVisible(b);
        lbl2.setVisible(b);
        lbl3.setVisible(b);
        lbl4.setVisible(b);
        lbl5.setVisible(b);
        lbl6.setVisible(b);
        lbl7.setVisible(b);
        lbl8.setVisible(b);
        lbl9.setVisible(b);
        lbl10.setVisible(b);
        lbl11.setVisible(b);
        lbl12.setVisible(b);
        lbl13.setVisible(b);
        subtn.setVisible(b);
    }

    public void addCheckoutComponents() {
        add(txt1);
        add(txt2);
        add(txt3);
        add(txt4);
        add(txt5);
        add(txt6);
        add(txt7);
        add(txt8);
        add(txt9);
        add(txt10);
        add (txt11);
        add (txt12);
        add (txt13);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);
        add(lbl8);
        add(lbl9);
        add(lbl10);
        add(lbl11);
        add(lbl12);
        add(lbl13);
        add(subtn);


    }
    /*****************************
     FIRST SCENE
     *****************************/
    //Sets Visibility for buttons
    public void setComponentsVisible(boolean b){
        bBuy1.setVisible(b);
        bBuy2.setVisible(b);
        bBuy3.setVisible(b);
        bBuy4.setVisible(b);
        bBuy5.setVisible(b);
        lLabel1.setVisible(b);
        lLabel2.setVisible(b);
        lLabel3.setVisible(b);
        lLabel4.setVisible(b);
        lLabel5.setVisible(b);
    }
    //Adds Components to JPanel
    public void addComponents(){
        add(bBuy1);
        add(bBuy2);
        add(bBuy3);
        add(bBuy4);
        add(bBuy5);
        add(lLabel1);
        add(lLabel2);
        add(lLabel3);
        add(lLabel4);
        add(lLabel5);
    }
    public void FirstSceneComponents(){
        setSize(1280, 720);
        int w = 120;
        int h = 20;
        int imgW = 174;
        int imgH = 132;

        setVisible(true);
        lLabel1 = new JLabel();
        lLabel2 = new JLabel();
        lLabel3 = new JLabel();
        lLabel4 = new JLabel();
        lLabel5 = new JLabel();

        //TODO: ADD lLabel#.setLocation here
        lLabel1.setBounds(20 , 178, imgW, imgH);
        lLabel2.setBounds(120 + w, 178, imgW, imgH);
        lLabel3.setBounds(220 + w*2, 178, imgW, imgH);
        lLabel4.setBounds(320 + w*3, 178, imgW, imgH);
        lLabel5.setBounds(420 + w*4, 178, imgW, imgH);







        bBuy1 = new JButton("BUY TICKET");
        bBuy2 = new JButton("BUY TICKET");
        bBuy3 = new JButton("BUY TICKET");
        bBuy4 = new JButton("BUY TICKET");
        bBuy5 = new JButton("BUY TICKET");

        // sets button posn and dimension
        bBuy1.setBounds(50, 360, w, h);
        bBuy2.setBounds(150 + w, 360, w, h);
        bBuy3.setBounds(250 + w*2, 360, w, h);
        bBuy4.setBounds(350 + w*3, 360, w, h);
        bBuy5.setBounds(450 + w*4, 360, w, h);

        //MITCH TODO: CODE FOR JLABEL HERE (IMAGES, posn, size), bBuy1 : lLabel1 1st show
        lLabel1.setIcon(icon1);
        lLabel2.setIcon(icon2);
        lLabel3.setIcon(icon3);
        lLabel4.setIcon(icon4);
        lLabel5.setIcon(icon5);

        setComponentsVisible(true);
        addComponents();
    }

    public void CheckoutComponents(){
        setSize(1280, 720);
        int w = 120;
        int h = 20;

        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txt4 = new JTextField();
        txt5 = new JTextField();
        txt6 = new JTextField();
        txt7 = new JTextField();
        txt8 = new JTextField();
        txt9 = new JTextField();
        txt10 = new JTextField();
        txt11 = new JTextField();
        txt12 = new JTextField();
        txt13 = new JTextField();
        lbl1 = new JLabel("First Name");
        lbl2 = new JLabel("Last Name");
        lbl3 = new JLabel("E-mail address");
        lbl4 = new JLabel("Title");
        lbl5 = new JLabel("Street Address");
        lbl6 = new JLabel("City");
        lbl7 = new JLabel("State/Province");
        lbl8 = new JLabel("Country/Territory");
        lbl9 = new JLabel("Postal Code");
        lbl10 = new JLabel("Phone Number");
        lbl11 = new JLabel("Card Number");
        lbl12 = new JLabel("Expiration Date");
        lbl13 = new JLabel("Security Code");

        subtn = new JButton("Submit");

        txt1.setBounds(720, 20, w, h);
        txt2.setBounds(720, 40 + h, w, h);
        txt3.setBounds(720, 60 + h*2, w, h);
        txt4.setBounds(720, 80 + h*3, w, h);
        txt5.setBounds(720, 100 + h*4, w, h);
        txt6.setBounds(720, 120 + h*5, w, h);
        txt7.setBounds(720, 140 + h*6, w, h);
        txt8.setBounds(720, 160 + h*7, w, h);
        txt9.setBounds(720, 180 + h*8, w, h);
        txt10.setBounds(720, 200 + h*9, w, h);
        txt11.setBounds(720, 220 + h*10, w, h);
        txt12.setBounds(720, 240 + h*11, w, h);
        txt13.setBounds(720, 260 + h*12, w, h);

        lbl1.setBounds(400, 20, w, h);
        lbl2.setBounds(400, 40 + h, w, h);
        lbl3.setBounds(400, 60 + h*2, w, h);
        lbl4.setBounds(400, 80 + h*3, w, h);
        lbl5.setBounds(400, 100 + h*4, w, h);
        lbl6.setBounds(400, 120 + h*5, w, h);
        lbl7.setBounds(400, 140 + h*6, w, h);
        lbl8.setBounds(400, 160 + h*7, w, h);
        lbl9.setBounds(400, 180 + h*8, w, h);
        lbl10.setBounds(400, 200 + h*9, w, h);
        lbl11.setBounds(400, 220 + h*10, w, h);
        lbl12.setBounds(400, 240 + h*11, w, h);
        lbl13.setBounds(400, 260 + h*12, w, h);

        subtn.setBounds(50, 580, 140, 40);

        setComponentsVisible3(false);
        addCheckoutComponents();

    }
    /***
     * ACTIONS FOR ALL BUTTONS
     */
    public void actions(){
        bExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        /*****
         * ACTION LISTENER for scene1
         * ADD COMMENT BEFORE next ACTION LISTENER scene
         */
        bBuy1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible(false);
                setComponentsVisible21(true);

                //TODO: store PATH of image to STRING
                //TODO: Some mySQL codes
            }
        });

        bBuy2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible(false);
                setComponentsVisible22(true);

                //TODO: store PATH of image to STRING
                //TODO: Some mySQL codes
            }
        });

        bBuy3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible(false);
                setComponentsVisible23(true);

                //TODO: store PATH of image to STRING
                //TODO: Some mySQL codes
            }
        });

        bBuy4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible(false);
                setComponentsVisible24(true);

                //TODO: store PATH of image to STRING
                //TODO: Some mySQL codes
            }
        });

        bBuy5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible(false);
                setComponentsVisible25(true);

                //TODO: store PATH of image to STRING
                //TODO: Some mySQL codes
            }
        });

        /*
         * ACTION LISTENER FOR SCENE 2
         */

        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible(true);
                setComponentsVisible2(false);
            }
        });

        subtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                first_name = txt1.getText();
                last_name =  txt2.getText();
                email = txt3.getText();
                title = txt4.getText();
                sAddress = txt5.getText();
                city = txt6.getText();
                state = txt7.getText();
                country = txt8.getText();
                postal_code = txt9.getText();
                phone_number = txt10.getText();
                card_number = txt11.getText();
                expiration_date = txt12.getText();
                security_code = txt13.getText();

                try{
                    String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
                    String user = "root";
                    String password = "admin";

                    // 1. Get a connection to database

                    Connection myConn = DriverManager.getConnection(url, user, password);

                    // 2. Create a statement
                    Statement myStmt = myConn.createStatement();

                    // 3. Execute SQL queries...myRs.getString("payment_info_id")
                    //create payment_info
                    String sql = "INSERT INTO  ticketnetdb.payment_infos"
                            +"(card_number, expiration_date, security_code)"
                            +"values('"+txt11.getText()+"', "+expiration_date+", "+security_code+")";
                    myStmt.executeUpdate(sql);

                    // Get latest entry.
                    ResultSet myRs = myStmt.executeQuery("SELECT MAX(payment_info_id) as payment_info_id FROM ticketnetdb.payment_infos");
                    String id = "";
                    if(myRs.next())
                        id = myRs.getString("payment_info_id");

                    System.out.println("ID: " + id);
                    System.out.println("PASSED");

                    // Create actual customer
                    String sql2 = "INSERT INTO ticketnetdb.customers"
                            +"(first_name, last_name, email_address, salutation, street_address, city, state, country, postal_code, phone_number, payment_info_id)"
                            +"values('"+first_name+"', '"+last_name+"', '"+email+"', '"+title+"','"+sAddress+"', '"+city+"', '"+state+"', '"+country+"', '"+postal_code+"', '"+phone_number+"', '"+id+"')";

                    myStmt.executeUpdate(sql2);

                    System.out.println("Customer Creation Compelete!");

                    // Generate Ticket

                    // Get latest entry.
                    ResultSet myRs2 = myStmt.executeQuery("SELECT MAX(customer_id) as customer_id FROM ticketnetdb.customers");
                    String custid = " ";
                    if(myRs2.next())
                        custid = myRs2.getString("customer_id");

                    System.out.println("CUST_ID: " + custid);
                    System.out.println("PASSEDD");

                    // Create actual Ticket
                    // WILL NEED TO EVENT NAME AND EVENT ID TO VARIBALE DEPENDS ON WHAT USER CLICKED ON MAIN MENU
                    // WILL NEED TO CHANGE SEAT ID WHEN THERES A SELECTION ON EVENT MENU

                    String sql3 = "INSERT INTO ticketnetdb.tickets"
                            +"(price, event_name, customer_id, event_id, seat_id)"
                            +"values('1299', 'Foster the people', "+custid+", '1', '1')";

                    myStmt.executeUpdate(sql3);

                    System.out.println("TICKET GENERATION Compelete!");
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        } );

        bContShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible(true);
                setComponentsVisible2(false);
            }
        });

        bCheckout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComponentsVisible2(false);
                setComponentsVisible3(true);
            }
        });

    }
}