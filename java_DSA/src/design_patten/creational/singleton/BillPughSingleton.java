package design_patten.creational.singleton;

public class BillPughSingleton {
    // Step 1: Create static class instance holder
    private static class Holder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Step 2: Private constructor (prevent object creation)
    private BillPughSingleton() {}

    // Step 3: Public method to access instance (Lazy loaded + Thread-safe + Fast)
    public static BillPughSingleton getInstance() {
        return Holder.INSTANCE;
    }

    /*
        ✔ Pros:
            -Thread-safe
            -Lazy initialization
            -No synchronization overhead
            -Clean and best practice
    */
}
