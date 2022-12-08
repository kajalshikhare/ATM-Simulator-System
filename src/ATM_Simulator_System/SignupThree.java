package ATM_Simulator_System;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JRadioButton r1,r2,r3,r4;
	JButton b1,b2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	String formno;
	public SignupThree(String formno) {
		 this.formno = formno;
	        this.setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
	        ImageIcon i1=new ImageIcon(LoginToApplication.class.getResource("/Images/bankIcon.png"));
	 		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);// set size of image
	 		ImageIcon i3=new ImageIcon(i2);
	 		JLabel label = new JLabel(i3);
	 		label.setBounds(150, 0, 100, 100);
	 	    add(label);  
	        this.l1 = new JLabel("Page 3: Account Details");
	        this.l1.setFont(new Font("Raleway", 1, 22));
	        this.l2 = new JLabel("Account Type:");
	        this.l2.setFont(new Font("Raleway", 1, 18));
	        this.l3 = new JLabel("Card Number:");
	        this.l3.setFont(new Font("Raleway", 1, 18));
	        this.l4 = new JLabel("XXXX-XXXX-XXXX-4184");
	        this.l4.setFont(new Font("Raleway", 1, 18));
	        this.l5 = new JLabel("(Your 16-digit Card number)");
	        this.l5.setFont(new Font("Raleway", 1, 12));
	        this.l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
	        this.l6.setFont(new Font("Raleway", 1, 12));
	        this.l7 = new JLabel("PIN:");
	        this.l7.setFont(new Font("Raleway", 1, 18));
	        this.l8 = new JLabel("XXXX");
	        this.l8.setFont(new Font("Raleway", 1, 18));
	        this.l9 = new JLabel("(4-digit password)");
	        this.l9.setFont(new Font("Raleway", 1, 12));
	        this.l10 = new JLabel("Services Required:");
	        this.l10.setFont(new Font("Raleway", 1, 18));
	        this.l11 = new JLabel("Form No:");
	        this.l11.setFont(new Font("Raleway", 1, 14));
	        this.l12 = new JLabel(formno);
	        this.l12.setFont(new Font("Raleway", 1, 14));
	        this.b1 = new JButton("Submit");
	        this.b1.setFont(new Font("Raleway", 1, 14));
	        this.b1.setBackground(Color.BLACK);
	        this.b1.setForeground(Color.WHITE);
	        this.b2 = new JButton("Cancel");
	        this.b2.setFont(new Font("Raleway", 1, 14));
	        this.b2.setBackground(Color.BLACK);
	        this.b2.setForeground(Color.WHITE);
	        this.c1 = new JCheckBox("ATM CARD");
	        this.c1.setBackground(Color.GRAY);
	        this.c1.setFont(new Font("Raleway", 1, 16));
	        this.c2 = new JCheckBox("Internet Banking");
	        this.c2.setBackground(Color.GRAY);
	        this.c2.setFont(new Font("Raleway", 1, 16));
	        this.c3 = new JCheckBox("Mobile Banking");
	        this.c3.setBackground(Color.GRAY);
	        this.c3.setFont(new Font("Raleway", 1, 16));
	        this.c4 = new JCheckBox("EMAIL Alerts");
	        this.c4.setBackground(Color.GRAY);
	        this.c4.setFont(new Font("Raleway", 1, 16));
	        this.c5 = new JCheckBox("Cheque Book");
	        this.c5.setBackground(Color.GRAY);
	        this.c5.setFont(new Font("Raleway", 1, 16));
	        this.c6 = new JCheckBox("E-Statement");
	        this.c6.setBackground(Color.GRAY);
	        this.c6.setFont(new Font("Raleway", 1, 16));
	        this.c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
	        this.c7.setBackground(Color.GRAY);
	        this.c7.setFont(new Font("Raleway", 1, 12));
	        this.r1 = new JRadioButton("Saving Account");
	        this.r1.setFont(new Font("Raleway", 1, 16));
	        this.r1.setBackground(Color.GRAY);
	        this.r2 = new JRadioButton("Fixed Deposit Account");
	        this.r2.setFont(new Font("Raleway", 1, 16));
	        this.r2.setBackground(Color.GRAY);
	        this.r3 = new JRadioButton("Current Account");
	        this.r3.setFont(new Font("Raleway", 1, 16));
	        this.r3.setBackground(Color.GRAY);
	        this.r4 = new JRadioButton("Recurring Deposit Account");
	        this.r4.setFont(new Font("Raleway", 1, 16));
	        this.r4.setBackground(Color.GRAY);
	        ButtonGroup groupgender = new ButtonGroup();
	        groupgender.add(this.r1);
	        groupgender.add(this.r2);
	        groupgender.add(this.r3);
	        groupgender.add(this.r4);
	        this.setLayout((LayoutManager)null);
	        this.l11.setBounds(700, 10, 70, 30);
	        this.add(this.l11);
	        this.l12.setBounds(770, 10, 40, 30);
	        this.add(this.l12);
	        this.l1.setBounds(280, 40, 400, 40);
	        this.add(this.l1);
	        this.l2.setBounds(100, 140, 200, 30);
	        this.add(this.l2);
	        this.r1.setBounds(100, 180, 150, 30);
	        this.add(this.r1);
	        this.r2.setBounds(350, 180, 300, 30);
	        this.add(this.r2);
	        this.r3.setBounds(100, 220, 250, 30);
	        this.add(this.r3);
	        this.r4.setBounds(350, 220, 250, 30);
	        this.add(this.r4);
	        this.l3.setBounds(100, 300, 200, 30);
	        this.add(this.l3);
	        this.l4.setBounds(330, 300, 250, 30);
	        this.add(this.l4);
	        this.l5.setBounds(100, 330, 200, 20);
	        this.add(this.l5);
	        this.l6.setBounds(330, 330, 500, 20);
	        this.add(this.l6);
	        this.l7.setBounds(100, 370, 200, 30);
	        this.add(this.l7);
	        this.l8.setBounds(330, 370, 200, 30);
	        this.add(this.l8);
	        this.l9.setBounds(100, 400, 200, 20);
	        this.add(this.l9);
	        this.l10.setBounds(100, 450, 200, 30);
	        this.add(this.l10);
	        this.c1.setBounds(100, 500, 200, 30);
	        this.add(this.c1);
	        this.c2.setBounds(350, 500, 200, 30);
	        this.add(this.c2);
	        this.c3.setBounds(100, 550, 200, 30);
	        this.add(this.c3);
	        this.c4.setBounds(350, 550, 200, 30);
	        this.add(this.c4);
	        this.c5.setBounds(100, 600, 200, 30);
	        this.add(this.c5);
	        this.c6.setBounds(350, 600, 200, 30);
	        this.add(this.c6);
	        this.c7.setBounds(100, 680, 600, 20);
	        this.add(this.c7);
	        this.b1.setBounds(250, 720, 100, 30);
	        this.add(this.b1);
	        this.b2.setBounds(420, 720, 100, 30);
	        this.add(this.b2);
	        this.getContentPane().setBackground(Color.GRAY);
	        this.setSize(850, 850);
	        this.setLocation(500, 60);
	        this.setVisible(true);
	        this.b1.addActionListener(this);
	        this.b2.addActionListener(this);
	    }

	    public void actionPerformed(ActionEvent ae) {
	        String atype = null;
	        if (this.r1.isSelected()) {
	            atype = "Saving Account";
	        } else if (this.r2.isSelected()) {
	            atype = "Fixed Deposit Account";
	        } else if (this.r3.isSelected()) {
	            atype = "Current Account";
	        } else if (this.r4.isSelected()) {
	            atype = "Recurring Deposit Account";
	        }

	        Random ran = new Random();
	        long first7 = ran.nextLong() % 90000000L + 5040936000000000L;
	        String cardno = "" + Math.abs(first7);
	        long first3 = ran.nextLong() % 9000L + 1000L;
	        String pin = "" + Math.abs(first3);
	        String facility = "";
	        if (this.c1.isSelected()) {
	            facility = facility + " ATM Card";
	        }

	        if (this.c2.isSelected()) {
	            facility = facility + " Internet Banking";
	        }

	        if (this.c3.isSelected()) {
	            facility = facility + " Mobile Banking";
	        }

	        if (this.c4.isSelected()) {
	            facility = facility + " EMAIL Alerts";
	        }

	        if (this.c5.isSelected()) {
	            facility = facility + " Cheque Book";
	        }

	        if (this.c6.isSelected()) {
	            facility = facility + " E-Statement";
	        }

	        try {
	            if (ae.getSource() == this.b1) {
	                if (atype.equals("")) {
	                    JOptionPane.showMessageDialog((Component)null, "Fill all the required fields");
	                } else {
	                    Conn c1 = new Conn();
	                    String q1 = "insert into signupThree values('" + this.formno + "','" + atype + "','" + cardno + "','" + pin + "','" + facility + "')";
	                    String q2 = "insert into login values('" + this.formno + "','" + cardno + "','" + pin + "')";
	                    c1.s.executeUpdate(q1);
	                    c1.s.executeUpdate(q2);
                        JOptionPane.showMessageDialog((Component)null, "Card Number: " + cardno + "\n Pin:" + pin);
	                    this.setVisible(false);
                        (new Deposite(pin)).setVisible(true);
                    
	                }
	            } else if (ae.getSource() == this.b2) {
	                System.exit(0);
	            }
	        } catch (Exception ex) {
	           System.out.println(ex);
	        }

	    }
   
	public static void main(String[] args) {
		new SignupThree("");
	}

}
