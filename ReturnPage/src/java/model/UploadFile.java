package model;

import java.io.*;

import java.nio.file.Paths;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;


@MultipartConfig
public class UploadFile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("video/mp4");
        Part filePart = request.getPart("File"); 

        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        InputStream fileContent = filePart.getInputStream();
        OutputStream ops = null;
        try {
            ops = new FileOutputStream(new File("D:\\Pro_return\\ReturnPage\\web\\VideoStore\\" + fileName));
            int read = 0;
            byte[] b = new byte[1024];
            while ((read = fileContent.read(b)) != -1) {
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
        getServletContext().getRequestDispatcher("/UploadVideoPage.jsp").forward(request, response);
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
