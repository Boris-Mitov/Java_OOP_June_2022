package inheritance.randomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList list = new RandomArrayList();
        list.add(15);
        list.add(52);
        list.add(116);
        list.add(25);
        list.add(54);

        System.out.println(list.getRandomElement());
    }
}
