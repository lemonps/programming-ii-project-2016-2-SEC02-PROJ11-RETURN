/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author Lemon
 */
public class LoginFormDB {

    public static boolean checkLogin(String username, String password) {
        boolean status = false;
       
            try {
                Connection con = ConnectionBuilder.getConnection();

                PreparedStatement ps = con.prepareStatement("select * from user where username=? and password=?");
                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();
                status = rs.next();

            } catch (Exception e) {
                System.out.println(e);
            }
        return status;
    }
}
