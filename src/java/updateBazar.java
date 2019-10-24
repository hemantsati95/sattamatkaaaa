

import com.utility.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class updateBazar extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String n1=request.getParameter("n1"); 
        String n2=request.getParameter("n2");
        String n3=request.getParameter("n3");
        String n4=request.getParameter("n4");
        String n5=request.getParameter("n5");
        String n6=request.getParameter("n6");
        String n7=request.getParameter("n7");
        String n8=request.getParameter("n8");
        String n9=request.getParameter("n9");
        String n10=request.getParameter("n10");
        String n11=request.getParameter("n11");
        String n12=request.getParameter("n12");
        String n13=request.getParameter("n13");
        String n14=request.getParameter("n14");
        String n15=request.getParameter("n15");
        String n16=request.getParameter("n16");
        String n17=request.getParameter("n17");
        String n18=request.getParameter("n18");
        String n19=request.getParameter("n19");
        
        
        try 
        {
            
            Connection con=MyConnection.connectDB();
            
            String query="update showbazar set Time_Bazar = ?, Diamond = ?, Milan_Day = ?, Rajdhani_Day = ?, Supreme_Day = ?, Kalyan = ?, Milan_Night = ?, Rajdhani_Night = ?, Supreme_Night = ?, Bombay_Bazar = ?, Kalyan_Night = ? , Worli_Mumbai = ? ,Bhagyalaxmi = ?, Jodi_Bazar = ? , MP_Day = ? , Gali = ? , Biswar = ? , Gaziabad = ? , Farida_bad = ?";
            PreparedStatement pst1=con.prepareStatement(query);
            pst1.setString(1,n1);
            pst1.setString(2,n2);
            pst1.setString(3,n3);
            pst1.setString(4,n4);
            pst1.setString(5,n5);
            pst1.setString(6,n6);
            pst1.setString(7,n7);
            pst1.setString(8,n8);
            pst1.setString(9,n9);
            pst1.setString(10,n10);
            pst1.setString(11,n11);
            pst1.setString(12,n12);
            pst1.setString(13,n13);
            pst1.setString(14,n14);
            pst1.setString(15,n15);
            pst1.setString(16,n16);
            pst1.setString(17,n17);
            pst1.setString(18,n18);
            pst1.setString(19,n19);
            
            pst1.executeUpdate();
            pst1.close();
            con.close();
            
        }
        catch(Exception e)
        
        {
           System.out.println(e);
        }
    }

  
}
