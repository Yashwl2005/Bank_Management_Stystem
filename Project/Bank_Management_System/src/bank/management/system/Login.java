package bank.management.system;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JLabel LABLE ;
    JTextField cardNumberField;
    JPasswordField pinField;
    JButton loginButton, clearButton, signupButton;
    Login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400, 10, 100, 100);
        add(l1);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image I2 = I1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel L1 = new JLabel(I3);
        L1.setBounds(650, 464, 100, 100);
        add(L1);

        LABLE = new JLabel("Welcome to ATM");
        LABLE.setForeground(java.awt.Color.WHITE);
        LABLE.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 30));
        LABLE.setBounds(320 , 125, 300, 30);
        add(LABLE) ;

        JLabel LABLE1 = new JLabel("Please Enter Your Card Number :");
        LABLE1.setForeground(java.awt.Color.WHITE);
        LABLE1.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 15));
        LABLE1.setBounds(120, 200, 300, 30);
        add(LABLE1);

        cardNumberField = new JTextField(11);
        cardNumberField.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 15));
        cardNumberField.setBounds(400, 200, 200, 30);
        add(cardNumberField);

        JLabel LABLE2 = new JLabel("PIN                                                      : ");       
        LABLE2.setForeground(java.awt.Color.WHITE);
        LABLE2.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 15));
        LABLE2.setBounds(120, 240, 300, 30);
        add(LABLE2); 

        pinField = new JPasswordField(4);
        pinField.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 15));
        pinField.setBounds(400, 240, 200, 30);
        add(pinField);

        loginButton = new JButton("Login");
        loginButton.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 15));
        loginButton.setBounds(400, 300, 90, 30);
        loginButton.setBackground(java.awt.Color.BLACK);
        loginButton.setForeground(java.awt.Color.WHITE);
        loginButton.addActionListener(this);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(loginButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 15));
        clearButton.setBounds(510, 300, 90, 30);
        clearButton.setBackground(java.awt.Color.BLACK);
        clearButton.setForeground(java.awt.Color.WHITE);
        clearButton.addActionListener(this);
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(clearButton);

        signupButton = new JButton("Sign Up");
        signupButton.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 15));
        signupButton.setBounds(400, 340, 200, 30);
        signupButton.setBackground(java.awt.Color.BLACK);
        signupButton.setForeground(java.awt.Color.WHITE);
        signupButton.addActionListener(this);
        signupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(signupButton);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image ii2 = ii1.getImage().getScaledInstance(850, 600, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel ll1 = new JLabel(ii3);
        ll1.setBounds(0, 0, 850, 600);
        add(ll1);

        setLayout(null);
        setSize(850, 600);
        setLocation(300, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        try {
            if (e.getSource() == loginButton) {
                String cardNumber = cardNumberField.getText();
                String pin = pinField.getText();
                // Add logic to validate card number and pin
                System.out.println("Login button clicked with Card Number: " + cardNumber + " and PIN: " + pin);
            } else if (e.getSource() == clearButton) {
                cardNumberField.setText("");
                pinField.setText("");
            } else if (e.getSource() == signupButton) {
                // Logic for sign up
                System.out.println("Sign Up button clicked");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
 