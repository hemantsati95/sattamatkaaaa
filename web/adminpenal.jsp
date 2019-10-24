<%-- 
    Document   : adminpenal
    Created on : Jul 19, 2019, 11:30:32 PM
    Author     : Hemant
--%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminPenal</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <style type="text/css">
                body 
                {
                 background-color: black;
                 background: url(img/t1.jpg) no-repeat center center fixed; 
                 background-size: cover;
                 background-size: cover;
                 background-size: cover;
                 background-size: cover;
                }
                .color1
                {
                `color: red;
                }
                .hdtitle{
                background-color: red;
                }
                h1{
                background-color: red;
                }
                #my_centered_buttons { display: flex; justify-content: center; }
             
        </style>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="index.jsp"><strong><div class="hdtitle">SattaMatkaOne</div></strong></a>
                    </div>
                    <div class="color1">
                        <h1 style="font-size:4vw;">Welcome To Sattamatka Admin Penal</h1>
                    </div>
    
                </div>
            </nav>
        </header>
        <div class="container">    
             <div class="container-fluid">    
                  <a class="btn btn-primary btn-lg margin-left " class="margin-top" href="update_bazar.jsp" role="button">Update All Bazars</a>
                  <a class="btn btn-primary btn-lg margin-left " class="margin-top" href="delete_bazar.jsp" role="button">Delete All Bazar</a>       
                  <a class="btn btn-primary btn-lg margin-left " class="margin-top" href="create_user.jsp" role="button">Create User</a>
             </div> 
            <div class="a2a_kit a2a_kit_size_32 a2a_default_style" id="my_centered_buttons">
    <a class="a2a_button_facebook"></a>
    <a class="a2a_button_twitter"></a>
    <a class="a2a_button_pinterest"></a>
    <a class="a2a_dd" href="https://www.addtoany.com/share"></a>
</div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
