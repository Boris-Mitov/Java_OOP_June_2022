package reflectionAndAnnotations.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz);

        Class<?> superclass = clazz.getSuperclass();

        System.out.println(superclass);

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Constructor<Reflection> constructor = clazz.getDeclaredConstructor();

        Object newInstance = constructor.newInstance();

        System.out.println(newInstance);

    }
}
