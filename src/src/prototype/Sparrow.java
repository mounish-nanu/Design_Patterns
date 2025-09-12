package prototype;

public class Sparrow extends Bird{
    int length;

    public Sparrow(String name , int weight, int length) {
        super(name, weight);
        this.length = length;
    }

    private Sparrow(Sparrow sp) {
        super(sp);
        this.length = sp.length;
    }

    public Sparrow copy(){
        return new Sparrow(this);
    }

}
