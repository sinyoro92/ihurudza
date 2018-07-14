/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Methods.*;
import MySec.*;
import MyValues.*;
import java.sql.SQLException;

/**
 *
 * @author sinyoro
 */
public class Register extends HttpServlet {

  NewRegistration nwr = new NewRegistration();
  CheckSystem mysc = new CheckSystem();
  Values vl = new Values();
  
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
   
        
        response.setContentType("text/html");  
        try(PrintWriter out = response.getWriter()) {
            
            String a = request.getParameter("name");
            String b = request.getParameter("surname");
            String c = request.getParameter("email");
            String d = request.getParameter("cell");
            String e = request.getParameter("address");
            try{
                if(mysc.secCheck())
                {
                    out.print(vl.getSresponse());
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.include(request,response);
                }else
                {
                if (nwr.newReg(a, b, c, d, e))
                {
                    response.sendRedirect("allUserHome.jsp");
                }else
                {
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.include(request,response);
                }
                }
             out.close();
            }
            catch (IOException | ServletException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }

  
}
