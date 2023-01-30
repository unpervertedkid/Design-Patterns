package decorator;

public abstract class Beverage {
    private String description = "Unknown Beverage";
    //condiments booleans
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    public String getDescription() {
        return description;
    }

    public double cost(){
        //TODO: implement cost
      return 0;
    }

    private boolean hasMilk() {
        return milk;
    }
    private boolean hasSoy() {
        return soy;
    }
    private boolean hasMocha() {
        return mocha;
    }
    private boolean hasWhip() {
        return whip;
    }

}
