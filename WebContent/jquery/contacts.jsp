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
  <title>网络订餐平台</title>

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
      <a href="index.html">欢迎使用网络订餐平台</a>
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
                        <div class="dropdown-menu dropdown-menu-lg pull-right">
                          <div class="listview">
                            <div class="lv-header">
                              Messages
                            </div>
                            <div class="lv-body">
                              <a class="lv-item" href="">
                                <div class="media">
                                  <div class="pull-left">
                                    <img class="lv-img-sm" src="img/profile-pics/1.jpg" alt="">
                                  </div>
                                  <div class="media-body">
                                    <div class="lv-title">David Belle</div>
                                    <small class="lv-small">Cum sociis natoque penatibus et magnis dis parturient
                                      montes
                                    </small>
                                  </div>
                                </div>
                              </a>
                              <a class="lv-item" href="">
                                <div class="media">
                                  <div class="pull-left">
                                    <img class="lv-img-sm" src="img/profile-pics/2.jpg" alt="">
                                  </div>
                                  <div class="media-body">
                                    <div class="lv-title">Jonathan Morris</div>
                                    <small class="lv-small">Nunc quis diam diamurabitur at dolor elementum, dictum
                                      turpis vel
                                    </small>
                                  </div>
                                </div>
                              </a>
                              <a class="lv-item" href="">
                                <div class="media">
                                  <div class="pull-left">
                                    <img class="lv-img-sm" src="img/profile-pics/3.jpg" alt="">
                                  </div>
                                  <div class="media-body">
                                    <div class="lv-title">Fredric Mitchell Jr.</div>
                                    <small class="lv-small">Phasellus a ante et est ornare accumsan at vel magnauis
                                      blandit turpis at augue ultricies
                                    </small>
                                  </div>
                                </div>
                              </a>
                              <a class="lv-item" href="">
                                <div class="media">
                                  <div class="pull-left">
                                    <img class="lv-img-sm" src="img/profile-pics/4.jpg" alt="">
                                  </div>
                                  <div class="media-body">
                                    <div class="lv-title">Glenn Jecobs</div>
                                    <small class="lv-small">Ut vitae lacus sem ellentesque maximus, nunc sit amet varius
                                      dignissim, dui est consectetur neque
                                    </small>
                                  </div>
                                </div>
                              </a>
                              <a class="lv-item" href="">
                                <div class="media">
                                  <div class="pull-left">
                                    <img class="lv-img-sm" src="img/profile-pics/4.jpg" alt="">
                                  </div>
                                  <div class="media-body">
                                    <div class="lv-title">Bill Phillips</div>
                                    <small class="lv-small">Proin laoreet commodo eros id faucibus. Donec ligula quam,
                                      imperdiet vel ante placerat
                                    </small>
                                  </div>
                                </div>
                              </a>
                            </div>
                            <a class="lv-footer" href="">View All</a>
                          </div>
                        </div>
        </li>
        <li class="dropdown">
          <a  class="tm-notification" href="detail"><i class="tmn-counts">菜篮子</i></a>
          <div class="dropdown-menu dropdown-menu-lg pull-right">
            <div class="listview" id="notifications">
              <div class="lv-header">
                Notification

                <ul class="actions">
                  <li class="dropdown">
                    <a href="" data-clear="notification">
                      <i class="zmdi zmdi-check-all"></i>
                    </a>
                  </li>
                </ul>
              </div>
              <div class="lv-body">
                <a class="lv-item" href="">
                  <div class="media">
                    <div class="pull-left">
                      <img class="lv-img-sm" src="img/profile-pics/1.jpg" alt="">
                    </div>
                    <div class="media-body">
                      <div class="lv-title">David Belle</div>
                      <small class="lv-small">Cum sociis natoque penatibus et magnis dis parturient montes</small>
                    </div>
                  </div>
                </a>
                <a class="lv-item" href="">
                  <div class="media">
                    <div class="pull-left">
                      <img class="lv-img-sm" src="img/profile-pics/2.jpg" alt="">
                    </div>
                    <div class="media-body">
                      <div class="lv-title">Jonathan Morris</div>
                      <small class="lv-small">Nunc quis diam diamurabitur at dolor elementum, dictum turpis vel</small>
                    </div>
                  </div>
                </a>
                <a class="lv-item" href="">
                  <div class="media">
                    <div class="pull-left">
                      <img class="lv-img-sm" src="img/profile-pics/3.jpg" alt="">
                    </div>
                    <div class="media-body">
                      <div class="lv-title">Fredric Mitchell Jr.</div>
                      <small class="lv-small">Phasellus a ante et est ornare accumsan at vel magnauis blandit turpis at
                        augue ultricies
                      </small>
                    </div>
                  </div>
                </a>
                <a class="lv-item" href="">
                  <div class="media">
                    <div class="pull-left">
                      <img class="lv-img-sm" src="img/profile-pics/4.jpg" alt="">
                    </div>
                    <div class="media-body">
                      <div class="lv-title">Glenn Jecobs</div>
                      <small class="lv-small">Ut vitae lacus sem ellentesque maximus, nunc sit amet varius dignissim,
                        dui est consectetur neque
                      </small>
                    </div>
                  </div>
                </a>
                <a class="lv-item" href="">
                  <div class="media">
                    <div class="pull-left">
                      <img class="lv-img-sm" src="img/profile-pics/4.jpg" alt="">
                    </div>
                    <div class="media-body">
                      <div class="lv-title">Bill Phillips</div>
                      <small class="lv-small">Proin laoreet commodo eros id faucibus. Donec ligula quam, imperdiet vel
                        ante placerat
                      </small>
                    </div>
                  </div>
                </a>
              </div>

              <a class="lv-footer" href="">View Previous</a>
            </div>

          </div>
        </li>
        <li class="dropdown hidden-xs">
          <a  class="tm-task" href="./jquery/chenggong.jsp"><i class="tmn-counts">订单状态</i></a>
          <div class="dropdown-menu pull-right dropdown-menu-lg">
            <div class="listview">
              <div class="lv-header">
                Tasks
              </div>
              <div class="lv-body">
                <div class="lv-item">
                  <div class="lv-title m-b-5">HTML5 Validation Report</div>

                  <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="95" aria-valuemin="0"
                         aria-valuemax="100" style="width: 95%">
                      <span class="sr-only">95% Complete (success)</span>
                    </div>
                  </div>
                </div>
                <div class="lv-item">
                  <div class="lv-title m-b-5">Google Chrome Extension</div>

                  <div class="progress">
                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="80"
                         aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                      <span class="sr-only">80% Complete (success)</span>
                    </div>
                  </div>
                </div>
                <div class="lv-item">
                  <div class="lv-title m-b-5">Social Intranet Projects</div>

                  <div class="progress">
                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0"
                         aria-valuemax="100" style="width: 20%">
                      <span class="sr-only">20% Complete</span>
                    </div>
                  </div>
                </div>

                <div class="lv-item">


                  <div class="progress">

                  </div>
                </div>
              </div>

              <a class="lv-footer" href="">View All</a>
            </div>
          </div>
        </li>
      </ul>

      <!-- Top Search Content -->
      <div id="top-search-wrap">
        <input type="text">
        <i id="top-search-close">&times;</i>
      </div>
</header>

<section id="main">
  <aside id="sidebar">
    <div class="sidebar-inner c-overflow">
      <div class="profile-menu">
        <a href="">
          <div class="profile-pic">
            <img src="img/profile-pics/1.jpg" alt="">
          </div>

          <div class="profile-info">
            Malinda Hollaway

            <i class="zmdi zmdi-arrow-drop-down"></i>
          </div>
        </a>

        <ul class="main-menu">
          <li>
            <a href="profile-about.html"><i class="zmdi zmdi-account"></i> View Profile</a>
          </li>
          <li>
            <a href=""><i class="zmdi zmdi-input-antenna"></i> Privacy Settings</a>
          </li>
          <li>
            <a href=""><i class="zmdi zmdi-settings"></i> Settings</a>
          </li>
          <li>
            <a href=""><i class="zmdi zmdi-time-restore"></i> Logout</a>
          </li>
        </ul>
      </div>

      <ul class="main-menu">
        <li><a href="index.html"><i class="zmdi zmdi-home"></i> Home</a></li>
        <li><a href="typography.html"><i class="zmdi zmdi zmdi-format-underlined"></i> Typography</a></li>
        <li class="sub-menu">
          <a href=""><i class="zmdi zmdi-widgets"></i> Widgets</a>

          <ul>
            <li><a href="widget-templates.html">Templates</a></li>
            <li><a class="active" href="widgets.html">Widgets</a></li>
          </ul>
        </li>
        <li class="sub-menu">
          <a href=""><i class="zmdi zmdi-view-list"></i> Tables</a>

          <ul>
            <li><a href="tables.html">Normal Tables</a></li>
            <li><a href="data-tables.html">Data Tables</a></li>
          </ul>
        </li>
        <li class="sub-menu">
          <a href=""><i class="zmdi zmdi-collection-text"></i> Forms</a>

          <ul>
            <li><a href="form-elements.html">Basic Form Elements</a></li>
            <li><a href="form-components.html">Form Components</a></li>
            <li><a href="form-examples.html">Form Examples</a></li>
            <li><a href="form-validations.html">Form Validation</a></li>
          </ul>
        </li>
        <li class="sub-menu">
          <a href=""><i class="zmdi zmdi-swap-alt"></i>User Interface</a>
          <ul>
            <li><a href="colors.html">Colors</a></li>
            <li><a href="animations.html">Animations</a></li>
            <li><a href="box-shadow.html">Box Shadow</a></li>
            <li><a href="buttons.html">Buttons</a></li>
            <li><a href="icons.html">Icons</a></li>
            <li><a href="alerts.html">Alerts</a></li>
            <li><a href="notification-dialog.html">Notifications & Dialogs</a></li>
            <li><a href="media.html">Media</a></li>
            <li><a href="components.html">Components</a></li>
            <li><a href="other-components.html">Others</a></li>
          </ul>
        </li>
        <li class="sub-menu">
          <a href=""><i class="zmdi zmdi-trending-up"></i>Charts</a>
          <ul>
            <li><a href="flot-charts.html">Flot Charts</a></li>
            <li><a href="other-charts.html">Other Charts</a></li>
          </ul>
        </li>
        <li><a href="calendar.html"><i class="zmdi zmdi-calendar"></i> Calendar</a></li>
        <li class="sub-menu">
          <a href=""><i class="zmdi zmdi-image"></i>Photo Gallery</a>
          <ul>
            <li><a href="photos.html">Default</a></li>
            <li><a href="photo-timeline.html">Timeline</a></li>
          </ul>
        </li>

        <li><a href="generic-classes.html"><i class="zmdi zmdi-layers"></i> Generic Classes</a></li>
        <li class="sub-menu active toggled">
          <a href=""><i class="zmdi zmdi-collection-item"></i> Sample Pages</a>
          <ul>

            <li><a href="profile-about.html">Profile</a></li>
            <li><a href="list-view.html">List View</a></li>
            <li><a href="messages.html">Messages</a></li>
            <li><a href="pricing-table.html">Pricing Table</a></li>
            <li><a class="active" href="contacts.html">Contacts</a></li>
            <li><a href="wall.html">Wall</a></li>
            <li><a href="invoice.html">Invoice</a></li>
            <li><a href="login.html">Login and Sign Up</a></li>
            <li><a href="lockscreen.html">Lockscreen</a></li>
            <li><a href="404.html">Error 404</a></li>

          </ul>
        </li>
      </ul>
    </div>
  </aside>

  <aside id="chat">
    <ul class="tab-nav tn-justified" role="tablist">
      <li role="presentation" class="active"><a href="#friends" aria-controls="friends" role="tab" data-toggle="tab">Friends</a>
      </li>
      <li role="presentation"><a href="#online" aria-controls="online" role="tab" data-toggle="tab">Online Now</a></li>
    </ul>

    <div class="chat-search">
      <div class="fg-line">
        <input type="text" class="form-control" placeholder="Search People">
      </div>
    </div>

    <div class="tab-content">
      <div role="tabpanel" class="tab-pane fade in active" id="friends">
        <div class="listview">
          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/2.jpg" alt="">
                <i class="chat-status-busy"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Jonathan Morris</div>
                <small class="lv-small">Available</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left">
                <img class="lv-img-sm" src="img/profile-pics/1.jpg" alt="">
              </div>
              <div class="media-body">
                <div class="lv-title">David Belle</div>
                <small class="lv-small">Last seen 3 hours ago</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/3.jpg" alt="">
                <i class="chat-status-online"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Fredric Mitchell Jr.</div>
                <small class="lv-small">Availble</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/4.jpg" alt="">
                <i class="chat-status-online"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Glenn Jecobs</div>
                <small class="lv-small">Availble</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left">
                <img class="lv-img-sm" src="img/profile-pics/5.jpg" alt="">
              </div>
              <div class="media-body">
                <div class="lv-title">Bill Phillips</div>
                <small class="lv-small">Last seen 3 days ago</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left">
                <img class="lv-img-sm" src="img/profile-pics/6.jpg" alt="">
              </div>
              <div class="media-body">
                <div class="lv-title">Wendy Mitchell</div>
                <small class="lv-small">Last seen 2 minutes ago</small>
              </div>
            </div>
          </a>
          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/7.jpg" alt="">
                <i class="chat-status-busy"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Teena Bell Ann</div>
                <small class="lv-small">Busy</small>
              </div>
            </div>
          </a>
        </div>
      </div>
      <div role="tabpanel" class="tab-pane fade" id="online">
        <div class="listview">
          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/2.jpg" alt="">
                <i class="chat-status-busy"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Jonathan Morris</div>
                <small class="lv-small">Available</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/3.jpg" alt="">
                <i class="chat-status-online"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Fredric Mitchell Jr.</div>
                <small class="lv-small">Availble</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/4.jpg" alt="">
                <i class="chat-status-online"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Glenn Jecobs</div>
                <small class="lv-small">Availble</small>
              </div>
            </div>
          </a>

          <a class="lv-item" href="">
            <div class="media">
              <div class="pull-left p-relative">
                <img class="lv-img-sm" src="img/profile-pics/7.jpg" alt="">
                <i class="chat-status-busy"></i>
              </div>
              <div class="media-body">
                <div class="lv-title">Teena Bell Ann</div>
                <small class="lv-small">Busy</small>
              </div>
            </div>
          </a>
        </div>
      </div>
    </div>
  </aside>


  <section id="content">

    <div class="container">

      <div class="block-header">
        <h2>Contacts
          <small>Manage your contact information</small>
        </h2>

        <ul class="actions m-t-20 hidden-xs">
          <li class="dropdown">
            <a href="" data-toggle="dropdown">
              <i class="zmdi zmdi-more-vert"></i>
            </a>

            <ul class="dropdown-menu dropdown-menu-right">
              <li>
                <a href="">Privacy Settings</a>
              </li>
              <li>
                <a href="">Account Settings</a>
              </li>
              <li>
                <a href="">Other Settings</a>
              </li>
            </ul>
          </li>
        </ul>
      </div>

      <!-- Add button -->
      <button class="btn btn-float btn-danger m-btn"><i class="zmdi zmdi-plus"></i></button>


      <div class="card">
        <div class="lv-header-alt clearfix m-b-5">
          <h2 class="lvh-label hidden-xs">20 Records</h2>

          <div class="lvh-search">
            <input type="text" placeholder="Start typing..." class="lvhs-input">

            <i class="lvh-search-close">&times;</i>
          </div>

          <ul class="lv-actions actions">
            <li>
              <a href="" class="lvh-search-trigger">
                <i class="zmdi zmdi-search"></i>
              </a>
            </li>
            <li>
              <a href="">
                <i class="zmdi zmdi-time"></i>
              </a>
            </li>
            <li class="dropdown">
              <a href="" data-toggle="dropdown"="" aria-expanded="false" aria-haspopup="true">
              <i class="zmdi zmdi-sort"></i>
              </a>

              <ul class="dropdown-menu dropdown-menu-right">
                <li>
                  <a href="">Last Modified</a>
                </li>
                <li>
                  <a href="">Last Edited</a>
                </li>
                <li>
                  <a href="">Name</a>
                </li>
                <li>
                  <a href="">Date</a>
                </li>
              </ul>
            </li>
            <li>
              <a href="">
                <i class="zmdi zmdi-info"></i>
              </a>
            </li>
            <li class="dropdown">
              <a href="" data-toggle="dropdown"="" aria-expanded="false" aria-haspopup="true">
              <i class="zmdi zmdi-more-vert"></i>
              </a>

              <ul class="dropdown-menu dropdown-menu-right">
                <li>
                  <a href="">Refresh</a>
                </li>
                <li>
                  <a href="">Settings</a>
                </li>
              </ul>
            </li>
          </ul>
        </div>

        <!-- in this way you can add the food here -->
        
        <div class="contacts clearfix row">
            <s:iterator value="orderdished" id='info' status="L">
            <div class="col-md-3">
              <div class="c-item">
                <a href="" class="ci-avatar">
                  <img src=".${info.url}" alt="">
                </a>

                <div class="c-info">
                  <strong>${info.name}</strong>
                  <small>${info.price}</small>
                </div>
                <div class="c-footer">
                  <button class="waves-effect" onclick="javascript:clickButton(${info.dishid})"><i
                      class="zmdi zmdi-person-add"></i> Add
                  <tton>
                </div>
              </div>        
            </div>
            </s:iterator>
          </div>
       

          <div class="load-more">
            <a href=""><i class="zmdi zmdi-refresh-alt"></i> Load More...</a>
          </div>
        </div>
      </div>
    </div>

  </section>
</section>

<footer id="footer">
  Copyright &copy; 2015 Material Admin

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

<SCRIPT type="text/javascript">
  function clickButton(str) {
    var url = 'order.action';
    var params = {
      dishid: str
    };
    jQuery.post(url, params, callbackFun, 'json');
  }
  function callbackFun(data) {
    alert("点餐成功");//瀵瑰簲HelloWorld绫荤殑message灞炴�
    //鑾峰彇鏁版嵁鍚庢覆鏌撻〉闈�
  }
</SCRIPT>


</body>
</html>