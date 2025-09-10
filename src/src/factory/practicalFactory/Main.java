package factory.practicalFactory;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Bird b = BirdFactory.fact("crow");
        Bird b2 = BirdFactory.fact("sparrow");
        if(b instanceof Crow){
            ((Crow) b).eat();
        }
        if(b2 instanceof Sparrow){
            ((Sparrow) b2).fly();
        }
    }
}
