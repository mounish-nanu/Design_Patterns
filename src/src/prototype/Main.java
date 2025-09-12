package prototype;

import java.util.ArrayList;
import java.util.List;


//Prototype and registry design pattern -> This pattern is used when creation of object
// is costly and when we want to return copy of class cheaply.

/**  comment the lines that are active in main method and uncomment other lines and run
 to check the copies that are being returned **/

//we store the copies of classes in registry and return a new copy whenever required

public class Main {
    public static void main(String[] args) {
//        List<Bird> birds = List.of(
//                new Crow("black", 30, "kawkaw"),
//                new Sparrow("red", 25, 50)
//        );
//        List<Bird> birdsCopy = new ArrayList<>();

        Registry rg = new Registry();
        rg.ad("crow" , new Crow("Black", 30, "kawkaw"));
        rg.ad("sparrow" , new Sparrow("brown" , 30,25));

        Bird bird = rg.getBird("sparrow");
//        for (Bird bird : birds) {
//            birdsCopy.add(bird.copy());
        System.out.println("Finished");
//        }
//        System.out.println(birdsCopy);

    }
}
