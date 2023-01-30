package decorator.beverages;

public class Espresso extends Beverage{
    private String description;
    public Espresso() {
        description = "Espresso Coffee";
    }
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
