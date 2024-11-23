package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Db_Connection {

    public Connection Con;
    public ResultSet Rst;
    public PreparedStatement Pstmt;

    public Db_Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String ConDb = "jdbc:mysql://localhost:3306/onlineexams";
            String ConUsername = "root";
            String ConPassword = "12345678";
            Con = DriverManager.getConnection(ConDb, ConUsername, ConPassword);
        } catch (Exception e) {
        }
    }
}
