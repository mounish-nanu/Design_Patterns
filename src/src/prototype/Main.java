package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = List.of(
               new Crow("black", 30, "kawkaw"),
               new Sparrow("red", 25, 50)
        );

        List<Bird> birdsCopy = new ArrayList<>();

        for(Bird bird:birds){
            birdsCopy.add(bird.copy());
        }

        System.out.println(birdsCopy);
    }
}
