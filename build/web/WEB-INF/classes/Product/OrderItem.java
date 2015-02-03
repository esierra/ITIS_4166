package Product;
import Product.Product;
import java.io.Serializable;
import java.text.NumberFormat;

public class OrderItem implements Serializable {
    private int orderNumber;
    private Product product;
    private int quantity;

    public OrderItem() {
    }
    public OrderItem(int orderNumber,Product product,int quantity){
        this.orderNumber=orderNumber;
        this.product=product;
        this.quantity=quantity;
    }

    public void setOrderNumber(int orderNumber){
        this.orderNumber=orderNumber;
    }
    public int getOrderNumber(){
        return orderNumber;
    }
    public void setProduct(Product p) {
        product = p;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getTotal(){
        double total=product.getPrice()*quantity;
        return total;
    }
}