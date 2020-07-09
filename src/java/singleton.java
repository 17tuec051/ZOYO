
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class singleton {
    static singleton ss = new singleton();

    
    Connection con;
    private singleton(){
        try{ 
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/zoyo","zoyo","zoyo");
            System.out.println("Connection made sucessfull");
        }
        catch(Exception e){}
    }
    static singleton getInstance() {
        return ss;
    }
    public Connection getCon(){
        return con;
    }
}
