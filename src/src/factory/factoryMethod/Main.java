package factory.factoryMethod;

//Bird is an abstract class and crow, sparrow are two classes which extends bird

//similarly, bird creator is also an abstract class and crow creator and sparrow creator
// extends that class

//From this main class , we create object of crowcreator which has makebird fly default method
// which again calls crow class from it
public class Main {
    public static void main(String[] args) {
        BirdCreator crowFactory = new CrowCreator();
        crowFactory.makeBirdFly();

        BirdCreator sparrowFactory = new SparrowCreator();
        sparrowFactory.makeBirdFly();

    }
}
