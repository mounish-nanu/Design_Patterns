package decorater;

public class Chocolate implements IceCreamCone{
    private IceCreamCone iceCreamCone;
    public Chocolate(IceCreamCone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }

    public int getCost(){
        return iceCreamCone.getCost() + 30;
    }

    public String getConstituents(){
        return iceCreamCone.getConstituents() + ", Chocolate";
    }
}
