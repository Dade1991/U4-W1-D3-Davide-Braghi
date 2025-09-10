package entities;

public class Rettangolo {
    // attributi

    private double base;
    private double height;

    // costruttori

    public Rettangolo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // metodi

    public double perimetroRettangolo() {
        return (base + height) * 2;
    }

    public double areaRettangolo() {
        return (base * height);
    }

    public void printPerimetroAndAreaRettangolo() {
        System.out.println("Il perimetro del rettangolo è: " + this.perimetroRettangolo());
        System.out.println("L'area del rettangolo è: " + this.areaRettangolo());
    }
}
