<%-- 
    Document   : return-main
    Created on : Apr 28, 2017, 3:47:55 PM
    Author     : homun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <a href="result.jsp"></a>
        <meta charset="utf-8" />
        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/simple-line-icons/simple-line-icons.css" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/bootstrap-switch/css/bootstrap-switch.css" rel="stylesheet" type="text/css" />
        <link href="assets/kookle.css" rel="stylesheet" type="text/css" />
        <link href="assets/global/css/components-md.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="assets/global/css/plugins-md.css" rel="stylesheet" type="text/css" />
        <link href="assets/layouts/layout3/css/layout.css" rel="stylesheet" type="text/css" />
        <link href="assets/layouts/layout3/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="assets/layouts/layout3/css/custom.css" rel="stylesheet" type="text/css" />
        <link rel="shortcut icon" href="favicon.ico" />
        <link href="assets/apps/css/todo.css" rel="stylesheet" type="text/css">
    </head>
    <body class="page-container-bg-solid page-md">
        <div class="page-wrapper">
            <div class="page-wrapper-row">
                <div class="page-wrapper-top">
                    <!-- BEGIN HEADER -->
                    <div class="page-header">
                        <!-- BEGIN HEADER TOP -->
                        <div class="page-header-top">
                            <div class="container">
                                <!-- BEGIN LOGO -->
                                <div class="page-logo">
                                    <div class="container">
                                        <img src="img/kademy.png" alt="logo" width="70px" height="70px">
                                    </div>

                                </div>

                                <!-- END LOGO -->
                                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                                <a href="javascript:;" class="menu-toggler"></a>
                                <!-- END RESPONSIVE MENU TOGGLER -->
                                <!-- BEGIN TOP NAVIGATION MENU -->
                                <div class="top-menu">
                                    <ul class="nav navbar-nav pull-right">
                                        <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" id="header_notification_bar">
                                            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                                <i class="icon-bell"></i>
                                                <span class="badge badge-default">7</span>
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li class="external">
                                                    <h3>Your
                                                        <strong>Notification</strong> tasks</h3>
                                                    <a href="notification.html">view all</a>
                                                </li>
                                                <li>
                                                    <ul class="dropdown-menu-list scroller" style="height: 250px;" data-handle-color="#637283">
                                                        <li>
                                                            <a href="video-subject.html">
                                                                <span class="time">just now</span>
                                                                <span class="details">
                                                                    <span class="label label-sm label-icon label-success">
                                                                        <i class="fa fa-plus"></i>
                                                                    </span> New MTH111 video available </span>
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="question.html">
                                                                <span class="time">10 mins</span>
                                                                <span class="details">
                                                                    <span class="label label-sm label-icon label-warning">
                                                                        <i class="fa fa-bell-o"></i>
                                                                    </span> New answer on Omise re-brand </span>
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="question.html">
                                                                <span class="time">30 mins</span>
                                                                <span class="details">
                                                                    <span class="label label-sm label-icon label-warning">
                                                                        <i class="fa fa-bell-o"></i>
                                                                    </span> New answer on Omise re-brand </span>
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="question.html">
                                                                <span class="time">40 mins</span>
                                                                <span class="details">
                                                                    <span class="label label-sm label-icon label-warning">
                                                                        <i class="fa fa-bell-o"></i>
                                                                    </span> New answer on Omise re-brand </span>
                                                            </a>
                                                        </li>

                                                        <li>
                                                            <a href="matew.html">
                                                                <span class="time">9 days</span>
                                                                <span class="details">
                                                                    <span class="label label-sm label-icon label-danger">
                                                                        <i class="fa fa-bolt"></i>
                                                                    </span> Tutorial video ready to watch again </span>
                                                            </a>
                                                        </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>

                                        <!-- BEGIN INBOX DROPDOWN -->

                                        <!-- BEGIN USER LOGIN DROPDOWN -->
                                        <li class="dropdown dropdown-user dropdown-dark">
                                            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                                <span class="username">${name}</span>
                                            </a>

                                            <ul class="dropdown-menu dropdown-menu-default">
                                                <li>
                                                    <a href="page_user_profile_1.html">
                                                        <i class="icon-user"></i> My Profile </a>
                                                </li>
                                                <li class="divider"> </li>
                                                <li>
                                                    <a href="page_user_login_1.html">
                                                        <i class="icon-key"></i> Log Out </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <!-- END USER LOGIN DROPDOWN -->
                                        <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                                        <li class="dropdown dropdown-extended quick-sidebar-toggler">
                                            <span class="sr-only">Toggle Quick Sidebar</span>
                                            <i class="icon-logout"></i>
                                        </li>
                                        <!-- END QUICK SIDEBAR TOGGLER -->
                                    </ul>
                                </div>
                                <!-- END TOP NAVIGATION MENU -->
                            </div>
                        </div>
                        <form id="searchdata" action="SeachVideo" method="POST" onsubmit="return Check();" >
                            <div class="search-page search-content-2">
                                <div class="search-bar">
                                    <div class="input-group">

                                        <input type="text" name="title" id="eiei" class="form-control" placeholder="Search for...">
                                        <span class="input-group-btn">
                                            <input type="submit" onClick="Check()" name="GO" class="btn blue uppercase bold" value="Search">Search
                                        </span>
                                    </div>
                                </div>

                            </div>
                        </form>
                        <script type="text/javascript">
                            function Check() {
                                myvalue = document.getElementById("eiei").value;
                                if (myvalue == "") {
                                    window.alert("Please try agiain ");
                                    return false;
                                } else {
                                    return true;
                                }


                            }
                        </script>                                         

                        <!-- END HEADER TOP -->
                        <!-- BEGIN HEADER MENU -->
                        <div class="page-header-menu">

                            <div class="container">
                                <div class="hor-menu">
                                    <ul class="nav navbar-nav">
                                        <li>
                                            <a  href="main.html">Home
                                            </a>
                                        </li>
                                        <li class="active">
                                            <a href="return-main.jsp">Return
                                            </a>
                                        </li>
                                        <li>
                                            <a href="matew.html">Ma-Tew
                                            </a>
                                        </li>
                                        <li>
                                            <a href="kookle.html">Kookle
                                            </a>
                                        </li>
                                        <li>
                                            <a href="one-4-all.html">One for all
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                        <!-- END HEADER MENU -->
                    </div>
                    <!-- END HEADER -->
                </div>
            </div>
            <div class="page-wrapper-row full-height">
                <div class="page-wrapper-middle">
                    <div class="page-container">
                        <div class="page-content-wrapper">
                            <div class="page-content">
                                <div class="container">
                                    <!-- Return and matew-->
                                    <div class="row">
                                        <!-- RETURN -->
                                        <div class="col-md-9">
                                            <div class="portlet light">
                                                <div class="portlet-title">
                                                    <div class="caption font-kademy">
                                                        <img src="img/return_white.png"><span class="caption-subject bold uppercase">Return : Back to class room activities with high quality video</span>
                                                    </div>
                                                </div>
                                                <div class="portlet-body form">
                                                    <div class="container">

                                                        <div class="row" >
                                                            <div class="col-md-6">
                                                                <div class="todo-container">
                                                                    <a href="CalServ" onClick="">	<ul class="todo-projects-container">
                                                                            <li class="todo-projects-item">
                                                                                <h3>MTH 101 : CALCULUS I</h3>

                                                                                <div class="todo-project-item-foot">
                                                                                    <h5 class="todo-red todo-inline">10 videos</h5>
                                                                                </div>
                                                                            </li>
                                                                        </ul></a>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="row" >
                                                            <div class="col-md-6">
                                                                <div class="todo-container">
                                                                    <a href="PlatServ">	<ul class="todo-projects-container">
                                                                            <li class="todo-projects-item">
                                                                                <h3>INT 107 : PLATFORM </h3>

                                                                                <div class="todo-project-item-foot">
                                                                                    <h5 class="todo-red todo-inline">10 videos</h5>
                                                                                </div>
                                                                            </li>
                                                                        </ul></a>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="row" >
                                                            <div class="col-md-6">
                                                                <div class="todo-container">
                                                                    <a href="WebServ"><ul class="todo-projects-container">
                                                                            <li class="todo-projects-item">
                                                                                <h3>INT 106 : WEB TECHNOLOGY</h3>

                                                                                <div class="todo-project-item-foot">
                                                                                    <h5 class="todo-red todo-inline">4 videos</h5>
                                                                                </div>
                                                                            </li>
                                                                        </ul></a>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="row" >
                                                            <div class="col-md-6">
                                                                <div class="todo-container">
                                                                    <a href="ComProServ"><ul class="todo-projects-container">
                                                                            <li class="todo-projects-item">
                                                                                <h3>INT 105 : COMPUTER PROGRAMMING</h3>

                                                                                <div class="todo-project-item-foot">
                                                                                    <h5 class="todo-red todo-inline">5 videos</h5>
                                                                                </div>
                                                                            </li>
                                                                        </ul></a>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>




                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-md-3">
                                            <div class="portlet light">
                                                <div class="portlet-title">
                                                    <div class="caption font-kademy">
                                                        <span class="caption-subject bold uppercase">Recommend Video for you</span>
                                                    </div>
                                                </div>
                                                <div class="portlet-body">
                                                    <div class="mt-element-card mt-element-overlay">

                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="mt-card-item">
                                                                    <div class="mt-card-avatar mt-overlay-1">
                                                                        <a href="view-video-return.html"><img src="img/stary.png"></a>
                                                                    </div>
                                                                    <div class="mt-card-content">
                                                                        <h3 class="mt-card-name">PHY101 PHYSIC I</h3>
                                                                        <p class="mt-card-desc font-grey-cararra">AJ. ARAYA ROCKER</p>
                                                                        <p class="mt-card-desc font-grey-cararra">SEC.1 12.30-15.30</p>
                                                                        <p class="mt-card-desc font-grey-cararra">11 NOV 2016</p>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="mt-card-item">
                                                                    <div class="mt-card-avatar mt-overlay-1">
                                                                        <a href="view-video-return.html"><img src="img/stary.png"></a>
                                                                    </div>
                                                                    <div class="mt-card-content">
                                                                        <h3 class="mt-card-name">PHY101 PHYSIC I</h3>
                                                                        <p class="mt-card-desc font-grey-cararra">AJ. ARAYA ROCKER</p>
                                                                        <p class="mt-card-desc font-grey-cararra">SEC.1 12.30-15.30</p>
                                                                        <p class="mt-card-desc font-grey-cararra">11 NOV 2016</p>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="mt-card-item">
                                                                    <div class="mt-card-avatar mt-overlay-1">
                                                                        <a href="view-video-return.html"><img src="img/stary.png"></a>
                                                                    </div>
                                                                    <div class="mt-card-content">
                                                                        <h3 class="mt-card-name">PHY101 PHYSIC I</h3>
                                                                        <p class="mt-card-desc font-grey-cararra">AJ. ARAYA ROCKER</p>
                                                                        <p class="mt-card-desc font-grey-cararra">SEC.1 12.30-15.30</p>
                                                                        <p class="mt-card-desc font-grey-cararra">11 NOV 2016</p>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="mt-card-item">
                                                                    <div class="mt-card-avatar mt-overlay-1">
                                                                        <a href="view-video-return.html"><img src="img/stary.png"></a>
                                                                    </div>
                                                                    <div class="mt-card-content">
                                                                        <h3 class="mt-card-name">PHY101 PHYSIC I</h3>
                                                                        <p class="mt-card-desc font-grey-cararra">AJ. ARAYA ROCKER</p>
                                                                        <p class="mt-card-desc font-grey-cararra">SEC.1 12.30-15.30</p>
                                                                        <p class="mt-card-desc font-grey-cararra">11 NOV 2016</p>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="mt-card-item">
                                                                    <div class="mt-card-avatar mt-overlay-1">
                                                                        <a href="view-video-return.html"><img src="img/stary.png"></a>
                                                                    </div>
                                                                    <div class="mt-card-content">
                                                                        <h3 class="mt-card-name">PHY101 PHYSIC I</h3>
                                                                        <p class="mt-card-desc font-grey-cararra">AJ. ARAYA ROCKER</p>
                                                                        <p class="mt-card-desc font-grey-cararra">SEC.1 12.30-15.30</p>
                                                                        <p class="mt-card-desc font-grey-cararra">11 NOV 2016</p>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>






                                                    </div>
                                                </div>
                                            </div>
                                        </div>


                                    </div>
                                    <!-- END RETURN-->



                                </div>
                                <!-- END  Return and matew-->


                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="page-wrapper-row">
        <div class="page-wrapper-bottom">
            <!-- BEGIN FOOTER -->

            <!-- BEGIN INNER FOOTER -->
            <div class="page-footer">
                <div class="container"> 2016 &copy; KADEMY 2016
                </div>
            </div>
            <div class="scroll-to-top">
                <i class="icon-arrow-up"></i>
            </div>
            <!-- END INNER FOOTER -->
            <!-- END FOOTER -->
        </div>
    </div>
</div>
<script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<script src="https://www.gstatic.com/firebasejs/3.5.0/firebase.js"></script>
<script src="assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="assets/layouts/layout3/scripts/layout.min.js" type="text/javascript"></script>
<script src="assets/layouts/layout3/scripts/demo.min.js" type="text/javascript"></script>
<script src="assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
</body>
</html>

