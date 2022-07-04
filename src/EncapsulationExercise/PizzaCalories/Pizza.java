package EncapsulationExercise.PizzaCalories;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, Dough dought, List<Topping> toppings) {
        this.setName(name);
        this.dought = dought;
        ;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    private void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }


}
