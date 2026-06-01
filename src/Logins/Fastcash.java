package Logins;
import java.util.*;

import java.sql.ResultSet;
// import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class Fastcash extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4,b5,b6,b7;
	  String pin;
//-------------------------------- constructer starts ------------------------------------	
	     Fastcash(String pin){
	    	 
	    	 this.pin = pin;
	    	 
	    	 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/atm2.png")) ; 
	 		Image i2 = i1.getImage().getScaledInstance(1350, 700, Image.SCALE_DEFAULT);
	 		ImageIcon i3 = new ImageIcon(i2);
	 		JLabel image = new JLabel(i3);
	 		image.setBounds(100,50,1350,700);
	 		add(image);
	 		
	 		
	 		JLabel l1 = new JLabel("SELECT WITHDRAWL AMOUNT ");
	 		l1.setBounds(400,150,350,30);
	 		l1.setFont(new Font("ralwey",Font.BOLD,20));
	 		l1.setForeground(Color.white);
	 		image.add(l1);
	 		
	 		b1 = new JButton("RS. 100");
//	 	    btnde.setFont(new Font("raleway",Font.BOLD,10));
	 	    b1.setBounds(360,230,130,30);
	 	    b1.setForeground(Color.white);
	 	    b1.setBackground(new Color(65,125,128));
	 	    b1.addActionListener(this);
	 	    image.add(b1);
	 	    
	 	    b2 = new JButton("RS. 500");
//	 	    btncw.setFont(new Font("raleway",Font.BOLD,10));
	 	    b2.setBounds(590,230,150,30);
	 	    b2.setForeground(Color.white);
	 	    b2.setBackground(new Color(65,125,128));
	 	    b2.addActionListener(this);
	 	    image.add(b2);
	 	    
	 	    b3 = new JButton("RS. 1000");
//	 	    btnfc.setFont(new Font("raleway",Font.BOLD,10));
	 	    b3.setBounds(360,270,130,30);
	 	    b3.setForeground(Color.white);
	 	    b3.setBackground(new Color(65,125,128));
	 	    b3.addActionListener(this);
	 	    image.add(b3);
	 	    
	 	    b4 = new JButton("RS. 2000");
//	 	    btnms.setFont(new Font("raleway",Font.BOLD,10));
	 	    b4.setBounds(590,270,150,30);
	 	    b4.setForeground(Color.white);
	 	    b4.setBackground(new Color(65,125,128));
	 	    b4.addActionListener(this);
	 	    image.add(b4);
	 	    
	 	    b5 = new JButton("RS. 5000");
//	 	    btnfc.setFont(new Font("raleway",Font.BOLD,10));
	 	    b5.setBounds(360,310,130,30);
	 	    b5.setForeground(Color.white);
	 	    b5.setBackground(new Color(65,125,128));
	 	    b5.addActionListener(this);
	 	    image.add(b5);
	 	    
	 	    b6 = new JButton("RS. 10000");
//	 	    btnbe.setFont(new Font("raleway",Font.BOLD,10));
	 	    b6.setBounds(590,310,150,30);
	 	    b6.setForeground(Color.white);
	 	    b6.setBackground(new Color(65,125,128));
	 	    b6.addActionListener(this);	
	 	    image.add(b6);
	 	
	 	    b7 = new JButton("BACK");
//	 	    btne.setFont(new Font("raleway",Font.BOLD,10));
	 	    b7.setBounds(590,350,150,30);
	 	    b7.setForeground(Color.white);
	 	    b7.setBackground(new Color(65,125,128));
	 	    b7.addActionListener(this);
	 	    image.add(b7);
	 		
	 		  
	 	   setLayout(null);
	 	   setSize(1750,1650);
	 	   setLocation(0,0);
//	 		setUndecorated(true);
	 	   setVisible(true);
	 	
	    	 
	    	 
	     }
//--------------------------------- constructer ends --------------------------------------	     
	     
//---------------------------------- event handling starts --------------------------------	     
	public void actionPerformed(ActionEvent e) {
	
		try {
			
			Data1 d = new Data1();
			
			int balance = 0;
			
		if(e.getSource()==b7) {
			
          new Main_class(pin);
			
			setVisible(false);
			
		}
		else {
			
			String amount = ((JButton)e.getSource()).getText().substring(4);
			Date date = new Date();
			ResultSet resultset = d.statement.executeQuery("Select * from bank where pin ='"+pin+"';");
			
			while(resultset.next()) {
				
				if(resultset.getString("type").equals("Deposite")) {
					
				balance += Integer.parseInt(resultset.getString("amount")); 
				
				}
				else {
					
				balance -= Integer.parseInt(resultset.getString("amount"));
				
				}
			} 
			
			String num = "17";
			if(e.getSource()!= b7 && balance < Integer.parseInt(amount)){
				
				JOptionPane.showMessageDialog(null,"Insufficient Balance");
				return;
			}
			
			d.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"');");
			JOptionPane.showMessageDialog(null, "Your Account is Debited by "+""+amount);
			new Main_class(pin);
			setVisible(false);
			
		}		
			
		}catch(Exception E) {
			
			E.printStackTrace();
		}
		
		
//			
	}
//---------------------------------- event handling ends -----------------------------------
	
//---------------------------------- main function starts ----------------------------------	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new Fastcash("");
	}
//---------------------------------- main function ends ---------------------------------------

}
