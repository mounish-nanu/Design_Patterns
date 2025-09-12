package prototype;

/**
 * Base class for all birds
 * **/

public class Bird implements Cloneable<Bird> {
//    attributes for all birds
    private String color;
    private int weight;

//    constructor for initializing attributes
    public Bird(String color, int weight){
        this.color = color;
        this.weight = weight;
    }
// bird constructor copy
    public Bird(Bird other){
        this.color = other.color;
        this.weight = other.weight;
    }
//  copy method which passes values to copy constructor

    public Bird copy(){
        return new Bird(this);
    }

}
