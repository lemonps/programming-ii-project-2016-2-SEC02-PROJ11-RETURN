/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ConnectionBuilder;

/**
 *
 * @author homun
 */
@WebServlet(name = "RegisterData", urlPatterns = {"/RegisterData"})
public class RegisterData extends HttpServlet {

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
        //request ก็คือ การที่เรากดคลิกส่งข้อมูลอะไรก็ตามเนี่ย ข้อมูลจะถูกส่งไปยัง server แล้ว server ก็จะประมวลผลตอบกลับมา
        String username = request.getParameter("username");//เป็นปุ่มคลิก ที่ปุ่มส่งข้อมูลมาเป็นString
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        
        Connection con = ConnectionBuilder.getConnection();
              //ASC = Ascend ขึ้น   ส่วน DESC แปล ลง
        try {
            //Statement 
            // PreparedStatement  เพื่อให้ภาษษจาวาเข้าใจว่าเราจะใช้ภาษาsql อ่ะห้ะ
            PreparedStatement statement = con.prepareStatement("select id from user order by id DESC limit 1");//การเพิ่มค่าไอดีทีละ1 ส่วน DESCเรียงค่าจากมากไปน้อย limit>ออกแค่แถวเดียวแถวแรก(บนสุด=ตัวเลขมากสุด เย้)
            ResultSet rs = statement.executeQuery();
            rs.next();//ที่ต้องใช้ เพราะว่า ตอนแรก cursor RS จะอยุ๋ที่ columm แล้วถ้าเราไม่ใช้ .next() มันจะ print columm ออกมา ซึ่งมันผิดเว้ยยย !!!
            int latestId = rs.getInt("id")+1;//id ล่าสุด ที่บอก1 เพราะจะได้ไอดีตัวถัดไปจากไอดีล่าสุด เย้
            //==+ " ' ' "
            
            //--------------------เราจะเช็ตว่า username ซ้ำไหม------------------------------------------------
            statement = con.prepareStatement("select * from user");//เอาข้อมูลdatabaseออกมาดูก่อน
            rs = statement.executeQuery();
            boolean valid = true;//valid แปลถูกต้อง --> ไม่ซ้ำๆ
            while(rs.next()){//วนข้อมูลในDatabase
                if(rs.getString("username").equals(username)){//เช็คว่าข้อมูลที่เราใส่เหมือนกับในdatabase ไหมถ้าเหมือนเข้าลูป
                    valid = false;//ถ้าไม่มีfalseจะเข้าลูปข้างล่าง T^T
                    System.out.println("username ซ้ำนะเธอ!!!!");
                    //String result="Username ซ้ำนะจ้ะอิๆ";
                    request.setAttribute("status","Userซ้ำ ");
                    request.getRequestDispatcher("/SubmitRegister.html").forward(request, response);
                    //อีกหน้าหนึ่งของเว็ปเช็คแจ้งเตือนว่าซ้ำหรือไม่ซ้ำ
                    
                    break;
                }
            }
            if(valid == true){//ในกรณีที่usernameไม่ซ้ำ เย้ๆ
                statement = con.prepareStatement("insert into user values(?,?,?,?,?)");
                statement.setInt(1,latestId);            
                statement.setString(2,username);////username จากช่อง form           
                statement.setString(3,password);
                statement.setString(4,name);
                statement.setString(5,surname);
                statement.executeUpdate();
               
                request.setAttribute("status","ลงทะเบียนสำเร็จ");
                request.getRequestDispatcher("/SubmitRegister.jsp").forward(request, response);
                
            }
            
            
            
        } catch (SQLException ex) {
            System.out.println("คำสั่งผิด");
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
