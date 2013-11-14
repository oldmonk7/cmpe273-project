  <!DOCTYPE html>
  <html lang="en">
  <head>
   <!-- Latest compiled and minified CSS -->
   <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" media="screen">
   <!-- Optional theme -->
   <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

   <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
   <!-- Latest compiled and minified JavaScript -->
   <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
   <script src="../assets/hello.js"></script>
   <script type="text/JavaScript" src="../assets/jquery.serializeJSON.min.js"></script>

   <script type="text/javascript">



   $(document).ready(function(){

    $('#form1').on('submit', function(event){


      event.preventDefault();
      alert("Inside submit method");

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
      url: "/signup/customer",
      data: jsondata,
      dataType: 'json',
      contentType:'application/json',
      success : function(response, status){
       console.log(response);
       alert(response);
       alert(status);

     },
     error:function(){
      alert("something went wrong");
    }
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


  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <link rel="shortcut icon" href="../../assets/ico/favicon.png">
  <title>Service Provider Sign Up</title>




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
   <fieldset class="col-lg-4"> 
   <legend><h4>Check the services you want to provide!</h4></legend>
   <div class="form-group">
    <div class="col-lg-4">
      <div class="checkbox">
        <label>
          <input name="category[]"type="checkbox" value:"food" id="food"> Food
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-lg-4">
      <div class="checkbox">
        <label>
          <input name="category[]" type="checkbox" value="dj" id="dj"> DJ
        </label>
      </div>
    </div>
  </div>
  </fieldset>






  </div>
  <div class="form-group">
   <div class="col-lg-offset-2 col-lg-2">
    <input type="submit" class="btn btn-primary" id="signup" value="Sign Up!">
  </div>
  </div>
  </form>


  <div class="container-well">
    <button class= "btn btn-primary btn-lg" onclick="hello( 'facebook' ).login()">Sign in with Facebook</button>

  </div>

  <div class="container-well">
    <button class= "btn btn-primary btn-lg" onclick="hello( 'google' ).login()">Sign in with Google</button>

  </div>


  </div>










  </body>
  </html>