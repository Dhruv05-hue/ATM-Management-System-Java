package Logins;
import javax.swing.*;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;


// ---------------------------------class signup3 starts--------------------------
public class Signup3 extends JFrame implements ActionListener{

	     // globally declared variables
	     JRadioButton b1,b2,b3,b4;
	     Checkbox c1,c2,c3,c4,c5,c6,c7;
	     JButton bc,bs;
	     String formno;
//	   ------------------------------  constructr starts --------------------------------------
	     Signup3(String formno){
	    	 
	    	 // title for panel
	    	 super("Application Form 2");
	    	 
	    	 this.formno = formno;
	    	// bank image
    	    ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("image/bank.png"));
	 		Image im2 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	 		ImageIcon im3 = new ImageIcon(im2);
	 		JLabel image1 = new JLabel(im3);
	 		image1.setBounds(150,5,100,100);
	 		add(image1);
	 		
	 		// label for form no
	 		JLabel f1 = new JLabel("Form no:" + formno);
	 		f1.setBounds(695,2,100,100);
	 		f1.setFont(new Font("raleway",Font.BOLD,15));
	 		add(f1);
	 		
	 		//label for page3
	 		JLabel p3 = new JLabel("Page 3:");
	 		p3.setBounds(295,10,100,100);
	 		p3.setFont(new Font("raleway",Font.BOLD,22));
	 		add(p3);
	 		
	 		//label for account details
	 		JLabel ad = new JLabel("Account Details");
	 		ad.setBounds(295,40,200,100);
	 		ad.setFont(new Font("raleway",Font.BOLD,22));
	 		add(ad);
	 		
	 		// label for account type
	 		JLabel acctype = new JLabel("Account Type:");
	 		acctype.setBounds(100,130,200,30);
	 		acctype.setFont(new Font("raleway",Font.BOLD,18));
	 		add(acctype);
	 		
	 		//radiobtn for saving account
	 		b1 = new JRadioButton("Saving Account");
	 		b1.setBounds(110,170,150,30);
	 		b1.setFont(new Font("raleway",Font.BOLD,15));
	 		b1.setBackground(new Color(215,252,252));
	 		add(b1);
	 		
	 		//radiobtn for fixed deposite acccount
	 		b2 = new JRadioButton("Fixed Deposit Account");
	 		b2.setBounds(390,170,210,30);
	 		b2.setFont(new Font("raleway",Font.BOLD,15));
	 		b2.setBackground(new Color(215,252,252));
	 		add(b2);
	 		
	 		//radiobtn for current account
	 		b3 = new JRadioButton("Current Account");
	 		b3.setBounds(110,210,210,30);
	 		b3.setFont(new Font("raleway",Font.BOLD,15));
	 		b3.setBackground(new Color(215,252,252));
	 		add(b3);
	 		
	 		//radiobtn for reccuring deposite account
	 		b4 = new JRadioButton("Recuuring Deposit Account");
	 		b4.setBounds(390,210,250,30);
	 		b4.setFont(new Font("raleway",Font.BOLD,15));
	 		b4.setBackground(new Color(215,252,252));
	 		add(b4);
	 		
	 		// grouping btns
	 		ButtonGroup b7 = new ButtonGroup();
	 		b7.add(b1);
	 		b7.add(b2);
	 		b7.add(b3);
	 		b7.add(b4);
	 		
	 		// label for card number
	 		JLabel lcard = new JLabel("Card Number:");
	 		lcard.setBounds(110,290,270,30);
	 		lcard.setFont(new Font("raleway",Font.BOLD,15));
	 		//lcard.setBackground(new Color(252,208,76));
	 		add(lcard);
	 		
	 		// label for card No
	 		JLabel lcardno = new JLabel("XXXX-XXXX-XXXX-4574");
	 		lcardno.setBounds(390,290,350,30);
	 		lcardno.setFont(new Font("raleway",Font.BOLD,15));
	 		//lcardno.setBackground(new Color(252,208,76));
	 		add(lcardno);
	 		
	 		// label for discription 1
	 		JLabel lcardyn = new JLabel("(Your 16-digit Card Number:)");
	 		lcardyn.setBounds(110,310,270,30);
	 		lcardyn.setFont(new Font("raleway",Font.BOLD,8));
//	 		lcardyn.setBackground(new Color(252,208,76));
	 		add(lcardyn);
	 		
	 		// label for discription 2
	 		JLabel lcardap = new JLabel("(it would appear on atm card/cheque Book and Statement)");
	 		lcardap.setBounds(390,310,350,30);
	 		lcardap.setFont(new Font("raleway",Font.BOLD,8));
	 		//lcard.setBackground(new Color(252,208,76));
	 		add(lcardap);
	 		
	 		// label for PIN
	 		JLabel lpin = new JLabel("PIN:");
	 		lpin.setBounds(110,350,270,30);
	 		lpin.setFont(new Font("raleway",Font.BOLD,15));
	 		add(lpin);
	 		
	 		// label for 4 digit PIN
	 		JLabel lpi = new JLabel("XXXX");
	 		lpi.setBounds(390,350,270,30);
	 		lpi.setFont(new Font("raleway",Font.BOLD,15));
	 		add(lpi);
	 		
	 		// label for discription 3
	 		JLabel lpiny = new JLabel("(4-digit Password)");
	 		lpiny.setBounds(110,370,270,30);
	 		lpiny.setFont(new Font("raleway",Font.BOLD,8));
	 		add(lpiny);
	 		
	 		// label for service required
	 		JLabel ls = new JLabel("Service Required:");
	 		ls.setBounds(110,420,270,30);
	 		ls.setFont(new Font("raleway",Font.BOLD,15));
	 		add(ls);
	 		
	 		// checkbox for ATM Card
	 		c1 = new Checkbox("ATM Card");
	 		c1.setBounds(115,460,100,20);
	 		c1.setFont(new Font("raleway",Font.BOLD,13));
	 		add(c1);
	 		
	 	    // checkbox for internet banking
	 		c2 = new Checkbox("Internet Banking");
	 		c2.setBounds(405,460,150,20);
	 		c2.setFont(new Font("raleway",Font.BOLD,13));
	 		add(c2);
	 		
	 	    // checkbox for mobile banking
	 		c3 = new Checkbox("Mobile Banking");
	 		c3.setBounds(115,490,150,20);
	 		c3.setFont(new Font("raleway",Font.BOLD,13));
	 		add(c3);
	 		
	 	    // checkbox for email alerts
	 		c4 = new Checkbox("Email Alerts");
	 		c4.setBounds(405,490,100,20);
	 		c4.setFont(new Font("raleway",Font.BOLD,13));
	 		add(c4);
	 		
	 	    // checkbox for cheque book
	 		c5 = new Checkbox("Cheque Book");
	 		c5.setBounds(115,520,100,20);
	 		c5.setFont(new Font("raleway",Font.BOLD,13));
	 		add(c5);
	 		
	 	    // checkbox for e-statements
	 		c6= new Checkbox("E-Statement");
	 		c6.setBounds(405,520,100,20);
	 		c6.setFont(new Font("raleway",Font.BOLD,13));
	 		add(c6);
	 		
	 		// checkbox for accepting terms
	 		c7= new Checkbox("i here by declaring that all above details are as per my knowledge");
	 		c7.setBounds(115,560,400,20);
	 		c7.setFont(new Font("raleway",Font.BOLD,8));
	 		add(c7);
	 		
	 		// button for submit
	 		bs = new JButton("Submit");
	 		bs.setBounds(235,630,100,20);
	 		bs.setForeground(Color.white);
	 		bs.setBackground(Color.black);
	 		bs.setFont(new Font("raleway",Font.BOLD,15));
	 		bs.addActionListener(this);
	 		add(bs);
	 		
            //button for cancel
	 		bc = new JButton("Cancel");
	 		bc.setBounds(375,630,100,20);
	 		bc.setForeground(Color.white);
	 		bc.setBackground(Color.black);
	 		bc.addActionListener(this);
	 		bc.setFont(new Font("raleway",Font.BOLD,15));
	 		add(bc);
	 		
	 		
	 		
	 		
	 	  // frame size,location,bg color,layout	
	      setLayout(null);	 
	      setSize(850,750);
	      setLocation(340,0);
		  setUndecorated(true);
	      getContentPane().setBackground(new Color (215,252,252));
	      setVisible(true);
	      
	}
//	     ----------------------------constructer ends--------------------------------
	     
	     
//	     ----------------------------event management starts-------------------------
	     
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String accttype = "";
		
		if(b1.isSelected()) {
			accttype="Saving Account";
		}
		else if(b2.isSelected()) {
			accttype="Fixed Deposit Account";
		}
		else if(b3.isSelected()) {
			accttype="Current Account";
		}
		else if(b4.isSelected()) {
			accttype="Reccuring Deposit Account";
		}
		
		Random ran = new Random();
		long first7 =(ran.nextLong() % 90000000L) + 1409963000000000L;
		String cardno = "" + Math.abs(first7);
		
		long first3 = (ran.nextLong() % 9000L) + 1000L;
		String pin = "" + Math.abs(first3);
		
		String fac = "";
		
		if(c1.getState()) {
			fac += "ATM Card";
		}
		
		else if(c2.getState()) {
			fac +="Internet Banking";
		}
		
		else if(c3.getState()) {
			fac +="Mobile Banking";
		}
		
		else if(c4.getState()) {
			fac +="EMAIL Alerts";
		}
		
		else if(c5.getState()) {
			fac +="Cheque Book";
		}
		
		else if(c6.getState()) {
			fac +="E-Statement";
		}
		
		try {
			
			if(e.getSource()==bs) {
				
				if(accttype.equals("")) {
				
					JOptionPane.showMessageDialog(null,"chhose one a/c type");
				}
				
				else {
					
					Data1 d = new Data1();
					String q = "insert into signupthree values('"+formno+"','"+accttype+"','"+cardno+"','"+pin+"','"+fac+"')";
					String l = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
					d.statement.executeUpdate(q);
					d.statement.executeUpdate(l);
					JOptionPane.showMessageDialog(null, "Card Number :"+cardno+" \n Pin : " + pin );
					new Deposite(pin);
					setVisible(false);
					
				}
			}
			
			else if(e.getSource()==bc) {
				
				System.exit(0);
			}
			
		}
		catch(Exception E) {
			
			E.printStackTrace();
		}
		
		}
	
		
		
		

	
//     ----------------------------event management ends-----------------------------
	
//	 ------------------------------ main function starts---------------------------------  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              new Signup3("");
	}
	
//	--------------------------------main function ends--------------------------------

}
// --------------------------------------------class signup3 ends------------------------------------------------------
