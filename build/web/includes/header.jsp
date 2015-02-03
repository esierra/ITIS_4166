<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html>
    <head>
        <title>Got Book</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="bookStore.html"></script>
        <link  rel="stylesheet" href="style.css" type="text/css"/>     
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <script src="/scripts/jquery.min.js"></script>
   <script src="bootstrap/js/bootstrap.min.js"></script>
    </head> -->
    
   <!--  <body>
    
                 <div  id="header">
                <h1> <a href="index.jsp"> 

          <img src="includes/img/Book.png"/></a>
          gotBooks</h1>
                  <div id="login">
                   <c:choose>
                <c:when test="${firstName != null}">${theUser.firstName} ${theUser.lastName}</c:when>
                
                <c:otherwise>
                  <button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-user"></span> User
</button>
                </c:otherwise>

            </c:choose>${firstName}</div>


               <div id="breadcrum"><a href="index.jsp">Home</a></div>
            </div><!END header--> 
     <!DOCTYPE html>
    <head>
        <title>Got Book</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  rel="stylesheet" href="style.css" type="text/css"/>   
        <!-- dummy files remember to rename them after -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- This is for the side menu scripts-->
<link rel="stylesheet" href="includes/jquery/css/BootSideMenu.css">
<script src="includes/jquery/js/BootSideMenu.js"></script>
<!---->


   <script src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    

            
    <script>$('#demo').BootSideMenu();</script>
  <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
      <!-- <img src="includes/img/logo.png"/> might add a logo to the brand setting-->
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
  <li><a href="About.jsp">About Us</a></li>
          <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Catalog <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="Catalog.jsp#cs">Computer Science</a></li>
            <li><a href="Catalog.jsp#ms">Mathematics</a></li>
            <li class="divider"></li>
            <li><a href="Catalog.jsp">Complete Listing</a></li>
  
          </ul>
        </li>
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="orderlist.jsp">Orders</a></li>
       
        <li><a href="Cart.jsp"> 
  <span class="glyphicon glyphicon-shopping-cart"></span>CART</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav> 
