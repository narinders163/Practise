package LambdaandFunctional;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface test
{
    public void show();
}
public class FuncAndLambda {
    public static void main(String[] args) {
        test t = () -> System.out.println("hi");

        t.show();

        List<Integer> integerList = Arrays.asList(4,5,6,7,8,9);
        integerList.forEach(i ->System.out.println(i));

//        for (int i:integerList) {
//            System.out.println(i);
//        }
    }
}
