package factory.factoryMethod;

public class CrowCreator extends BirdCreator {
    @Override
    public Bird createBird() {
        return new Crow();
    }
}
