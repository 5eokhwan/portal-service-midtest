package kr.ac.jejunu.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

interface ConnectionMaker {
    Connection getConnection() throws ClassNotFoundException, SQLException;
}