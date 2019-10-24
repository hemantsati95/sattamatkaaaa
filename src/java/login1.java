

import com.utility.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login1 extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       String n1=request.getParameter("n1");
       String n2= request.getParameter("n2");
        try  {
            Connection con=MyConnection.connectDB();
            String query2="select username,password from adminlogin where username=? and password=?";
            PreparedStatement pst= con.prepareStatement(query2);
            pst.setString(1,n1);
            pst.setString(2,n2);
            ResultSet rs=pst.executeQuery();
            if(n1.equals("n1") && n2.equals("n2"))
            {
                response.sendRedirect("adminshowbazar.jsp");
            }
            else
            
            {
                response.sendRedirect("login.jsp");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }

  
}
