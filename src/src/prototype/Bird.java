package prototype;

public class Bird implements Cloneable<Bird> {
    private String color;
    private int weight;

    public Bird(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public Bird(Bird other){
        this.color = other.color;
        this.weight = other.weight;
    }

    public Bird copy(){
        return new Bird(this);
    }

}
