package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<String , Bird> birds = new HashMap<String , Bird>();
    public void ad(String name, Bird bd){
        birds.put(name, bd);
    }
    public Bird getBird(String name){
        return birds.get(name).copy();
    }
}
