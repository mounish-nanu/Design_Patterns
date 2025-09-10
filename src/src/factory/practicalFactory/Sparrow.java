package factory.practicalFactory;

public class Sparrow extends Bird{
    public Bird render(){
        return new Sparrow();
    };

    public void fly(){
        System.out.println("Sparrow fly");
    }
}
