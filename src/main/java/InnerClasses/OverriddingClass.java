package InnerClasses;

public class OverriddingClass {
    public static void main(String[] args)
    {
        A b = new B();
        b.m1();
    }

}
class A
{
    int i;
    public void m1()
    {
        for(i=0;i<=5;i++)
        {
            System.out.println("Printing :"+i);
        }
    }

}
class B extends A
{
    int i;
    public void m1()
    {
        for (i=0;i<=10;i++)
        {
            System.out.println("Printing :"+i);
        }
    }
}
