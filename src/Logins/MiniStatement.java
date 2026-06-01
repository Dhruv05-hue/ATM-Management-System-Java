package Logins;
import java.util.*;
import java.sql.ResultSet;
// import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

// ----------------------------------class ministatement starts--------------------------------------
public class MiniStatement extends JFrame implements ActionListener{
    //globally declared variable starts
	String pin;
	JButton btn;
	// globally declared variable ends
	
// ---------------------- constructer starts ------------------------	
	 MiniStatement (String pin){
		 // imported pin from main_class
		 this.pin=pin;
		 
		 // setting size and location of frame
		 setLayout(null);
		 getContentPane().setBackground(new Color(255,204,204));
		 setSize(400,900);
		 setLocation(20,0);
		 setVisible(true);
		 
		 // label for all the deposite and withdrawl details
		 JLabel l1 = new JLabel();
//		 l1.setBounds(20,140,400,450);
//		 add(l1);
		 
		 JScrollPane js = new JScrollPane(l1);
		 js.setBounds(20,140,350,450);
		 js.setBackground(new Color(255,204,204));
		 add(js);
		 
		 // label for head of frame 
		 JLabel l2 = new JLabel("D&P BANK");
		 l2.setFont(new Font("SYSTEM",Font.BOLD,15));
		 l2.setBounds(150,20,200,20);
		 add(l2);
		 
		 // label for the card no
		 JLabel l3 = new JLabel();
		 l3.setBounds(20,80,300,20);
		 add(l3);
		 
		 // label for total balance
		 JLabel l4 = new JLabel();
		 l4.setBounds(20,600,300,20);
		 add(l4);
		 
		 // btn exit
		 btn = new JButton("EXIT");
		 btn.setBounds(250,600,100,25);
		 btn.addActionListener(this);
		 btn.setBackground(Color.BLACK);
		 btn.setForeground(Color.white);
		 add(btn);
		 
		 try {
			 // connecting from class data
			 Data1 d = new Data1();
			 
			// resultset use to take values from database table
			ResultSet rs = d.statement.executeQuery("select * from login where pin = '"+pin+"'");
			
			while(rs.next()) {
				                               // to get value of coloumn
				l3.setText("Card Number:" + rs.getString("cardno").substring(0,4) + "XXXXXXXX" + rs.getString("cardno").substring(12));
			}			 
		 }		 	 
		 catch(Exception E) {
		 			 
			 E.printStackTrace();		 
		 }
		 
		 try {
			 
			 int balance=0;
			 Data1 d = new Data1();
			 
			 ResultSet resultset = d.statement.executeQuery("select * from bank where pin = '"+pin+"'");
			  
			   while(resultset.next()) {
				   
				   l1.setText(l1.getText() + "<html>" + resultset.getString("date")+"&nbsp;&nbsp;&nbsp;" + resultset.getString("type")+"&nbsp;&nbsp;&nbsp;" + "" + resultset.getString("amount") + "<br> <br> <html>");
				   if(resultset.getString("type").equals("Deposite")) {
					   
					   balance += Integer.parseInt(resultset.getString("amount"));
				   }
				   else {
					   
					   balance -= Integer.parseInt(resultset.getString("amount"));
				   }   
			   }
			   
			   l4.setText("Your Total Balance is Rs." + "" + balance);
			   
		 }
		 
		 catch(Exception e) {
			 
			 e.printStackTrace();
		 }
		 
	 }
// -----------------------end of constructer ---------------------------	

// ----------------------- event handling starts -----------------------
	@Override
	public void actionPerformed(ActionEvent E) {
		
		setVisible(false);
		
	}
// ---------------------- event handling ends-----------------------
	
	
// ---------------------main function starts -----------------------	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object of class
		new  MiniStatement("");
	}
// --------------------- main function ends --------------------------	

}
// --------------------------------------------class ministatements ends -------------------------------------
