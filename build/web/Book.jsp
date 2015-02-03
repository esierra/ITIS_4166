<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>
<div class="big-book"><img src="${imgURL}"/>
</div>
<div id="book-description">
<h2>${prName}</h2>
<small>By: Joshua Bloch</small>
<p>${description}</p>
</div>
<div id="price">$${price}</div>
    <form action="OrderController" method="post">
<div class="box">
                       <input type="hidden" name="productCode" value="${bookValue}">
                        <input type="submit" value="Add To Cart">
                  
                   </form> 

</div>
   <div id="BackButton">                  
                    <a href="Catalog.jsp">Back to Catalog</a>                                   
                </div> 
