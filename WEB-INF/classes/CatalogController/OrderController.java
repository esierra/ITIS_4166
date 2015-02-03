package CatalogController;

import Product.*;
import data.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
*
* @author Edson Sierra
*/
public class OrderController extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
   }
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

               
               double price = 0;
               String dis = null;
               String cate = null;
               String img = null;
               String prName = null;

       String url="/Catalog.jsp";
       ServletContext sc = getServletContext();
       String action=request.getParameter("action");
       if (action == null) {
           action = "cart";  // default action
       }

       if (action.equals("shop")) {
           url = "/Catalog.jsp";    
       } 
//////////////////////////////////////////////////////////////

       if (action.equals("1")) {
            
             String name=request.getParameter("action");
            User test=UserDB.getUser(name);
            HttpSession sess = request.getSession();

            String firstName=test.getFirstName();
            String lastName=test.getLastName();
            String email=test.getEmail();
            String address1=test.getAddress1();
            String address2=test.getAddress2();
            String city=test.getCity();
            String state=test.getState();

       sess.setAttribute("firstName", firstName); 
       sess.setAttribute("lastName", lastName); 
       sess.setAttribute("address1",address1);
       sess.setAttribute("city",city);
       sess.setAttribute("state",state);

  url = "/My-Orders.jsp";
       }
/////////////////////////////////////////////////////////////
else if(action.equals("confirmOrder")){
      HttpSession session = request.getSession();        
        String user = (String) session.getAttribute("firstName");
        Cart cart = (Cart) session.getAttribute("cart");
        Order order =new Order();
        order.setItemList(cart.getItems());
        order.setUser(user);

      DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
      Date today = Calendar.getInstance().getTime();        
      String reportDate = df.format(today);
        order.setDate(reportDate);
        Random rand=new Random();
         OrderItemDB ot=new OrderItemDB();
         OrderItem orderitem= (OrderItem) session.getAttribute("lineItem");
        int i=rand.nextInt(10000);
        order.setOrderNum(i);
        order.setTaxRate(7.0);
        order.setCost(orderitem.getTotal());
        order.setHasPaid(true);
        OrderDB ob=new OrderDB();          
         ob.addOrder(order);
                   int insert = ot.insert(i,orderitem);
        session.setAttribute("i",i);
        session.setAttribute("order", order);
     
        url= "/orderlist.jsp";
}  
else if(action.equals("viewOrders")){
    HttpSession session = request.getSession(); 
      String user = (String) session.getAttribute("firstName");
      if(user.equals(null)) url="/Catalog.jsp";
      else url="/orderlist.jsp";

}     

//////////////////////////////////////////////////////////////

       else if (action.equals("cart")) {
     String productCode = request.getParameter("productCode");
     String quantityString = request.getParameter("quantity");
    Product pr = ProductDB.getProduct(productCode);
     Product prp=new Product();


           HttpSession session = request.getSession();
           Cart cart = (Cart) session.getAttribute("cart");
           if (cart == null) {
               cart = new Cart();
           }
           int quantity;
          try {
                quantity = Integer.parseInt(quantityString);
                if (quantity < 0) {
                    quantity = 1;
                }
            } catch (NumberFormatException nfe) {
                quantity = 1;
            }
     
            String price1=pr.getProductName();

       if(prp!=null){
       price = prp.getPrice();
       cate = prp.getCatalogCategory();
       dis = prp.getDescription();
       price = prp.getPrice();
       prName = prp.getProductName();


    
           OrderItem lineItem = new OrderItem();
           lineItem.setProduct(prp);
           lineItem.setProduct(pr);
           lineItem.setQuantity(quantity);
           if (quantity > 0) {
                cart.addItem(lineItem);
            } else if (quantity == 0) {
                cart.removeItem(lineItem);
            }

 session.setAttribute("cart", cart);
 session.setAttribute("lineItem",lineItem);
           url = "/Cart.jsp";
   }
    sc.getRequestDispatcher(url)
               .forward(request, response);
    return;

}
 sc.getRequestDispatcher(url)
         .forward(request, response);
    }

}