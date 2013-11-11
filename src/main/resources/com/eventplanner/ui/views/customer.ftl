<!DOCTYPE html>
<html lang="en">
<head>
     <!-- Latest compiled and minified CSS -->
      <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" media="screen">
      <!-- Optional theme -->
      <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

    <script src="http://code.jquery.com/jquery.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
         <script src="../assets/hello.js"></script>

      <script type="text/javascript">

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



    /*$( "#signup" ).submit(function( event ) {

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
});*/







    $("#signup").click(function(){

         alert($("#inputEmail1").val);

          $.ajax({
            url:         "/signup/customer",
            type:        "POST",
            data:        JSON.stringify({ email: $("#inputEmail1").val(),
                                          password: $("#inputPassword1").val(),
                                          phone: $("#inputPhone").val()
                                        }),
            contentType: "application/json",
            dataType:    "json",
            success:     function(){
                alert("You are signed up!");
            }
          })
        })
    </script>


	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="shortcut icon" href="../../assets/ico/favicon.png">
	<title>Customer Sign Up</title>


	

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!--[if lt IE 9]>
        <script src="../../assets/js/html5shiv.js"></script>
        <script src="../../assets/js/respond.min.js"></script>
        <![endif]-->

    </head>


    <body>

    	<div class="navbar navbar-inverse navbar-fixed-top">
    		<div class="container">
    			<div class="navbar-header">
    				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
    					<span class="icon-bar"></span>
    					<span class="icon-bar"></span>
    					<span class="icon-bar"></span>
    				</button>
    				<a class="navbar-brand" href="#">Event Planner</a>
    			</div>
    			<div class="collapse navbar-collapse">
    				<ul class="nav navbar-nav">
    					<li class="active"><a href="#">Home</a></li>
    					<li><a href="#about">About</a></li>
    					<li><a href="#contact">Contact</a></li>
    					<li class="dropdown" id="menu1" class="nav pull-right">
    						<a class="dropdown-toggle" data-toggle="dropdown" href="#menu1">
    							Login
    							<b class="caret"></b>
    						</a>
    						<div class="dropdown-menu">
    							<form style="margin: 0px" accept-charset="UTF-8" action="/sessions" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" />
    								<input name="authenticity_token" type="hidden" /></div>
    								<fieldset class='textbox' style="padding:10px">
    									<input style="margin-top: 8px" type="text" placeholder="Username" />
    									<input style="margin-top: 8px" type="password" placeholder="Passsword" />
    									<input class="btn-primary" name="commit" type="submit" value="Log In" />
    								</fieldset>
    							</form>
    						</div>
    					</li>
    				</ul>
    			</div><!--/.nav-collapse -->
    		</div>
    	</div>
    </div>
    <br>
    <br>
    <br>
    <br>


    <div class="container well" >
    	<form class="form-horizontal" role="form" method="POST" action="">
            <div class="form-group">
                <label for="inputName" class="col-lg-2 control-label">Name</label>
                <div class="col-lg-4">
                    <input type="text" class="form-control" id="inputName" placeholder="text">
                    <span><div class="container" id="profile"></div></span>

                </div>
            </div>

    		<div class="form-group">
    			<label for="inputEmail1" class="col-lg-2 control-label">Email</label>
    			<div class="col-lg-4">
    				<input type="email" class="form-control" id="inputEmail1" placeholder="Email">
    			</div>
    		</div>
    		<div class="form-group">
    			<label for="inputPassword1" class="col-lg-2 control-label">Password</label>
    			<div class="col-lg-2">
    				<input type="password" class="form-control" id="inputPassword1" placeholder="Password">
    			</div>
    		</div>
    		<div class="form-group">
    			<label for="inputPhone" class="col-lg-2 control-label">Phone</label>
    			<div class="col-lg-2">
    				<input type="text" class="form-control" id="inputPhone" placeholder="Phone">
    			</div> (optional)
    		</div>
    		<div class="form-group">
    			<div class="col-lg-offset-2 col-lg-2">
    				<button type="submit" class="btn btn-primary" id="signup">Sign Up!</button>
    			</div>
    		</div>
    	</form>


                  <div class="container">
                  <button class= "btn btn-primary btn-lg" onclick="hello( 'facebook' ).login()">Sign in with Facebook</button>

                  </div>

                  <div class="container">
                  <button class= "btn btn-primary btn-lg" onclick="hello( 'google' ).login()">Sign in with Google</button>

                  </div>


    </div>

    








</body>
</html>