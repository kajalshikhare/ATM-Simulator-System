package ATM_Simulator_System;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
	JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JTextField t1,t2;
    String pin;
	BalanceEnquiry(String pin) {
        this.pin = pin;
        ImageIcon i1=new ImageIcon(LoginToApplication.class.getResource("/Images/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(1000, 1180, 1);// set size of image
		ImageIcon i3=new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        this.add(l3); 
        this.l1 = new JLabel();
        this.l1.setForeground(Color.WHITE);
        this.l1.setFont(new Font("System", 1, 16));
        this.b1 = new JButton("BACK");
        this.setLayout((LayoutManager)null);
        this.l1.setBounds(190, 350, 400, 35);
        l3.add(this.l1);
        this.b1.setBounds(390, 633, 150, 35);
        l3.add(this.b1);
        int balance = 0;

        try {
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '" + pin + "'");

            while(rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception var9) {
        }

        this.l1.setText("Your Current Account Balance is Rs " + balance);
        this.b1.addActionListener(this);
        this.setSize(960, 1080);
        this.setUndecorated(true);
        this.setLocation(500, 0);
        this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 this.setVisible(false);
	     (new Transaction(this.pin)).setVisible(true);
	}

	public static void main(String[] args) {
		new BalanceEnquiry("");

	}

	
}
