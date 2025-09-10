package entities;

public class Chiamata {
    // attributi

    private String dialledCall;
    private int callDuration;

    // costruttori
    public Chiamata(String dialledCall, int callDuration) {
        this.dialledCall = dialledCall;
        this.callDuration = callDuration;
    }

    // metodi

    public String getDialledCall() {
        return dialledCall;
    }

    public int getCallDuration() {
        return callDuration;
    }

    @Override
    public String toString() {
        return "Numero telefono= '" + dialledCall + "' " +
                "- Durata della chiamata= " + callDuration
                ;
    }
}
