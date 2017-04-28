package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MySubscribe extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("Subcribe!!");
        HttpSession session = request.getSession();
            String userId = request.getParameter("userId");
        session.setAttribute("userId", userId);
            System.out.println("userId From Subscribe Button = "+userId);
            String subId = request.getParameter("subId");
        session.setAttribute("subId", subId);
            System.out.println("subId = "+subId);
        
        try{
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            String sql = "insert into subscription (user_id , subject_id) values (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
                 int uid = Integer.parseInt(userId);
                 int sid = Integer.parseInt(subId);
                        ps.setInt(1, uid);
                        ps.setInt(2, sid);
                        ps.executeUpdate();

           /* Statement sm = con.createStatement();
            sm.execute("insert into subscription (user_id , subject_id) values ("+uid+","+sid+")");
            System.out.println("Executed!");
            */
//        request.setAttribute("userId",userId);
//        userId = (int)request.getAttribute("userId");
//        subId = (int)request.getAttribute("subId");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
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
