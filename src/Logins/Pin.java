package Logins;

import java.util.*;
import java.sql.ResultSet;
// import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

// ----------------------------------------- class PIN starts ------------------------------------------
public class Pin extends JFrame implements ActionListener{
       // globally declared variable starts
	   JButton b1,b2;
	   JPasswordField p1,p2;
	   String pin;
	   // globally declared variables end
	   
// -------------------- constructer starts ------------------------	   
	Pin(String pin){
		// imported pin from main_class
		this.pin = pin;
		
		// ATM image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1350, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel img = new JLabel(i3);
		img.setBounds(0,0,1350,700);
		add(img);
		
		   // label for change your pin
		   JLabel l1 = new JLabel("CHANGE YOUR PIN");
		   l1.setBounds(370,150,360,30);
		   l1.setForeground(Color.white);
		   l1.setFont(new Font("System",Font.BOLD,18));
		   img.add(l1);
		   
		   // label for new pin
		   JLabel l2 = new JLabel("New PIN:");
		   l2.setBounds(370,190,180,30);
		   l2.setForeground(Color.white);
		   l2.setFont(new Font("System",Font.BOLD,15));
		   img.add(l2);
		   
		   // password field for new pin
		   p1 = new JPasswordField();
		   p1.setBackground(new Color(65,125,128));
		   p1.setForeground(Color.white);
		   p1.setBounds(530,195,150,20);
		   p1.setFont(new Font("raleway",Font.BOLD,22));
		   img.add(p1);
		   
		   // label for re-enter new password
		   JLabel l3 = new JLabel("Re-Enter New PIN:");
		   l3.setBounds(370,230,360,30);
		   l3.setForeground(Color.white);
		   l3.setFont(new Font("System",Font.BOLD,15));
		   img.add(l3);
		   
		   // password field for re-enter new pin
		   p2 = new JPasswordField();
		   p2.setBackground(new Color(65,125,128));
		   p2.setForeground(Color.white);
		   p2.setBounds(530,235,150,20);
		   p2.setFont(new Font("raleway",Font.BOLD,22));
		   img.add(p2);
		       
		       // btn for chage password
		       b1 = new JButton("CHANGE");
			  // b1.setFont(new Font("raleway",Font.BOLD,10));
			   b1.setBounds(610,305,130,30);
			   b1.setForeground(Color.white);
			   b1.setBackground(new Color(65,125,128));
			   b1.addActionListener(this);
			   img.add(b1);
			   
			   // button back
			   b2 = new JButton("BACK");
			   //b2.setFont(new Font("raleway",Font.BOLD,10));
			   b2.setBounds(610,345,130,30);
			   b2.setForeground(Color.white);
			   b2.setBackground(new Color(65,125,128));
			   b2.addActionListener(this);
			   img.add(b2);
		
		// location and size of frame
		setLayout(null);
 	   	setSize(1750,1650);
 	   	setLocation(0,0);
//	 	setUndecorated(true);
 	   	setVisible(true);
	}
// --------------------- constructer ends -----------------------------
	
// ---------------------- event handling starts ------------------------
	public void actionPerformed(ActionEvent e) {
		
		String pin1 = p1.getText();
		String pin2 = p2.getText();
		try {
			
			
			
			
			 if(e.getSource()==b1) {
				
				
				
				  if(p1.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null,"New PINfield is empty");
				}
				
				else if(p2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Re-Enter new Field is empty");
				}	
				  
				else if(!pin1.equals(pin2) ) {
						
						JOptionPane.showMessageDialog(null, "Password is not same ");
						
					}
				
				else if(pin2.equals(pin1)){
			
				Data1 d= new Data1();
				String q = "update bank set pin = '"+pin1+"' where pin = '"+pin+"' ";
				String q1 = "update login set pin = '"+pin1+"' where pin = '"+pin+"' ";
				String q2 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"' ";		
				d.statement.executeUpdate(q);
				d.statement.executeUpdate(q1);
				d.statement.executeUpdate(q2);
				JOptionPane.showMessageDialog(null, " Your PIN has changed");
				new Main_class("");
				setVisible(false);
				
				}
			}
				else if(e.getSource()==b2) {
					
					new Main_class("");
					setVisible(false);
				}
			
				
			
		}catch(Exception E) {
			
			E.printStackTrace();
		}
		
	}
// ------------------------ end of event handling ---------------------	

// ------------------------ main function starts ------------------------	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new Pin("");
	}
// --------------------- main function ends ------------------------------	

}
// ------------------------------------------- end of class PIN ---------------------------------------
