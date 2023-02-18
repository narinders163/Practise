package InnerClasses;

public class MemberClassExample {
    int i;
    class B {
        int j;
        public void m1()
        {
            System.out.println("Inside method m1");
        }
    }
}
class C
{
    public static void main(String [] args)
    {
        MemberClassExample memberClassExample = new MemberClassExample();
        memberClassExample.i = 5;
        MemberClassExample.B obj = memberClassExample.new B();
        obj.j=10;
        obj.m1();

    }
}
