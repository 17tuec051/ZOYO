

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/reg"})
public class reg extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");
        String pass = request.getParameter("password");
        String repass = request.getParameter("repassword");
        String number = request.getParameter("number");
        String address= request.getParameter("address");
        insertjdbc ij = new insertjdbc();
        if(!pass.equals(repass)){
            out.println("alert(\"re-enter your password\")");
            response.sendRedirect("register.jsp");
        }
        else{
            try {
                ij.valid(name,mail,pass,number,address);
            } catch (SQLException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
            response.sendRedirect("hotel.jsp");
        }
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
