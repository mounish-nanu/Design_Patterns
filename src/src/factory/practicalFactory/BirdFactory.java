package factory.practicalFactory;

public class BirdFactory {

    public static Bird fact(String btype){
        if (btype.equals("crow")){
            return new Crow();
        }
        else if (btype.equals("sparrow")){
            return new Sparrow();
        }
        else{
            return null;
        }
    }

}
