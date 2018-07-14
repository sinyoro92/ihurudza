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

/**
 *
 * @author sinyoro
 */
public class NewAcc extends HttpServlet {

    private static final long serialVersionUID = 1L;
        addUser au = new addUser();

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
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
           String e = request.getParameter("role");
           String f = request.getParameter("address");
            try{
                
                if (au.newAdmin(a, b, c, d, e, f))
                {
                    response.sendRedirect("allUserHome.jsp");
                }else
                {
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.include(request,response);
                }
             out.close();
            }
            catch (IOException | ServletException ex) {
                Logger.getLogger(NewAcc.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
}

