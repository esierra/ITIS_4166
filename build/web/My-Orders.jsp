<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>



                <h1>Invoice</h1>
                <hr>
                <h3><script>var days = new Array('Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday');
var months = new Array('January','February','March','April','May','June','July','August','September','October','November','December');
var d = new Date();
var weekDay = days[d.getDay()];
var month = months[d.getMonth()];
var day = d.getDate();
var year = d.getYear();
if (day == 1) suffix = 'st';
else if (day == 2) suffix = 'nd';
else if (day == 3) suffix = 'rd';
document.write(weekDay+', '+month+' '+day+', '+'2014');</script>
                </h3>
            <p style="text-decoration:underline">Ship to/ Bill to:
            <div id="shipping">
            <p>${firstName} ${lastName}
            <p>${address1}
            <p>${city} ${state}</p>


            <hr>
<table width="85%">
  <tr>
    <th>Quantity</th>
    <th>Item</th>
    <th>Price</th>
    <th>Total</th>
    <th></th>
  </tr>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="item" items="${cart.items}">
  <tr>
    <td>${item.quantity}</td>
    <td>${item.product.productName}</td>
    <td>${item.product.price}</td>
    <td>${item.total}</td>
    <td>
      <form action="OrderController" method="post">
        <input type="hidden" name="productCode" 
               value="${item.product.productCode}">
                <input type="hidden" name="quantity" 
               value="0">
      </form>
    </td>
  </tr>
</c:forEach>
</table>
</div><!--end shipping div-->
<hr>
                  

               <div id="CheckOut">                  
                    <a href="payment.jsp">PURCHASE</a>                                                                 
            </div>