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
	<title>PlanEvent</title>
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
          
    
    <!-- DEMO Switcher
  	================================================== -->
   
    
</head>

<body id="mainsite">
	

    
    <a id="top"></a>
    
	<!-- Page Layout
	================================================== -->
    
     <!-- header section -->
	<header id="header-section" class="ha-header ">
    	<div class="grid-container">
				<div class="ha-header-perspective">
					<div class="ha-header-front">
                    <div class="grid-30 tablet-grid-20 hide-on-mobile">
						</div>
						<nav id="ut-navigation" class="grid-70 tablet-grid-80 mobile-grid-100">
                            <a  href="/home">Home</a>
                            <a   href="/about">About</a>
                            
                            <a class="selected" href="#">Plan Event</a>
                            <!--<a href="/myplan">My Plan</a>-->
                            <a  href="/team">Team</a>
                            <a href="/register">Register</a>
                             <a href="/login">Log In</a>
                        </nav>
					</div>
				</div><!-- close .ha-header-perspective --> 
        </div><!-- close grid container -->  
    </header><!-- close header -->
    
    <div class="clear"></div>
    
	
    
    <div class="clear"></div>
   
    <div id="main-content" class="wrap">
    
   
            
    <div class="clear"></div>
    
    <section id="team-section" class="team-section content-section">

            <!-- section header -->
            <div class="grid-70 prefix-15 mobile-grid-100 tablet-grid-100">
                <header class="section-header">
                    <h2 class="section-title"><span>Plan</span></h2>
                  </header>
            </div>
            <!-- close section header -->
            
            <div class="clear"></div>
            
            <!-- member 1 -->
            <div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
                 
                <div class="member-box">
                    <div class="row">
                         <div class="col-sm-2">
                            <h2>Food</h2>
                              <div class="list-group">
                                <#list stakeHolders as sp>
                                <#list sp.category as cat>
                                <#if cat == "food">
                                <li><a href="#" class="list-group-item">${sp.user.name}</a></li>
                                </#if>
                                </#list>
                                </#list>
                              </div>
                        </div>
                    </div>
                </div>
                
            </div><!-- close member -->
            
            <!-- member 1 -->
            <div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
                
                <div class="member-box">
                   <div class="row">
                          <div class="col-sm-2">
                          <h2>Music</h2>
                              <div class="list-group">
                                <#list stakeHolders as sp>
                                <#list sp.category as cat>
                                <#if cat == "dj">
                                <li><a href="#" class="list-group-item selected">${sp.user.name}</a></li>
                                </#if>
                                </#list>
                                </#list>
                              </div>
                        </div>
                    </div>
                </div>
                
            </div><!-- close member -->
            
            <!-- member 1 -->
            <div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
               
                <div class="member-box">
                    <div class="row">
                           <div class="col-sm-2">
                              <h2>Venues</h2>
                                  <div class="list-group">
                                    <#list stakeHolders as sp>
                                    <#list sp.category as cat>
                                    <#if cat == "venue">
                                    <li><a href="#" class="list-group-item">${sp.user.name}</a></li>
                                    </#if>
                                    </#list>
                                    </#list>
                                  </div>
                            </div>
                    </div>
                </div>
                
            </div><!-- close member -->
            
             <!-- member 1 -->
            <div class="member-box grid-25 mobile-grid-100 tablet-grid-50">
                <div class="member-box">
                    <div class="row">
                          <div class="col-lg-4" > 
                              <h2>Plan</h2>
                              <div class="list-group">

                                <form id="plan" action="">
                                   <div id="username"></div>
                                  <div id="sps"></div>

                                  <div id="planbutton"> </div>
                                </form>


                              </div>
                            </div>
                    </div>

                </div>
                
            </div><!-- close member -->
            
          <div id="response">
                      </div>
            
        </div><!-- close grid-container -->  
    </section><!-- close team section -->
    
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
     <script type="text/JavaScript" src="../assets/js/jquery.serializeJSON.min.js"></script>

    <script>
            function getCookie(c_name)
              {
                debugger; 
              var c_value = document.cookie;
              var c_start = c_value.indexOf(" " + c_name + "=");
              if (c_start == -1)
                {
                c_start = c_value.indexOf(c_name + "=");
                }
              if (c_start == -1)
                {
                c_value = null;
                }
              else
                {
                c_start = c_value.indexOf("=", c_start) + 1;
                var c_end = c_value.indexOf(";", c_start);
                if (c_end == -1)
                {
              c_end = c_value.length;
              }
              c_value = unescape(c_value.substring(c_start,c_end));
              }
              return c_value;
              }

          </script>
          <script type="text/javascript">

          $(document).ready(function() {


            debugger;
              var username = getCookie(name);
             // var username = getCookie(name);
              
              

           $(".list-group-item").click(function(event) {
            event.preventDefault();
            $(this).css("backgroundColor","green");
            $('#username').html('<input type="text" name="user" style="{display:none;}"value="'+ username +'"></input>');
            $('#sps').append('<h3><input name="stakeHolders[]" type="checkbox" href="#" value="'+$(this).html()+'" checked>' + " " + $(this).html()+"</h3>");
            $('#planbutton').html('<input type="submit" class="btn btn-primary" id="makeplan" value="Build Plan!">')
            //$('#plan').append($(this).html());
            //$('#plan').append('</a>');
            
          });



           $('#plan').on('submit', function(event){


            event.preventDefault();

          //var form = $('#form1');
          //var json = ConvertFormToJSON(form);
          //var array = $('#form1').serializeArray();
          var array = $('#plan').serializeJSON();
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
            url: "/plan",
            data: jsondata,
            dataType: 'json',
            contentType:'application/json',

          }).done(function(data) {
             //alert(data);
             $('#response').html("<h1>Congratz! Your plan is live. The service providers will contact you soon</h1>");


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





</script>

    
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