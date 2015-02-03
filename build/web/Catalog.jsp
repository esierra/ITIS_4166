<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>

<div id="head-wrapper">
  <div id="head" class="container">
<h1>Pick a subject and start shopping</h1>
<h3>Hundreds of textbooks at your fingertips.</h3>

<a href="#cs">
<div class="module l">
  <p>COMPUTER SCIENCE</p>
</div>
</a>
<div class="module r">
  <p>MATHEMATICS</p>
</div>


</div>
</div><!-- end container-->
<a name="cs"></a>
<div class="row">
<div id="free">
<div class="col-xs-6"><span class="glyphicon glyphicon-gift"></span> Free two-day shipping on every book!</div>
<div class="col-xs-6"><span class="glyphicon glyphicon-home"></span> Pick up in store same day</div>
</div>
</div>

<h1>Computer Science Textbooks</h1>
<div class="row">
<div class="books">
<div class="col-xs-6 col-md-4">

<form action="Catalog" method="get">
<input type="hidden" name="action" value="Book-1">
<div class="formImg">
<input type="image" src="includes/img/javaconcurrency.jpg" alt="Submit" height="300" width="280" >
<p>Java Concurrency in Practice</p>
</div>
</form>
</div>

<div class="col-xs-6 col-md-4">
<form action="Catalog" method="get">
<input type="hidden" name="action" value="Book-2">
<div class="formImg">
<input type="image" src="includes/img/HeadFirstJava.jpg" alt="Submit" height="300" width="280" >
</div>
<p>Head First Java</p>
</form>
</div>

<div class="col-xs-6 col-md-4">
<form action="Catalog" method="get">
<input type="hidden" name="action" value="Book-3">
<div class="formImg">
<input type="image" src="includes/img/effectiveJava.jpg" alt="Submit" height="300" width="280" >
</div>
<p>Effective Java</p>
</form>
</div></div><!--end row div-->
</div><!--end book div-->



<div class="row">
<div class="books">
<div class="col-xs-6 col-md-4">

<form action="Catalog" method="get">
<input type="hidden" name="action" value="Book-4">
<div class="formImg">
<input type="image" src="includes/img/unix.jpg" alt="Submit" height="300" width="280" >
<p>Introduction to Unix/Linux</p>
</div>
</form>
</div>

<div class="col-xs-6 col-md-4">
<form action="Catalog" method="get">
<input type="hidden" name="action" value="Book-5">
<div class="formImg">
<input type="image" src="includes/img/networks.jpg" alt="Submit" height="300" width="280" >
<p>Computer Networks</p>
</div>
</form>
</div>

<div class="col-xs-6 col-md-4">
<form action="Catalog" method="get">
<input type="hidden" name="action" value="Book-6">
<div class="formImg">
<input type="image" src="includes/img/OS.jpg" alt="Submit" height="300" width="280" >
<p>Modern Operating Systems</p>
</div>
</form>
</div></div><!--end row div-->
</div><!--end book div-->

