package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class DBconnect {
    public Connection DBconnect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien","root", "");
        return cnn;
    }
}
