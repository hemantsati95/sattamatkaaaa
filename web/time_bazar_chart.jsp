
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.utility.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Time Bazar Chart</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    </head>
    <body>
         <div style="border-style: dotted; border-color: #0000ff; background-color: #ffffff; color: #090000; " align="center"><big> <br/>
                 <h2> TIME BAZAR </h2>  <br/>
                 <table width="auto" cellspacing="0" cellpadding="4" border="1" bgcolor="white"> 
                     <%
                         Connection conn=MyConnection.connectDB();
                         String query ="select time_bazar from chart";
                         PreparedStatement pst= conn.prepareStatement(query);
                         ResultSet rs= pst.executeQuery();
                         while(rs.next())
                         {
                     %>
                     <tr><td><%= rs.getString("time_bazar")%></td><td><%= rs.getString("time_bazar")%></td><td><%= rs.getString("time_bazar")%></td><td><%= rs.getString("time_bazar")%></td></tr>
                     <%}
                     conn.close();
                     %>
                 
                 </table> </big> <br/> <br/></div>


        
        
       <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
