<%-- 
    Document   : welcome
    Created on : 6 Jul, 2020, 2:57:25 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

        <style>
            body{
                background-image: url('https://thumbs.dreamstime.com/z/watercolor-illustration-red-apple-cinnamon-round-corner-frame-isolated-white-background-design-tea-food-hand-drawn-158355765.jpg');
                background-size: cover;
                align-content: center;
                background-color: lightblue;
            }
            div{
                width: 300px;
                border: 15px solid black;
                padding: 50px;
                margin : 20px;
                position: fixed;
                top: 10%;
                left: 35%;
                
            }
        </style>
        <title>REGISTER</title>
    </head>
    <body>
        <form action="reg" method="post">
        <div>
            <center>
                <center><h1>REGISTER</h1></center>
                <hr>
                ENTER YOUR NAME: <i class="fa fa-user"></i><input type="text" name="name" placeholder="name"><br><br>
                ENTER YOUR EMAIL-ID:  <input type="email" name="mail" placeholder="@gmail.com"><br><br>
                ENTER THE PASSWORD: <i class="fa fa-lock"></i><input type="password" name="password" placeholder="password"><br><br>
                RE-ENTER YOUR PASSWORD: <i class="fa fa-lock"></i><input type="password" name="repassword" placeholder="re_Enter"><br><br>
                ENTER YOUR NUMBER: <input type="number" name="number" placeholder="number"><br><br>
                ENTER YOUR ADDRESS: <input type="text" name="address" placeholder="address"><br><br>
                <input type="submit" value="submit">
            </center>
        </div>
        </form>>
    </body>
</html>
