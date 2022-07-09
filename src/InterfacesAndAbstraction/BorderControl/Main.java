package InterfacesAndAbstraction.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String line = scanner.nextLine();

        while (!"End".equals(line)) {
            String[] lineParts = line.split("\\s+");

            Identifiable identifiable =
                    lineParts.length == 2
                            ? new Robot(lineParts[0], lineParts[1])
                            : new Citizen(lineParts[0], Integer.parseInt(lineParts[1]), lineParts[2]);

            identifiables.add(identifiable);
            System.out.println(identifiable.getId());
            line = scanner.nextLine();
        }

        String fakeIdPostFix = scanner.nextLine();

        identifiables
                .stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeIdPostFix))
                .forEach(System.out::println);
    }

}
