package Logins;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.ResultSet;

// -------------------------------- class log starts --------------------------------------------------
public class Log extends JFrame implements ActionListener {
	
	// globally declared variables
	
	JLabel label1,label2,label3; // used to show text on frame
	
	JTextField textField2;  
	JPasswordField passwordField3;// for adding text input
	
	 // for adding password input
	
	JButton button1,button2,button3,button4; // to make a button on frame
	
	// end of globally declared varible
	
	// start of constructor
	
	Log(){
		
//		use to add title to the frame
		super("Bank Management System");
		
		
//		--------creating the bank image at top----------
		

		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("image/bank.png")); // its use image as a source
		
		Image i2= i1.getImage() .getScaledInstance(100, 100, Image.SCALE_DEFAULT);  //	image represent graphical representation of image
		
		ImageIcon i3= new ImageIcon(i2);
		
		JLabel image = new JLabel(i3); //	jlabel is used to display image on frame
		
		image.setBounds(350, 10, 100, 100); //	its use to set the x, y position and width and height
		
		add(image); // this will finally add the image to frame
		
		
//		--------creating the bank image at top ends----------

		
				
//		------------ creating 2nd hand image------------------
		
		ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("image/card.png"));
		Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
		ImageIcon ii3 = new ImageIcon(ii2);
		JLabel iimage = new JLabel(ii3);
		iimage.setBounds(630,350,100,100);
		add(iimage);
		
//		----------- creating image 2 ends ----------------
		
		
		
//		-----------Adding the first page text and font on frame1----------
		
//		label 1 welcome to atm
		label1 = new JLabel("WELCOME TO THE ATM"); // JLabel is also used to write text on jframe
		label1.setForeground(Color.white);// use to add text color
		label1.setFont(new Font("AvantGarde", Font.BOLD, 38)); // use to add font-family,bold,weight
		label1.setBounds(170,125,450,40);
		add(label1);
		
//		label for code no
		label2 = new JLabel("Code No:");
		label2.setForeground(Color.white);
		label2.setFont(new Font("railway",Font.BOLD,20));
		label2.setBounds(150,190,375,30);
		add(label2);
		
		// textfield for code no
		textField2 = new JTextField();
		textField2.setBounds(290,190,230,30);
		textField2.setFont(new Font("Arial",Font.BOLD,14));
		add(textField2);
		
//		label for pin
		label3 = new JLabel("PIN:");
		label3.setFont(new Font("railway",Font.BOLD,20));
		label3.setForeground(Color.white);
		label3.setBounds(150,240,375,30);
		add(label3);
		
		// textfield for password 
		passwordField3 = new JPasswordField();
		passwordField3.setBounds(290,240,230,30);
		passwordField3.setFont(new Font("Ariel",Font.BOLD,14));
		add(passwordField3);
		
//		-----------Adding the first page text and font on frame1 ends----------
		
		
		
//      -------------- adding button on frame -----------------------
		
		
//		adding button log in
		
		button1 = new JButton("Log In");
		button1.setBounds(290,300,100,30);
		button1.setForeground(Color.white);
		button1.setBackground(Color.BLACK);
		button1.setFont(new Font("Ariel",Font.BOLD,15));
		button1.addActionListener(this);
		add(button1);
		
//		end of button log in
		
//		adding button clear
		
		button2 = new JButton("Clear");
		button2.setBounds(410,300,100,30);
		button2.setForeground(Color.white);
		button2.setBackground(Color.black);
		button2.setFont(new Font("Ariel",Font.BOLD,15));
		button2.addActionListener(this);
		add(button2);
		
//		end of adding button clear 
		
//		adding sign up button
		
		button3 = new JButton("Sign Up");
		button3.setBounds(350,350,100,30);
		button3.setForeground(Color.white);
		button3.setBackground(Color.black);
		button3.setFont(new Font("Ariel",Font.BOLD,15));
		button3.addActionListener(this);
		add(button3);
		
		button4 = new JButton("EXIT");
		button4.setBounds(365,420,70,20);
		button4.setFont(new Font("Ariel",Font.BOLD,15));
		button4.setForeground(Color.white);
		button4.setBackground(Color.black);
		button4.addActionListener(this);
		add(button4);
//		end of adding sign up  button 
		
//		-----------------end of adding button to the frame-------------
		
		
		
//		----------------setting background for the frame------------
		
		ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("image/backbg.png"));
		Image iii2 = iii1.getImage().getScaledInstance(850, 480,Image.SCALE_DEFAULT);
		ImageIcon iii3 = new ImageIcon(iii2);
		JLabel iiimage = new JLabel(iii3);
		iiimage.setBounds(0,0,850,480);
		add(iiimage);
		
//		----------------setting background for the frame ends------------
		
		
//		------setting the frame width and location and its visibility to true------
		
		setLayout(null);
		setSize( 850 ,  480);
		setLocation(370,150);
		setUndecorated(true);
		setVisible(true);//	allways put setvisible at last
		
//		------setting the frame width and location ands its visibility to true ends------
		
		
	}
	
//	----------------- overriding actionevent to store the element on which action is performeed by the help od adding .addActionListner in button
	
	@Override
	 public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) { // checks wheather the presed button is button1
			
			
			if(textField2.getText().equals("") || passwordField3.getText().equals("")) {
				
				JOptionPane.showMessageDialog(null, "fill the empty pannel");
				return;
			}
			Data1 d = new Data1();
			
			String cardno = textField2.getText();
			String pin = passwordField3.getText();
			
			String q = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"';";
			try {
				ResultSet resultset = d.statement.executeQuery(q);
				
				if(resultset.next()) {
				setVisible(false);
				new Main_class(pin);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card No or Pin");
				}

			} catch (SQLException e1) {
				//TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			}
		else if(e.getSource() == button2) { // checks weather the pressed button is button 2
			
			textField2.setText("");
			
			passwordField3.setText("");
		}
		else if(e.getSource() == button3) { //checks weather the pressed button is button 3 
			
			new Sign();
			setVisible(false);
		}
		
		else if(e.getSource()==button4) {
			
			System.exit(0);
		}
		
	}
	
//	-------------------------------------end of event management-----------------------------------
	
   
// -------------------------main function starts-------------------------------------
	public static void main(String[] arg) {
		
		new Log();
	}
// -------------------------main function ends---------------------------------------
}
// ----------------------------------------class log ends ----------------------------------------------------------------------------
