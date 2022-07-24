package reflectionAndAnnotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        Class clazz = Class.forName("reflectionAndAnnotations.Reflection");

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getSuperclass());

        Class[] interfaces = clazz.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
