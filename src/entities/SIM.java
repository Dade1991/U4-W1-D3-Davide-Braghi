package entities;

import java.util.Arrays;

public class SIM {
    // attributi

    private String phoneNumber;
    private double availableCredit;
    private Chiamata[] dialledCalls;

    // costruttori

    public SIM(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.availableCredit = 0.0;
        this.dialledCalls = new Chiamata[5];
    }

    // metodi

    public void getSIMData() {
        System.out.println("Numero di telefono: " + phoneNumber);
        System.out.println("Il credito disponibile è di: " + availableCredit + " €");
        System.out.println("Ultime chiamate effettuate:" + Arrays.toString(dialledCalls));
    }

    public void setCall(Chiamata[] calls) {
        this.dialledCalls = calls;
    }
}
