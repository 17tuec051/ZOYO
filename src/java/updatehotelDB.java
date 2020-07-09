
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/updatehotelDB"})

public class updatehotelDB extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String dish = request.getParameter("dish");
            String cost = request.getParameter("cost");
            String hotel = request.getParameter("name");
            singleton ss = singleton.getInstance();
            Connection con = ss.getCon();
            
            try {
                Statement st = con.createStatement();
                String s1="select rname,ryear,rnumber,raddress from hoteldish where rname='"+hotel+"' and rdish is null";
                //select rname,ryear,rnumber,raddress from hoteldish where rname='kannapa' and rdish is null; 
                ResultSet rs = st.executeQuery(s1);
                out.println("came here");
                String name,year,number,address;
                while(rs.next()){
                    Statement sp = con.createStatement();
                    name=rs.getString(1);
                    year=rs.getString(2);
                    number=rs.getString(3);
                    address=rs.getString(4);
                    String s2="insert into hoteldish values('"+name+"','"+year+"','"+number+"','"+address+"','"+dish+"','"+cost+"')";
                    sp.executeUpdate(s2);
                }
                response.sendRedirect("dish.jsp");
            } catch (SQLException ex) {
                out.println("error came");
                Logger.getLogger(updatehotelDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    private void precessRequest(HttpServletRequest request, HttpServletResponse response)
    {       
    }


}
