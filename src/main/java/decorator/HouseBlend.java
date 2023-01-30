package decorator;

public class HouseBlend extends Beverage{
    private String description;
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    double cost() {
        return 0;
    }
}
