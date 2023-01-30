package decorator;

public class DarkRoast extends Beverage {
    private String description;
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    @Override
    double cost() {
        return 0;
    }
}
