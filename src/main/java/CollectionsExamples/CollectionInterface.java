package CollectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionInterface {
    public static void main(String [] args)
    {
        Collection<String> l = new ArrayList<>();
        l.add("Harman");
        l.add("Narinder");
//        l.add(1,"Aviarj");
//        System.out.println(l);

        Iterator<String> b = l.iterator();
        while(b.hasNext())
        {
            System.out.println(b.next());
        }


    }
}
