class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        // If instance is defined then return it, otherwise return a new instance
        if (Singleton.instance == null) {
            return Singleton.instance;
        } else {
            return new Singleton();
        }
    }
}

class SingletonExample {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        if (a == b) {
            System.out.println("There is only one instance");
        } else {
            System.out.println("References are different");
        }
    }
}