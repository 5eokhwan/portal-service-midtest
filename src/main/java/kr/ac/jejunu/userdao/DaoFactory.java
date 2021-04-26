package kr.ac.jejunu.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
    public UserDao getUserDao() {
        return new UserDao(new JejuConnectionMaker());
    }

    public JejuConnectionMaker getConnectionMaker() {
        return new JejuConnectionMaker();
    }
}
