public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.methodeSingleton();
        s2.methodeSingleton();
        System.out.println("s1 == s2 : " + (s1 == s2));
        // new Singleton(); -> erreur de compilation : constructeur prive
    }
}
