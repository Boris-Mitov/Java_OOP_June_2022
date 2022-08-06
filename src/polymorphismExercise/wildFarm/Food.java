package polymorphismExercise.wildFarm;

public abstract class Food {
    public Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
