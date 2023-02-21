package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class practise {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("java.lang.String");
        Constructor<?>[] constructors = aClass.getConstructors();
        System.out.println(Arrays.toString(constructors));
        Constructor<?> constructor = aClass.getConstructor(char[].class);
        String s = "why";
        char[] chars = s.toCharArray();
        System.out.println(constructor);
        Object o = constructor.newInstance(chars);
        System.out.println(o);

        Method[] methods = aClass.getMethods();
        Arrays.stream(methods).toList().stream().forEach(m-> System.out.println("Method name ::::: " + m));
        Method indexOf = aClass.getMethod("indexOf", String.class);
        System.out.println(indexOf);
        System.out.println(indexOf.invoke(o,"y"));

    }
}
