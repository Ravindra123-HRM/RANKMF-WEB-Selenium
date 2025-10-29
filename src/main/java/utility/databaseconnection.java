package utility;
<<<<<<< HEAD
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;

public class databaseconnection {

    public static void main(String[] args) {

        // 🔧 Update these values for your setup
        String host = "192.168.5.100";
        int port = 3306;
        String database = "mutual_funds";
        String username = "ravindra.chavan@rankmf.com";
        String password = "aEwds38sDdw";
        String jdbcUrl = "jdbc:mysql://" + host + ":" + port + "/" + database +
                         "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

        System.out.println("🔍 Checking MySQL connection to " + host + ":" + port + " ...");

        // Step 1: Test if host is reachable
        if (!isHostReachable(host, port, 4000)) {
            System.out.println("❌ Host not reachable or port blocked. Check network or firewall.");
            return;
        }

        // Step 2: Try MySQL JDBC connection
        try {
            System.out.println("⏳ Attempting to connect to database...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("✅ Successfully connected to MySQL database!");
            con.close();
        } catch (com.mysql.cj.jdbc.exceptions.CommunicationsException e) {
            System.out.println("❌ Communication failure: MySQL server not responding.");
            System.out.println("   Possible causes: wrong host, port closed, or MySQL not started.");
        } catch ( Exception e) {
            System.out.println("❌ Authentication or configuration issue: " + e.getMessage());
        }
    }

    // Utility to check if host + port are reachable
    private static boolean isHostReachable(String host, int port, int timeoutMs) {
        try (Socket socket = new Socket()) {
            SocketAddress socketAddress = new InetSocketAddress(host, port);
            socket.connect(socketAddress, timeoutMs);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
=======

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class databaseconnection {
    public static void main(String[] args) throws ClassNotFoundException {
      /*  String url = "jdbc:mysql://10.10.90.115:3306/mutual_funds";
        String user = "samco_user";
        String password = "samco123456";
        
        try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	System.out.println("Driver Loaded");
        	String connectionURL="jdbc:mysql://10.10.90.115:3306;user=samco_user;password=samco123456;database=mutual_funds";
        	Connection con=DriverManager.getConnection(connectionURL);
        	Statement sat=con.createStatement();
        	 ResultSet rs = sat.executeQuery("SELECT otp FROM mf_otp WHERE client_id = 'RR34434' ORDER BY id DESC");
        	System.out.println("Sql server connected");
        	while(rs.next())
        	{
        		 String otp = rs.getString("mf_otp");
        	}
        } catch (SQLException e) {
            System.out.println("Failed to close connection.");
            e.printStackTrace();
        }
    }*/
    try{  
    	Class.forName("com.mysql.cj.jdbc.Driver");  
    	Connection con=DriverManager.getConnection(  
    	"jdbc:mysql://10.10.90.115:3306/mutual_funds","samco_user","samco123456");  
    	//here sonoo is database name, root is username and password  
    	Statement stmt=con.createStatement();  
    	ResultSet rs=stmt.executeQuery("SELECT otp FROM mf_otp WHERE client_id = 'RR34434' ORDER BY id DESC");  
    	while(rs.next())  
    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    	con.close();  
    	}catch(Exception e){ System.out.println(e);}  
    	}  
    	}  

    


/*public class databaseconnection {

	static Connection con =null;
	
	 static String url ="jdbc:mysql://192.168.5.73:3306/"; 
	 static String username ="samco_user";
	 static String password = "samco123456";
	 
//String query = "Select id from sm_user_account where email='testyui@samco.in'";

public static void Connectsql(String db) {
	try {
		//Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Establish the connection
		//con = DriverManager.getConnection(Constant.dburl+db,Constant.dbusername,Constant.dbPassword);
		con= DriverManager.getConnection(url+db,username,password);
	}
	catch(Exception ex) {
		System.out.println(ex);
	}

}

public static String GetData(String query ) {
	String data = null;
	try
	{
		//Class.forName("com.mysql.jdbc.Driver");

		// Created the statement
		Statement st = con.createStatement();

		// Execute statement
		ResultSet rs = st.executeQuery(query);

		rs.next();

		//data = String.valueOf(rs.getString(1));

		data = rs.getString(1);

		System.out.println(data);

		//Close statement
		st.close();

		//Close Connection
		con.close();

	}
	catch(Exception ex) {
		System.out.println("Something Went Wrong");
		System.out.println(ex);
	}

	return data;
}


public static void main(String[] args) { 
Connectsql("mutual_funds"); 
GetData("SELECT otp FROM mf_otp WHERE `client_id` = 'RR34434' ORDER BY id DESC");
}*/


	
	
	
	

//	  static Connection con=null; ;
//		
//	 static String url ="jdbc:mysql://192.168.5.73:3306/"; 
//  static String username ="samcoadmin";
//	 static String password = "SamcoDBAdmin";
//		 
//	//String query = "Select id from sm_user_account where email='testyui@samco.in'";
//
//	public static  void Connectsql(String db) {
//		try {
//			//Load Driver
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			//Establish the connection
//			//con = DriverManager.getConnection(Constant.dburl+db,Constant.dbusername,Constant.dbPassword);
//			 con= DriverManager.getConnection(url+db,username,password);
//		}
//		catch(Exception ex) {
//			
//		}
//
//	}
//
//	public static  String GetData(String query ) {
//		String data = null ;
//		try
//		{
//			//Class.forName("com.mysql.jdbc.Driver");
//
//			// Created the statement
//			Statement st = con.createStatement();
//
//			// Execute statement
//			ResultSet rs = st.executeQuery(query);
//
//			rs.next();
//
//			//data = String.valueOf(rs.getString(1));
//
//			data = rs.getString(1);
//
//			System.out.println(data);
//
//			//Close statement
//			//st.close();
//
//			//Close Connection
//			//con.close();
//
//		}
//		catch(Exception ex) {
//			System.out.println("Something Went Wrong");
//			
//		}
//
//		return data;
//
//	}
//
//		
//	
//
//	
//	
//
//	  public static void main(String[] args) { 
//	 
//	  Connectsql("mutual_funds"); 
//	  
//	 GetData("SELECT otp FROM mf_otp WHERE client_id = 'DP17682' ORDER BY id DESC"); 
//	 
//	 //GetData1("SELECT otp FROM mf_otp WHERE client_id = 'RR34434' ORDER BY id DESC"); 
//	 //GetData2("SELECT `folio_number` FROM `mf_amc_investor_order` WHERE `folio_number` != '' AND `client_id` = 'dp17682' ORDER BY `id` DESC"); 
//	 
//	 
//	 
//	  }
//
//	
//
//	public static String GetData111(String query) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	  
//	  
// 

	
>>>>>>> ee410d6c12b415293c21901c1d29a1db63f6a0d6
