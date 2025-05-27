package bank.management.system;
import java.awt.*;
import javax.swing.*;
public class Signup extends JFrame {
    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(25, 10, 100, 100);
        add(l1);

        
        getContentPane().setBackground(new java.awt.Color(222,255,288));
        setLayout(null);
        setSize(850, 700);
        setLocation(360, 40);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
