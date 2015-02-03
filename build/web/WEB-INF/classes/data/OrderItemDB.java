package data;
import Product.*;
import SQLUtil.*;
import SQLUtil.DbConnection;
import java.sql.*;
import java.util.*;
import javax.servlet.*;

public class OrderItemDB {

    //This method adds one lineItem to the LineItems table.
    public static int insert(int orderNumber, OrderItem orderItem) {
        Connection connection = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "INSERT INTO OrderItem(OrderNumber, ProductCode, Quantity) "
                + "VALUES (?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, orderNumber);
            ps.setString(2, orderItem.getProduct().getProductCode());
            ps.setInt(3, orderItem.getQuantity());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } 
    }
        public static OrderItem getList(int orderNumber){
            OrderItem lineItems = new OrderItem();
              OrderItem lineItem = new OrderItem();
              Order or=new Order();
              Product product=new Product();
         Statement statement = DbConnection.getNewStatement();
                 Connection connection = DbConnection.getConnection();
        ResultSet resultSet = null;
        PreparedStatement ps;
        String query = "";
        int orderNum=0;
        String pr="";
        int quant=0;

//'" + orderNumber " + "' ORDER BY orderNumber
           try{ 
            query = "SELECT OrderNumber, ProductCode, Quantity FROM OrderItem WHERE OrderNumber= '"+orderNumber+"'";
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                orderNum=resultSet.getInt("OrderNumber");   
                pr=resultSet.getString("ProductCode");
                 quant=resultSet.getInt("Quantity");
                 lineItem.setOrderNumber(orderNum);
                 product=ProductDB.getProduct(pr);
                lineItem.setProduct(product);
                lineItem.setQuantity(quant);
               OrderItem lineItems2=new OrderItem(orderNum,product,quant);
               return lineItems2;

                     
          
            }
                
           
            return lineItems;
           
    
        } catch (SQLException se) {
           System.err.println(se);
           System.err.println("error in getList()");

            return null;
        }
    }

//     public static ArrayList<OrderItem> getList(int orderNumber){
//             ArrayList<OrderItem> lineItems = new ArrayList();
//               OrderItem lineItem = new OrderItem();
//               Order or=new Order();
//               Product product=new Product();
//          Statement statement = DbConnection.getNewStatement();
//                  Connection connection = DbConnection.getConnection();
//         ResultSet resultSet = null;
//         PreparedStatement ps;
//         String query = "";
//         int orderNum=0;
//         String pr="";
//         int quant=0;

// //'" + orderNumber " + "' ORDER BY orderNumber
//            try{ 
//             query = "SELECT OrderNumber, ProductCode, Quantity FROM OrderItem WHERE OrderNumber= '"+orderNumber+"'";
//             resultSet = statement.executeQuery(query);

//             while (resultSet.next()) {
//                 orderNum=resultSet.getInt("OrderNumber");   
//                 pr=resultSet.getString("ProductCode");
//                  quant=resultSet.getInt("Quantity");
//                  lineItem.setOrderNumber(orderNum);
//                  product=ProductDB.getProduct(pr);
//                 lineItem.setProduct(product);
//                 lineItem.setQuantity(quant);
//                 lineItems.add(lineItem);
                     
          
//             }
//                 for (OrderItem lineItem1 : lineItems) {
//                     System.out.println(lineItem1);
//                 }
           
//             return lineItems;
           
    
//         } catch (SQLException se) {
//            System.err.println(se);
//            System.err.println("error in getList()");

//             return null;
//         }
//     }
}
