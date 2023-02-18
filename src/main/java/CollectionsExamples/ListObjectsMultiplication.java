package CollectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListObjectsMultiplication {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,8,2,4,6,2,3,5,7,9);
        System.out.println(list.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->(c+e)));
    }
}
