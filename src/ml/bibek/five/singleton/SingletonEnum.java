package ml.bibek.five.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void print() {
        System.out.println("Singleton using enum");
    }
}

// Driver class
class SingletonEnumClient {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.print();
    }
}

