package Interfaces;
interface Computer {
    void show();
}
class laptop implements Computer {
    public void show() {
        System.out.println("code,compile,run");
    }
}
class desktop implements Computer {
    public void show() {
        System.out.println("code, compile, run faster");
    }
}
class developer
{
    void devapp(Computer comp){
        comp.show();
    }
}
public class NeedOfInterface {
    public static void main(String[] args) {
//        Computer comp = new laptop();
        Computer comp = new desktop();
        developer dev = new developer();
        dev.devapp(comp);
    }
}
