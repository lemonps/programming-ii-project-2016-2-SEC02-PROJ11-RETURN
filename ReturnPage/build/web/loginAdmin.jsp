<%-- 
    Document   : LoginP
    Created on : Apr 26, 2017, 8:37:06 PM
    Author     : homun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/simple-line-icons/simple-line-icons.css" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="assets/global/plugins/bootstrap-switch/css/bootstrap-switch.css" rel="stylesheet" type="text/css" />

        <link href="assets/global/css/components-md.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="assets/global/css/plugins-md.css" rel="stylesheet" type="text/css" />
        <link href="assets/layouts/layout3/css/layout.css" rel="stylesheet" type="text/css" />
        <link href="assets/layouts/layout3/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="assets/layouts/layout3/css/custom.css" rel="stylesheet" type="text/css" />
        <link rel="shortcut icon" href="favicon.ico" />
        <style>
            a{
                color:black;   

            }

        </style>
    </head>
    <body class="page-container-bg-solid page-md">
        <div class="page-wrapper">

            <div class="page-wrapper-row full-height">
                <div class="page-wrapper-middle">
                    <div class="page-container">
                        <div class="page-content-wrapper">
                            <div class="page-content">
                                <div class="container">
                                    <div class="page-header-top">
                                        <div class="container">
                                            <div class="page-logo">
                                                <a href="index.html">
                                                    <img src="img/kademy.png" alt="logo" style="margin-top: 20px;" width="70px" height="70px">
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="portlet light ">
                                                <div class="portlet-title">
                                                    <div class="caption font-kademy">
                                                        <span class="caption-subject bold uppercase"> What is KADEMY ? </span>
                                                    </div>
                                                </div>
                                                <div class="portlet-body form">
                                                    <p style="color: white;">เพราะการเรียนรู้คือสิ่งสำคัญ Kademy ได้ตระหนักถึงความสำคัญของการเรียนรู้การเรียนในห้องเรียนคือสิ่งสำคัญ</p><br><br>
                                                </div>

                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="portlet light ">
                                                <div class="portlet-title">
                                                    <div class="caption font-kademy">
                                                        <i class="icon-settings font-kademy"></i>
                                                        <span class="caption-subject bold uppercase"> Login Admin</span>
                                                    </div>
                                                </div>
                                                <div class="portlet-body form">
                                                    <form role="form" id="form_sample_2" class="form-horizontal" action="LogServ" method="post">

                                                        <div class="form-body">

                                                            <div class="form-group form-md-line-input">
                                                                <label class="col-md-2 control-label" for="form_control_1"><i class="fa fa-user font-kademy" aria-hidden="true"></i></label>
                                                                <div class="col-md-6">
                                                                    <input type="text" class="form-control" name="username" id="form_control_1" placeholder="Username" required>
                                                                    <div class="form-control-focus"> </div>
                                                                </div>
                                                            </div>
                                                            <div class="form-group form-md-line-input">
                                                                <label class="col-md-2 control-label" for="form_control_2"><i class="fa fa-unlock-alt font-kademy" aria-hidden="true"></i></label>
                                                                <div class="col-md-6">
                                                                    <input type="password" class="form-control" name="password" id="form_control_2" placeholder="Password" required>
                                                                    <div class="form-control-focus"> </div>
                                                                </div>
                                                            </div>
                                                            <div class="form-actions">
                                                                <div class="row">
                                                                    <div class="col-md-offset-2 col-md-10">
                                                                        <input type="submit" onclick="" id="loginbtn" class="btn btn-default" value="Sign in" disable>
                                                                        
                                                                        <button id="signAdButton" type="button" class="btn btn-default"><a href="login.jsp">Sign in(User)</a></button>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    </form>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
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

        <script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
        <script src="https://www.gstatic.com/firebasejs/3.5.0/firebase.js"></script>

    </body>
</html>

