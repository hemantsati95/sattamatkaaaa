

import com.utility.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeBazar extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String n1= request.getParameter("n1");
        try {
              Connection con=MyConnection.connectDB();
            String query="update showbazar set Time_Bazar = ?";
            PreparedStatement pst1=con.prepareStatement(query);
            pst1.setString(1,n1);
            pst1.executeUpdate();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
