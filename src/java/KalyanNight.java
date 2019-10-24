

import com.utility.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class KalyanNight extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String n3= request.getParameter("n20");
         try  {
            Connection conn=MyConnection.connectDB();
            String query="update showbazar set Kalyan_Night=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1,n3);
            conn.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
