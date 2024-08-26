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
public class ThucHanh2_B20DCCN100 {

    public Connection getConnection() throws SQLException {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "Cuonglc123");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web", connectionProps);
        return conn;
    }

    public boolean executeUpdate(Connection conn, String command) throws SQLException {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(command); // This will throw a SQLException if it fails
            return true;
        } finally {

            // This will run whether we throw an exception or not
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public ResultSet executeQuery(Connection conn, String command) throws SQLException {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(command); // This will throw a SQLException if it fails
            return rs;
        } catch (SQLException e) {
            System.out.println("ERROR: Could not query the database");
            e.printStackTrace();
            return null;
        }
    }

//    public void run() {
//        // Connect DB
//        Scanner sc = new Scanner(System.in);
//        Connection conn = null;
//        try {
//            conn = this.getConnection();
//            System.out.println("Connected to database");
//        } catch (SQLException e) {
//            System.out.println("ERROR: Could not connect to the database");
//            e.printStackTrace();
//            return;
//        }
//        try {
//            String username = " 'cuong' ";
//            String query = "SELECT username, password FROM login WHERE username = " + username;
//            ResultSet rs = this.executeQuery(conn, query);
//            while(rs.next()){
//                String checkU = rs.getString("username");
//                String checkP = rs.getString("password");
//            System.out.println("U: " + checkU);
//            System.out.println("P: " + checkP);
//            }
//            
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        // Query data
        /*
        while (true) {
            System.out.println("---------------------------------MENU-------------------------------------");
            System.out.println("1. Tim chuyen bay");
            System.out.println("2. Dat chuyen bay");
            System.out.println("3. Xem dat cho");
            System.out.println("0. Thoat");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Nhap thao tac muon thuc hien: ");
            int t = sc.nextInt();
            sc.nextLine();
            if (t == 0) {
                break;
            }
            if (t == 1) {
                try {
                    System.out.println("Nhap thanh pho xuat phat(origin_city): ");
                    String origin_city = sc.nextLine();
                    System.out.println("Nhap thanh pho ha canh(dest_city): ");
                    String dest_city = sc.nextLine();
                    String queryString = "SELECT * FROM Flights WHERE origin_city = '" + origin_city + "' AND dest_city = '" + dest_city + "' ";
                    ResultSet rs = this.executeQuery(conn, queryString);
                    System.out.println("Data in the table:");
                    while (rs.next()) {
                        System.out.println("fid: " + rs.getInt("fid"));
                        System.out.println("year: " + rs.getInt("year"));
                        System.out.println("month_id: " + rs.getInt("month_id"));
                        System.out.println("day_of_month: " + rs.getInt("day_of_month"));
                        System.out.println("day_of_week_id: " + rs.getInt("day_of_week_id"));
                        System.out.println("carrier_id: " + rs.getString("carrier_id"));
                        System.out.println("flight_num: " + rs.getInt("flight_num"));
                        System.out.println("--------------------------------------------------------------");
                    }
                } catch (SQLException e) {
                    System.out.println("ERROR: Could not query data from the table");
                    e.printStackTrace();
                    return;
                }
            } else if (t == 2) {
                try {
                    System.out.println("Nhap ma khach hang:");
                    int uid = sc.nextInt();
                    System.out.println("Nhap ma chuyen bay:");
                    int fid = sc.nextInt();
                    String name = "";
                    String adr = "";
                    try {

                        String queryString = "SELECT * FROM customers WHERE uid = '" + uid + "' ";
                        ResultSet rs = this.executeQuery(conn, queryString);
                        while (rs.next()) {
                            name = rs.getString("name");
                            adr = rs.getString("adr");
                        }
                    } catch (SQLException e) {
                        System.out.println("ERROR: Could not query data from the table");
                        e.printStackTrace();
                        return;
                    }
                    String insertString
                            = "INSERT INTO booking VALUES( '" + uid + "'," + "'" + fid + "' ," + "'" + name + "' ," + "'" + adr + "')";
                    this.executeUpdate(conn, insertString);
                } catch (SQLException e) {
                    System.out.println("ERROR: Could not insert data into the table");
                    e.printStackTrace();
                    return;
                }
            } else if (t == 3) {
                try {
                    System.out.println("Nhap ma khach hang:");
                    int uidB = sc.nextInt();
                    String queryString = "SELECT * FROM booking WHERE uidB = '" + uidB + "' ";
                    ResultSet rs = this.executeQuery(conn, queryString);
                    System.out.println("Data in the table booking:");
                    while (rs.next()) {
                        System.out.println("uidB: " + rs.getInt("uidB"));
                        System.out.println("fidB: " + rs.getInt("fidB"));
                        System.out.println("nameB : " + rs.getString("nameB"));
                        System.out.println("adrB : " + rs.getString("adrB"));
                        System.out.println("---------------");
                    }
                } catch (SQLException e) {
                    System.out.println("ERROR: Could not query data from the table");
                    e.printStackTrace();
                    return;
                }
            }
        }*/
//    }

//    public static void main(String[] args) {
//        ThucHanh2_B20DCCN100 app = new ThucHanh2_B20DCCN100();
//        app.run();
//    }
}
