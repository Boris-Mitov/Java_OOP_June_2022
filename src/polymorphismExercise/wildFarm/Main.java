package polymorphismExercise.wildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animalList = new ArrayList<>();

        String inputLine = scanner.nextLine();
        while (!"End".equals(inputLine)) {
            String[] animalData = inputLine.split(" ");

            String animalType = animalData[0];
            String animalName = animalData[1];
            Double animalWeight = Double.parseDouble(animalData[2]);
            String animalLivingRegion = animalData[3];
            Animal animal = getAnimal(animalData, animalType, animalName, animalWeight, animalLivingRegion);

            inputLine = scanner.nextLine();
            String[] foodData = inputLine.split(" ");

            String foodType = foodData[0];
            Integer foodQuantity = Integer.parseInt(foodData[1]);
            Food food = getFood(foodType, foodQuantity);;

            animal.makeSound();

            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animalList.add(animal);

            inputLine = scanner.nextLine();
        }
        animalList.forEach(System.out::println);
    }

    private static Animal getAnimal(String[] animalData, String animalType, String animalName, Double animalWeight, String animalLivingRegion) {

        switch (animalType) {
            case "Cat":
                String catBreed = animalData[4];
                return new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
            default:
                return null;
        }
    }

    private static Food getFood(String foodType, Integer foodQuantity) {
        switch (foodType) {
            case "Vegetable":
                return new Vegetable(foodQuantity);
            case "Meat":
                return new Meat(foodQuantity);
            default:
                return null;
        }
    }
}
