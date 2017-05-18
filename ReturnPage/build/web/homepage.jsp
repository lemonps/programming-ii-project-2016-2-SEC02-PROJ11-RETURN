<!DOCTYPE html>
<html>
<head>
	<title>PAGE1</title>
	<meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>
        
</head>
<body>
		
    
        <div class="container-fluid">

            <div id="header">
                        <span>Welcome  Mr. ${name}</span>
                        <a onclick="LogoutTest"><i class="glyphicon glyphicon-log-out"> Logout</i></a>
                        
                <form id="searchdata" action="SeachVideo" method="POST">
                    SearchBytitle : <input type="text" name="title">
                    <input type="submit" name="GO" value="GO">
                </form>
               
                <form id="searchdata" action="SearchSubCourse" method="POST">
                    SearchBycourseId : <input type="text" name="course_id">
                    <input type="submit" name="GO" value="GO">
                </form>

                <img src="logo.png" alt="logo">
                
                <h1>RETURN</h1>


            </div>

            <div id="nav">
                &nbsp&nbsp&nbsp&nbsp<a href="homepage.jsp" target="_blank">Home</a>
                &nbsp&nbsp&nbsp&nbsp<a href="homepage.jsp" target="_blank">Return</a>
                &nbsp&nbsp&nbsp&nbsp<a href="homepage.jsp" target="_blank">ma-tew</a>
                &nbsp&nbsp&nbsp&nbsp<a href="homepage.jsp" target="_blank">kookle</a>
                &nbsp&nbsp&nbsp&nbsp<a href="homepage.jsp" target="_blank">oneforall</a>
                <button type="submit" onclick="">
            </div>


            <div id="content">

                <div id="subcontent">
                    <iframe src="https://www.youtube.com/embed/rmNK0Rh8gTY?controls=0"></iframe><br><br>
                    <iframe src="https://www.youtube.com/embed/rmNK0Rh8gTY?controls=0"></iframe><br><br>
                    <iframe src="https://www.youtube.com/embed/tVP-aWrFwXE?controls=0"></iframe><br><br>
                    <iframe src="https://www.youtube.com/embed/pefzSBTd0m0?controls=0"></iframe><br><br>
                    <iframe src="https://www.youtube.com/embed/wLJxrEjYY4w?controls=0"></iframe><br><br>
                </div>


                <div id="incontent">
                    <ul>
                        <div id="list1"><li><a href="Calculas.jsp?userId=${userId}">CALCULAS</a></li></div><br>
                        <div id="list2"><li><a href="Compro.jsp?userId=${userId}">COMPROGRAMMING</a></li></div><br>
                        <div id="list1"><li><a href="Platform.jsp?userId=${userId}">PLATFORM</a></li></div><br>
                        <div id="list2"><li><a href="Webtech.jsp?userId=${userId}">WEBTECH</a></li></div><br>
                        <ul>
                </div>


            </div>


                <div id="footer">
                   <p>2017 &copy; KADEMY( <a id="fbkademy" href="https://www.facebook.com/groups/962608370536714/" target="_blank">Team-return</a> )</p>
                </div>

       </div>

       </body>
    </html>

