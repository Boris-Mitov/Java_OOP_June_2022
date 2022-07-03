package WorkingWithAbstractionExercise.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] vault = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long cash = 0;

        for (int i = 0; i < vault.length; i += 2) {
            String name = vault[i];
            long count = Long.parseLong(vault[i + 1]);

            String itemType = "";

            if (name.length() == 3) {
                itemType = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                itemType = "Gem";
            } else if (name.equalsIgnoreCase("gold")) {
                itemType = "Gold";
            }

            if (itemType.equals("")) {
                continue;
            } else if (bagCapacity < bag.values().stream()
                    .map(Map::values)
                    .flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (itemType) {
                case "Gem":
                    if (!bag.containsKey(itemType)) {
                        if (bag.containsKey("Gold")) {
                            if (count > bag.get("Gold").values().stream()
                                    .mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(itemType).values().stream()
                            .mapToLong(e -> e)
                            .sum() + count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(itemType)) {
                        if (bag.containsKey("Gem")) {
                            if (count > bag.get("Gold").values().stream()
                                    .mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(itemType).values().stream()
                            .mapToLong(e -> e)
                            .sum() + count > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(itemType)) {
                bag.put((itemType), new LinkedHashMap<>());
            }

            if (!bag.get(itemType).containsKey(name)) {
                bag.get(itemType).put(name, 0L);
            }


            bag.get(itemType).put(name, bag.get(itemType).get(name) + count);
            if (itemType.equals("Gold")) {
                gold += count;
            } else if (itemType.equals("Gem")) {
                gems += count;
            } else if (itemType.equals("Cash")) {
                cash += count;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> b : bag.entrySet()) {
            Long sumValues = b.getValue().values().stream()
                    .mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", b.getKey(), sumValues);

            b.getValue().entrySet().stream()
                    .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}