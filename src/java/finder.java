
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class finder {
    public boolean correct(String username,String password) throws SQLException{
        singleton s = singleton.getInstance();
        Connection con = s.getCon();
        Statement st = con.createStatement();
        String temp = "select * from register where pname = '"+username+"' and password = '" + password +"'";
        ResultSet rs = st.executeQuery(temp);
        while(rs.next()){
            return true;
        }
        return false;
    }
}
