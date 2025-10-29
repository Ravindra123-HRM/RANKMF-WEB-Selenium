package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {

    static Connection con = null;

    // Database credentials
    static String username = "ravindra.chavan@rankmf.com";
    static String password = "aEwds38sDdw";
    static String host = "192.168.5.100";
    static String port = "3306";
    static String dbName = "mutual_funds"; // Change if needed

    // Establish connection
    public static void Connectsql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Full JDBC URL
            String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName
                    + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

            con = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connection successful to database: " + dbName);
        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed. Please check host, credentials, or firewall.");
            e.printStackTrace();
        }
    }

    // Get data from query
    public static String GetData(String query) {
        String data = null;
        try {
            if (con == null || con.isClosed()) {
                System.out.println("⚠️ No connection established. Connecting now...");
                Connectsql(); // automatically reconnect if needed
            }

            try (Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(query)) {

                if (rs.next()) {
                    data = rs.getString(1);
                    System.out.println("✅ Result: " + data);
                } else {
                    System.out.println("ℹ️ No data found for query.");
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Query execution failed.");
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                    System.out.println("🔒 Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("⚠️ Failed to close connection.");
                e.printStackTrace();
            }
        }
        return data;
    }

    // Test the connection
    public static void main(String[] args) {
        Connectsql();
        GetData("SELECT otp FROM mf_otp WHERE client_id = 'RR34434' ORDER BY id DESC LIMIT 1");
    }
}
