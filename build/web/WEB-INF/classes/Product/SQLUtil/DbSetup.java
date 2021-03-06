
package Product.SQLUtil;
import Product.*;
import data.*;


public class DbSetup {

    // runing this file creates the PRODUCT and USER tables
    // and adds a test entry in each table
    public static void main(String[] args) {

        ProductDB pDB = new ProductDB();
        pDB.createProductTable();

        Product testProduct = new Product("1", "productName", 0, "catalogCategory",
                0.0f, "description", "imageUrl");
        pDB.addProduct(testProduct);

        UserDB uDB = new UserDB();
        uDB.createUserTable();

        User testUser = new User("userID", "firstName", "lastName", "email",
                "address1", "address2", "city", "state",
                "zipcode", "country");
        uDB.addUser(testUser);

    }

}
