package schiffe;

import inout.InOut;

public abstract class Schiff {

    public double streichAnzahl;
    private double rostfaktor;
    public int dieSchiffsNummer;
    private static int naechsteFreieSchiffsNummer = 1;

    public Schiff() {

        dieSchiffsNummer = naechsteFreieSchiffsNummer;
        naechsteFreieSchiffsNummer ++;
        rostfaktor = 1;
    }

    public void rostet() {

        rostfaktor = rostfaktor * definitions.Definitions.ROSTFAKTORPROMONAT;
    }

    abstract public double preis();
    abstract public double PreisFuerStreichen();
    abstract public double PreisFuerBergen();
    abstract public double PreisFuerVerschrotten();

    public void zustandAusgeben() {
        InOut.printString("Schiff Nr." + getSchiffsNummer() + " ist ein " + getSchiffsArt() + " hat einen Rostfaktor von " + getRostFaktor() + " und wurde brereits " + getAnzahlStreichen() + " gestrichen" );

    }

    private double getAnzahlStreichen() {
        return streichAnzahl;
    }

    public double getRostFaktor() {
        return rostfaktor;
    }

    abstract public String getSchiffsArt();


    abstract public int getSchiffsNummer();

    abstract public double monatsGewinn();

    public void streichen() {
        rostfaktor = 1 - (0.05 * getAnzahlStreichen());
        streichAnzahl = streichAnzahl + 1;
    }



}
