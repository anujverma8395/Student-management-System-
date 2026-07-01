 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Method to get connection
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db", "root", "root"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Main method to test the connection
    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Connection Successful to student_db!");
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Failed to close connection.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to connect to student_db.");
        }
    }
}

