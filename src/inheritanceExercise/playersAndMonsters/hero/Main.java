package inheritanceExercise.playersAndMonsters.hero;

public class Main {
    public static void main(String[] args) {
        MuseElf museElf = new MuseElf("goshko", 3);
        SoulMaster soulMaster = new SoulMaster("Jigi", 63);
        BladeKnight bladeKnight = new BladeKnight("Tanko", 100);

        System.out.println(museElf);
        System.out.println(soulMaster.getUsername() + " -> " + soulMaster.getLevel() + "lvl");
        System.out.println(bladeKnight.getUsername() + " -> " + bladeKnight.getLevel() + "lvl");

    }
}
