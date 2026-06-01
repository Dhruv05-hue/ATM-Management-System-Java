package Logins;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class Sign extends JFrame implements ActionListener{
	
	// globally declared variables
	
	Random ran = new Random();
	
	long first4 = (ran.nextLong() % 9000l) +1000l; // creating random 4 digit form no
	
	String first = "" + Math.abs(first4); // storing form no in string variable
	
	JTextField textName,textFName,textdate,textemail,textadd,textcity,textpin,textstate;
	
	JRadioButton radiobutton1,radiobutton2,radiobutton3,radiobutton4,radiobutton5;
	
	JButton nextbtn,button4;
	
	JDateChooser datechooser;
	
	// globally declared variables end
	
//	          --------------------------constructor starts---------------------------------
	
	Sign(){
		
		// title for frame
		super("Sign UP Page");
		
//		--------------adding bank image--------------------
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image1 = new JLabel(i3);
		image1.setBounds(25,10,100,100);
		add(image1);
		
//		--------------end of adding bank image--------------
				
//		--------------labels and text------------------
		
		// label for application form no
		JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
		label1.setBounds(160,20,600,40);
		label1.setFont(new Font("raleway",Font.BOLD,38));
//		label1.setForeground(Color.white);
		add(label1);
		
		// label for application page 1
		JLabel label2 = new JLabel("Page 1");
		label2.setBounds(330,70,600,30);
		label2.setFont(new Font("raleway",Font.BOLD,22));				            
		add(label2);
		
		// label for application personal details
		JLabel label3 = new JLabel("Personal Details");
		label3.setBounds(290,90,600,30);
		label3.setFont(new Font("raleway",Font.BOLD,22));
		add(label3);
		
		// label for name
		JLabel label4 = new JLabel("Name:");
		label4.setBounds(130,150,100,30);
		label4.setFont(new Font("raleway",Font.BOLD,22));
		add(label4);
		
		// textfield for name
		textName = new JTextField();
		textName.setBounds(350,150,400,30);     					
		textName.setFont(new Font("Raleway",Font.BOLD,14));
		add(textName);
		
		// label for father name
		JLabel fName = new JLabel("Father Name:");
		fName.setBounds(130,200,180,30);
		fName.setFont(new Font("raleway",Font.BOLD,22));
		add(fName);
		
		// textfield for fathers name
		textFName = new JTextField();
		textFName.setBounds(350,200,400,30);
		textFName.setFont(new Font("Raleway",Font.BOLD,14));
		add(textFName);
		
		// label for date of birth
		JLabel DOB = new JLabel("Date Of Birth:");
		DOB.setBounds(130,250,180,30);
		DOB.setFont(new Font("Raleway",Font.BOLD,22));
		add(DOB);
		
		// datechooser to select date from calender by adding external library
		datechooser = new JDateChooser();
		datechooser.setBounds(350,250,400,30);
		datechooser.setFont(new Font("raleway",Font.BOLD,14));            
		add(datechooser);
		       
		// label for gender
		JLabel gender = new JLabel("Gender");
		gender.setBounds(130,300,180,30);  
		gender.setFont(new Font("raleway",Font.BOLD,22));
		add(gender);
		
		// radio button for male
		radiobutton1 = new JRadioButton("Male");
		radiobutton1.setFont(new Font("raleway",Font.BOLD,14));
		radiobutton1.setBounds(350,300,80,30); 
		radiobutton1.setBackground(new Color(222,255,228));
		add(radiobutton1);
		
		// radio button for female
		radiobutton2 = new JRadioButton("Female");
		radiobutton2.setBounds(460,300,80,30);
		radiobutton2.setFont(new Font("raleway",Font.BOLD,14));
		radiobutton2.setBackground(new Color(222,255,228));
		add(radiobutton2);
		
		// grouping btn
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup.add(radiobutton1);
		buttongroup.add(radiobutton2);
		
		// label for email
		JLabel email = new JLabel("Email Address:");
		email.setBounds(130,350,180,30);
		email.setFont(new Font("raleway",Font.BOLD,22));
		add(email);
		
		// textfield for email
		textemail = new JTextField();
		textemail.setBounds(350,350,400,30);
		textemail.setFont(new Font("raleway",Font.BOLD,14));
		add(textemail);
		
		// label for martial status
		JLabel labelms = new JLabel("Martial Status:");
		labelms.setBounds(130,400,180,30);
		labelms.setFont(new Font("raleway",Font.BOLD,22));
		add(labelms);
		
		// radio button for married
		radiobutton3 = new JRadioButton("Married");
		radiobutton3.setBounds(350,400,80,30);
		radiobutton3.setBackground(new Color(222,255,228));
		radiobutton3.setFont(new Font("raleway",Font.BOLD,14));
		add(radiobutton3);
		
		// radio button for unmarried
		radiobutton4 = new JRadioButton("Unmarried");
		radiobutton4.setBounds(460,400,130,30);
		radiobutton4.setBackground(new Color(222,255,228));
		radiobutton4.setFont(new Font("raleway",Font.BOLD,14));
		add(radiobutton4);
		
		// radio button for other
		radiobutton5 = new JRadioButton("Other");
		radiobutton5.setBounds(600,400,130,30);
		radiobutton5.setBackground(new Color(222,255,228));
		radiobutton5.setFont(new Font("raleway",Font.BOLD,14));
		add(radiobutton5);
		
		// group of button
		ButtonGroup b2 = new ButtonGroup();
		b2.add(radiobutton3);
		b2.add(radiobutton4);
		b2.add(radiobutton5);
		
//		textms = new JTextField();
//		textms.setBounds(350,400,400,30);
//		textms.setFont(new Font("raleway",Font.BOLD,14));
//		add(textms);
		
		// label for address
		JLabel labeladd = new JLabel("Address:");
	    labeladd.setBounds(130,450,180,30);
	    labeladd.setFont(new Font("raleway",Font.BOLD,22));
	    add(labeladd);
	    
	 // textfield for address
	    textadd = new JTextField();
	    textadd.setBounds(350,450,400,30);
	    textadd.setFont(new Font("raleway",Font.BOLD,14));
	    add(textadd);
	    
	 // label for city
	    JLabel labelcity = new JLabel("City:");
	    labelcity.setBounds(130,500,180,30);
	    labelcity.setFont(new Font("raleway",Font.BOLD,22));
	    add(labelcity);
	    
	    // textfield for city
	    textcity = new JTextField();
	    textcity.setBounds(350,500,400,30);
	    textcity.setFont(new Font("raleway",Font.BOLD,14));
	    add(textcity);
	    
	 // label for pin
	    JLabel labelpin = new JLabel("PIN:");
	    labelpin.setBounds(130,550,180,30);
	    labelpin.setFont(new Font("raleway",Font.BOLD,22));
	    add(labelpin);
	    
	 // textfield for pin
	    textpin = new JTextField();
	    textpin.setBounds(350,550,400,30);
	    textpin.setFont(new Font("raleway",Font.BOLD,14));
	    add(textpin);
	    
	 // label for state
	    JLabel labelst = new JLabel("State:");
	    labelst.setBounds(130,600,180,30);
	    labelst.setFont(new Font("raleway",Font.BOLD,22));
	    add(labelst);
	    
	 // textfield for state
	    textstate = new JTextField();
	    textstate.setBounds(350,600,400,30);
	    textstate.setFont(new Font("raleway",Font.BOLD,14));
	    add(textstate);
	    
//	    -------------end of creating label -------------
	    
//	    -------------creating next button---------------
		
	    nextbtn = new JButton("Next");
	    nextbtn.setBounds(630,700,70,20);
	    nextbtn.setForeground(Color.white);
	    nextbtn.setBackground(Color.black);
	    nextbtn.setFont(new Font("raleway",Font.BOLD,14));
	    nextbtn.addActionListener(this);
	    add(nextbtn);
	    
	    button4 = new JButton("EXIT");
		button4.setBounds(365,700,70,20);
		button4.setFont(new Font("Ariel",Font.BOLD,15));
		button4.setForeground(Color.white);
		button4.setBackground(Color.black);
		button4.addActionListener(this);
		add(button4);
	    
//	   --------------end of creating next button--------------
	    
//		--------------frame size management-------------
		
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(800,850);
		setLocation(340,10);
		setUndecorated(true);
		setVisible(true);
		
//		-------------end of frame size management-----------
		
	}
	
//	    ------------creating the override fuction where the result of event can be manage-----------
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == nextbtn) {
			
//------------when btn is clicked the entered value shoild be stored in strings to transfer to database
			String formno = first;
			String name = textName.getText();
			String fname = textFName.getText();
			String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
			String gender = null;
			
			if(radiobutton1.isSelected()) {
				gender = "Male";
			}
			else if(radiobutton2.isSelected()) {
				gender = "Female";
			}
			
			String email = textemail.getText();
			String martial = null;
			
			if(radiobutton3.isSelected()) {
			martial = "Married";
			}
			else if(radiobutton4.isSelected()) {
				martial = "Unmarried";
			}
			else if(radiobutton5.isSelected()) {
				martial = "Other";
			}
			
			String address = textadd.getText();
			String city = textcity.getText();
			String pin = textpin.getText();
			String state = textstate.getText();
			
			try {
				
//	----------if text field is empty the pop window should open to fill all----------
				
				if(textName.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Name is require");
				}
				else if(textFName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Father name require");
				}
				else if(textadd.getText().equals("")) {
				    JOptionPane.showMessageDialog(null,"Address is require");
				}
				else if(textcity.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"City is require");
				}
				else if(textpin.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Pin is require");
				}
				else if(textstate.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"State is require");
				}
				else if(textemail.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Email is require");
				}
				else {
					
//-------------when next button is clicked the database should be updated----------
					Data1 con1 = new Data1();
					String q = "insert into signup values('"+ formno +"','"+ name +"','"+ fname +"','"+ dob +"','"+ gender +"','"+ email +"','"+ martial +"','"+ address +"','"+ city +"','"+ pin +"','"+ state +"')";
					con1.statement.executeUpdate(q);
					new Signup2(formno);
					setVisible(false);
				}
			}catch(Exception E) {
				
				E.printStackTrace();
			}
		}
		if(e.getSource()==button4) {
			System.exit(0);
		}
		
	}
	
//	      ----------------end of events management--------------------

//        ----------------- start of main function--------------------	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		obj of constructor of class
		new Sign();

	}
//      -------------------- end of main function --------------------

}
//  --------------------------------------end of class sign---------------------------------------------