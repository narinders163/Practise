package CollectionsExamples;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public boolean hasNext() {
        return false;
    }


    public Object next() {
        return null;
    }

    @Override
    public String toString() {
        return "IteratorExample{}";
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Narinder");
        list.add("Pargat");
        list.add("Harman");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            Object ele = iterator.next();
            System.out.println(ele);
        }

    }
}
