package WorkingWithAbstractionExercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardsRanks cardsRanks = CardsRanks.valueOf(scanner.nextLine());
        CardsSuits cardsSuits = CardsSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardsSuits, cardsRanks);

        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardsRanks(), card.getCardsSuits(), card.getPower());

    }
}
