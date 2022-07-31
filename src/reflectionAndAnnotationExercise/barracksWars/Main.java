package reflectionAndAnnotationExercise.barracksWars;

import reflectionAndAnnotationExercise.barracksWars.interfaces.Repository;
import reflectionAndAnnotationExercise.barracksWars.interfaces.Runnable;
import reflectionAndAnnotationExercise.barracksWars.interfaces.UnitFactory;
import reflectionAndAnnotationExercise.barracksWars.core.Engine;
import reflectionAndAnnotationExercise.barracksWars.core.factories.UnitFactoryImpl;
import reflectionAndAnnotationExercise.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
