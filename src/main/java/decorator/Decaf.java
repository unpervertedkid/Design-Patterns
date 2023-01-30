package decorator;

public class Decaf extends Beverage{
    private String description;
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    double cost() {
        return 0;
    }
}
