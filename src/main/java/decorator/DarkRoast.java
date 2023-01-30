package decorator;

public class DarkRoast extends Beverage {
    private String description;
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return super.cost() + 0.99;
    }
}
