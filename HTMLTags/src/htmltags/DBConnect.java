/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package htmltags;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author gamboama_sd2082
 */
public class DBConnect {

    public static void main(String args[]) {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo", "root", "root");
                    //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            String sqlString = "insert into users(username,password,role) values ('mj','fdfd','student')";
            stmt.executeUpdate(sqlString);
            ResultSet rs =stmt.executeQuery("Select * from users");
//             stmt.executeUpdate("insert into users(username,password,role) values ('mj','','student'");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

