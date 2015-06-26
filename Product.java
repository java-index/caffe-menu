/**
 * Created by eco on 26.06.15.
 */
public class Product {
    private Ingredients [] ingredients;
    private String productName;
    Double price;

    public Product(String productName){
        this.productName = productName;
        ingredients = new Ingredients[0];
        this.price = 0.0;
    }
    public void addIngredients(Ingredients ingredients){
        this.ingredients[0] = ingredients;
    }

    public void setPrice(Double newPrice) {
        this.price = newPrice;
    }
}
