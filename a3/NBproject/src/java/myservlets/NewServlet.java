/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author redho
 */
public class NewServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Servlet NewServlet</title>");            
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.print("</body>");
            out.print("</html>");
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
     * For login:
     * request 
     * login: 1
     * usern: usern
     * userp: userp
     * 
     * response
     * success: success
     * 
     * 
     * For register:
     * request
     * login: 0
     * usern:   usern   *
     * userp:   userp   *
     * email:   email   *
     * fname:   fname   *
     * lname:   lname   *
     * date:    date    * 
     * sex:     sex
     * country: country *
     * town:    town    *
     * extra:   extra
     * 
     * response
     * success: success
     * 
     * 
     * For username lookup:
     * request
     * login: 2
     * usern: usern
     * 
     * response
     * success: found
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter o = response.getWriter();
        o.print("<html><head><title>Echo Request\n</title></head><body>");
        o.print("HTTP Method:"+request.getMethod());
        o.print("<br>URL"+request.getRequestURL().toString());
        String usern = request.getParameter("usern");
        String userp = request.getParameter("userp");
        
        
        o.print("<br>Username: "+usern);
        o.print("<br>Password: "+userp);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Supposedly will hold the user info, check creds etc";
    }// </editor-fold>

}
