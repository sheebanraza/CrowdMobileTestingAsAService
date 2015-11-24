<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content="Team 12 MTaaS Project"/>
    <meta name="author" content="Rahul"/>
    <meta name="keywords" content="Team 12 MTaaS Project, T'estPier, TestPier, Crowd Sourcing, SJSU Project"/>
    <link rel="canonical" href="#">


</head>
<body class="set-body">


<div id="wrapper">
    <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><font face="Georgia, Times New Roman, Times, serif"><strong><font
                    color="#42AFDF">T</font></strong>'EST<strong><font color="#000000">P</font></strong>IER</font>
            </a>
        </div>

        <div class="notifications-wrapper">
            <ul class="nav">


                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-cogs"></i><i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user pull-right">
                        <li><a href="login.html"><i class="fa fa-user"></i>My Account</a>
                        </li>

                    </ul>
                </li>
            </ul>

        </div>
    </nav>
    <!-- /. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <div class="user-div">
                        <h4>&nbsp;&nbsp; Welcome, User !</h4>
                    </div>

                </li>

                <li>
                    <a href="login.html"><i class="fa fa-cogs "></i>Sign In </a>
                </li>
                <li>
                    <a href="index.html"><i class="fa fa-sitemap "></i>Home Page </a>
                </li>

                <li>
                    <a href="blank.html"><i class="fa fa-table "></i>Blank Page </a>
                </li>
            </ul>
        </div>

    </nav>
    <!-- /. SIDEBAR MENU (navbar-side) -->
    <div id="page-wrapper" class="page-wrapper-cls">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-head-line">Register</h1>
                </div>
            </div>

            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        BASIC INFO
                    </div>
                    <div class="panel-body">

                        <div class="form-group">
                            <label for="fname">First Name *</label>
                            <input type="text" class="form-control" id="fname" placeholder="Enter First Name"/>
                        </div>

                        <div class="form-group">
                            <label for="lname">Last Name *</label>
                            <input type="text" class="form-control" id="lname" placeholder="Enter Last Name"/>
                        </div>

                        <div class="form-group">
                            <label for="Email">Email address *</label>
                            <input type="email" class="form-control" id="email" placeholder="Enter email "/>
                        </div>
                        <div class="form-group">
                            <label for="userName">User Name *</label>
                            <input type="text" class="form-control" id="userName" placeholder="User Name"/>
                        </div>

                        <div class="form-group">
                            <label for="Password">Password *</label>
                            <input type="password" class="form-control" id="password" placeholder="Password"/>
                        </div>

                        <div class="form-group">
                            <label for="phone">Phone Number*</label>
                            <input type="text" value="" pattern="\d*" class="form-control" id="phone"
                                   placeholder="Enter Cell Number"/>
                        </div>
                        <div class="form-group">
                            <label for="usertype">User Type*</label>
                            <select class="form-control" id="utype" placeholder="Select User Type"/>
                            <option>Select User Type</option>
                            <option value="A">App Provider</option>
                            <option value="T">Tester</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Avatar
                    </div>
                    <div class="panel-body">
                        <p>Uploaded avatars should be square. Acceptable file types are .jpg, .jpeg, .gif, and .png.</p>

                        <div class="form-group">
                            <label for="exampleInputFile">File input</label>
                            <input type="file" id="exampleInputFile"/>
                        </div>

                    </div>
                </div>
            </div>

        </div>
        <p>All content, including avatars , are all subject to our Terms & Conditions. By registering an account, you
            attest that you have read and agree to our Terms of Use and Privacy & Security Policy.<br>Terms & Conditions
            | Rules of Engagement | Privacy & Security Policy</p>


        <div class="checkbox">
            <label>
                <input type="checkbox"/> I Agree
            </label>
        </div>


        <button type="button" class="btn btn-primary" id="register" align="Center">Register</button>
    </div>
</div>
</div>
<!-- /. WRAPPER  -->
<footer>
    &copy; 2015 Team'12 | For : Cloud Computing(281)
</footer>

<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.metisMenu.js"></script>
<script src="assets/js/custom.js"></script>
<script src="assets/js/jquery-1.11.1.js"></script>
<script type="text/javascript">

    var jq = $(document).ready(function () {
        console.log("Loadeddddddd");

        $('#register').click(function () {
            window.location.href = '/registerUser/MobileCrowdTesting.htm?firstName=' + $('#fname').val() +
                    '&lastName=' + $('#lname').val() + '&password=' + $('#password').val() + '&email=' + $('#email').val()
                    + '&phone=' + $('#phone').val() + '&userType=' + $('#utype').val() + '&userName=' + $('#userName').val();
        });

    });


</script>
</body>
</html>
