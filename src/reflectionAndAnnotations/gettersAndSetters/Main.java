package reflectionAndAnnotations.gettersAndSetters;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        Method[] methods = clazz.getDeclaredMethods();

//        int modifiers = methods[0].getModifiers();



        TreeSet<Method> getters =filterMethodBy(methods, "get");

        TreeSet<Method> setters = filterMethodBy(methods, "set");

        Function<Class<?>, String> formatType = c -> c == int.class ? "class int" : c.toString();

        getters.stream()
                .forEach(m -> {
                    System.out.printf("%s will return %s%n", m.getName(), formatType.apply(m.getReturnType()));
                });

        setters.stream()
                .forEach(m -> {
                    System.out.printf("%s and will set field of %s%n", m.getName(),formatType.apply(m.getParameterTypes()[0]));
                });
    }

    public static TreeSet<Method> filterMethodBy (Method[] methods, String filter) {
        return Arrays.stream(methods)
                .filter(n -> n.getName().contains(filter))
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(Method::getName))));
    }
}
