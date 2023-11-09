package assignmentProject;

public class Product {
    public ProductCategory productCategory;
    private String productId;
    private String productName;
    public double price;
    public String productDescription;


    public Product(String productId, String productName, double price, String productDescription){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }




}
