package decorator;

public class Espresso extends Beverage{
    private String description;
    public Espresso() {
        description = "Espresso Coffee";
    }
    @Override
    double cost() {
        return 0;
    }
}
