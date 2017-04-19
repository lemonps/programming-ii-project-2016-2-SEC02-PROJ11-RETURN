
package Servlet;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowData {
    public static ResultSet showData() {//ResultSet เพราะว่าเราต้องการเอาค่านี้ออกไปprint
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement statement = con.prepareStatement("select * from subject");//statement คำสั่งSQL
            ResultSet rs = statement.executeQuery();//Resultsetคือค่าที่เราใช้เก็บ
            return rs;
            
        } catch (SQLException ex) {
            System.out.println("คำสั่งผิด");
        }
        return null;
    }
        }
    

