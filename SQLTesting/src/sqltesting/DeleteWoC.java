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
public class DeleteWoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Statement stmt = null;

        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/connectiontest", "root", "");
        stmt = (Statement) con.createStatement();
        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));
//            stmt.executeUpdate(sql);
        try {

            for (int i = 1; i < 1001; i++) {
                String sql = "DELETE FROM `testsql` WHERE id="+i;
                System.out.println(sql);
                stmt.executeUpdate(sql);

            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);

        }
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
    }

}
