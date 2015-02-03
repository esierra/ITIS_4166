<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>

<div id="cart-wrapper">

  My Shopping Cart
</div>
<div class="purchase">

<p>Subtotal:${order.cost}
<p>Tax:$3.00
<p>Shipping:Free
<p>Grand Total:${order.cost+3}

<div class="box">
<form action="OrderController" method="post">
  <input type="hidden" name="action" value="1">
  <input type="submit" value="Checkout">
</form>
</div>
</div>

<div class="row">
<div class="row-cart">
<div class="col-sm-3 col-md-3">Item</div>
<div class="col-sm-3 col-md-3"> Quantity</div>
<div class="col-sm-3 col-md-3">Price</div>
<div class="col-sm-3 col-md-3">Total</div>
</div>
</div><!--end row div-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="item" items="${cart.items}">


<div class="cart-item">
<div class="col-sm-3 col-md-3"><img src="${item.product.imageUrl}"/>
${item.product.productName}<form action="OrderController" method="post">
        <input type="hidden" name="productCode" value="${item.product.productCode}">
        <input type="hidden" name="quantity" value="0">
        <input type="submit" class="remove" value="X Remove Item">
      </form>
</div>
<div class="col-sm-3 col-md-3"> <form action="OrderController" method="post">
        <input type="hidden" name="productCode" value="${item.product.productCode}">
       <input type="text" class="update" name="quantity" value="${item.quantity}">

        <input type="submit" class="UpdateButton" value="Update">
      </form></div>
<div class="col-sm-3 col-md-3">${item.product.price}</div>
<div class="col-sm-3 col-md-3">${item.total}</div>
</div>
<div id="item-space"></div>
</c:forEach>