<%-- 
    Document   : admin
    Created on : Nov 26, 2014, 6:37:03 PM
    Author     : Admin
--%>

<%@page import="java.util.Arrays"%>
<%@page import="data.OrderItemDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.OrderItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>
<%@include file="/includes/side-navigator.jsp"%>
<%@include file="/includes/user-navigator.jsp"%>
<%@include file="/includes/general-navigator.jsp"%>

<div id="main area">

<h1>Admin Menu</h1>
    <form action="AdminController" method="post">
       <input type="hidden" name="action" value="viewOrders">
        <input type="submit" value="Display All Orders">
        </form>
      <!--   <%OrderItem items=OrderItemDB.getList(1455);   
        int i=items.getOrderNumber();%>
        <%=items%>
        <%=i%> -->
        <table width="65%">
  <tr>
    <th>Order Number</th>
    <th>Customer</th>
    <th>Order Date</th>
    <th>Total</th>
  </tr>
<tr>
    <td>${orderNum1}</td>
    <td>${firstName}</td>
    <td>${order.date}</td>
    <td>${order.cost}</td>
    
</tr>
</table>
<hr>

        
        <!-- quantity= ${quant} -->
        
       



</div>
