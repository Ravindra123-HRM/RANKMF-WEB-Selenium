package utility;
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
