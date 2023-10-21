package werft;

import definitions.Definitions;
import schiffe.Schiff;

import java.util.ArrayList;
import java.util.List;

public class Werft {
    private List<Schiff> dieSchiffe;
    private Kassa dieKassa;


    public Werft() {
        dieSchiffe = new ArrayList<Schiff>();
        dieKassa = new Kassa(Definitions.ANFANGSKAPITAL);
    }

    public void arbeitetEinenMonat() throws KonkursException {
        for (Schiff x: dieSchiffe) x.rostet();
        for (Schiff x: dieSchiffe) dieKassa.nimmtEin(x.monatsGewinn());
        for (Schiff x: dieSchiffe) {
            if (x.getRostFaktor() <= 0.25 ){
                dieKassa.zahltAus(x.PreisFuerBergen());
                dieSchiffe.remove(x);
                //TODO Schiffe aus der werft entfernen wenn sie sinken
                System.out.println("Schiff " + x.getSchiffsNummer() + " ist gesunken und muss Bezahlt werden.");
            }
        }

    }

    public void zustandAusgeben() {
        for (Schiff x: dieSchiffe) x.zustandAusgeben();
        dieKassa.standAusgeben();
    }

    public void uebernimmt(Schiff x) {
        dieSchiffe.add(x);

    }

    public void bezahlt(double preis) throws KonkursException {
        dieKassa.zahltAus(preis);


    }

public void bezahltStreichen (double PreisFuerStreichen) throws  KonkursException {
        dieKassa.zahltAus(PreisFuerStreichen);
}
    public Schiff getSchiffPerNummer(int x) {
        Schiff ausgewaehltesSchiff = null;
        for (Schiff z: dieSchiffe)
            if (z.getSchiffsNummer() == x) ausgewaehltesSchiff = z;
        return ausgewaehltesSchiff;
    }

    public void bezahltVerschrotten(double PreisFuerVerschrotten) throws KonkursException {
        dieKassa.zahltAus(PreisFuerVerschrotten);
    }

    public void verstrottet(Schiff x) {
        System.out.println("Schiff " + x.getSchiffsNummer() + " wurde verschrottet");
        dieSchiffe.remove(x);
        // TODO implement verstrottet in werft.Werft
    }
}
