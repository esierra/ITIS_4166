// • addItem(Product, Quantity) – adds an OrderItem for the product / quantity to the cart. 
// The cart should not allow multiple OrderItems for the same product, but should update 
// appropriately if one already exists.
// • removeItem(Product) – removes any OrderItem associated with the given Product.
// • List/Collection<OrderItem> getItems() – returns the set of current OrderItem-s
// • getItems() – returns a List / Collection of OrderItems from the cart
// • emptyCart() –clears the entire cart contents

package Product;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable {

    private ArrayList<OrderItem> items;

    public Cart() {
        items = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }
    public ArrayList<OrderItem> emptyCart(){
      items.clear();
      return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(OrderItem item) {
        String code = item.getProduct().getProductCode();
                int quantity = item.getQuantity();

        for (OrderItem cartItem : items) {
            if (cartItem.getProduct().getProductCode().equals(code)) {
                cartItem.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }
    
    public void removeItem(OrderItem item) {
        String code = item.getProduct().getProductCode();
        for (int i = 0; i < items.size(); i++) {
            OrderItem lineItem = items.get(i);
            if (lineItem.getProduct().getProductCode().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }
}