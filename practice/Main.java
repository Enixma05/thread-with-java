public class Main {
    public static void main(String[] args) throws Exception {
        // === Thread dengan mewarisi kelas thread ===
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println("Done gan");

        // === Thread dengan interface Runnable
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        t2.join();
        System.out.println("Done bang");

    }
}
