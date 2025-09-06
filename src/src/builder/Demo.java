package builder;

public class Demo {
    public static void main(String[] args) {
        Computer cmp = new Computer.Builder("Intel").ram(16).storageGb(512).build();

//        System.out.println(cmp.getCpu());

    }
}
