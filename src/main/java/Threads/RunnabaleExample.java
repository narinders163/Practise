package Threads;

import java.util.Scanner;

public class RunnabaleExample implements Runnable{

    public static int n, total = 0;

    public static void main(String[] args) {
        long Start = System.currentTimeMillis();
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        RunnabaleExample.n = scanner.nextInt();
        RunnabaleExample runnabaleExample = new RunnabaleExample();
        Thread thread = new Thread(runnabaleExample);
        thread.start();
        //System.out.println(CalculateTime.total);
        long End = System.currentTimeMillis();
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(thread.isAlive());
        System.out.println(thread.getName());
        System.out.println("It took a total of " + (End - Start) / 1000 + " Seconds to finish the test");
    }

    public void run()  {
        for (int i = 1; i <= RunnabaleExample.n; i++) {
            RunnabaleExample.total = RunnabaleExample.total + i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(RunnabaleExample.total);

    }

}
