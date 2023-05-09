package template.Barista;

public class BeverageTestDrive {

    public static void main(String[] args) {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        TeaWithHook teaHook = new TeaWithHook();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
    }
}
