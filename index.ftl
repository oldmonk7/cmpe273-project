
  <!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.png">

    <title>Plan my Event</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

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
                      <input name="authenticity_token" type="hidden" value=${user} /></div>
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

       <div class="container">


        <br>
        <br>
        <div class="jumbotron">
          <div class="container">
            <h1>Plan your Event</h1>


          </div>

        </div>
        <div class="container">
          <form class="navbar-form pull-right">
            <div class="input-group">
              <input type="search" class="form-control" placeholder="Search"/>
              <span class="input-group-btn">
                <button type="submit" class="btn btn-info">Search</button>
              </span> 
            </div>
          </form>   
        </div>  

        <div class="container">
          <form class = "form-inline" role = "form" action = "customer.html">

            <div>

              <br>
              <br>
              <input type = "submit" class = "btn btn-primary btn-lg" value = "Sign up as Customer">


            </div>

          </form>  


          <form class = "form-inline" role = "form" action = "service-provider.html">

            <div>

              <br>
              <br>
              <input type = "submit" class = "btn btn-warning btn-lg" value = "Sign up as Service Provider">


            </div>
            <br>
            <br>
            <div class="row">
              <div class="col-lg-4">
                <h2>Music</h2>
                <div class="list-group">
                  <#list serviceprovider as sp>
                  <#if sp.category == "music">
                  <a href="#" class="list-group-item">${sp.name}</a>
                  </#if>
                  </#list>
                </div>

              </div>
              <div class="col-lg-4">
                <h2>Venues</h2>
                 <#list serviceprovider as sp>
                  <#if sp.category == "venue">
                  <a href="#" class="list-group-item">${sp.name}</a>
                  </#if>
                  </#list>
              </div>
              <div class="col-lg-4">
                <h2>Food</h2>
                 <#list serviceprovider as sp>
                  <#if sp.category == "food">
                 <a href="#" class="list-group-item">${sp.name}</a>
                  </#if>
                  </#list>
              </div>
            </div>









          </div><!-- /.container -->


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="js/jquery-2.0.3.js"></script>
        <script src="js/bootstrap.min.js"></script>
      </body>
      </html>

