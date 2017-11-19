package adrianthreads2;

/**
 *
 * @author Arod6
 */
public class AdrianThreads2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Thread thread0 = new Thread(new printA());
        Thread thread1 = new Thread(new printB());
        Thread thread2 = new Thread(new printC());

        Thread[] threads = {thread0, thread1, thread2};

        int threadCount=0;

        while (true) {

            threads[threadCount % threads.length].start();
            threads[threadCount % threads.length].join();

            if (++threadCount == 3000) {
                break;
            }
        }

    }
}
