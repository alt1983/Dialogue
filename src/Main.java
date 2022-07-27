public class Main {
    public static void main(String[] args) {

        String[] threads = {"поток 1", "поток 2", "поток 3", "поток 4"};
        ThreadGroup mainGroup = new ThreadGroup("main group");

        for (int i = 0; i < threads.length; i++) {
            String name = "поток " + (i + 1);
            new Thread(mainGroup, new MyThread(name)).start();
        }

        try {
            Thread.sleep(15000);
            mainGroup.interrupt();
        } catch (InterruptedException err) {

        }

    }
}