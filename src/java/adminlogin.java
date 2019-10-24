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
import javax.servlet.http.HttpSession;

public class adminlogin extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String n1=request.getParameter("aname");
        String n2=request.getParameter("apass");
        try  {
                Connection conn=MyConnection.connectDB();
                String query ="select ausername,apassword from adminlogin where ausername=? and apassword=?";
                PreparedStatement pst= conn.prepareStatement(query);
                pst.setString(1,n1);
                pst.setString(2,n2);
                ResultSet rs=pst.executeQuery();
                
             
                    if(n1.equals("Admin@123") && n2.equals("Admin@123"))
                    {
                     //get the old session and invalidate
                    HttpSession session = request.getSession(true);
                    session.setAttribute("session1", n1);
                    response.sendRedirect("adminpenal.jsp");
                    }
                    if(n1.equals(request.getParameter("aname")) && n2.equals(request.getParameter("apass")))
                    {
                        HttpSession session2=request.getSession();
                        session2.setAttribute("aname",n1);
                        response.sendRedirect("update.jsp");
                    }
                    else
                    {
                                response.sendRedirect("login.jsp");
                     }           
                
        }
        catch(Exception e)
        {
            
        }
    }

    
}
