package factory.factoryMethod;

public class SparrowCreator extends BirdCreator {
    @Override
    public Bird createBird() {
        return new Sparrow();
    }
}
