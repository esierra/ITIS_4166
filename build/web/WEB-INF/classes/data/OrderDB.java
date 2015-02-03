package data;
import Product.*;
import SQLUtil.*;
import SQLUtil.DbConnection;
import java.sql.*;
import java.util.*;
import javax.servlet.*;


public class OrderDB {

  public Order addOrder(Order order) {

        Connection connection = DbConnection.getConnection();
        PreparedStatement ps;
        // insert the new row into the table
        try {
            ps = connection.prepareStatement("INSERT INTO ORDERS VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, order.getOrderNum());
            ps.setString(2, order.getDate());
            ps.setString(3, order.getUser());
            // ps.setObject(4, order.getItemList()); 
            ps.setDouble(4, order.getTaxRate());
            ps.setDouble(5, order.getCost());
            ps.setBoolean(6, order.getHasPaid());

            ps.executeUpdate();


        } catch (SQLException se) {
            if (((se.getErrorCode() == 30000) && ("23505".equals(se.getSQLState())))) {
                System.out.println("ERROR: Could not insert record into Order; dup primary key: " + order.getOrderNum());
            } else  { 
                System.err.println(se);
                System.out.println("ERROR: Could not add row to PRODUCT table: " + order.getOrderNum() + " " + se.getCause());
            }
            return null;

        } catch (Exception e) {
            System.out.println("ERROR number 2: Could not add row to PRODUCT table: " + order.getOrderNum());
            



            return null;
        }
        System.out.println("Added product to PRODUCT table: " + order.getOrderNum());

        // return the  product object
        return order;
    }

 public static ArrayList<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<Order>();

        Statement statement = DbConnection.getNewStatement();
        ResultSet resultSet = null;

         int orderNumber=0;
         String date="";
         String user="";
//         ArrayList<Order> orderItemList=new ArrayList<Order>();
         double taxRate=0.0;
         double cost=0.0;
         boolean hasPaid=false;

        try {
            // Find the speciic row in the table
            resultSet = statement.executeQuery(
                    "SELECT OrderNumber,Date, User,TaxRate,Cost,HasPaid FROM Orders ORDER BY OrderNumber");
            while (resultSet.next()) {
               orderNumber = resultSet.getInt("OrderNumber");
               date        = resultSet.getString("Date");
               user       = resultSet.getString("User");
               taxRate      = resultSet.getDouble("TaxRate");
               cost         = resultSet.getDouble("Cost");
               hasPaid      =resultSet.getBoolean("HasPaid");
                
                Order order = new Order(orderNumber, date, user, null,taxRate, cost, hasPaid);
                orders.add(order);
                System.out.println("Found ordernumber in order table: " + orderNumber);
            }
        } catch (SQLException se) {
            System.out.println("ERROR: Could not exicute SQL statement in: " + "UserDB.getAllUsers()");
            System.out.println("ERROR: Could not exicute SQL statement: " + se);
            return null;
        }

        return orders;
    }
public static Order getOrder(){
     Statement statement = DbConnection.getNewStatement();
        ResultSet resultSet = null;

        int orderNumber=0;
         String date="";
         String user="";
//         ArrayList<Order> orderItemList=new ArrayList<Order>();
         double taxRate=0.0;
         double cost=0.0;
         boolean hasPaid=false;

        try {
            // Find the speciic row in the table
            resultSet = statement.executeQuery(
                    "SELECT OrderNumber,Date, User,TaxRate,Cost,HasPaid FROM Orders ORDER BY OrderNumber");
            while (resultSet.next()) {
               orderNumber = resultSet.getInt("OrderNumber");
               date        = resultSet.getString("Date");
               user       = resultSet.getString("User");
               taxRate      = resultSet.getDouble("TaxRate");
               cost         = resultSet.getDouble("Cost");
               hasPaid      =resultSet.getBoolean("HasPaid");
                

                System.out.println("2..Found ordernumber in order table: " + orderNumber);
            }
        } catch (SQLException se) {
            System.out.println("2..ERROR: Could not exicute SQL statement in: " + "UserDB.getAllUsers()");
            System.out.println("2..ERROR: Could not exicute SQL statement: " + se);
            return null;
        }
            Order order = new Order(orderNumber, date, user, null,taxRate, cost, hasPaid);
            return order;
}


}