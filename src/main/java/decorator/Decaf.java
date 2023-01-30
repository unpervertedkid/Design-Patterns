package decorator;

public class Decaf extends Beverage{
    private String description;
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return super.cost() + 1.05;
    }
}
