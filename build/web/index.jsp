
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.utility.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SattaMatkaOne</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <style>
            h1{
                color: #17255e;
            }
            h2{
                color: maroon;
            }
            .heading{
                background-color: brown;
                color: gold;
                
            }
            .number1{
                background-color: red;
                color: red;
                
            }
            .field1
            {
                background: #9e2121;
                color: #c90c0c;
            }
            .field2{
                background-color: black;
            }
            .kalyan{
                background-color: yellow;
            }
            .delhi{
                background-color: blueviolet;
            }
            .font1{
                color: red;
            }
            .button{
                color: red;
                
            }
            fieldset 
            {
		border: 1px solid #ddd !important;
		margin: 0;
		xmin-width: 0;
		padding: 10px;       
		position: relative;
		border-radius:4px;
		background-color:#f5f5f5;
		padding-left:10px!important;
	    }	
	    legend
	    {
			font-size:14px;
			font-weight:bold;
			margin-bottom: 0px; 
			width: 35%; 
			border: 1px solid #ddd;
			border-radius: 4px; 
			padding: 2x 2px 2px 2px; 
			background-color: #ffffff;
		}
                .login{
                    color: black;
                }   
        </style>
    </head>
    <body bgcolor="#abc3d9">
        
        <fieldset align="center">
            <strong><h1 style="font-size:4vw;">SATTAMATKAONE.COM</h1></strong>
            <marquee><h1 style="font-size:4vw;">WELLCOME FRIENDS IN THE WORLD OF SATTA MATKA ONE GROUP MAY YOU ALWAYS WIN</h1></marquee>
       
         </fieldset>
        <fieldset align="center">
            <div class="heading" title="sattamatka market">
Satta Matka ❋ Satta Matka Market ❋ Satta Market ❋ Matka Jodi Fix ❋ Satta Matka Results ❋ Free Matka Results ❋ SattaMatka ❋ Matka Tips ❋ Kalyan Matka Results ❋
Satta Game ❋ Mumbai Main ❋ Kalyan Results ❋ Kalyan Chart ❋ Main Mumbai Chart ❋ Online Matka Results ❋ Matka Game ❋ Satta Matka Tips ❋ Milan Chart ❋ 
Old Satta chart ❋ Top Matka Guess ❋ Matka Chart ❋ Matka ❋ Free Matka Guessing ❋ Matka Links ❋ Live Satta Matka Results ❋ Satta Matka Number ❋ Matka Jodi Fix ❋ 
Kalyan Fix Open ❋ kalyan Jodi ❋ Kalyan Open ❋ Satta matka Open ❋ Satta Matka Jodi ❋ Maktka Jodi Aaj ❋ Kalyan Jodi Aaj
</div>
                      
        </fieldset>    
    <div class="number1" title="satta market">
        <fieldset align="center" class="field2">
         
                <strong>SATTAMATKAONE.COM</strong><br>
                <strong>SATTA MATKA ONE COM</strong><br>
                <strong>SATTA MATKA ONE MARKET</strong><br>
                <strong>SATTA MATKA ONE JODI</strong><br />
                <strong>SATTA MATKA ONE FIX MARKET</strong><br>
                <strong>KALYAN FIX JODI</strong><br />
                <strong>!! MATKA JODI FIX !!</strong><br>
                <strong>!!  ADMIN  !!</strong><br>
                <strong>MOBILE NUMBER - 9630402851 </strong><br>
            </fieldset>
</div>
            
        <br>
        <br>
         <div align="center" class="button" class="btn-group">
        <button type="button" onClick="window.location.reload();" class="btn btn-primary">Refresh</button>
        </div>
        <br>
        <br>
        <br>
        
        

        <%
                            Connection con=MyConnection.connectDB();
                           
                            String n1="select * from showbazar";
                            PreparedStatement pst1=con.prepareStatement(n1);
                            ResultSet rs1=pst1.executeQuery();
                            while(rs1.next())
                            {
                            
                        %>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Time Bazar</h1></strong></legend>
             
                        <h2><%=rs1.getString("Time_Bazar")%></h2>
                     
                        <h3>[ 1:10 PM - 2:10 PM ]</h3> 
                    
            
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Diamond</h1></strong></legend>
                        
                        <h2><%=rs1.getString("Diamond")%></h2>
                        
                        <h3>[ 1:10 PM - 2:40 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Milan Day</h1></strong></legend>
                 <h2><%=rs1.getString("Milan_Day")%></h2>
                        <h3>[ 3:10 PM - 5:10 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Rajdhani Day</h1></strong></legend>
             <h2><%=rs1.getString("Rajdhani_Day")%></h2>
                        <h3>[ 3:15 PM - 5:15 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Supreme Day</h1></strong></legend>
             <h2><%=rs1.getString("Supreme_Day")%></h2>
                        <h3>[ 3:35 PM - 5:35 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="kalyan">
        <fieldset align="center">
           
            <legend><strong><h1 style="font-size:4vw;"><div class="kalyan">Kalyan</div></h1></strong></legend>
                         <h2><%=rs1.getString("Kalyan")%></h2>
               <div class="kalyan">
                   <h3>[ 4:30 PM - 6:30 PM ]</h3>
            
           </div>
           
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Milan Night</h1></strong></legend>
             <h2><%=rs1.getString("Milan_Day")%></h2>
                        <h3>[ 9:05 PM - 11:05 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;" color='black'>Rajdhani Night</h1></strong></legend>
             <h2><%=rs1.getString("Rajdhani_Night")%></h2>
                        <h3>[ 9:25 PM - 11:55 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Supreme Night</h1></strong></legend>
             <h2><%=rs1.getString("Supreme_Night")%></h2>
                        <h3>[ 9:45 PM - 11:45 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Bomabay Bazar</h1></strong></legend>
             <h2><%=rs1.getString("Bombay_Bazar")%></h2>
                        <h3>[ 3:25 PM - 5:25 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="kalyan">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;"><div class="kalyan">Kalyan Night</div></h1></strong></legend>
             <h2><%=rs1.getString("Kalyan_Night")%></h2>
            <div class="kalyan"> <h3>[ 9:35 PM - 12:05 PM ]</h3></div>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Worli Mumbai</h1></strong></legend>
             <h2><%=rs1.getString("Worli_Mumbai")%></h2>
                        <h3>[ 9:15 PM - 11:00 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Bhagyalaxmi</h1></strong></legend>
             <h2><%=rs1.getString("Bhagyalaxmi")%></h2>
                        <h3>[ 12:40 PM - 2:40 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
        <fieldset align="center">
             <legend><strong><h1 style="font-size:4vw;">Jodi Bazar</h1></strong></legend>
              <h2><%=rs1.getString("Jodi_Bazar")%></h2>
                        <h3>[ 9:30 PM - 11:30 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
         <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">MP Day</h1></strong></legend>
             <h2><%=rs1.getString("MP_Day")%></h2>
                        <h3>[ 2:05 PM - 4:05 PM ]</h3>
            
        </fieldset>
        </div>
        <br>
        <br> 
        <div align="center" class="button" class="btn-group">
        <button type="button" onClick="window.location.reload();" class="btn btn-primary">Refresh</button>
        </div>
        <br>
        <br>
        <div class="delhi">
         <fieldset align="center">
            <!--<legend><strong><h1></h1></strong></legend>-->
             <div class="delhi">
                 <h1 style="font-size:4vw;"><strong><div class="font1">Delhi Bazar</div></strong></h1>
             </div>
        </fieldset>
        </div>
        <div class="field1">
         <fieldset align="center">
             <legend><strong><h1 style="font-size:4vw;">Galihj</h1></strong></legend>
              <h2><%=rs1.getString("Gali")%></h2>
                        <h3>[ 10:45 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
         <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Bisawar</h1></strong></legend>
             <h2><%=rs1.getString("Biswar")%></h2>
                        <h3>[ 5:00 AM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
         <fieldset align="center">
             <legend><strong><h1 style="font-size:4vw;"><div>Gaziyabad</div></h1></strong></legend>
             <h2><%=rs1.getString("Gaziabad")%></h2>
           
                        <h3>[ 8:00 PM ]</h3>
            
        </fieldset>
        </div>
        <div class="field1">
         <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Faridabad</h1></strong></legend>
                        <h2><%=rs1.getString("Farida_bad")%></h2>
         
                        <h3>[ 6:15 PM ]</h3>
                       
        </fieldset>
           
        </div>
        <div class="field1">
         <fieldset align="center">
            <legend><strong><h1 style="font-size:4vw;">Kalyani</h1></strong></legend>
                        <h2><%=rs1.getString("Kalyani")%></h2>
                
            <h1></h1>
                        
                        <h3>[ 6:15 PM ]</h3>
                       
        </fieldset>
           
        </div>                
          <%
                        }
                        con.close();
                        %>
     
        <br>
        <br>
        <br>
        
        <br>
        <br>
        <br>
         <div align="center" class="button" class="btn-group">
             <a class="btn btn-outline-success" href="adminlogin.jsp" role="button">Login</a> 
        </div>
        <br>
        <br>
        <br>
       
        <div>
         <fieldset align="center">
             <div>
                 <h1><strong style="font-size:4vw;">MATKA JODI CHAT</strong></h1>
                 
                 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Time Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Diamond Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Milan Day Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Rajdhani Day Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Suprem Day Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Kalyan Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Milan Night Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Rajdhani Night Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Supreme Night Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Bombay Bazar Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Kalyan Night Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Worli Mumbai Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Bhagyalaxmi Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Jodi Bazar Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">MP Day Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Dehli Bazar Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Gali Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Disawar Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Gaziyabad Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Faridabad Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <br>
        <br>
        <div align="center" class="button" class="btn-group">
        <button type="button" onClick="window.location.reload();" class="btn btn-primary">Refresh</button>
        </div>
        <br>
        <br>
        <div>
         <fieldset align="center">
             <div>
                 <h1 style="font-size:4vw;"><strong>Matka Penal Chart</strong></h1>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                 <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Time Bazar Penal Chart</a> 
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Diamond Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Milan Day Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Rajdhani Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Supreme Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        
        <div>
         <fieldset align="center">
             <div>
            
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Kalyan Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Milan Night Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Rajdhani Night Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Supreme Night Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
               
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Bombay Bazar Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Kalyan Night Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Worli Mumbai Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Bhagyalaxmi Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">Jodi Bazar Penal Chart</a>
             </div>
           
        </fieldset>
        </div>
        <div>
         <fieldset align="center">
             <div>
                 
                     <a class="btn btn-secondary btn-lg btn-block" href="test.jsp" role="button">MP Penal Chart</a>
             </div>
           
        </fieldset>
            <br>
            <br>
            <br>
        </div>
        <div align="center" class="button" class="btn-group">
        <button type="button" onClick="window.location.reload();" class="btn btn-primary">Refresh</button>
        </div>
        <br>
        <br>
        <br>
         <div class="number1" title="satta market">
        <fieldset align="center" class="field2">
         
                <strong>SATTAMATKAONE.COM</strong><br>
                <strong>All RIGHT RESERVED</strong><br>
                <strong>(2012-2019)</strong><br>
                
                <strong>!! CONTACT ADMIN  !!</strong><br>
                <strong>MOBILE NUMBER - 9630402851 </strong><br>
            </fieldset>
              <div align="center" class="button" class="btn-group">
        <button type="button" onClick="window.location.reload();" class="btn btn-primary">Refresh</button>
        </div>
</div>
         <fieldset align="center">
             <div>
                 <h4><strong></strong></h4>
             </div>
           
        </fieldset>
        
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
