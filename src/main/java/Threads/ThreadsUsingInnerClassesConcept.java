package Threads;

public class ThreadsUsingInnerClassesConcept {

    public static void main(String[] args) throws InterruptedException {
        long starttime = System.currentTimeMillis();

        Thread thread = new Thread(() -> {
            for (int j = 0; j <= 200; j++) {
                System.out.println("j :" + j);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i <= 200; i++) {
                    System.out.println("i :" + i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        long finishtime = System.currentTimeMillis();
        long totaltime = (finishtime - starttime) / 1000;
        System.out.println("total time taken to execute is " + totaltime + " seconds");
    }
}
