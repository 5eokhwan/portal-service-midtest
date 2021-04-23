package kr.ac.jejunu.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JejuUserDao extends UserDao {

    @Override
    Connection getConnection() throws ClassNotFoundException, SQLException {
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/kakao_track?serverTimezone=UTC"
                    , "root", "sshh1013");
        }
    }
}
