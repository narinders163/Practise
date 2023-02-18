package InnerClasses;

public class OverriddingUsingInner {
    public static void main(String[] args)
    {
        D d = new D()
        {
          public void m1()
          {
              for(int i = 0; i<=10; i++)
              {
                  System.out.println("Printing :"+i);
              }
          }
        };
        d.m1();
    }
}
class D {
    int i;

    public void m1() {
        for (i = 0; i <= 5; i++) {
            System.out.println("Printing :" + i);
        }
    }
}


