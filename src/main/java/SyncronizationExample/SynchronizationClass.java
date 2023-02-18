package SyncronizationExample;

class ToBeSynchronized
{
    int count;
    public synchronized void counter()
    {
        count++;
    }
}

public class SynchronizationClass {
    public static void main(String[] args) throws InterruptedException {
        ToBeSynchronized toBeSynchronized = new ToBeSynchronized();
        Thread thread = new Thread(){
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    toBeSynchronized.counter();
                }
            }
        };

        Thread thread1 = new Thread(){
            public void run()
            {
                for (int i=1;i<=1000;i++)
                {
                    toBeSynchronized.counter();
                }
            }
        };

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(toBeSynchronized.count);

    }
}
