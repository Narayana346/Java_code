package design_patten.creational.singleton;

public class LockingSingleton {
    // Step 1: Create static instance
    private static volatile LockingSingleton instance;

    // Step 2: Private constructor (prevent object creation)
    private LockingSingleton() {}

    // Step 3: Public method to access instance
    public static LockingSingleton getInstance() {
        if (instance == null) {
           synchronized (LockingSingleton.class){
               if(instance == null){
                   instance = new LockingSingleton();
               }
           }
        }
        return instance;
    }

    /*
     ✔ Pros:
        -Thread-safe
        -Better performance than synchronized
     ❗ Important:
        -Must use volatile keyword
    */

}
