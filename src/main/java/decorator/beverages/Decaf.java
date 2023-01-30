package decorator.beverages;

public class Decaf extends Beverage{
    private String description;
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
