<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<!--[if IE 9 ]>
 <html class="ie9"><![endif]-->
<head>
    <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
                <title>è®¢åç¡®è®¤</title>
                
                <!-- Vendor CSS -->
                <link href="vendors/bower_components/animate.css/animate.min.css" rel="stylesheet">
                    <link href="vendors/bower_components/bootstrap-sweetalert/lib/sweet-alert.css" rel="stylesheet">
                        <link href="vendors/bower_components/material-design-iconic-font/dist/css/material-design-iconic-font.min.css"
                            rel="stylesheet">
                            
                            
                            <!-- CSS -->
                            <link href="css/app.min.1.css" rel="stylesheet">
                                <link href="css/app.min.2.css" rel="stylesheet">
</head>

<body>
    <header id="header">
        <ul class="header-inner">
            <li id="menu-trigger" data-trigger="#sidebar">
                <div class="line-wrap">
                    <div class="line top"></div>
                    <div class="line center"></div>
                    <div class="line bottom"></div>
                </div>
            </li>
            
            <li class="logo hidden-xs">
                <a href="index.html"></a>
            </li>
            
            <li class="pull-right">
                <ul class="top-menu">
                    <li id="toggle-width">
                        <div class="toggle-switch">
                            <input id="tw-switch" type="checkbox" hidden="hidden">
                                <label for="tw-switch" class="ts-helper"></label>
                                </div>
                    </li>
                    <li id="top-search">
                        <a class="tm-search" href=""></a>
                    </li>
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="tm-settings" href=""></a>
                        <ul class="dropdown-menu dm-icon pull-right">
                            <li class="hidden-xs">
                                <a data-action="fullscreen" href=""><i class="zmdi zmdi-fullscreen"></i> Toggle Fullscreen</a>
                            </li>
                            <li>
                                <a data-action="clear-localstorage" href=""><i class="zmdi zmdi-delete"></i> Clear Local Storage</a>
                            </li>
                            <li>
                                <a href=""><i class="zmdi zmdi-face"></i> Privacy Settings</a>
                            </li>
                            <li>
                                <a href=""><i class="zmdi zmdi-settings"></i> Other Settings</a>
                            </li>
                        </ul>
                    </li>
                    </li>
        </ul>
        
        <!-- Top Search Content -->
        <div id="top-search-wrap">
            <input type="text">
                <i id="top-search-close">&times;</i>
                </div>
    </header>
    
    <div class="container">
        <div class="card">
            <div class="card-header">
                <h2>订单状态<small>${status}</small></h2>
            </div>
        </div>
    </div>
    
    <footer id="footer">
        Copyright &copy; 2016 Lively
        
        <ul class="f-menu">
            <li><a href="">Home</a></li>
            <li><a href="">Dashboard</a></li>
            <li><a href="">Reports</a></li>
            <li><a href="">Support</a></li>
            <li><a href="">Contact</a></li>
        </ul>
    </footer>
    
    <!-- Older IE warning message -->
    <!--[if lt IE 9]>
     <div class="ie-warning">
     <h1 class="c-white">Warning!!</h1>
     <p>You are using an outdated version of Internet Explorer, please upgrade <br/>to any of the following web browsers to
     access this website.</p>
     <div class="iew-container">
     <ul class="iew-download">
     <li>
     <a href="http://www.google.com/chrome/">
     <img src="img/browsers/chrome.png" alt="">
     <div>Chrome</div>
     </a>
     </li>
     <li>
     <a href="https://www.mozilla.org/en-US/firefox/new/">
     <img src="img/browsers/firefox.png" alt="">
     <div>Firefox</div>
     </a>
     </li>
     <li>
     <a href="http://www.opera.com">
     <img src="img/browsers/opera.png" alt="">
     <div>Opera</div>
     </a>
     </li>
     <li>
     <a href="https://www.apple.com/safari/">
     <img src="img/browsers/safari.png" alt="">
     <div>Safari</div>
     </a>
     </li>
     <li>
     <a href="http://windows.microsoft.com/en-us/internet-explorer/download-ie">
     <img src="img/browsers/ie.png" alt="">
     <div>IE (New)</div>
     </a>
     </li>
     </ul>
     </div>
     <p>Sorry for the inconvenience!</p>
     </div>
     <![endif]-->
    
    <!-- Javascript Libraries -->
    <script src="vendors/bower_components/jquery/dist/jquery.min.js"></script>
    <script src="vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    
    <script src="vendors/bower_components/jquery.nicescroll/jquery.nicescroll.min.js"></script>
    <script src="vendors/bower_components/Waves/dist/waves.min.js"></script>
    <script src="vendors/bootstrap-growl/bootstrap-growl.min.js"></script>
    <script src="vendors/bower_components/bootstrap-sweetalert/lib/sweet-alert.min.js"></script>
    
    <!-- Placeholder for IE9 -->
    <!--[if IE 9 ]>
     <script src="vendors/bower_components/jquery-placeholder/jquery.placeholder.min.js"></script>
     <![endif]-->
    
    <script src="js/functions.js"></script>
    <script src="js/demo.js"></script>
</body>
</html>