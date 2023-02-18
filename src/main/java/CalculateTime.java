import java.util.Scanner;

public class CalculateTime extends Thread {
    public static int n, total = 0;

    public static void main(String[] args) {
        long Start = System.currentTimeMillis();
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        CalculateTime.n = scanner.nextInt();
        CalculateTime calculateTime = new CalculateTime();
        calculateTime.start();
        //System.out.println(CalculateTime.total);
        long End = System.currentTimeMillis();
        try {
            calculateTime.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("It took a total of " + (End - Start) / 1000 + " Seconds to finish the test");
    }

    public void run()  {
        for (int i = 1; i <= CalculateTime.n; i++) {
            CalculateTime.total = CalculateTime.total + i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(CalculateTime.total);
    }

}
