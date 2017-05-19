/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAd;

import java.sql.*;
import model.ConnectionBuilder;

/**
 *
 * @author Lemon
 */
public class LoginAd {

    public static boolean checkLogin(String username, String password) {
        boolean status = false;
       
            try {
                Connection con = ConnectionBuilder.getConnection();

                PreparedStatement ps = con.prepareStatement("select * from admin where username=? and password=?");
                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();
                status = rs.next();

            } catch (Exception e) {
                System.out.println(e);
            }
        return status;
    }
    public static void main(String[] args) {
        System.out.println(LoginAd.checkLogin("non","non"));
    }
}
