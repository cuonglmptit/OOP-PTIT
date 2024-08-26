/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ThucHanh2_B20DCCN100 a = new ThucHanh2_B20DCCN100();
        Connection conn = a.getConnection();
        ResultSet rs = a.executeQuery(conn, "SELECT * FROM login;");
        while(rs.next()){
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
        }
    }
}
