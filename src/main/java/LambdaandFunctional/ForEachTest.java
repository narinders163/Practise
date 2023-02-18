package LambdaandFunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9, 3, 2, 4, 7, 8);
//        for (int i=0;i<= list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }

//        for (int n:list)
//        {
//            System.out.println(n);
//        }

//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        list.forEach(consumer);


        list.forEach(n->System.out.println(n));


    }
}
