package design_patten.creational.singleton;

public class SynchronizedSingleton {
    // Step 1: Create static instance
    private static SynchronizedSingleton instance;

    // Step 2: Private constructor (prevent object creation)
    private SynchronizedSingleton() {}

    // Step 3: Public method to access instance (thread-safe & lazy initialization)
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

     /*
        ✔ Pros:
            -Thread-safe
        ❌ Cons:
            -Slow performance
            -Every call is synchronized (even after object is created)
    */
}
