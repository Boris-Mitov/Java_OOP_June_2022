package WorkingWithAbstractionExercise.CardsWithPower;

public class Card {
    private CardsSuits cardsSuits;
    private CardsRanks cardsRanks;

    public Card(CardsSuits cardsSuits, CardsRanks cardsRanks) {
        this.cardsSuits = cardsSuits;
        this.cardsRanks = cardsRanks;
    }

    public CardsSuits getCardsSuits() {
        return cardsSuits;
    }

    public CardsRanks getCardsRanks() {
        return cardsRanks;
    }

    public int getPower() {
        return this.cardsRanks.getRankPower() + this.cardsSuits.getSuitPower();
    }

}
