<%-- 
    Document   : subject
    Created on : Mar 30, 2017, 2:34:08 PM
    Author     : Lemon
--%>

<%@page import="model.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title>Platform</title>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="1.css">

    </head>
    <body>
        <%
         
                Connection con = ConnectionBuilder.getConnection();
                String sql = "select id from subscription where user_id=? AND subject_id=6";
                PreparedStatement ps = con.prepareStatement(sql);
                String userId = request.getParameter("userId");
                request.getSession().setAttribute("userId", userId);
                int uid = Integer.parseInt(userId);
                request.setAttribute("text", "Subscribe");
                ps.setInt(1,uid);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    request.setAttribute("text", "Unsubscribe");
                }
                con.close();
           
            }


        %>

        <div id="header">

            <div id="image"><img src="logo.png" alt="logo" ></div>                      
            <h1>RETURN</h1>  


        </div>

        <div id="nav">
            <table>
                <tr>
                    <th><a href="Home.html" target="_blank">Home</a></th>
                    <th><a href="Return.html" target="_blank">Return</a></th>
                    <th><a href="ma-tew.html" target="_blank">ma-tew</a></th>
                    <th><a href="kookle.html" target="_blank">kookle</a></th>
                    <th><a href="oneforall.html" target="_blank">oneforall</a></th>
                </tr>
            </table>
        </div>
        <br>
        <br>
        <h2>Platform</h2>

        <form action="Subscribe">
            <input type="hidden" name="userId" value=${userId}>
            <input type="hidden" name="subId" value="6">
            <input type="hidden" name="jspPath" value="Platform.jsp">
            <input type="hidden" name="subscribeStatus" value="${text}">
            <input type="submit" value="${text}" onclick="location.reload(true)"> 

        </form>

            <hr>

        <div id="contentMaster">
            <div id="content">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br>            <h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>

        </div>
        <div id="contentMaster">
            <div id="content">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>

        </div>
        <div id="contentMaster">
            <div id="content">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>

        </div>
        <div id="contentMaster">
            <div id="content">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>

        </div>
        <div id="contentMaster">
            <div id="content">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>
            <div id="content2">
                <a href="viewvideo1.html" "><img src="stary.png" style="width: 50%; height: 50%;"></a> 
                <br><h3>MTH101 CALCULUS I</h3>
                <p>AJ. KASEM KEETAK</p>
                <p>SEC.1 8.30-11.30</p>
                <p>11 NOV 2016</p>
            </div>

        </div>

        <hr>

        <div id="footer">
            <center><p>2016 &copy KADEMY 2016</p></center>
        </div>


    </body>
</html>

