package model;

import java.io.*;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class UploadFile extends HttpServlet {

     protected void UploadVideo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Part filePart = request.getPart("File"); 

        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); 
        InputStream fileContent = filePart.getInputStream(); 
        OutputStream ops = null;
        try {
            ops = new FileOutputStream(new File("D:\\Pro_return\\ReturnPage" + fileName));
            System.out.println("upload success");
            byte[] b = new byte[1024]; 
            int read = fileContent.read(b); 
            while (read != -1) {
                ops.write(b, 0, read);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally { 
            if (ops != null) {
                try {
                    ops.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        getServletContext().getRequestDispatcher("/test.jsp").forward(request, response);
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
        UploadVideo(request, response);
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
        UploadVideo(request, response);
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
