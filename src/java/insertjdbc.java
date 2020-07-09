
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class insertjdbc {

    public void valid(String name, String mail, String pass,String number, String address) throws SQLException {
        singleton s = singleton.getInstance();
        Connection con = s.getCon();
        Statement st = con.createStatement();
        String s1 = "insert into register values('"+name+"','"+mail+"','"+pass+"','"+number+"','"+address+"')";
        st.executeUpdate(s1);
    }

}
