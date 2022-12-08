package ATM_Simulator_System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class LoginToApplication extends JFrame implements ActionListener {
	 JButton login, signUp, clear;
	 JTextField cardField; 
	 JPasswordField pinField;
	LoginToApplication(){
		setTitle("ATM");
		setLayout(null);
		ImageIcon i1=new ImageIcon(LoginToApplication.class.getResource("/Images/bankIcon.png"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);// set size of image
		ImageIcon i3=new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70,10,100,100);
	    add(label);  
	    getContentPane().setBackground(Color.GRAY);
	    
	    JLabel text = new JLabel("WELCOME TO ATM");
	    text.setFont(new Font("Osward",Font.BOLD, 38));
	    text.setBounds(300,40,400,40);
	    add(text);
	    
	    JLabel cardNo = new JLabel("Card No:");
	    cardNo.setFont(new Font("Railway",Font.BOLD, 28));
	    cardNo.setBounds(120,150,150,30);
	    add(cardNo);
	    
	    cardField=new JTextField(); 
	    cardField.setFont(new Font("Arial",Font.BOLD, 14));
	    cardField.setBounds(300,150,230,30);
	    add( cardField);
	    
	    JLabel pin = new JLabel("PIN:");
	    pin.setFont(new Font("Railway",Font.BOLD, 28));
	    pin.setBounds(120,220,250,30);
	    add(pin); 
	    
	    pinField=new JPasswordField(); 
	    pinField.setFont(new Font("Arial",Font.BOLD, 14));
	    pinField.setBounds(300,220,230,30);
	    add(pinField);
	    
	    login=new JButton("SIGN IN");
	    login.setBounds(300,300,100,30);
	    login.setBackground(Color.BLACK);
	    login.setForeground(Color.WHITE);
	    login.addActionListener(this);
	    add(login);
	    
	    clear=new JButton("CLEAR");
	    clear.setBounds(430,300,100,30);
	    clear.setBackground(Color.BLACK);
	    clear.setForeground(Color.WHITE);
	    clear.addActionListener(this);
	    add(clear);
	    

	    signUp=new JButton("SIGNUP");
	    signUp.setBounds(300,350,230,30);
	    signUp.setBackground(Color.BLACK);
	    signUp.setForeground(Color.WHITE);
	    signUp.addActionListener(this);
	    add(signUp);
	    
	    
	    
		setSize(800, 500);
		setVisible(true);
		setLocation(350, 200);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			Conn c=new Conn();
			String cardno = this. cardField.getText();
            String pin = this.pinField.getText();     
            String q = "select * from login where cardno = '" + cardno + "' and pin = '" + pin + "'";
            try {
            	ResultSet rs=c.s.executeQuery(q);//inside sql package
            	if (rs.next()) {
                    this.setVisible(false);
                    (new Transaction(pin)).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Incorrect Card Number or PIN");
                }
            }catch(Exception ex) {
            System.out.println(ex);
            }
          
            
			
		}else if(e.getSource()==clear) {
			cardField.setText("");
			pinField.setText("");
		}else if(e.getSource()==signUp) {
			setVisible(false);// close current tab 
			 new Signup().setVisible(true);//open sign up 
			
		}
		
	}
	
public static void main(String[] args) {
	new LoginToApplication();
}
}
