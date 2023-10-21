package werft;

import definitions.Definitions;
import inout.InOut;

public class Kassa {
    private double kassastand;


    public Kassa() {

    }

    public Kassa(double anfangskapital) {
        kassastand = Definitions.ANFANGSKAPITAL;
    }

    public void zahltAus(double preis) throws KonkursException {
        kassastand = kassastand - preis;
        if (kassastand < 0) {
            throw new KonkursException();
        }

    }

    public void standAusgeben() {
        InOut.printString("Aktueller Kassastand: " + kassastand);
    }

    public void nimmtEin(double x) {
        kassastand = kassastand + x;
    }


}
