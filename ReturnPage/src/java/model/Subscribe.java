/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
        String userId = request.getParameter("userId");
        session.setAttribute("userId", userId);
        System.out.println("userId From Subscribe Button = " + userId);
        String subId = request.getParameter("subId");
        session.setAttribute("subId", subId);
        System.out.println("subId = " + subId);
        
        
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql;
            if (request.getParameter("subscribeStatus").equals("Subscribe")) {
                sql = "insert into subscription (user_id , subject_id) values (?,?)";
                //System.out.println("Subscribe !!");
                
            } else {
                sql = "delete from subscription WHERE user_id = ? AND subject_id = ?";
                //System.out.println("UnSubscribe !!");
            }
            
            PreparedStatement ps = con.prepareStatement(sql);
            int uid = Integer.parseInt(userId);
            int sid = Integer.parseInt(subId);
            ps.setInt(1, uid);
            ps.setInt(2, sid);
            ps.executeUpdate();
            
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
