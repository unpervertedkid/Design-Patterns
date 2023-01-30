package decorator.beverages;

public class DarkRoast extends Beverage {
    private String description;
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
