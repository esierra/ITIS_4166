package Product;

public class Product implements java.io.Serializable {

    private String productCode;
    private String productName;
    private int categoryCode;
    private String catalogCategory;
    private float price;
    private String description;
    private String imageUrl;

    public Product() {
        productCode = "";
        productName = "";
        categoryCode = 0;
        catalogCategory = "";
        price = 0;
        description = "";
        imageUrl = "";
    }

    public Product(String productCode, String productName, int categoryCode, String catalogCategory,
            float price, String description, String imageUrl) {

        this.productCode = productCode;
        this.productName = productName;
        this.categoryCode = categoryCode;
        this.catalogCategory = catalogCategory;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCatalogCategory() {
        return catalogCategory;
    }

    public void setCatalogCategory(String catalogCategory) {
        this.catalogCategory = catalogCategory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
