<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp"%>

 
<h2>Contact Us</h2>
<hr>
<h4>Phone Number : 1 800 123 4567</h4>
<h4>Mail : 123 Main Street, Charlotte NC 28269</h4>
<h3>PLease leave your message below</h3>


<form action="inputServlet" method="get">
    <table cellspacing="7" border="0">
        <tr>
            <td align="rigth">Your Name </td>
            <td><input type="text" name="name" required></td>
        </tr>
        <tr>
            <td align="rigth">Email address </td>
            <td><input type="text" name="emailAddress" required></td>
        </tr>
        <tr>
            <td align="rigth">Subject </td>
            <td><input type="text" name="subject"></td>
        </tr>
        <tr>
            <td></td>
      
        </tr>
    </table>   
</form>
 <script type="text/javascript">
 var RecaptchaOptions = {
    theme : 'white'
 };
 </script>
 
  <%@ page import="net.tanesha.recaptcha.ReCaptcha" %>
    <%@ page import="net.tanesha.recaptcha.ReCaptchaFactory" %>
     <form action="" method="post">
        <%
          ReCaptcha c = ReCaptchaFactory.newReCaptcha("6Le3Tf0SAAAAAI2iCDOq1VWAhblaxG_ERZBKgVf2", "6Le3Tf0SAAAAAAuQDsAeYUll2YrFhvpbl1_HgJ5c", false);
          out.print(c.createRecaptchaHtml(null, null));
        %>
        <input type="submit" class="enjoy-css" value="submit" />
        </form>

