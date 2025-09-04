package singleton;

//singleton design pattern makes sure that only one object is created for a class , which
//significantly reduces object creation cost and leaves us with single global object

//In this file , I wrote different ways to implement this pattern and their pros and cons
//and finally I will end this with a best possible way to implement singleton

public class Logger {

//    Eager loading -> Creates the single instance when the class is initialized.

    // static: belongs to the class (one per classloader)
    // final : the reference can't be reassigned after initialization

    /* private static final Logger instance = new Logger();

    private Logger(){}

    // Global access point to the single instance
    public static Logger getInstance() {
        return instance;
    } */

//   pros ->  Easiest correct code

  /*  Downside of this approach is we don't have a choice for creating instance ,
    sometimes object creation might be expensive   */


//    -----------------------Lazy loading----------------------

//    volatile -> this lets others to read values immediately after read/write opration
//    private static volatile Logger instance;
//
//    private Logger() {}
//
//    public static Logger getInstance() {
//        if (instance == null){
////            synchronized allows only one thread to go inside and create object
////            as soon as object is created and instance will be updated since it is volatile
////            and other threads will come to know that
//            synchronized (Logger.class){
//                if (instance == null){
//                    instance = new Logger();
//                }
//            }
//        }
//        return instance;
//    }

//    downside for this or whenever we use serialization , we will create 2 objects for this
//    and to avoid that we use below function
    // private Object readResolve() { return getInstance(); }

    // ---------------- Nested Class---------

//    private static class Holder {
//        public static final Logger INSTANCE = new Logger();
//}
//
//public static Logger getInstance() {
//        return Holder.INSTANCE;
//}

    //----------enum approach--------
private enum Holder {
    INSTANCE; //this creates only one object and uses the same object always
    final Logger value = new Logger();
}

public static Logger getInstance() {
    return Holder.INSTANCE.value;
}





}
