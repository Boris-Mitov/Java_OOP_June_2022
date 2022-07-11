package InterfacesAndAbstractionExercises.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> thingsWithBirthday = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] inputParts = input.split("\\s+");
            String typeToCreate = inputParts[0];
            switch (typeToCreate) {
                case "Citizen":
                    String citizenName = inputParts[1];
                    int age = Integer.parseInt(inputParts[2]);
                    String id = inputParts[3];
                    String citizenBirthDate = inputParts[4];
                    Citizen citizen = new Citizen(citizenName, age, id, citizenBirthDate);
                    thingsWithBirthday.add(citizen);
                    break;
                case "Pet":
                    String petName = inputParts[1];
                    String birthDate = inputParts[2];
                    Pet pet = new Pet(petName, birthDate);
                    thingsWithBirthday.add(pet);
                    break;
                case "Robot":
                    //TODO
                    break;
            }
            input = scanner.nextLine();
        }
        String yearToCheck = scanner.nextLine();
        for (Birthable citizen : thingsWithBirthday) {
            if(citizen.getBirthDate().endsWith(yearToCheck)) {
                System.out.println(citizen.getBirthDate());
            }
        }

    }
}
