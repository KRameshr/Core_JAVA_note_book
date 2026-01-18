import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        Connection conn = LibUtil.getConnection();
        if (conn != null) {
            System.out.println("Connected to SQL Server successfully!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}
