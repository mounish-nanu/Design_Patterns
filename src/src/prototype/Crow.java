package prototype;

// crow -> implementation of bird

public class Crow extends Bird{
    private String sound;

    public Crow(String color, int weight, String sound) {
        super(color,weight);
        this.sound = sound;
    }

    private Crow(Crow other){
        super(other);
        this.sound = other.sound;
    }

    public Crow copy(){
        return new Crow(this);
    }
}
