package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionOnStudent {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("Reflection.Student");
            Object o = aClass.newInstance();
            Constructor<?> constructor = aClass.getConstructor(null);
            Constructor<?> constructor1 = aClass.getConstructor(double.class, double.class);
            Object o1 = constructor1.newInstance(6,8);

            Method getAge = aClass.getMethod("getAge",null);
            System.out.println(getAge.invoke(o1,null));
            
            Method setAge = aClass.getMethod("setAge", double.class);
            setAge.invoke(o1,87.0);
            Method getAge1 = aClass.getMethod("getAge",null);
            System.out.println(getAge1.invoke(o1,null));

            Field age = aClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(o1,43);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
