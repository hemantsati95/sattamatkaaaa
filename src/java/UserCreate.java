
import com.utility.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UserCreate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String n1=request.getParameter("n1");
        String n2=request.getParameter("n2");
        try  {
            Connection conn=MyConnection.connectDB();
            String query="insert into signup (username,password) values(?,?)";
            PreparedStatement pst=conn.prepareStatement(query);
            pst.setString(1,n1);
            pst.setString(2,n2);
            pst.executeUpdate();
            pst.close();
            conn.close();
            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }

}
