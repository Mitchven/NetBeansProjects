/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltesting;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gamboama_sd2082
 */
public class SQLTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));
        for (int i = 0; i < 201; i++) {
            try {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/connectiontest", "root", "");
                stmt = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
                String sql = "INSERT INTO `testsql`(`id`, `column1`, `column2`, `column3`, `column4`, `column5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
                System.out.println(sql);

                stmt.executeUpdate(sql);
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error!");

            }
        }
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
        
    
    }
}
