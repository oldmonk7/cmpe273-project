<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<!--
=======================================================================================
 Brooklyn HTML Template by United Themes (http://www.unitedthemes.com)
 Marcel Moerkens & Matthias Nettekoven 
=======================================================================================
-->

<head>

	<!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
    <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
	<title>Plan Your Event</title>
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
    
    
    <!--[if lt IE 9]>
		<script src="../assets/js/html5.js"></script>
	<![endif]-->
    
    <!--[if lte IE 8]> 
		<link rel="stylesheet" type="text/css" href="../assets/css/ie8.css" />
	<![endif]-->

	<!-- Favicons
	================================================== -->
	<link rel="shortcut icon" href="../assets/images/favicon.ico">
	<link rel="apple-touch-icon" href="../assets/images/apple-touch-icon.png">
	<link rel="apple-touch-icon" sizes="72x72" href="../assets/images/apple-touch-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="114x114" href="../assets/images/apple-touch-icon-114x114.png">

	<!-- Load jQuery
  	================================================== -->
  	<script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/js/modernizr.js"></script>
    <script src="../assets/js/device.min.js"></script>
    

    
</head>

<body id="mainsite">
	
    
    <a id="top"></a>
    
	<!-- Page Layout
	================================================== -->
    
     
    
    <div class="clear"></div>
    
	<!-- slider section -->
    <section class="slider hero ha-waypoint" data-animate-up="ha-header-hide" data-animate-down="ha-header-hide">
		<div class="parallax-overlay parallax-overlay-1"></div>
        
        <div class="grid-container">
            <!-- hero holder -->
            <div class="hero-holder grid-70 mobile-grid-100 tablet-grid-100">
            	<div class="hero-inner">
                    <span class="hero-description">Your Personal Event Planner</span>
                    <h1 class="hero-title">Plan your <span>event</span></h1>
                    <a  class="hero-btn" href="/about">Get Started</a>
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
    
	
</div>
	
    <!-- Load Javascript
  	================================================== -->
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
       <script type="text/javascript">

          $(document).ready(function(){


  $('#form-login').on('submit', function(event){


    event.preventDefault();
    alert("Inside submit method");

        //var form = $('#form1');
        //var json = ConvertFormToJSON(form);
        var array = $('#form-login').serializeArray();
        console.log(array);
        var o = {};

        $.each(array, function() {
          if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
              o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
          } else {
            o[this.name] = this.value || '';
          }
        });

        /*jQuery.each(array, function() {

          json[array.name] = array.value || '';
          console.log(array.name);
        });*/
  
  console.log(o);
  var jsondata = JSON.stringify(o);
  console.log(jsondata);
           var loginEmail= $("#loginEmail").val() ;
           console.log(loginEmail);
            var loginPassword= $("#loginPassword").val() ;
           console.log(loginPassword);

           $.ajax({
             url: '/auth/login',
             async:'false',
             type: 'POST',
             dataType: 'json',
             data: jsondata,
             contentType : 'application/json',
             headers: { 'Email': loginEmail , 'Password' : loginPassword }
           })
           .done(function(data) {
             alert(data);
             
             authToken = data.auth;
             console.log("data.name"+ data.user);
             userName = data.user;
             console.log(authToken);
             console.log(userName);
               $("#form-login").remove();



             $('#response').html("Logged in as " + userName);
                  
                  
                    
                  // var exdate=new Date();
                  // exdate.setDate(exdate.getDate() + 30);
                  // var c_value=escape(value) + ((exdays==null) ? "" : "; expires="+exdate.toUTCString());
                  //document.cookie="{ name:\""+userName +"\", Auth-Token:\""+authToken+"\"}";
                  document.cookie= "name= "+userName;
                  document.cookie="Auth-Token="+authToken;

  
             console.log("success");
             
           })
           .fail(function(data) {
             alert(data);
             console.log("error");
           })
           .always(function() {
             console.log("complete");
           });
           


});

});


          </script>
    
<!-- End Document
================================================== -->
</body>
</html>