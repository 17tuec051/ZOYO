<%-- 
    Document   : dish
    Created on : 7 Jul, 2020, 1:31:48 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>dish</title>
        <style>
            body {
                background-image: url("https://png.pngtree.com/thumb_back/fw800/back_our/20190622/ourmid/pngtree-creative-foodie-food-festival-hd-background-image_207691.jpg");
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
        <form action="updatehotelDB" method="post">
            <center>
            <div>
                NAME:<input type="text" name="name"><br>
                DISH:<input type="text" name="dish"><br>
                COST:<input type="number" name="cost">$<br><hr>
                <input type="submit" value="UPDATE">
            </div>
            </center>
        </form>
        <form action="index.html" method="post">
            <center>
            <input type="submit" value="SUBMIT">
            </center>
        </form>
    </body>
</html>
