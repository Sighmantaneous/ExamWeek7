public class Product {

    private String productId;
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.productId = "";
        this.name = "" ;
        this.price = 0;
        this.quantity = 0;
    }

    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return ( "Product details are:"+ "Id = "+productId+" name= "+name+" price = "+ price+ " quantity = "+quantity );
    }
}
