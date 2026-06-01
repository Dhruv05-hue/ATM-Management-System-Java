package Logins;

import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

	public class Main_class extends JFrame implements ActionListener{

		JButton btnde,btncw,btnfc,btnms,btnpin,btnbe,btne;
		String pin;
		
		
		  Main_class(String pin){
			  
			  this.pin=pin;
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/atm2.png")); 
			Image i2 = i1.getImage().getScaledInstance(1350, 700, Image.SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel image = new JLabel(i3);
			image.setBounds(100,50,1350,700);
			add(image);
			
			
			JLabel l1 = new JLabel("Please Select Your Transaction");
			l1.setBounds(400,150,350,30);
			l1.setFont(new Font("ralwey",Font.BOLD,20));
			l1.setForeground(Color.white);
			image.add(l1);
			
			btnde = new JButton("DEPOSIT");
//		    btnde.setFont(new Font("raleway",Font.BOLD,10));
		    btnde.setBounds(360,230,130,30);
		    btnde.setForeground(Color.white);
		    btnde.setBackground(new Color(65,125,128));
		    btnde.addActionListener(this);
		    image.add(btnde);
		    
		    btncw = new JButton("CASH WITHDRAWL");
//		    btncw.setFont(new Font("raleway",Font.BOLD,10));
		    btncw.setBounds(590,230,150,30);
		    btncw.setForeground(Color.white);
		    btncw.setBackground(new Color(65,125,128));
		    btncw.addActionListener(this);
		    image.add(btncw);
		    
		    btnfc = new JButton("FAST CASH");
//		    btnfc.setFont(new Font("raleway",Font.BOLD,10));
		    btnfc.setBounds(360,270,130,30);
		    btnfc.setForeground(Color.white);
		    btnfc.setBackground(new Color(65,125,128));
		    btnfc.addActionListener(this);
		    image.add(btnfc);
		    
		    btnms = new JButton("MINI STATEMENT");
//		    btnms.setFont(new Font("raleway",Font.BOLD,10));
		    btnms.setBounds(590,270,150,30);
		    btnms.setForeground(Color.white);
		    btnms.setBackground(new Color(65,125,128));
		    btnms.addActionListener(this);
		    image.add(btnms);
		    
		    btnpin = new JButton("PIN CHANGE");
//		    btnfc.setFont(new Font("raleway",Font.BOLD,10));
		    btnpin.setBounds(360,310,130,30);
		    btnpin.setForeground(Color.white);
		    btnpin.setBackground(new Color(65,125,128));
		    btnpin.addActionListener(this);
		    image.add(btnpin);
		    
		    btnbe = new JButton("BALANCE ENQURY");
//		    btnbe.setFont(new Font("raleway",Font.BOLD,10));
		    btnbe.setBounds(590,310,150,30);
		    btnbe.setForeground(Color.white);
		    btnbe.setBackground(new Color(65,125,128));
		    btnbe.addActionListener(this);	
		    image.add(btnbe);
		    
		    btne = new JButton("EXIT");
//		    btne.setFont(new Font("raleway",Font.BOLD,10));
		    btne.setBounds(590,350,150,30);
		    btne.setForeground(Color.white);
		    btne.setBackground(new Color(65,125,128));
		    btne.addActionListener(this);
		    image.add(btne);
		    
		    
			  
		   setLayout(null);
		   setSize(1750,1650);
		   setLocation(0,0);
//			setUndecorated(true);
		   setVisible(true);
		
		  }
		
		  @Override
		  public void actionPerformed(ActionEvent e) {
			  
			  if(e.getSource()==btnde) {
				  
				  new Deposite(pin);
				  setVisible(false);
			  }
			  
			  else if(e.getSource()==btnfc) {
				  
				  new Fastcash(pin);
				  setVisible(false);  
			  }
			  
			  else if(e.getSource()==btne) {
				  
				  System.exit(0);
			  }
			  
			  else if(e.getSource()==btncw) {
				  
				  new Cashw(pin);
				  
				  setVisible(false);
				  
			  }
			  
			  else if(e.getSource()==btnbe) {
				  
				  new Balanceq(pin);
				  setVisible(false);
			  }
			  
			  else if(e.getSource()==btnpin) {
				  
				  new Pin(pin);
				  setVisible(false);
			  }
			  
			  else if(e.getSource()==btnms) {
				  
				  new MiniStatement(pin);
				  
			  }
			  
              
			  
			 
			  
		  }
		  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        new Main_class("");
		}

	}


