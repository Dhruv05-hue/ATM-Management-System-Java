package Logins;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Data1 {

	// to make connection class connection will use
		Connection connection;
		
		// to make a sql statement Statement will use
		Statement statement;
		
		// public constructer starts
	    public Data1() {
	    	
	    	
	    	// making connection with database 
	    	try {
	    		// using drivemanager to getconnection with sql workbench  
	    		connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/logins","root","31205");
	    		
	    		// converting the stored string in connection to sql query by statement and create statement
	    	    statement = connection.createStatement();
	    	   
	    	}catch(Exception e){
	    		      e.printStackTrace();
	    	}
	    
}
	   
}

