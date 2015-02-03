<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>
<table width="85%">
  <tr>
    <th>Order Number</th>
    <th>Customer</th>
    <th>Order Date</th>
    <th>Total</th>
  </tr>
<tr>
    <td>${order.orderNum}</td>
    <td>${firstName}</td>
    <td>${order.date}</td>
    <td>${order.cost}</td>
    
</tr>
</table>
<hr>