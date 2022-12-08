package ATM_Simulator_System;
import java.sql.*;
public class Conn {
Connection c;
Statement s;
	public Conn() {
		try {
		// Class.forName("com.mysql.jdbc.Driver");	//driver register
		  this.c = DriverManager.getConnection("jdbc:mysql:///ATMmanagementsystem", "root", "Password@9822");  //Connection creation
		  this.s = this.c.createStatement();  //create statement
		
		}catch(Exception e) {
			 System.out.println(e);
		}
	}

}
