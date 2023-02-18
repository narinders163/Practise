package enumExample;
enum Laptop
{
    Macbook(2000), XPS(2200), Surface(1800), ThinkPad(1900);
    private int price;
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    Laptop(int p)
    {
        this.price = p;
    }
}

public class EnumExampleClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());
    }
}
