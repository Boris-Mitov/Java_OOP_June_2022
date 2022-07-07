package InheritanceExercise.Zoo;

public class Main {
    public static void main(String[] args) {

        Lizard lizard = new Lizard("Gushter");
        Snake snake = new Snake("Smoko");
        Gorilla gorilla = new Gorilla("Harambe");
        Bear bear = new Bear("Teddy");

        System.out.println(lizard.getName());
        System.out.println(snake.getName());
        System.out.println(gorilla.getName());
        System.out.println(bear.getName());
    }
}
