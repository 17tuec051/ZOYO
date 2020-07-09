<%-- 
    Document   : hotel
    Created on : 7 Jul, 2020, 12:29:03 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HOTEL REGISTRATION</title>
        <style>
            body{
                background-image: url("https://c0.wallpaperflare.com/preview/540/1016/960/cheese-food-meal-dinner.jpg");
                background-size: cover;
            }
            div{
                width: 300px;
                border: 15px solid black;
                padding: 50px;
                margin : 20px;
                position: fixed;
                top: 25%;
                left: 35%;
                
            }
        </style>
    </head>
    <body>
        <form action="addhotel" method="post">
        <center>
            <div style="background-color: lightcoral">
                RESTAURANT NAME:<input type="text" name="rname" placeholder="TITLE"><br><br>
                ESTABLISHED YEAR:<input type="number" name="year" placeholder="0000"><br><br>
                ADDRESS:<input type="text" name="address" placeholder="ADDRESS"><br><br>
                PHONE NUMBER:<input type="number" name="number" placeholder="NUMBER"><br><br>
                <center><input type="submit" value="SUBMIT"></center>
            </div>
        </center>
        </form>
    </body>
</html>
