package getterandsetter;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String [] args)
    {
        int currentyear = 2022;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hey "+name+" thanks for coming here!");
        System.out.println("What year were you born in?");
        String yearofbirth = sc.nextLine();
        int birthyear = Integer.parseInt(yearofbirth);
        int age = currentyear - birthyear;
        System.out.println("So you are "+age+" years old!!");


    }
}
