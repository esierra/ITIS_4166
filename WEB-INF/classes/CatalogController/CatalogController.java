package CatalogController;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import Product.*;
import Product.ProductDB;
import Product.Product;
import data.*;
/**
*
* @author Admin
*/
public class CatalogController extends HttpServlet {


   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
//       processRequest(request, response);
       String requestURI = request.getRequestURI();
       HttpSession session = request.getSession();
             String url="";
            url = "/Catalog.jsp";

       if (requestURI.endsWith("Catalog")) {
            url = "/Catalog.jsp";
          } 

                String productCode=request.getParameter("action");
                requestURI = requestURI.substring(13);
          Product pr = ProductDB.getProduct(productCode.substring(5,6));
          String bookValue=productCode.substring(5,6);
          String prName=pr.getProductName();
          String price=Float.toString(pr.getPrice());
          String description=pr.getDescription();
          String imgURL=pr.getImageUrl();
          String category=pr.getCatalogCategory();

          OrderItem lineItem = new OrderItem();           
           lineItem.setProduct(pr);
           session.setAttribute("description",description);
           session.setAttribute("category",category);
           session.setAttribute("price", price);
           session.setAttribute("prName", prName);
            session.setAttribute("productCode", productCode);
            session.setAttribute("imgURL", imgURL);
            session.setAttribute("bookValue",bookValue);

             // url= "/" + productCode + ".jsp";
            url="/Book.jsp";
               
          getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
        }               
 
      
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
    
        }
  
   }



