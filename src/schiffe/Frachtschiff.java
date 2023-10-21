package schiffe;

import definitions.Definitions;

public class Frachtschiff extends Schiff {


    public Frachtschiff() {

    }

    public double preis() {
        return Definitions.FRACHTSCHIFFPREIS;
    }
    public double PreisFuerStreichen() {return Definitions.FRACHTSCHIFFSTREICHPREIS;}

    @Override
    public double PreisFuerBergen() {

        return Definitions.FRACHTBERGEPREIS;
    }

    @Override
    public double PreisFuerVerschrotten() {
        return Definitions.FRACHTVERSCHROTTPREIS;
    }

    public String getSchiffsArt() {
        return "Frachtschiff";
    }

    public int getSchiffsNummer() {
        return dieSchiffsNummer;
    }

    public double monatsGewinn() {

        return Definitions.FRACHTSCHIFFGEWINN;
    }

}
