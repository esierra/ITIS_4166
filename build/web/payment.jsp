
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>


<h1>Payment Information</h1>
       <hr>
       <div class="alert alert-danger" role="alert">
  <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
  <span class="sr-only">Error:</span>
<span class="label label-danger">Danger</span>
  Please do not enter any personal information!
</div>
<div class="payment">

<label>Credit Card Type</label>
<input type="text" name="number" required><br>
<label>Expiration Date</label>
<input type="text" name="number" required><br>
<label>Card Number</label>
<input type="text" name="number" required><br>
<label>CVV (3 digit)</label>
<input type="text" name="number" required><br>


</div>
<div class="confirm-purchase">
 <p>Your card will be charged a total of: ${order.cost} ${total.cost}</p>
          <form action="OrderController" method="post">
           <input type="hidden" name="action" value="confirmOrder">
            <input type="submit" class="UpdateButton" value="Confirm Purchase">
            </form>

</div>