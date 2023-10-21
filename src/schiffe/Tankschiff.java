package schiffe;

import definitions.Definitions;

public class Tankschiff extends Schiff {


    public Tankschiff() {

    }


    public double preis() {

        return Definitions.TANKSCHIFFPREIS;
    }
    public double PreisFuerStreichen() {return Definitions.TANKSCHIFFSTREICHPREIS;}

    @Override
    public double PreisFuerBergen() {

        return Definitions.TANKBERGEPREIS;
    }

    @Override
    public double PreisFuerVerschrotten() {
        return Definitions.TANKVERSCHROTTPREIS;
    }

    public String getSchiffsArt() {
        return "Tankschiff";
    }

    public int getSchiffsNummer() {
        return dieSchiffsNummer;
    }


    public double monatsGewinn() {
        return Definitions.TANKSCHIFFGEWINN;
    }


}
