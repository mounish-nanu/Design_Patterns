package prototype;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Bird> birds = List.of(
//                new Crow("black", 30, "kawkaw"),
//                new Sparrow("red", 25, 50)
//        );
//
//        List<Bird> birdsCopy = new ArrayList<>();
        Registry rg = new Registry();
        rg.ad("crow" , new Crow("Black", 30, "kawkaw"));
        rg.ad("sparrow" , new Sparrow("brown" , 30,25));

        Bird bird = rg.getBird("sparrow");
//        for (Bird bird : birds) {
//            birdsCopy.add(bird.copy());
        System.out.println("Finished");


//        }
//
//        System.out.println(birdsCopy);
        
    }
}
