package schiffe;

import definitions.Definitions;

public class Passagierschiff extends Schiff {


    public Passagierschiff() {

    }

    public double preis() {

        return Definitions.PASSAGIERSCHIFFPREIS;
    }

    public double PreisFuerStreichen() {return Definitions.PASSAGIERSCHIFFSTREICHPREIS;}

    @Override
    public double PreisFuerBergen() {
        return Definitions.PASSAGIERBERGEPREIS;
    }

    public double PreisFuerVerschrotten() {
        return Definitions.PASSAGIERVERSCHROTTPREIS;
    }

    public String getSchiffsArt() {
        return "Passagierschiff";
    }

    public int getSchiffsNummer() {
        return dieSchiffsNummer;
    }


    public double monatsGewinn() {
        return Definitions.PASSAGIERSCHIFFGEWINN;
    }


}
