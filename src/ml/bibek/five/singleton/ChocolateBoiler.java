package ml.bibek.five.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = false;
        boiled = false;
    }

//    Solution for multiple instance creation in multi threading

//    Method 1: Synchronizing the getInstance() method --> NOT RECOMMENDED (PROCESSOR HEAVY)
//    public static synchronized ChocolateBoiler getInstance() {
//        if (instance == null)
//            instance = new ChocolateBoiler();
//        return instance;
//    }

//    Method 2: Eager instantiation
//    private static ChocolateBoiler instance = new ChocolateBoiler();
//    public static ChocolateBoiler getInstance() {
//        return instance;
//    }

//    Method 3: Double-checked locking --> RECOMMENDED
    public static ChocolateBoiler getInstance() {
        if (instance == null)
            synchronized (ChocolateBoiler.class) {
                if (instance == null)
                    instance = new ChocolateBoiler();
            }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled())
            empty = true;
    }

    public void boil() {
        if (!isEmpty() && !isBoiled())
            boiled = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
