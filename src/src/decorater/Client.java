package decorater;

public class Client {
    public static void main(String[] args) {
        IceCreamCone iceCreamCone = new Chocolate(
                new Vanilla(
                        new BlueCone()
        ));
        System.out.println(iceCreamCone.getCost());
        System.out.println(iceCreamCone.getConstituents());
    }
}
