package factory.practicalFactory;

public class Crow extends Bird{
    public Bird render(){
        return new Crow();
    }
    public void eat(){
        System.out.println("Crow eat");
    }
}
