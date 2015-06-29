public class Drinks extends Product {
    protected Product[] ingredient;

    public Drinks() {
        this.ingredient = new Product[1];
    }

    public void addIngredient(Product ingredient) {
        this.ingredient[0] = ingredient;
    }

    public double getPrice(){
        double getPrice = 0;
        for(Product p : ingredient){
            getPrice += p.getPrice();
        }
        return getPrice;
    }

    public Product[] getIngredient() {
        return ingredient;
    }
}
