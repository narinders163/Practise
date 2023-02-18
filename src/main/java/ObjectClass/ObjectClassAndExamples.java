package ObjectClass;

import java.util.Objects;

class Laptop
{
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Laptop laptop = (Laptop) o;
//        return price == laptop.price && Objects.equals(model, laptop.model);
//    }

    public boolean equals(Laptop that)
    {
        if(this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
public class ObjectClassAndExamples {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        Laptop obj1 = new Laptop();
        obj.model = "Lenovo";
        obj.price = 1000;

        obj1.price = 1000;
        obj1.model = "Lenovo";
        System.out.println(obj);
        System.out.println(obj1);



        System.out.println(obj==obj1);
        

        System.out.println(obj.equals(obj1));



    }
}
