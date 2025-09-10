package factory.factoryMethod;

public abstract class BirdCreator {

    public abstract Bird createBird();

    public void makeBirdFly() {
        Bird bird = createBird();
        bird.fly();
    }
}