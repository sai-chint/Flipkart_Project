<!DOCTYPE html>
<html lang="en">
<head>
  <title>My Flipkart</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
    .dropbtn {
    background-color: black;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
}
 
.dropdown {
    position: relative;
    display: inline-block;
}
 
.dropdown-content {
    display: none;
    position: absolute;
    background-color: lightgrey;
    min-width: 200px;
    z-index: 1;
}
 
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
 
.dropdown-content a:hover {background-color: white;}
.dropdown:hover .dropdown-content {display: block;}
.dropdown:hover .dropbtn {background-color: grey;}
 
    
  </style>
</head>
<body>

<div class="jumbotron">
	<div class="panel-body"><img src="C:\Users\saichint\Desktop\Flipkart_Project\flipkart-image.jpeg" class="img-responsive" style="width:50%" alt="Image" class ="container text-center"></div>
  	<div class="container text-center">
    <h1>FlipKart</h1>      
    <p>Products</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        
        <div class="dropdown">
					<a href=""><button class="dropbtn">Home</button></a>
		<div class="dropdown-content">
</div>
</div>
        <div class="dropdown">
		<button class="dropbtn">Electronics</button>
		<div class="dropdown-content">
					<a href="Mobiles.html">Mobiles</a>
					<a href="Laptops.html">Laptops</a>
					<a href="Play Station.html">Play Station</a>
</div>
</div>    	
        <div class="dropdown">
		<button class="dropbtn">TV & Appliances</button>
		<div class="dropdown-content">
        			<a href="#">Official Android TVs</a>
					<a href="#">Smart & Ultra HD</a>
					<a href="#">TV by Brand</a>
</div>
</div>
        <div class="dropdown">
		<button class="dropbtn">Home & Furniture</button>
		<div class="dropdown-content">
				<a href="#">Kitchen & Dining</a>
				<a href="#">Furniture</a>
				<a href="#">Furnishing</a>
</div>
</div>
        <div class="dropdown">
				<a href="#"><button class="dropbtn">Contact us</button></a>
		<div class="dropdown-content">
</div>
</div>
        	       	
      </ul>
      
      

 	<% if(session.getAttribute("user")==null){
        	%>
     
        <% } else { %>
         <li><b>WELCOME</b>&nbsp<b>${welcome}</b></li>
       <li><a href="Logout">LOGOUT</a></li>
      
       <%} %>
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Login.html"><span class="glyphicon glyphicon-user"></span> Login/Sign Up </a></li>
        <li><a href="Shopping Cart.html"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container">
 <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
      	<div class="panel-heading">Mobiles</div>
      		<div class="panel-body"><img src="C:\Users\saichint\Desktop\Flipkart_Project\mobilegroup.jpeg" class="img-responsive" style="width:100%" alt="Image"></div>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="panel panel-primary">
      	<div class="panel-heading">TV's</div>
      		<div class="panel-body"><img src="C:\Users\saichint\Desktop\Flipkart_Project\tv.jpeg" class="img-responsive" style="width:100%" alt="Image"></div>
      </div>
    </div>
  	<div class="col-sm-4">
      <div class="panel panel-primary">
     	 <div class="panel-heading">Home & Furniture</div>
      		<div class="panel-body"><img src="C:\Users\saichint\Desktop\Flipkart_Project\home&furniture.jpeg" class="img-responsive" style="width:100%" alt="Image"></div>
      </div>
    </div>
</div>
</div>
<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="30" placeholder="Email">
    <a href ="Sign Up.html"> <button type="button" class="btn btn-danger">Sign Up</button></a>
  </form>
</footer>

</body>
</html>
