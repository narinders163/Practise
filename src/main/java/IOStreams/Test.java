package IOStreams;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        WritingCSV wcsv = new WritingCSV();
        Class c = wcsv.getClass();
        System.out.println(c);
        System.out.println(c.getSimpleName());
        Method[] methods = c.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method m:methods)
        {
            System.out.println(m.getName()+" Method and Return type Is = "+m.getReturnType());
        }
    }
}
