package Logins;
import java.util.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

// ----------------------------------- class  deposite starts --------------------------------------------------
public class Deposite extends JFrame implements ActionListener{
        
	   // globally declared variable
	   String pin;
	   JTextField text1;
	   JButton b1,b2;
	   // globally declared variables end
	  
//   -------------------------------- constructer starts-------------------------------------------	   
	   Deposite(String pin){
		   
		   this.pin = pin;
		   
		   // bank image
		   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/atm2.png"));
		   Image i2 = i1.getImage().getScaledInstance(1350, 700, Image.SCALE_DEFAULT);
		   ImageIcon i3 = new  ImageIcon(i2);
		   JLabel image1 = new JLabel(i3);
		   image1.setBounds(100,50,1350,700);
		   add(image1);
		   
		   
		   // label for deposite
		   JLabel l1 = new JLabel("Enter Amount You Want To Deposite.");
		   l1.setBounds(370,150,360,30);
		   l1.setForeground(Color.white);
		   l1.setFont(new Font("System",Font.BOLD,20));
		   image1.add(l1);
		   
		   // text input for deposited amount
		   text1 = new JTextField();
		   text1.setBounds(410,190,250,30);
		   text1.setForeground(Color.white);
		   text1.setBackground(new Color(65,125,128));
		   text1.setFont(new Font("raleway",Font.BOLD,18));
		   image1.add(text1);
		   
		   // button deposit
		   b1 = new JButton("DEPOSIT");
		  // b1.setFont(new Font("raleway",Font.BOLD,10));
		   b1.setBounds(610,305,130,30);
		   b1.setForeground(Color.white);
		   b1.setBackground(new Color(65,125,128));
		   b1.addActionListener(this);
		   image1.add(b1);
		   
		   // button back
		   b2 = new JButton("BACK");
		   //b2.setFont(new Font("raleway",Font.BOLD,10));
		   b2.setBounds(610,345,130,30);
		   b2.setForeground(Color.white);
		   b2.setBackground(new Color(65,125,128));
		   b2.addActionListener(this);
		   image1.add(b2);
		   
		   
		   
		   // setting locaton and size of frame
		   setLayout(null);
		   setSize(1750,1650);
		   setLocation(0,0);
//			setUndecorated(true);
		   setVisible(true);
		   
		   
		   
	   }
//    ----------------------------------------- constructer ends ---------------------------------------	   
	   
//    ---------------------------------------- Event handling starts -----------------------------------	   
	   @Override
	   public void actionPerformed(ActionEvent e) {
		   
		   try {
			   String amount = text1.getText();
			   Date date = new Date();
			   
			   if(e.getSource()==b1) {
				   
				   if(text1.getText().equals("")) {
					   
					   JOptionPane.showMessageDialog(null,"Enter Deposite Amount ");
				   }
				   
				   else {
					   
					   Data1 c = new Data1();
					   c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposite','"+amount+"');");
					   JOptionPane.showMessageDialog(null, "Rs."+ amount + "is Deposited in your Account");
					   setVisible(false);
					   new Main_class(pin);
				   }
			   }
			   
			   else if(e.getSource()==b2) {
				   
				   setVisible(false);
				   new Main_class(pin);
			   }
		   }
		   catch(Exception E) {
			   E.printStackTrace();
		   }
	   }
//  ----------------------------------------- event handling ends -----------------------------------------
	   
	   
// ------------------------------------------ main function starts -----------------------------------------	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 //object for class deposite
                 new Deposite("");
	}
// ------------------------------------------- main function ends -------------------------------------------

}
// ------------------------------------------- end of class deposite ----------------------------------------
