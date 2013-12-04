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
	<title>ServiceProviderSignUp</title>
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
    <script src="../assets/js/hello.js"></script>
    <script type="text/JavaScript" src="../assets/js/jquery.serializeJSON.min.js"></script>
    
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
                            
                            <a href="/plan/build">Plan Event</a>
                            <a href="/myplan">My Plan</a>
                            <a  href="/team">Team</a>
                            <a class="selected"  href="/register">Register</a>
                             <a href="/login">Log In</a>
                        </nav>
					</div>
				</div><!-- close .ha-header-perspective --> 
        </div><!-- close grid container -->  
    </header><!-- close header -->
    
    <div class="clear"></div>
   
    <div id="main-content" class="wrap">
    
    
    <!-- portfolio section -->
	<section id="portfolio-section" class="portfolio-section content-section">
		<div class="grid-container">
        	
            <!-- section header -->
            <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
                <header class="section-header">
                    <h2 class="section-title"><span>Service Provider Sign Up</span></h2>
                    </header>
            </div>
            <!-- close section header -->
            
            <div class="clear"></div>
            
            <!-- portfolio box 1 -->
			<div style="margin-left:35%"class="grid-33 mobile-grid-50 tablet-grid-50">
            	     <form class="form-horizontal" id="form1" role="form" method="POST" action="signup/customer">
                            <div class="form-group">
                              <label for="inputName" class="col-lg-2 control-label">Name</label>
                                  <div class="col-lg-4">
                                    <input type="text" class="form-control" id="inputName" name="user[name]" placeholder="text">
                                    <span><div class="container" id="profile"></div></span>

                                  </div>
                            </div>

                            <div class="form-group">
                             <label for="inputEmail1" class="col-lg-2 control-label">Email</label>
                                 <div class="col-lg-4">
                                  <input type="email" class="form-control" id="inputEmail1" name="user[email]" placeholder="Email">
                                </div>
                            </div>
                            <div class="form-group">
                               <label for="inputPassword1" class="col-lg-2 control-label">Password</label>
                                   <div class="col-lg-2">
                                    <input type="password" class="form-control" id="inputPassword1" name="user[password]" placeholder="Password">
                                    </div>
                            </div>
                            <div class="form-group">
                              <label for="inputPhone" class="col-lg-2 control-label">Phone</label>
                              <div class="col-lg-2">
                                <input type="text" class="form-control" id="inputPhone" name="user[phone]" placeholder="Phone">
                              </div> (optional)
                            </div>
                            <div class="form-group">
                              <label for="inputDesc" class="col-lg-2 control-label">Description</label>
                              <div class="col-lg-2">
                                <textarea class="form-control" id="inputDesc" form="form1" name="description" placeholder="What you do?"></textarea>
                              </div>
                            </div>
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
                            </fieldset>

                            <div class="form-group" style="margin-top:20px">
                                  <div class="col-lg-offset-2 col-lg-2">
                                    <input type="submit" class="btn btn-primary" id="signup" value="Sign Up!">
                                  </div>

                            <div>
                                

                            <button class= "btn btn-primary btn-lg" onclick="hello( 'facebook' ).login()">Sign in with Facebook</button>
                             <button class= "btn btn-primary btn-lg" onclick="hello( 'google' ).login()">Sign in with Google</button>
                    </form>



                    <div id="response">


                    </div>  
			</div><!-- close portfolio -->
			
		</div><!-- close grid-container -->
	</section><!-- close portfolio section -->
    
   
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

    $('#form1').on('submit', function(event){


      event.preventDefault();
     

          //var form = $('#form1');
          //var json = ConvertFormToJSON(form);
          //var array = $('#form1').serializeArray();
          var array = $('#form1').serializeJSON();
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
    var jsondata = JSON.stringify(array);
    console.log(jsondata);

    $.ajax({
      type: "POST",
      url: "/stakeholders",
      data: jsondata,
      dataType: 'json',
      contentType:'application/json',
      
  }).done(function(data) {
             //alert(data);

             authToken = data.auth;
             userName = data.user;
             $("#form1").remove();
            
              document.cookie= "name= "+userName;
              document.cookie="Auth-Token="+authToken;
             $('#response').html("<h1>Congratz! You are signed up</h1><button href='/plan'>Make Plan</button>");
            
  
             console.log("success");
             console.log(data.msg);
           })
           .fail(function(data) {
         
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
               },{redirect_uri:'/serviceprovider'});


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