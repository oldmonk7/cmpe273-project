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
	<title>CustomerSignUp</title>
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
    
    <!-- DEMO Switcher
  	================================================== -->
    <link rel="stylesheet" href="../styleswitcher/../assets/css/styleswitcher.css">
    
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
     <script src="../assets/js/hello.js"></script>
    
    <!-- DEMO Switcher
  	================================================== -->
    <script src="../styleswitcher/../assets/js/styleswitcher.js"></script>
    
</head>

<body id="mainsite">
	
   
    
    <a id="top"></a>
    
	<!-- Page Layout
	================================================== -->
    
     <!-- header section -->
	<header id="header-section" class="ha-header">
    	<div class="grid-container">
				<div class="ha-header-perspective">
					<div class="ha-header-front">
            <div class="grid-30 tablet-grid-20 hide-on-mobile">
						</div>
						<nav id="ut-navigation" class="grid-70 tablet-grid-80 mobile-grid-100">
                            <a  href="/home">Home</a>
                            <a   href="/about">About</a>
                            
                            <a  href="/plan/build">Plan Event</a>
                            <a href="/myplan">My Plan</a>
                            <a  href="/team">Team</a>
                            <a href="/register">Register</a>
                              <a  class="selected" href="/login">Log In</a>
                        </nav>
					</div>
				</div><!-- close .ha-header-perspective --> 
        </div><!-- close grid container -->  
    </header><!-- close header -->
    
    <div class="clear"></div>
    
	
   
    <div id="main-content" class="wrap">
    
    <!-- about section -->
	<section id="about-section" class="about-section content-section ha-waypoint" data-animate-up="ha-header-hide" data-animate-down="ha-header-small">
		<div class="grid-container">
        	
            <!-- section header -->
            <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
                <header class="section-header">
                    <h2 class="section-title"><span>Log In</span></h2>
               </header>
            </div>
            <!-- close section header -->
            
            <div  style="margin-left:20%;"class="grid-50 tablet-grid-100 mobile-grid-100 about-box">
            	 <form class="form-horizontal" id="form-login" role="form" >
              <div class="form-group">
                <input type="text" id="loginEmail" placeholder="Email" class="form-control">
              </div>
              <div class="form-group">
                <input type="password" id="loginPassword" placeholder="Password" class="form-control">
              </div>
              <button type="submit" class="btn btn-success">Sign in</button>
             
            </form>


                
                

            </div>

            


           
<div id="response">
            
    	</div><!-- close grid-container -->
    </section><!-- close about section -->
            
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

              window.location.replace("/plan/build");
             console.log("success");
             
           })
           .fail(function(data) {
             window.location.replace("/plan/build");
             console.log("error");
           })
           .always(function() {
             console.log("complete");
           });
           


});

});


hello.init({
 facebook : "591409814229487",
 google : "1082014842762-rdmd6ivb9g5n03cadn643ep6im68oct9.apps.googleusercontent.com"
               //windows  : WINDOWS_CLIENT_ID,
               //google   : GOOGLE_CLIENT_ID
             },{redirect_uri:'/customer'});


hello.on('auth.login', function(auth){

       // call user information, for the given network

       hello( auth.network ).api( "me" ).success(function(r){

         console.log(r);
         $('#inputName').val(r.name)
         $('#inputEmail1').val(r.email)
         var $target = $("#profile_"+ auth.network );
         if($target.length==0){
           $target = $("<div id='profile_"+auth.network+"'></div>").appendTo("#profile");
         }
         $target.html('<img src="'+ r.thumbnail +'" /> Hey '+r.name).attr('title', r.name + " on "+ auth.network);
       });
     });



   /* $( "#signup" ).submit(function( event ) {

  // Stop form from submitting normally
  event.preventDefault();

  // Get some values from elements on the page:
  var $form = $( this ),
  term = $form.find( "input[name='s']" ).val(),
  url = $form.attr( "action" );

  // Send the data using post
  var posting = $.post( url, { s: term } );

  // Put the results in a div
  posting.done(function( data ) {
    var content = $( data ).find( "#content" );
    $( "#result" ).empty().append( content );
});
});
*/








</script>


    
<!-- End Document
================================================== -->
</body>
</html>