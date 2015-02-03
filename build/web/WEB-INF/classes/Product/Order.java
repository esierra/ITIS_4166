package Product;
import data.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Order implements Serializable{
private int orderNumber;
private String date;
private String user;
private ArrayList<OrderItem> orderItemList;
private double taxRate;
private double cost;
private boolean hasPaid;


public Order(){
  orderNumber=0;
  date="";
//  user="";
  // orderItemList="";
  taxRate=0.0;
  cost=0.0;
  hasPaid=false;
}

public Order(int orderNumber,String date,String user,ArrayList<OrderItem> orderItemList,double taxRate,double cost,boolean hasPaid){
this.orderNumber=orderNumber;
this.date=date;
this.user=user;
this.orderItemList=orderItemList;
this.taxRate=taxRate;
this.cost=cost;
this.hasPaid=hasPaid;
}
public int getOrderNum(){
  return orderNumber;
}
public void setOrderNum(int orderNumber){
  this.orderNumber=orderNumber;
}
public String getDate(){
  return date;
}
public void setDate(String date){
  this.date=date;
}
public String getUser(){
  return user;
}
public void setUser(String user){
  this.user=user;
}
public ArrayList<OrderItem> getItemList(){
  return orderItemList;
}
public void setItemList(ArrayList<OrderItem> orderItemList){
  this.orderItemList=orderItemList;
}
public double getTaxRate(){
  return taxRate;
}
public void setTaxRate(double taxRate){
  this.taxRate=taxRate;
}
public double getCost(){
    double invoiceTotal = 0.0;
        for (OrderItem item : orderItemList) {
            invoiceTotal += item.getTotal();
        }
        return invoiceTotal;
}
public void setCost(double cost){
  this.cost=cost;
}
public boolean getHasPaid(){
  return hasPaid;
}
public void setHasPaid(boolean hasPaid){
  this.hasPaid=hasPaid;
}
}