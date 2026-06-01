package Logins;
import java.util.*;
import java.sql.ResultSet;
// import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

// ------------------------------------------------ class cashw starts -------------------------------------------------------
public class Cashw extends JFrame implements ActionListener{

// globally declared variables
	JTextField text1;
	JButton b1,b2;
	String pin;
// globally declared end
	
	
//   ------------------------- constructer starts ------------------------------
    Cashw(String pin)	{
    	
    	// imported pin 
    	this.pin=pin;
    	
    	// ATM image
    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/atm2.png")) ; 
		Image i2 = i1.getImage().getScaledInstance(1350, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(100,50,1350,700);
		add(image);
		
		 // label maximum amt
		 JLabel head = new JLabel("MAXIMUM WITHDRAWL IS RS.10,000");
		 head.setBounds(410,150,290,20);
		 head.setForeground(Color.white);
		 head.setFont(new Font("System",Font.BOLD,15));
		 image.add(head);
		 
		 // label for enter amt
		 JLabel l1 = new JLabel("PLEASE ENTER YOUR AMOUNT");
		 l1.setBounds(410,200,240,20);
		 l1.setForeground(Color.white);
		 l1.setFont(new Font("System",Font.BOLD,15));
		 image.add(l1);
		 
		   // text input amt
		   text1 = new JTextField();
		   text1.setBounds(410,230,290,20);
		   text1.setForeground(Color.white);
		   text1.setBackground(new Color(65,125,128));
		   text1.setFont(new Font("raleway",Font.BOLD,18));
		   image.add(text1);
		   
		   // btn for withdrawl
		   b1 = new JButton("WITHDRAW");
		   // b1.setFont(new Font("raleway",Font.BOLD,10));
		   b1.setBounds(610,305,130,30);
		   b1.setForeground(Color.white);
		   b1.setBackground(new Color(65,125,128));
		   b1.addActionListener(this);
		   image.add(b1);
			   
		   // button back
		   b2 = new JButton("BACK");
		   //b2.setFont(new Font("raleway",Font.BOLD,10));
		   b2.setBounds(610,345,130,30);
		   b2.setForeground(Color.white);
		   b2.setBackground(new Color(65,125,128));
		   b2.addActionListener(this);
		   image.add(b2);
    	
           // setting frame size and location 	
	       setLayout(null);
	  	   setSize(1750,1650);
	  	   setLocation(0,0);
	//     setUndecorated(true);
	  	   setVisible(true);
    }
    //  ------------------------------------ constructer ends ------------------------------------------
    
	// ------------------------------------- event handling starts----------------------------------------
    public void actionPerformed(ActionEvent e) {
    	
   	try {
    	 String withdraw = text1.getText();
    	 Date date = new Date();
    	 
    	 if(e.getSource()==b1) {
    		 
    		  if(text1.getText().equals("")) {
    			  
    			  JOptionPane.showMessageDialog(null,"Enter The Withdrawel Amount");
    		  }
    		  
    		  else {
    			   Data1 d = new Data1();
    			   ResultSet resultset = d.statement.executeQuery("select * from bank where pin = '"+pin+"'");
    			   int balance = 0;
    			   while(resultset.next()) {
    				   
    				   if(resultset.getString("type").equals("Deposite")) {
    					   
    					   balance += Integer.parseInt(resultset.getString("amount"));
    				   }
    				   else {
    					   
    					   balance -= Integer.parseInt(resultset.getString("amount"));
    				   }   
    			   }
    			   
    			   if(balance < Integer.parseInt(withdraw)) {
    				   
    				   JOptionPane.showMessageDialog(null,"Insufficent Balance");
    				   return;
    			   }
    			   
    			   d.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrwal','"+withdraw+"');");   			   
    			   JOptionPane.showMessageDialog(null,"Your Account Is Debited By "+ "" +withdraw);
    			   new Main_class(pin);
    			   setVisible(false);
    			  
    			  
    		  }
    		  
    	 }
    		  
    		  else if(e.getSource()==b2) {
    			  
    			  
   			      new Main_class(pin);
   			      setVisible(false);
    		  
    	 }
    	 
 	}catch(Exception E) {
    		E.printStackTrace();
    	}
    	 
    }
    // --------------------------------------- event handling ends-----------------------------------------------
    
 // ----------------------------------- main function starts ----------------------------------------------------
	public  static void main(String[]arg) {
		// object of class
		new Cashw("");
	}
// ----------------------------------------main function ends -----------------------------------------------------	
}
// --------------------------------------------- class cashw ends -----------------------------------------------------------------
