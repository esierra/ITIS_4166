/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CatalogController;

import Product.OrderItem;
import data.OrderItemDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AdminController", urlPatterns = {"/AdminController"})
public class AdminController extends HttpServlet {




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                 ServletContext sc = getServletContext();
       String action=request.getParameter("action");
                    HttpSession session = request.getSession();
                    Integer i= (Integer)session.getAttribute("i");
                    //Integer.parseInt(i)
                OrderItem items=OrderItemDB.getList(i);
                int orderNum1=items.getOrderNumber();
                int quant=items.getQuantity();
                session.setAttribute("items", items);
                session.setAttribute("orderNum1", orderNum1);
                session.setAttribute("quant", quant);



                String url="/admin.jsp";
 sc.getRequestDispatcher(url)
         .forward(request, response);
        
    }


}
