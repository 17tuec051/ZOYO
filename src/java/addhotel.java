

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addhotel extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            processRequest(request, response);
            String resname=request.getParameter("rname");
            String year=request.getParameter("year");
            String address=request.getParameter("address");
            String number=request.getParameter("number");
            //response.sendRedirect("dish.jsp");
            singleton ss = singleton.getInstance();
            Connection con = ss.getCon();
            Statement st = con.createStatement();
            String s1="insert into hoteldish values('"+resname+"','"+year+"','"+number+"','"+address+"',null,null)";
            st.executeUpdate(s1);
            System.out.println(s1);
            response.sendRedirect("dish.jsp");
        }
        catch(Exception e){
            System.out.println(e);
            response.sendRedirect("dish.jsp");
        }
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    private void processRequest(HttpServletRequest request, HttpServletResponse response)
    {
    }

    
}
