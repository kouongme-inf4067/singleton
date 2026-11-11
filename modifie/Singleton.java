public class Singleton {
    private static volatile Singleton instance = null;     // modifié : volatile

    private Singleton() {
        System.out.println("Creation de l'instance unique");
    }

    public static Singleton getInstance() {
        if (instance == null) {                            // 1er test sans verrou
            synchronized (Singleton.class) {               // ajouté
                if (instance == null) {                    // 2e test sous verrou
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void methodeSingleton() {
        System.out.println("Singleton.methodeSingleton()");
    }
}
