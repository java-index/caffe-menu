public class Menu {

    private Drinks[] drinks;

     public void createMenu(){
         Drinks coffee = new Drinks();
         coffee.setProductName("Coffee");
         coffee.addIngredient(new Sugar("Sugar", 0.5));

         Drinks blackTea = new Drinks();
         blackTea.setProductName("Black Tea");
         coffee.addIngredient(new Lemon("Lemon", 0.5));

         Drinks mokachino = new Drinks();
         mokachino.setProductName("Mokachino");
         coffee.addIngredient(new Water("Water", 0.2));

         drinks = new Drinks[3];
         drinks[0] = coffee;
         drinks[1] = blackTea;
         drinks[2] = mokachino;
     }

    public void printMenu(){
        System.out.printf("1. Drink - %s, Infgradient %s %s\n", drinks[0].getProductName(), drinks[0].getIngredient()[0].getProductName(), drinks[0].getPrice());
    }
}
