<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<!--
=======================================================================================
 Event Planner HTML Template
 Kavish Parikh, Arun Malik, Mishal Shah, Shashank Garg
=======================================================================================
-->

<head>

    <!-- Basic Page Needs
  ================================================== -->
    <meta charset="utf-8">
    <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
    <title>EventPlanner</title>
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Mobile Specific Metas
  ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">

    <!-- CSS
  ================================================== -->
    <link rel="stylesheet" href="../assets/css/reset.css" media="all">
    <link rel="stylesheet" href="../assets/css/ut-fontface.css" media="all">
    <link rel="stylesheet" href="../assets/css/font-awesome.css" media="all">
    <link rel="stylesheet" href="../assets/css/flexslider.css" media="all">
    <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="all">
    <link rel="stylesheet" href="../assets/css/ut-responsive-grid.css" media="all">
    <link rel="stylesheet" href="../assets/css/style.css" media="all">
    <script src="../assets/js/jquery.min.js"></script>
  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" media="screen">
  <!-- Optional theme -->
  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">
  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

    <!-- DEMO Switcher
    ================================================== -->
    <link rel="stylesheet" href="../styleswitcher/css/styleswitcher.css">

    <!--[if lt IE 9]>
    <script src="js/html5.js"></script>
    <![endif]-->

    <!--[if lte IE 8]>
    <link rel="stylesheet" type="text/css" href="css/ie8.css" />
    <![endif]-->

    <!-- Favicons
    ================================================== -->
    <link rel="shortcut icon" href="../assets/images/favicon.ico">
    <link rel="apple-touch-icon" href="../assets/images/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="../assets/images/apple-touch-icon-e-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="../assets/images/apple-touch-icon-e-114x114.png">

    <!-- Load jQuery
      ================================================== -->
   
    <script src="../assets/js/modernizr.js"></script>
    <script src="../assets/js/device.min.js"></script>

    <!--<script src="jquery-1.5.min.js"></script>-->
    <!--<script src="jquery-ui-1.8.9.custom.min.js"></script>-->

    <!-- DEMO Switcher
    ================================================== -->
    <script src="../styleswitcher/js/styleswitcher.js"></script>

</head>

<body id="mainsite">

<!--<div id="ut_styleswitcher">-->
<!---->
<!--<div style="position: relative;">-->
<!---->
<!--<a href="#" class="toggle"></a>-->
<!--<h1>Color Switcher</h1>-->
<!---->
<!--<p>-->
<!--<a class="colorchange amethyst" href="index.html">Amethyst</a>-->
<!--<a class="colorchange asbestos" href="../darkgrey/index.html">Dark Grey</a>-->
<!--<a class="colorchange carrot" href="../carrot/index.html">Carrot</a>-->
<!--<a class="colorchange emerald" href="../green/index.html">Green</a>-->
<!--<a class="colorchange midnight" href="../midnightblue/index.html">Midnight Blue</a>-->
<!--<a class="colorchange river" href="../blue/index.html">Blue</a>-->
<!--<a class="colorchange pomegranate" href="../red/index.html">Red</a>-->
<!--<a class="colorchange pumpkin" href="../pumpkin/index.html">Pumpkin</a>-->
<!--<a class="colorchange sunflower" href="../yellow/index.html">Yellow</a>-->
<!--<a class="colorchange turquoise" href="../turquoise/index.html">Turquoise</a>-->
<!--</p>-->
<!---->
<!--<h1>Layout</h1>-->
<!--<input type="button" value="Video Header" onClick="location.href='index-video.htm'">-->
<!--<input type="button" value="Image Header" onClick="location.href='index-2.html'">-->
<!---->
<!--<br />-->
<!--<span class="info">This Panel is only for demo purposes! </span>-->
<!---->
<!--</div>-->
<!---->
<!--</div>-->

<a id="top"></a>

<!-- Page Layout
================================================== -->

<!-- header section -->
<header id="header-section" class="ha-header ha-header-hide">
    <div class="grid-container">
        <div class="ha-header-perspective">
            <div class="ha-header-front">
                <div class="grid-30 tablet-grid-20 hide-on-mobile">
                    <!--<h1 class="logo"><a href="#top"><img src="images/logo.png" alt="logo"></a></h1>-->
                </div>
                <nav id="ut-navigation" class="grid-70 tablet-grid-80 mobile-grid-100">
                    <a class="selected" href="#top">Home</a>
                    <a href="#main-content">About</a>
                    <a href="#service-section">Service</a>
                    <a href="#plan-event-section">Plan Event</a>
                    <a href="#team-section">Team</a>
                    <a href="#contact-section">Register</a>
                    <a class="btn pull-right" data-toggle="modal" data-target="#login">Login</a>
                   <!--<ul class="nav pull-right">
                      
                      <li class="divider-vertical"></li>
                       <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown">Sign In <strong class="caret"></strong></a>
                       <div class="dropdown-menu" style="padding: 15px; padding-bottom: 0px;">
               Login form here 
                      </div>
                        </li>
                    </ul>-->
                </nav>
            </div>
        </div><!-- close .ha-header-perspective -->
    </div><!-- close grid container -->
</header><!-- close header -->

<div class="clear"></div>

<!-- slider section -->
<div class="modal hide fade" id="login" role="dialog" aria-labelledby="loginlabel">  
    <div class="modal-dialog">
    <div class="modal-content">
    <div class="modal-header">   
        <a href="#" class="btn btn-success pull-right" data-dismiss="modal">×</a>   
        <h4>Welcome to technicalkeeda.com</h4>  
    </div>  
    <div class="modal-body">  
        <form method="post" action='<?= base_url();?>/login' name="loginForm">   
            <p><input type="text" class="span3" name="email" id="email" placeholder="Enter Email" value=""></p>  
             <p><input type="password" class="span3" id="loginPassword" name="loginPassword" placeholder="Enter Password"></p>  
              <p><button type="submit" class="btn btn-success">Sign in</button> 
                <a href="<?= base_url();?>/forgotpassword">Forgot Password</a></p>  
            </form>  
        </div>                  
    </div>
</div>
</div> 

<section class="slider hero ha-waypoint" data-animate-up="ha-header-hide" data-animate-down="ha-header-hide">
    <div class="parallax-overlay parallax-overlay-1"></div>

    <div class="grid-container">
        <!-- hero holder -->
        <div class="hero-holder grid-70 mobile-grid-100 tablet-grid-100">
            <div class="hero-inner">
                <span class="hero-description">Your Personal Event Planner</span>
                <h1 class="hero-title">Plan your <span>Event</span></h1>
                <a id="to-about-section" class="hero-btn">Get Started</a>
            </div>
        </div><!-- close hero-holder -->
    </div>

    <!-- slider -->
    <div class="main-slider">
        <ul class="slides">
            <li style="background:url(../assets/images/slider/slide-3.jpg);"></li>
            <li style="background:url(../assets/images/slider/slide-4.jpg);"></li>
            <li style="background:url(../assets/images/slider/slide-5.jpg);"></li>
            <li style="background:url(../assets/images/slider/slide-6.jpg);"></li>
            <li style="background:url(../assets/images/slider/slide-7.jpg);"></li>
        </ul>
    </div>
    <!-- close slider -->

</section>
<!-- close hero section -->

<div class="clear"></div>

<div id="main-content" class="wrap">

<!-- about section -->
<section id="about-section" class="about-section content-section ha-waypoint" data-animate-up="ha-header-hide" data-animate-down="ha-header-small">
    <div class="grid-container">

        <!-- section header -->
        <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
            <header class="section-header">
                <h2 class="section-title"><span>About Event Planner</span></h2>
                <p class="section-slogan">We are a an online event planning service located in <strong>San Jose</strong>, <strong>Califonia</strong>. We have a compiled registry for all the services required to plan an event. It is your one stop shop.</p>
            </header>
        </div>
        <!-- close section header -->

        <div class="grid-50 tablet-grid-100 mobile-grid-100 about-box">
            <figure class="about-icon"><img src="../assets/images/app-development.png" alt="app-development"></figure>

            <div class="about-box">
                <h3>Marriage</h3>
                <!--<p>Praesent faucibus nisl sit amet nulla sollicitudin pretium a sed purus. Nullam bibendum porta magna.</p>-->
            </div>
        </div>

        <div class="grid-50 tablet-grid-100 mobile-grid-100 about-box">
            <figure class="about-icon"><img src="../assets/images/ui-design.png" alt="ui-design"></figure>

            <div class="about-box">
                <h3>Sporting Events</h3>
                <!--<p>Praesent faucibus nisl sit amet nulla sollicitudin pretium a sed purus. Nullam bibendum porta magna.</p>-->
            </div>
        </div>

        <div class="grid-50 tablet-grid-100 mobile-grid-100 about-box">
            <figure class="about-icon"><img src="../assets/images/brand-identity.png" alt="brand-identity"></figure>

            <div class="about-box">
                <h3>School Parties</h3>
                <!--<p>Praesent faucibus nisl sit amet nulla sollicitudin pretium a sed purus. Nullam bibendum porta magna.</p>-->
            </div>
        </div>

        <div class="grid-50 tablet-grid-100 mobile-grid-100 about-box">
            <figure class="about-icon"><img src="../assets/images/consultancy.png" alt="consultancy"></figure>

            <div class="about-box">
                <h3>Concert</h3>
                <!--<p>Praesent faucibus nisl sit amet nulla sollicitudin pretium a sed purus. Nullam bibendum porta magna.</p>-->
            </div>
        </div>

        <div class="grid-50 tablet-grid-100 mobile-grid-100 about-box">
            <figure class="about-icon"><img src="../assets/images/consultancy.png" alt="consultancy"></figure>

            <div class="about-box">
                <h3>Religious Functions</h3>
                <!--<p>Praesent faucibus nisl sit amet nulla sollicitudin pretium a sed purus. Nullam bibendum porta magna.</p>-->
            </div>
        </div>

        <div class="grid-50 tablet-grid-100 mobile-grid-100 about-box">
            <figure class="about-icon"><img src="../assets/images/consultancy.png" alt="consultancy"></figure>

            <div class="about-box">
                <h3>Many Others</h3>
                <!--<p>Praesent faucibus nisl sit amet nulla sollicitudin pretium a sed purus. Nullam bibendum porta magna.</p>-->
            </div>
        </div>

    </div><!-- close grid-container -->
</section><!-- close about section -->

<div class="clear"></div>

<!-- parallax banner 3-->
<section id="service-section" class="parallax-section parallax-banner-3 parallax-background service-section">
    <div class="parallax-overlay parallax-overlay-3"></div>
    <div class="grid-container parallax-content">
        <div class="grid-parent grid-100 mobile-grid-100 tablet-grid-100">

            <!-- entry header -->
            <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
                <header class="parallax-header">
                    <h2 class="parallax-title"><span>Our Services</span></h2>
                    <!--<p class="parallax-slogan">Our <strong>quality standards</strong> apply also in terms of service, technical expertise and advice. Our dedicated employees are happy to assist you with know-how and experience in your daily business.</p>-->
                    <p class="parallax-slogan">We have tried to bring to you a service, which will help you in plannig any kind of your event. You will not have to go through the pain of browsing google for all the small services you need. We have a registry just for that, just click on what you need and you will be informed about the availability of the desired service provider.</p>
                </header>
            </div>
            <!-- close entry header -->

            <!-- icon box 1 -->
            <div class="grid-33 mobile-grid-100 tablet-grid-100">
                <div class="box-fade icon-box">
                    <div class="arrow-right"></div>
                    <i class="icon-time icon-4x service-icon"></i>
                </div>
                <div class="box-fade info">
                    <h3>Plan Event</h3>
                    <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod.</p>
                </div>
            </div><!-- close icon box -->

            <!-- icon box 2 -->
            <div class="grid-33 mobile-grid-100 tablet-grid-100">
                <div class="box-fade icon-box">
                    <div class="arrow-right"></div>
                    <i class="icon-globe icon-4x service-icon"></i>
                </div>
                <div class="box-fade info">
                    <h3>Submit your list</h3>
                    <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod.</p>
                </div>

            </div><!-- close icon box -->

            <!-- icon box 3 -->
            <div class="grid-33 mobile-grid-100 tablet-grid-100">
                <div class="box-fade icon-box">
                    <div class="arrow-right"></div>
                    <i class="icon-umbrella icon-4x service-icon"></i>
                </div>
                <div class="box-fade info">
                    <h3>Notifications</h3>
                    <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod.</p>
                </div>
            </div><!-- close icon box -->

        </div><!-- close grid-100 -->
    </div><!-- close grid container -->
</section><!-- close parallax banner 3-->

<!--&lt;!&ndash; parallax banner 2&ndash;&gt;-->
<!--<section id="parallax-section-2" class="parallax-section parallax-banner-2 parallax-background parallax-section-2 ha-waypoint">-->
<!--<div class="parallax-overlay parallax-overlay-2"></div>-->
<!--<div class="grid-container parallax-content">-->
<!---->
<!--&lt;!&ndash; parallax header &ndash;&gt;-->
<!--<div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">-->
<!--<header class="parallax-header">-->
<!--&lt;!&ndash;<h2 class="parallax-title"><span>Our Philosophy is</span></h2>&ndash;&gt;-->
<!--&lt;!&ndash;<p class="parallax-slogan">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nec libero molestie ipsum dignissim condimentum. Donec at ligula elit. Nunc nec ipsum lectus.</p>&ndash;&gt;-->
<!--</header>-->
<!--</div>-->
<!--&lt;!&ndash; close parallax header &ndash;&gt;-->
<!---->
<!--</div>&lt;!&ndash; close grid container &ndash;&gt;-->
<!--</section>&lt;!&ndash; close parallax banner 2&ndash;&gt;-->

<div class="clear"></div>

<div class="clear"></div>

<!-- cta section -->
<section id="cta-section" class="cta-section content-section">
    <div class="grid-container">
        <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
            <span class="cta-btn cl-effect-18"><a href="#" class="cl-effect-18">Register with us</a></span>
        </div>
    </div>
</section><!-- close cta section -->

<div class="clear"></div>

<!-- plan event section -->
<section id="plan-event-section" class="plan-event-section content-section">
    <div class="grid-container">

        <!-- section header -->
        <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
            <header class="section-header">
                <h2 class="section-title"><span>plan event</span></h2>
                <p class="section-slogan">You can start plannig your event right away. Browse through our list and drag those options into the shopping cart.</p>
            </header>
        </div>
        <!-- close section header -->

        <div class="clear"></div>

        <!-- plan-event box 1 -->
        <div class="container">
            <div class="row">
                <div class="col-sm-2">
                  <h2>Food</h2>
                  <div class="list-group">
                    <#list stakeHolders as sp>
                    <#list sp.category as cat>
                    <#if cat == "food">
                    <li href="#" class="list-group-item">${sp.user.name}</li>
                    </#if>
                    </#list>
                    </#list>
                </div>

        </div><!-- close plan-event -->
    </div>

        <!-- plan-event box 2 -->
        

    </div><!-- close grid-container -->
    <div class="container">
            <div class="row">
                <div class="col-sm-2">
                  <h2>Music</h2>
                  <div class="list-group">
                    <#list stakeHolders as sp>
                    <#list sp.category as cat>
                    <#if cat == "dj">
                    <li href="#" class="list-group-item">${sp.user.name}</li>
                    </#if>
                    </#list>
                    </#list>
                </div>

        </div><!-- close plan-event -->
    </div>

        <!-- plan-event box 2 -->
        

    </div><!-- close grid-container -->
    <div class="container">
           
                <div class="col-sm-2">
                  <h2>Venues</h2>
                  <div class="list-group">
                    <#list stakeHolders as sp>
                    <#list sp.category as cat>
                    <#if cat == "venue">
                    <li href="#" class="list-group-item">${sp.user.name}</li>
                    </#if>
                    </#list>
                    </#list>
                </div>

        </div><!-- close plan-event -->
    </div>

        <!-- plan-event box 2 -->
        

    </div><!-- close grid-container -->
    

</section><!-- close plan-event section -->

<div class="clear"></div>

<!-- parallax banner 4 -->
<section id="social-section" class="parallax-section parallax-banner-4 parallax-background social-section">
    <div class="parallax-overlay parallax-overlay-4"></div><!-- parallax overlay -->
    <div class="grid-container parallax-content">
        <div class="grid-parent grid-100 mobile-grid-100 tablet-grid-100">

            <!-- parallax header -->
            <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
                <header class="parallax-header">
                    <h2 class="parallax-title"><span>Get Connected</span></h2>
                    <p class="parallax-slogan">Praesent faucibus nisl sit amet nulla sollicitudin pretium a sed purus. Nullam bibendum porta magna sed pulvinar.</p>
                </header>
            </div>
            <!-- close parallax header -->

            <div class="clear"></div>

            <!-- social network -->
            <ul class="social-network">
                <li class="facebook grid-20 tablet-grid-20 mobile-grid-50">
                    <a class="social-link" href="#" target="_blank">
                        <span class="social-icon"><i class="icon-facebook icon-4x"></i></span>
                        <span class="social-title">Facebook</span>
                        <span class="social-info">Join the Conversation</span>
                    </a>
                </li>
                <li class="twitter grid-20 tablet-grid-20 mobile-grid-50">
                    <a class="social-link" href="#" target="_blank">
                        <span class="social-icon"><i class="icon-twitter icon-4x"></i></span>
                        <span class="social-title">Twitter</span>
                        <span class="social-info">Get the Latest News</span>
                    </a>
                </li>
                <li class="google-plus grid-20 tablet-grid-20 mobile-grid-50">
                    <a class="social-link" href="#" target="_blank">
                        <span class="social-icon"><i class="icon-google-plus icon-4x"></i></span>
                        <span class="social-title">Google Plus</span>
                        <span class="social-info">Join Our Circle</span>
                    </a>
                </li>
                <li class="youtube grid-20 tablet-grid-20 mobile-grid-50">
                    <a class="social-link" href="#" target="_blank">
                        <span class="social-icon"><i class="icon-youtube icon-4x"></i></span>
                        <span class="social-title">YouTube</span>
                        <span class="social-info">View Exclusive Videos</span>
                    </a>
                </li>
                <li class="instagram grid-20 tablet-grid-20 mobile-grid-50">
                    <a class="social-link" href="#" target="_blank">
                        <span class="social-icon"><i class="icon-instagram icon-4x"></i></span>
                        <span class="social-title">Instagram</span>
                        <span class="social-info">Latest Images</span>
                    </a>
                </li>
            </ul><!-- close social network -->

        </div><!-- close grid-100 -->
    </div><!-- close grid container -->
</section><!-- close parallax banner 4-->
<!-- close social section -->

<div class="clear"></div>

<div class="clear"></div>

<!-- member 1 -->
<div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
    <figure class="member-photo"><img src="../assets/images/member-1-arum-malik.jpg" alt="member"></figure>

    <div class="member-box">
        <h3>Arun Malik</h3>
        <span>Team Sharp Coders</span>
    </div>

</div><!-- close member -->

<!-- member 1 -->
<div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
    <figure class="member-photo"><img src="../assets/images/member-2-kavish-parikh.jpg" alt="member"></figure>

    <div class="member-box">
        <h3>Kavish Parikh</h3>
        <span>Team Sharp Coders</span>
    </div>

</div><!-- close member -->

<!-- member 1 -->
<div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
    <figure class="member-photo"><img src="../assets/images/member-3-mishal-shah.jpg" alt="member"></figure>

    <div class="member-box">
        <h3>Mishal Shah</h3>
        <span>Team Sharp Coders</span>
    </div>

</div><!-- close member -->

<!-- member 1 -->
<div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
    <figure class="member-photo"><img src="../assets/images/member-4-shashank-garg.jpg" alt="member"></figure>

    <div class="member-box">
        <h3>Shashank Garg</h3>
        <span>Team Sharp Coders</span>
    </div>

</div><!-- close member -->
</div><!-- close grid-container -->
</section><!-- close team section -->

<!-- contact section -->
<section id="contact-section" class="contact-section parallax-section parallax-banner-5 parallax-background">
    <div class="parallax-overlay parallax-overlay-5"></div><!-- parallax overlay -->
    <div class="grid-container parallax-content">

        <!-- parallax header -->
        <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
            <header class="parallax-header">
                <h2 class="parallax-title"><span>Register</span></h2>
                <p class="parallax-slogan">You can start using our <strong>Services</strong></p>
            </header>
        </div>
        <!-- close parallax header -->

        <div class="clear"></div>

        <!-- contact wrap -->
        <div class="grid-100 mobile-grid-100 tablet-grid-100">
            <div class="contact-wrap">


                <!-- contact message -->
                <div class="grid-parent grid-40 suffix-5 mobile-grid-100 tablet-grid-100">
                    <div class="contact-message">
                        <h3 class="grid-100">Message</h3>
                        <ul class="icons-ul">
                            <li><i class="icon-li icon-home"></i>For any doubts or questions please drop us a mail. <br> We will try to reply as soon as possible <br></li>
                            <!--<li><i class="icon-li icon-phone"></i>(305) 555-4446</li>-->
                            <li><i class="icon-li icon-envelope-alt"></i>sample@eventplanner.com</li>
                            <li><i class="icon-li icon-globe"></i>www.eventplanner.com</li>
                        </ul>
                    </div>
                </div><!-- close contact message -->

                <!-- contact form -->
                <div class="grid-parent grid-55 mobile-grid-100 tablet-grid-100">
                    <div class="contact-form-holder clearfix" id="contact-form-holder">

                        <!--Button for selecting between customer and stakeholder-->

                        <nav id="ut-navigation" class="grid-70 tablet-grid-80 mobile-grid-100">
                            <h3>What type of user are you..?</h3>
                            <a id="customer-form" href="#contact-form-customer">CUSTOMER</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a id="stakeholder-form" href="#contact-form-stakeholder">SERVICE PROVIDER</a>
                        </nav>

                        <script>
                            //                    $("#customer-form").bind("click", function(e) {
                            //                        e.preventDefault();
                            //                        var id = $(this).data("customer-form-section");
                            //                        $("#contact-form-customer section:visible").fadeOut();
                            //                        $(id).fadeIn();
                            //                    });
                            $("#customer-form").click(function(){
                            $("#customer-form-section").removeAttr("style");
                            });
                            //                    $("#stakeholder-form").bind("click", function(e) {
                            //                        e.preventDefault();
                            //                        var id = $(this).data("stakeholder-form-section");
                            //                        $("#contact-form-stakeholder section:visible").fadeOut();
                            //                        $(id).fadeIn();
                            //                    });
                            $("#stakeholder-form").click(function(){
                            $("#stakeholder-form-section").removeAttr("style");
                            });
                        </script>
                        <!--</div>-->
                        <!--</div>-->
                        <!-- close contact wrap -->
                        <!--Button for selecting between customer and stakeholder-->


                        <!-- contact form for customer-->
                        <section id="customer-form-section" style="visibility: hidden">
                            <!--<div class="grid-parent grid-55 mobile-grid-100 tablet-grid-100">-->
                            <!--<div class="contact-form-holder-customer clearfix" id="contact-form-holder-customer">-->

                            <form id="contact-form-customer" class="contact-form-customer">

                                <h3 class="grid-100">This is all we need</h3>

                                <ul class="grid-50">

                                    <li><input id="name" class="name" type="text" name="name" placeholder="Username:"></li>
                                    <li><input id="email" class="email" type="email" name="email" placeholder="E-Mail:"></li>
                                    <li><input id="phone" class="phone" type="text" name="phone" placeholder="Phone:"></li>

                                </ul>

                                <div class="grid-100">
                                    <input id="send-btn" class="send-btn" type="submit" name="send-btn" value="Sign Up">
                                    <div class="success-message">Email has been sent!</div>
                                    <div class="alert-message"></div>
                                    <div class="error-message">Email could not be delivered. Please try again later!</div>
                                </div>
                            </form><!-- close contact form for customer-->
                            <!--</section>-->
                            <!--</div>-->
                            <!--</div>-->
                        </section>
                        <!-- SIGN UP FOR CUSTOMER-->

                        <!-- contact form for service provider-->
                        <section id="stakeholder-form-section" style="visibility: hidden">

                            <!--<div class="grid-parent grid-55 mobile-grid-100 tablet-grid-100">-->
                            <!--<div class="contact-form-holder-stakeholder clearfix" id="contact-form-holder-stakeholder">-->
                            <form id="contact-form-stakeholder" class="contact-form-stakeholder">
                                <h3 class="grid-100">This is all we need</h3>

                                <ul class="grid-50">

                                    <input type="text" class="form-control" id="inputName" name="user[name]" placeholder="Text">
                                    <input type="email" class="form-control" id="inputEmail1" name="user[email]" placeholder="Email">
                                    <input type="password" class="form-control" id="inputPassword1" name="user[password]" placeholder="Password">
                                    <input type="text" class="form-control" id="inputPhone" name="user[phone]" placeholder="Phone">
                                    <textarea class="form-control" id="inputDesc" form="form1" name="description" placeholder="What you do?"></textarea>
                                    <fieldset class="col-lg-4">
                                        <legend><h4>Check the services you want to provide!</h4></legend>
                                        <div class="form-group">
                                            <div class="col-lg-4">
                                                <div class="checkbox">
                                                    <label>
                                                        <input name="category[]"type="checkbox" value="food" id="food"> Food
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-4">
                                                <div class="checkbox">
                                                    <label>
                                                        <input name="category[]" type="checkbox" value="dj" id="dj"> Music
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-4">
                                                <div class="checkbox">
                                                    <label>
                                                        <input name="category[]" type="checkbox" value="venue" id="venue"> Venue
                                                    </label>
                                                </div>
                                            </div>
                                        </div>

                                </ul>

                                <div class="grid-100">
                                    <input id="send-btn" class="send-btn" type="submit" name="send-btn" value="Sign Up">
                                    <div class="success-message">Email has been sent!</div>
                                    <div class="alert-message"></div>
                                    <div class="error-message">Email could not be delivered. Please try again later!</div>
                                </div>
                            </form><!-- close contact form for service provider-->
                            <!-- SIGN UP END FOR CUSTOMER-->
                            <!--</div>-->
                            <!--</div>-->
                        </section>


                    </div>
                </div><!-- close contact-form-holder -->

            </div>
            <!--</div>&lt;!&ndash; close contact wrap &ndash;&gt;-->


        </div><!-- close container -->
</section><!-- close contact section -->

<div class="clear"></div>

<!-- Footer Section -->
<footer class="footer">
    <div class="grid-container">
        <div class="grid-100 mobile-grid-100 tablet-grid-100">
            <h3>Hope you all like it.!</h3>
        </div>
    </div><!-- close container -->
</footer><!-- close footer -->
</div>

<!-- Load Javascript
  ========../assets/========================================== -->
<script src="../assets/js/jquery.mb.YTPlayer.js"></script>
<script src="../assets/js/jquery.flexslider-min.js"></script>
<script src="../assets/js/jquery.parallax.min.js"></script>
<script src="../assets/js/jquery.scrollTo.min.js"></script>
<script src="../assets/js/waypoints.min.js"></script>
<script src="../assets/js/jquery.magnific-popup.min.js"></script>
<script src="../assets/js/jquery.custom.js"></script>

<script type="text/javascript">
    /* <![CDATA[ */

    (function($){

    "use strict";

    $(document).ready(function(){
    $(window).load(function(){
    $('.main-slider').flexslider({
    animation: "fade",
    directionNav:true
    });
    });
    });

    })(jQuery);

    /* ]]> */
</script>

<!-- End Document
================================================== -->
</body>
</html>