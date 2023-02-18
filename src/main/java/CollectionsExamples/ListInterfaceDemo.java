package CollectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Narinder");
        list.add("Pargat");
        list.add("Mummy");
        list.add("Daddy");
        list.add("Aviraj");

        Collections.shuffle(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
