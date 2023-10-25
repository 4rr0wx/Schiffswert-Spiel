package werft;

import definitions.Definitions;
import schiffe.Schiff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Werft {
    private List<Schiff> dieSchiffe;
    private Kassa dieKassa;


    public Werft() {
        dieSchiffe = new ArrayList<Schiff>();
        dieKassa = new Kassa(Definitions.ANFANGSKAPITAL);
    }

    public void arbeitetEinenMonat() throws KonkursException {
        Iterator<Schiff> iterator = dieSchiffe.iterator();

        while (iterator.hasNext()) {
            Schiff x = iterator.next();
            x.rostet();
            dieKassa.nimmtEin(x.monatsGewinn());

            if (x.getRostFaktor() <= 0.25) {
                dieKassa.zahltAus(x.PreisFuerBergen());
                iterator.remove(); // Entfernt das Schiff aus der Liste
                System.out.println("Schiff " + x.getSchiffsNummer() + " ist gesunken");
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
    }
}
