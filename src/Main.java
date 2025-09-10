import entities.Chiamata;
import entities.Rettangolo;
import entities.SIM;

public class Main {
    public static void main(String[] args) {
        rectangleExercises();
        simExercise();
    }

    public static void rectangleExercises() {
        Rettangolo rectangle1 = new Rettangolo(4, 5);
        Rettangolo rectangle2 = new Rettangolo(6, 10);

        stampaDueRettangoli(rectangle1, rectangle2);
    }

    public static void stampaDueRettangoli(Rettangolo rectangle1, Rettangolo rectangle2) {
        System.out.println("___________________________________________________");
        rectangle1.printPerimetroAndAreaRettangolo();
        rectangle2.printPerimetroAndAreaRettangolo();

        double sommePerimetri = rectangle1.perimetroRettangolo() + rectangle2.perimetroRettangolo();
        double sommeAree = rectangle1.areaRettangolo() + rectangle2.areaRettangolo();

        System.out.println("___________________________________________________");
        System.out.println("La somma dei PERIMETRI dei rettangoli è: " + sommePerimetri);
        System.out.println("La somma delle AREE dei rettangoli è: " + sommeAree);
    }

    public static void simExercise() {
        System.out.println("___________________________________________________");
        SIM mySIM = new SIM("3391234567");

        Chiamata[] arrayOfCalls = {
                new Chiamata("3387777666", 4),
                new Chiamata("3387777666", 4),
                new Chiamata("3387777666", 4),
                new Chiamata("3387777666", 4),
                new Chiamata("3387777666", 4),
        };
        mySIM.setCall(arrayOfCalls);
        mySIM.getSIMData();
    }
}