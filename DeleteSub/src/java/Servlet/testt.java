/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WIN10_M7
 */
public class testt {
    public static void main(String[] args) {
        Connection con = ConnectionBuilder.getConnection();
        try {// 1 4 6 8 9 34
            PreparedStatement statement = con.prepareStatement("select id from user order by id DESC limit 1");//การเพิ่มค่าไอดีทีละ1 ส่วน DESC แปล ลง
            ResultSet rs = statement.executeQuery();
            int latestId=0;//id ล่าสุด
            rs.next();
            latestId=rs.getInt("id");
            System.out.println(latestId);
        } catch (SQLException ex) {
            Logger.getLogger(testt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }           

}
