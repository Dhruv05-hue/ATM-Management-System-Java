package Logins;

import java.util.*;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


// --------------------------------------------------- class balanceq starts -----------------------------------------------------------
public class Balanceq extends JFrame implements ActionListener {

	// globally declared
	JLabel l1;
	JButton b1;
	String pin;
	
	 // globally declared ends
	
// --------------------------------------------- constructer starts -------------------------------------------------------------------	
	Balanceq(String pin){
   
    // imported variables
	this.pin = pin;
		
		// ATM image
    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/atm2.png")) ; 
		Image i2 = i1.getImage().getScaledInstance(1350, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(100,50,1350,700);
		add(image);
		
		 // label current balance
		 JLabel head = new JLabel("Your Current Balance is Rs is.");
		 head.setBounds(410,170,290,20);
		 head.setForeground(Color.white);
		 head.setFont(new Font("System",Font.BOLD,15));
		 image.add(head);
		 
		 // label for showing amount
		 JLabel l1 = new JLabel();
		 l1.setBounds(410,200,240,20);
		 l1.setForeground(Color.white);
		 l1.setFont(new Font("System",Font.BOLD,15));
		 image.add(l1);
		 
		 // btn back
		 b1 = new JButton("BACK");
		 // b1.setFont(new Font("raleway",Font.BOLD,10));
		 b1.setBounds(610,345,130,30);
		 b1.setForeground(Color.white);
		 b1.setBackground(new Color(65,125,128));
		 b1.addActionListener(this);
		 image.add(b1);
		 
		 // balance var
		 int balance = 0;
		 
		 
		 // selecting the values from table where pin no is matching and deducting or incre as per the type diposite/withdraw
		 try {
			 Data1 d = new Data1();
			 ResultSet resultset = d.statement.executeQuery("select * from bank where pin ='"+pin+"';" );
			 while (resultset.next()) {
				 
				 if(resultset.getString("type").equals("Deposite")) {
					   
					   balance += Integer.parseInt(resultset.getString("amount"));
				   }
				   else {
					   
					   balance -= Integer.parseInt(resultset.getString("amount"));
				   }   
			 }
		 }catch(Exception E) {
			 E.printStackTrace();
		 }
		 
		 l1.setText(""+ balance);
		 
		// setting frame size and location 	
	       setLayout(null);
	  	   setSize(1750,1650);
	  	   setLocation(0,0);
	//     setUndecorated(true);
	  	   setVisible(true);
		
	}
	
// -----------------------------------------------------	constructer ends -------------------------------------------------------
	
// -----------------------------------------------------  event handling starts ----------------------------------------------------	
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()==b1) {
			  
			  
			      new Main_class(pin);
			      setVisible(false);
		  
	 }
		
	}
// ----------------------------------------------------- event handling ends ----------------------------------------------------------
	
// ----------------------------------------------------- main function starts ---------------------------------------------------------	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Balanceq("");
	}
// ----------------------------------------------------- main function ends -----------------------------------------------------------	

}
// ----------------------------------------------------- class balanceq ends ----------------------------------------------------------
