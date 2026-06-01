package Logins;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

// -----------------------------class signup2 starts--------------------------------------------------
public class Signup2 extends JFrame implements ActionListener{

//	globally declared variables
	
	String formno;
	JTextField textpan,textadhar;
	JRadioButton y1,n1,y2,n2;
    JButton nextbtn2,button4;
	JComboBox  comboreligion,combocategories,comboincome,comboeducation,combooccupation;
	
//	end of globally declared variabels
	
//      ----------------start of constructer-------------------	
	
	Signup2(String formno){
		
		// title of frame 
		super("Application Form");
		
		// bank image
		ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("image/bank.png"));
		Image im2 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon im3 = new ImageIcon(im2);
		JLabel image1 = new JLabel(im3);
		image1.setBounds(150,5,100,100);
		add(image1);
		
		this.formno = formno;
		
		// label of page2
		JLabel labelpage = new JLabel("Page 2 :-");
		labelpage.setBounds(290,40,180,30);
		labelpage.setFont(new Font("raleway",Font.BOLD,22));
		add(labelpage);
		
		// label of additional details
		JLabel labeladditiondetail = new JLabel("Additional Details");
		labeladditiondetail.setBounds(290,70,200,30);
		labeladditiondetail.setFont(new Font("raleway",Font.BOLD,22));
		add(labeladditiondetail);
		
		// label of religion
		JLabel labelreli = new JLabel("Religion:");
		labelreli.setBounds(100,130,180,30);
		labelreli.setFont(new Font("raleway",Font.BOLD,18));
		add(labelreli);
		
		// string to hold combobox/dropdown contain
		String religion[] = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
		
		// dropdown/combo box for relegions
		comboreligion = new JComboBox(religion);
		comboreligion.setBackground(new Color(252,208,76));
		comboreligion.setBounds(350,130,350,30);
		comboreligion.setFont(new Font("raleway",Font.BOLD,14));
		add(comboreligion);
		
		// label for categories
		JLabel labelcate = new JLabel("Categories:");
		labelcate.setBounds(100,180,180,30);
		labelcate.setFont(new Font("raleway",Font.BOLD,18));
		add(labelcate);
		
		// string for categories
		String categories[] = {"General","OBC","ST","SC","Other"};
		
		// dropdown/combo box for categories
		combocategories = new JComboBox(categories);
		combocategories.setBounds(350,180,350,30);
		combocategories.setFont(new Font("raleway",Font.BOLD,14));
		combocategories.setBackground(new Color(252,208,76));
		add(combocategories);
		
		//label for income
		JLabel jincome = new JLabel("Income:");
		jincome.setBounds(100,230,180,30);
		jincome.setFont(new Font("raleway",Font.BOLD,18));
		add(jincome);
		// string for income
		String income[] = {"None","Above 1,50,000","Above 2,50,000","5,00,000","Up To 10,00,000","Above 10,00,000"};
		
		// dropdown/combo box for income
		comboincome = new JComboBox(income);
		comboincome.setBounds(350,230,350,30);
		comboincome.setFont(new Font("raleway",Font.BOLD,14));
		comboincome.setBackground(new Color(252,208,76));
		add(comboincome);
		
		//label for education
		JLabel jedu = new JLabel("Educational:");
		jedu.setBounds(100,280,180,30);
		jedu.setFont(new Font("raleway",Font.BOLD,18));
		add(jedu);
		
		//string for education
		String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
		
		// dropdown/combo box for education
		comboeducation = new JComboBox(education);
		comboeducation.setBounds(350,280,350,30);
		comboeducation.setFont(new Font("raleway",Font.BOLD,14));
		comboeducation.setBackground(new Color(252,208,76));
		add(comboeducation);
		
		//label for occupation 
		JLabel joccu = new JLabel("Occupation:");
		joccu.setBounds(100,330,180,30);
		joccu.setFont(new Font("raleway",Font.BOLD,18));
		add(joccu);
		
		// string for occupation
		String occupation[] = {"Salaried","Self-Employeed","Business","Student","Retiered","Other"};
		
		// dropdown/combo box for occupation
		combooccupation = new JComboBox(occupation);
		combooccupation.setBounds(350,330,350,30);
		combooccupation.setFont(new Font("raleway",Font.BOLD,14));
		combooccupation.setBackground(new Color(252,208,76));
		add(combooccupation);
		
		//label for pan no
		JLabel jpan = new JLabel("PAN Number:");
		jpan.setBounds(100,380,180,30);
		jpan.setFont(new Font("raleway",Font.BOLD,18));
		add(jpan);
		
		// textfield for pan no
		textpan = new JTextField();
		textpan.setBounds(350,380,350,30);
		textpan.setFont(new Font("raleway",Font.BOLD,14));
		add(textpan);
		
		// label for adhar number
		JLabel jadhar = new JLabel("Aadhar Number:");
		jadhar.setBounds(100,430,180,30);
		jadhar.setFont(new Font("raleway",Font.BOLD,18));
		add(jadhar);
		
		// textfield for adhar number
		textadhar = new JTextField();
		textadhar.setBounds(350,430,350,30);
		textadhar.setFont(new Font("raleway",Font.BOLD,14));
		add(textadhar);
		
		//label for senior citizen 
		JLabel jsc = new JLabel("Senior Citizen:");
		jsc.setBounds(100,480,180,30);
		jsc.setFont(new Font("raleway",Font.BOLD,18));
		add(jsc);
		
		//radio btn for yes
		y1 = new JRadioButton("Yes");
		y1.setBounds(350,480,100,20);
		y1.setBackground(new Color(252,208,76));
		y1.setFont(new Font("raleway",Font.BOLD,14));
		add(y1);
		
		// radio btn for no
		n1 = new JRadioButton("No");
		n1.setBounds(450,480,100,20);
		n1.setBackground(new Color(252,208,76));
		n1.setFont(new Font("raleway",Font.BOLD,14));
		add(n1);
		
		//grouping button so that only one option should be selected
		ButtonGroup b4= new ButtonGroup();
		b4.add(y1);
		b4.add(n1);
		
		// label for existing account
		JLabel jea = new JLabel("Existing Account:");
		jea.setBounds(100,530,180,30);
		jea.setFont(new Font("raleway",Font.BOLD,18));
		add(jea);
		
		// radio btn for yes
		y2 = new JRadioButton("Yes");
		y2.setBounds(350,530,100,20);
		y2.setBackground(new Color(252,208,76));
		y2.setFont(new Font("raleway",Font.BOLD,14));
		add(y2);
		
		// radio btn for no
		n2 = new JRadioButton("No");
		n2.setBounds(450,530,100,20);
		n2.setBackground(new Color(252,208,76));
		n2.setFont(new Font("raleway",Font.BOLD,14));
		add(n2);
		
		// grouping btn
		ButtonGroup b3= new ButtonGroup();
		b3.add(y2);
		b3.add(n2);
		
		//next button 
		nextbtn2 = new JButton("Next");
		nextbtn2.setBounds(600,600,70,20);
		nextbtn2.setFont(new Font("raleway",Font.BOLD,10));
		nextbtn2.setForeground(Color.WHITE);
		nextbtn2.setBackground(Color.black);
		nextbtn2.addActionListener(this);
		add(nextbtn2);
		
		button4 = new JButton("EXIT");
		button4.setBounds(300,600,70,20);
		button4.setFont(new Font("Ariel",Font.BOLD,10));
		button4.setForeground(Color.white);
		button4.setBackground(Color.black);
		button4.addActionListener(this);
		add(button4);
		
		// label for form no
		JLabel labelform = new JLabel("Form no:" + formno);
		labelform.setBounds(600,20,100,30);
		labelform.setFont(new Font("raleway",Font.BOLD,14));
		add(labelform);
		
		// size,location, background-color,of frame
		setLayout(null);
		setSize(850,750);
		setLocation(340,10);
		setUndecorated(true);
		getContentPane().setBackground(new Color(252,208,76)); // sets bg color of frame
		setVisible(true);
		
	}
	
//        ----------------------end of constructer-------------------------	
	
//        --------------------events handeling starts-----------------------------	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==nextbtn2) {
	   // comboreligion,combocategories,comboincome,comboeducation,combooccupation;
		String rel = (String) comboreligion.getSelectedItem();
		String cate = (String) combocategories.getSelectedItem();
		String inc = (String) comboincome.getSelectedItem();
		String edu = (String) comboeducation.getSelectedItem();
		String occu = (String) combooccupation.getSelectedItem();
		String pan = textpan.getText();
		String adhar = textadhar.getText();
		String senior = "";
		
		if(y1.isSelected()) {
			senior = "Yes";
		}
		
		else if(n1.isSelected()) {
			senior = "no";
		}
		
		String exist = "";
		
		if(y2.isSelected()) {
			exist = "Yes";
		}
		
		else if(n2.isSelected()) {
			exist = "no";
		}
		
		try {
			if(textpan.getText().equals("") || textadhar.getText().equals("")) {
				
				JOptionPane.showMessageDialog(null,"Fill All The Panels");
			}
			
			else {
				
				Data1 q = new Data1();
				String h = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occu+"','"+pan+"','"+adhar+"','"+senior+"','"+exist+"');";
			    q.statement.executeUpdate(h);
			    new Signup3(formno);
			    setVisible(false);
			}
			
		}
		catch(Exception E) {
			
			E.printStackTrace();
		}
		}
		if(e.getSource()==button4) {
			System.exit(0);
		}
	}
	
//        --------------------end of events handeling-----------------------------	

//        ----------------------main function starts------------------------------
	public static void main(String[]arg) {
		
		new Signup2("");
	}
//        ----------------------end of main function------------------------------
	
}

 // ------------------------------- end of class -------------------------------------------------------

