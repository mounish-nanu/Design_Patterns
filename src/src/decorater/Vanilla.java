package decorater;

public class Vanilla implements IceCreamCone{
    private IceCreamCone iceCreamCone;

    public Vanilla(IceCreamCone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }

    public int getCost(){
        return iceCreamCone.getCost() + 20;
    }

    public String getConstituents(){
        return iceCreamCone.getConstituents() + ", Vanilla";
    }
}
