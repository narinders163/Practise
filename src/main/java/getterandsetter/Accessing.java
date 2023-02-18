package getterandsetter;

public class Accessing {
    public static void main(String[] args)
    {
        Setting s = new Setting();
        s.setAmount(1000);
        s.setAcc_no(14575);
        s.setName("Aman");

        System.out.println(s.getAmount());
        System.out.println(s.getAcc_no());
        System.out.println(s.getName());
    }
}
