package decorator;

public class Espresso extends Beverage{
    private String description;
    public Espresso() {
        description = "Espresso Coffee";
    }
    @Override
    public double cost() {
        return super.cost() + 1.99;
    }
}
