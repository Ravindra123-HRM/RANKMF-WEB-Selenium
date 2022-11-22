package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {


	  static Connection con=null; ;
		
	 static String url ="jdbc:mysql://192.168.5.73:3306/"; 
  static String username ="samcoadmin";
	 static String password = "SamcoDBAdmin";
		 
	//String query = "Select id from sm_user_account where email='testyui@samco.in'";

	public static  void Connectsql(String db) {
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

	public static  String GetData(String query ) {
		String data = null ;
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

	public static  String GetData1(String query ) {
		String data = null ;
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
	 
	  Connectsql("mutual_fund_partners"); 
	  
	 GetData("SELECT otp FROM mf_otp WHERE client_id = 'DP17682' ORDER BY id DESC"); 
	// GetData1("SELECT otp FROM mf_otp WHERE client_id = '111874435' ORDER BY id DESC"); 
	 
	 
	  }

	public static String GetData111(String query) {
		// TODO Auto-generated method stub
		return null;
	}
	  
	  
 
}
	