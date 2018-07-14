/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
//import methods.CheckUsers;
import java.io.IOException;  
import java.io.PrintWriter;    
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;
import Methods.*;
import MyValues.*;
  
/**
 *
 * @author sinyoro
 */
public class Login extends HttpServlet {

    private static final long serialVersionUID = 7168190557986094523L;

    CheckUsers cu = new CheckUsers();
    Values v = new Values();
    Nyasha tata = new Nyasha();
    CheckState cs = new CheckState();
    CheckStatus cst = new CheckStatus();
    
    @Override
       public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
      
        response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            String n=request.getParameter("username");
            String p=request.getParameter("password");
            v.setSessionName(n);
            String a = v.role1(Nyasha.role1);
            String b = v.role2(Nyasha.role2);
            String c = v.role3(Nyasha.role3);
            String d = v.accState1(Nyasha.state1);
            String e = v.status1(Nyasha.status1);
            
            if ( n.isEmpty() && p.isEmpty())
            {
                out.print("<font color=red> Please populate all fields");
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                rd.include(request,response);
            }else
            {
                try {
                   if(cu.validate(n,p,a)){
                        
                     if(cs.validateState(n, p, a, d))
                     {
                       if(cst.validateStatus(n, p, a, e))
                       {    
                        HttpSession session = request.getSession();
                        session.setAttribute("username", n);
                        //setting session to expiry in 30 mins
                        session.setMaxInactiveInterval(30*60);
                        Cookie userName = new Cookie("username", n);
                        userName.setMaxAge(30*60);
                        response.addCookie(userName);
                        response.sendRedirect("AdminHome.jsp");
                          }
                       else
                       {
                        out.print("Account not verified please contact the Administrator for activation");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request,response);
                       }
                     }
                     else
                     {
                        out.print("Account not active please contact the Administrator for activation");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request,response);
  

                    }
                }
                    else if(cu.validate2(n,p,b)){
                        
                     if(cs.validateState2(n, p, b, d))
                     {
                       if(cst.validateStatus2(n, p, b, e))
                       {
                           
                        //RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
                        //rd.forward(request,response);
                        HttpSession session = request.getSession();
                        session.setAttribute("username", n);
                        //setting session to expiry in 30 mins
                        session.setMaxInactiveInterval(30*60);
                        Cookie userName = new Cookie("username", n);
                        userName.setMaxAge(30*60);
                        response.addCookie(userName);
                        response.sendRedirect("VetHome.jsp");
                        }
                       else
                       {
                        out.print("Account not verified please contact the Administrator for activation");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request,response);
                       }
                     }
                     else
                     {
                        out.print("Account not active please contact the Administrator for activation");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request,response);
                    
                     }
                        }
                    else if(cu.validate3(n,p,c)){
                        
                     if(cs.validateState3(n, p, c, d))
                     {
                       if(cst.validateStatus3(n, p, c, e))
                       {    
                        //RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
                        //rd.forward(request,response);
                        HttpSession session = request.getSession();
                        session.setAttribute("username", n);
                        //setting session to expiry in 30 mins
                        session.setMaxInactiveInterval(30*60);
                        Cookie userName = new Cookie("username", n);
                        userName.setMaxAge(30*60);
                        response.addCookie(userName);
                        response.sendRedirect("UserHome.jsp");
                       }
                       else
                       {
                        out.print("Account not verified please contact the Administrator for activation");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request,response);
                       }
                     }
                     else
                     {
                        out.print("Account not active please contact the Administrator for activation");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request,response);
  

                    }
                }
                     
                    else{
                        out.print("Sorry username or password error");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request,response);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        }  
    }  
