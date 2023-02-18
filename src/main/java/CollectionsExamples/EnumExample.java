package CollectionsExamples;

enum Phone
{
    APPLE(1100),SAMSUNG,GOOGLE(1050);

    int price;
    Phone()
    {
        price = 1000;
    }
    Phone(int p)
    {
        price = p;
    }
}

public class EnumExample {
    public static void main(String[] args)
    {
        Phone[] phone = Phone.values();
        for (Phone phones: phone)
        {
            System.out.println(phones);
        }
        System.out.println(System.getProperty("user.dir"));
    }
}
