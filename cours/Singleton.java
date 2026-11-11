public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Creation de l'instance unique");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void methodeSingleton() {
        System.out.println("Singleton.methodeSingleton()");
    }
}
