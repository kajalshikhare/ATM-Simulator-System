package ATM_Simulator_System;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton b;
    JRadioButton r1,r2,r3,r4;
    JTextField t1,t2,t3;
    JComboBox c1,c2,c3,c4,c5;
    String formno;

    SignupTwo(String formno) {

         ImageIcon i1=new ImageIcon(LoginToApplication.class.getResource("/Images/bankIcon.png"));
 		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);// set size of image
 		ImageIcon i3=new ImageIcon(i2);
 		JLabel label = new JLabel(i3);
 		label.setBounds(150, 0, 100, 100);
 	    add(label);  
         this.formno = formno;
         this.setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         
         this.l1 = new JLabel("Page 2: Additonal Details");
         this.l1.setFont(new Font("Raleway", 1, 22));
         
         this.l2 = new JLabel("Religion:");
         this.l2.setFont(new Font("Raleway", 1, 18));
         
         this.l3 = new JLabel("Category:");
         this.l3.setFont(new Font("Raleway", 1, 18));
         
         this.l4 = new JLabel("Income:");
         this.l4.setFont(new Font("Raleway", 1, 18));
         
         this.l5 = new JLabel("Educational");
         this.l5.setFont(new Font("Raleway", 1, 18));
         
         this.l11 = new JLabel("Qualification:");
         this.l11.setFont(new Font("Raleway", 1, 18));
         
         this.l6 = new JLabel("Occupation:");
         this.l6.setFont(new Font("Raleway", 1, 18));
         
         this.l7 = new JLabel("PAN Number:");
         this.l7.setFont(new Font("Raleway", 1, 18));
        
         this.l8 = new JLabel("Aadhar Number:");
         this.l8.setFont(new Font("Raleway", 1, 18));
        
         this.l9 = new JLabel("Senior Citizen:");
         this.l9.setFont(new Font("Raleway", 1, 18));
         
         this.l10 = new JLabel("Existing Account:");
         this.l10.setFont(new Font("Raleway", 1, 18));
         
         this.l12 = new JLabel("Form No:");
         this.l12.setFont(new Font("Raleway", 1, 13));
         
         this.l13 = new JLabel(formno);
         this.l13.setFont(new Font("Raleway", 1, 13));
        
         this.b = new JButton("Next");
         this.b.setFont(new Font("Raleway", 1, 14));
         this.b.setBackground(Color.BLACK);
         this.b.setForeground(Color.WHITE);
        
         this.t1 = new JTextField();
         this.t1.setFont(new Font("Raleway", 1, 14));
        
         this.t2 = new JTextField();
         this.t2.setFont(new Font("Raleway", 1, 14));
        
         this.r1 = new JRadioButton("Yes");
         this.r1.setFont(new Font("Raleway", 1, 14));
         this.r1.setBackground(Color.GRAY);
         this.r2 = new JRadioButton("No");
         this.r2.setFont(new Font("Raleway", 1, 14));
         this.r2.setBackground(Color.GRAY);
         this.r3 = new JRadioButton("Yes");
         this.r3.setFont(new Font("Raleway", 1, 14));
         this.r3.setBackground(Color.GRAY);
         this.r4 = new JRadioButton("No");
         this.r4.setFont(new Font("Raleway", 1, 14));
         this.r4.setBackground(Color.GRAY);
         String[] religion = new String[]{"Hindu", "Muslim", "Sikh", "Christian", "Other"};
         this.c1 = new JComboBox(religion);
         this.c1.setBackground(Color.WHITE);
         this.c1.setFont(new Font("Raleway", 1, 14));
         String[] category = new String[]{"General", "OBC", "SC", "ST", "Other"};
         this.c2 = new JComboBox(category);
         this.c2.setBackground(Color.WHITE);
         this.c2.setFont(new Font("Raleway", 1, 14));
         String[] income = new String[]{"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
         this.c3 = new JComboBox(income);
         this.c3.setBackground(Color.WHITE);
         this.c3.setFont(new Font("Raleway", 1, 14));
         String[] education = new String[]{"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
         this.c4 = new JComboBox(education);
         this.c4.setBackground(Color.WHITE);
         this.c4.setFont(new Font("Raleway", 1, 14));
         String[] occupation = new String[]{"Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others"};
         this.c5 = new JComboBox(occupation);
         this.c5.setBackground(Color.WHITE);
         this.c5.setFont(new Font("Raleway", 1, 14));
         this.setLayout((LayoutManager)null);
         this.l12.setBounds(700, 10, 60, 30);
         this.add(this.l12);
         this.l13.setBounds(760, 10, 60, 30);
         this.add(this.l13);
         this.l1.setBounds(280, 30, 600, 40);
         this.add(this.l1);
         this.l2.setBounds(100, 120, 100, 30);
         this.add(this.l2);
         this.c1.setBounds(350, 120, 320, 30);
         this.add(this.c1);
         this.l3.setBounds(100, 170, 100, 30);
         this.add(this.l3);
         this.c2.setBounds(350, 170, 320, 30);
         this.add(this.c2);
         this.l4.setBounds(100, 220, 100, 30);
         this.add(this.l4);
         this.c3.setBounds(350, 220, 320, 30);
         this.add(this.c3);
         this.l5.setBounds(100, 270, 150, 30);
         this.add(this.l5);
         this.c4.setBounds(350, 270, 320, 30);
         this.add(this.c4);
         this.l11.setBounds(100, 290, 150, 30);
         this.add(this.l11);
         this.l6.setBounds(100, 340, 150, 30);
         this.add(this.l6);
         this.c5.setBounds(350, 340, 320, 30);
         this.add(this.c5);
         this.l7.setBounds(100, 390, 150, 30);
         this.add(this.l7);
         this.t1.setBounds(350, 390, 320, 30);
         this.add(this.t1);
         this.l8.setBounds(100, 440, 180, 30);
         this.add(this.l8);
         this.t2.setBounds(350, 440, 320, 30);
         this.add(this.t2);
         this.l9.setBounds(100, 490, 150, 30);
         this.add(this.l9);
         this.r1.setBounds(350, 490, 100, 30);
         this.add(this.r1);
         this.r2.setBounds(460, 490, 100, 30);
         this.add(this.r2);
         this.l10.setBounds(100, 540, 180, 30);
         this.add(this.l10);
         this.r3.setBounds(350, 540, 100, 30);
         this.add(this.r3);
         this.r4.setBounds(460, 540, 100, 30);
         this.add(this.r4);
         this.b.setBounds(570, 640, 100, 30);
         this.add(this.b);
         this.b.addActionListener(this);
         this.getContentPane().setBackground(Color.GRAY);
         this.setSize(850, 750);
         this.setLocation(500, 80);
         this.setVisible(true);
     }

     public void actionPerformed(ActionEvent ae) {
         String religion = (String)this.c1.getSelectedItem();
         String category = (String)this.c2.getSelectedItem();
         String income = (String)this.c3.getSelectedItem();
         String education = (String)this.c4.getSelectedItem();
         String occupation = (String)this.c5.getSelectedItem();
         String pan = this.t1.getText();
         String aadhar = this.t2.getText();
         String scitizen = "";
         if (this.r1.isSelected()) {
             scitizen = "Yes";
         } else if (this.r2.isSelected()) {
             scitizen = "No";
         }

         String eaccount = "";
         if (this.r3.isSelected()) {
             eaccount = "Yes";
         } else if (this.r4.isSelected()) {
             eaccount = "No";
         }

         try {
             if (this.t2.getText().equals("")) {
                 JOptionPane.showMessageDialog((Component)null, "Fill all the required fields");
             } else {
                 Conn c1 = new Conn();
                 String q1 = "insert into signupTwo values('" + this.formno + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','" + scitizen + "','" + eaccount + "')";
                 c1.s.executeUpdate(q1);
                 this.setVisible(false);
                 (new SignupThree(this.formno)).setVisible(true);
               
             }
         } catch (Exception ex) {
            System.out.println(ex);
         }

     }

   	  
	public static void main(String[] args) {
		new SignupTwo("");
	}

}
