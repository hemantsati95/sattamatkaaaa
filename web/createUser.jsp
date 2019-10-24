
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User</title>
    </head>
    <body>
        <form action="UserCreate" method="post">
            <table align="center">
                <tr>
                    <td>
                        <input type="text" name="n1" placeholder="username"/>
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <input type="text" name="n2" placeholder="password"/>
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <input type="submit"  value="Submit"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
