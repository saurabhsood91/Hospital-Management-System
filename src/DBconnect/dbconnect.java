/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnect;
import java.sql.*;
import static java.lang.System.out;
/**
 *
 * @author saurabh
 */
public class dbconnect {
    private String query;
    
    public dbconnect(String query)
    {
        this.query=query;
    }
    public ResultSet exquery()
    {
        ResultSet res=null;
        try
        {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url="jdbc:db2://localhost:50000/dbhosp";
            String dbusername="db2inst1";
            String dbpasswd="";
            Connection conn=DriverManager.getConnection(url,dbusername,dbpasswd);
            Statement st=conn.createStatement();
            res=st.executeQuery(query);
        }

        catch(SQLException e)
        {
            e.printStackTrace();
        }

        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        return res;
    }

}
