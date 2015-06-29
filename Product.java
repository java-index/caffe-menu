public abstract class Product {
    protected String productName;
    protected double price;
    protected double quantity;

    public Product(String name, double quantity){
        this.productName = name;
        this.quantity = quantity;
    }

    public Product(){
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    protected void renameProduct(String newName){
        this.productName = newName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
