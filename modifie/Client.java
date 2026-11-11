public class Client {
    public static void main(String[] args) throws InterruptedException {
        final int NB = 5;
        final Singleton[] obtenues = new Singleton[NB];
        Thread[] threads = new Thread[NB];
        for (int i = 0; i < NB; i++) {
            final int k = i;
            threads[i] = new Thread(() -> obtenues[k] = Singleton.getInstance());
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }
        boolean memeInstance = true;
        for (Singleton s : obtenues) {
            memeInstance = memeInstance && (s == obtenues[0]);
        }
        obtenues[0].methodeSingleton();
        System.out.println(NB + " threads, meme instance : " + memeInstance);
    }
}
