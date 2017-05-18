/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lemon
 */
public class Subscribe extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        int uid = Integer.parseInt(request.getParameter("userId"));
             System.out.println("id = " + request.getParameter("userId"));
        session.setAttribute("userId", uid);
             System.out.println("userId From Subscribe Button = " + uid);
        int sid = Integer.parseInt(request.getParameter("subId"));
        session.setAttribute("subId", sid);
             System.out.println("subId = " + sid);
        
        
        
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql;
            /*String sql1;
                sql1 = "select id from subscription where user_id=? AND subject_id=3";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setInt(1, uid);
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                request.setAttribute("text", "Unsubscribe");
            }*/

            if (request.getParameter("subscribeStatus").equals("Subscribe")) {
                sql = "insert into subscription (user_id , subject_id) values (?,?)";
                System.out.println("Subscribe !!");
                
            } else {
                sql = "delete from subscription WHERE user_id = ? AND subject_id = ?";
                System.out.println("UnSubscribe !!");
            }
            
            PreparedStatement ps2 = con.prepareStatement(sql);
                ps2.setInt(1, uid);
                ps2.setInt(2, sid);
                ps2.executeUpdate();
            
            RequestDispatcher rd = request.getRequestDispatcher(request.getParameter("jspPath"));
            rd.forward(request, response);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
