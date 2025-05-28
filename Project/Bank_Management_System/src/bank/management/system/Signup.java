package bank.management.system;

// import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Signup extends JFrame {

    // JDateChooser dateChooser;

    JRadioButton maleButton, femaleButton, otherButton;
    JCheckBox termsCheckBox;

    Random random = new Random();
    long randomNumber = Math.abs((random.nextLong() % 9000L) + 1000L);
    
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(25, 10, 100, 100);
        add(l1);

        JLabel lable1 = new JLabel("APPLICATION FORM NO : " + randomNumber);
        lable1.setBounds(160, 20, 600, 40);
        lable1.setFont(new Font("Raleway", Font.BOLD, 38));
        lable1.setForeground(Color.BLACK);
        add(lable1);

        JLabel lable2 = new JLabel("Page 1 : Personal Details");
        lable2.setBounds(290, 70, 400, 40);
        lable2.setFont(new Font("Raleway", Font.BOLD, 20));
        lable2.setForeground(Color.BLACK);
        add(lable2);

        JLabel nameLabel = new JLabel("Name : ");
        nameLabel.setBounds(100, 150, 100, 30);
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        nameLabel.setForeground(Color.BLACK);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(270, 150, 400, 30);
        nameField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(nameField);

        JLabel fatherLabel = new JLabel("Father's Name : ");
        fatherLabel.setBounds(100, 200, 170, 30);
        fatherLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherLabel.setForeground(Color.BLACK);
        add(fatherLabel);

        JTextField fatherField = new JTextField();
        fatherField.setBounds(270, 200, 400, 30);
        fatherField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(fatherField);

        JLabel dobLabel = new JLabel("Date of Birth : ");
        dobLabel.setBounds(100, 250, 150, 30);
        dobLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        dobLabel.setForeground(Color.BLACK);
        add(dobLabel);
        

        JTextField dobField = new JTextField();
        dobField.setBounds(270, 250, 400, 30);
        dobField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(dobField);
        
        JLabel genderLabel = new JLabel("GENDER : ");
        genderLabel.setBounds(100, 300, 150, 30); 
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        genderLabel.setForeground(Color.BLACK);
        add(genderLabel);

        
        maleButton = new JRadioButton("Male");
        maleButton.setBounds(getBounds().x + 270, 300, 100, 30);    
        maleButton.setFont(new Font("Raleway", Font.BOLD, 15)); 
        maleButton.setBackground(new Color(222,255,228));   
        maleButton.setForeground(Color.BLACK);
        add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(getBounds().x + 370, 300, 100, 30);
        femaleButton.setFont(new Font("Raleway", Font.BOLD, 15));
        femaleButton.setBackground(new Color(222,255,228));
        femaleButton.setForeground(Color.BLACK);
        add(femaleButton);

        otherButton = new JRadioButton("Other");
        otherButton.setBounds(getBounds().x + 470, 300, 100, 30);
        otherButton.setFont(new Font("Raleway", Font.BOLD, 15));
        otherButton.setBackground(new Color(222,255,228));
        otherButton.setForeground(Color.BLACK);
        add(otherButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleButton);
        buttonGroup.add(femaleButton);
        buttonGroup.add(otherButton);

        JLabel emailLabel = new JLabel("Email Address : ");
        emailLabel.setBounds(100, 350, 150, 30);
        emailLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        emailLabel.setForeground(Color.BLACK);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(270, 350, 400, 30);
        emailField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(emailField);

        JLabel phoneLabel = new JLabel("Phone Number : ");
        phoneLabel.setBounds(100, 400, 150, 30);
        phoneLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        phoneLabel.setForeground(Color.BLACK);
        add(phoneLabel);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(270, 400, 400, 30);
        phoneField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(phoneField);

        JLabel addressLabel = new JLabel("Address : ");
        addressLabel.setBounds(100, 450, 150, 30);
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        addressLabel.setForeground(Color.BLACK);
        add(addressLabel);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(270, 450, 400, 100);
        addressArea.setFont(new Font("Raleway", Font.BOLD, 15));
        addressArea.setLineWrap(true);
        addressArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        scrollPane.setBounds(270, 450, 400, 100);
        add(scrollPane);

        termsCheckBox = new JCheckBox("I agree to the terms and conditions");
        termsCheckBox.setBounds(270, 570, 300, 30);
        termsCheckBox.setFont(new Font("Raleway", Font.BOLD, 15));
        termsCheckBox.setBackground(new Color(222,255,228));
        termsCheckBox.setForeground(Color.BLACK);
        add(termsCheckBox);

        JButton nextButton = new JButton("Next");
        nextButton.setBounds(600, 620, 100, 30);
        nextButton.setFont(new Font("Raleway", Font.BOLD, 15));
        nextButton.setBackground(new Color(0, 153, 0));
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(e -> {
            if (nameField.getText().isEmpty() || fatherField.getText().isEmpty() || dobField.getText().isEmpty() ||
                (!maleButton.isSelected() && !femaleButton.isSelected() && !otherButton.isSelected()) ||
                emailField.getText().isEmpty() || phoneField.getText().isEmpty() || addressArea.getText().isEmpty() ||
                !termsCheckBox.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields and agree to the terms.");
            } else {
                // Proceed to the next step
                JOptionPane.showMessageDialog(null, "Form submitted successfully!");
            }
        });

        add(nextButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(720, 620, 100, 30);
        cancelButton.setFont(new Font("Raleway", Font.BOLD, 15));
        cancelButton.setBackground(new Color(255, 0, 0));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.addActionListener(e -> {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Cancel Confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
        add(cancelButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Bank Management System - Signup");
        setIconImage(i2);
        setLayout(null);
        setBackground(new Color(222, 255, 228));
        setForeground(Color.BLACK);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850 , 800);
        setLocation(360 , 40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }
}
