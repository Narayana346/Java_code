package design_patten.creational.singleton;

public class Singleton {
    // Step 1: Create static instance
    private static Singleton instance;

    // Step 2: Private constructor (prevent object creation)
    private Singleton() {}

    // Step 3: Public method to access instance (Not thread-safe & Lazy initialization)
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /*
        ❗ Problem:
                -Not thread-safe
                -Multiple threads can create multiple objects
    */
}
