package design_patten.creational.singleton;

public class BasicSingleton {
    // Step 1: Create static instance
    private static BasicSingleton instance;

    // Step 2: Private constructor (prevent object creation)
    private BasicSingleton() {}

    // Step 3: Public method to access instance (Not thread-safe & Lazy initialization)
    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }

    /*
        ❗ Problem:
                -Not thread-safe
                -Multiple threads can create multiple objects
    */
}
