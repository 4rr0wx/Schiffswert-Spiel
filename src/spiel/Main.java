package spiel;

import inout.InOut;
import inout.InOutException;
import schiffe.Frachtschiff;
import schiffe.Passagierschiff;
import schiffe.Schiff;
import schiffe.Tankschiff;
import werft.KonkursException;
import werft.Werft;

public class Main {
    public static void main(String[] args) {
        Werft dieWerft = new Werft();
        //TODO Benutzerfreundlicher machen
        
        // Ablauf Monat für Monat
        try {
            while (true) {
                // Werft arbeitet einen Monat
                dieWerft.arbeitetEinenMonat();
                // Ausgabe: Zustand der Werft
                dieWerft.zustandAusgeben();
                // Auswahl
                System.out.println("\n----- Neuer Spielzug -----");
                int auswahl = InOut.readMenu("Was ist zu tun?",
                        "Ein Frachtschiff bauen@" +
                                "Ein Passagierschiff bauen@" +
                                "Ein Tankschiff bauen@" +
                                "Ein Schiff streichen@" +
                                "Ein Schiff verschrotten@" +
                                "Nichts tun@" +
                                "Spielende");
                switch (auswahl) {
                    case 1 ->// ein Frachtschiff bauen
                    {
                        Schiff x = new Frachtschiff();
                        dieWerft.bezahlt(x.preis());
                        dieWerft.uebernimmt(x);
                    }
                    case 2 -> // ein Passagierschiff bauen
                    {
                        Schiff x = new Passagierschiff();
                        dieWerft.bezahlt(x.preis());
                        dieWerft.uebernimmt(x);
                    }
                    case 3 -> // ein Tankschiff bauen
                    {
                        Schiff x = new Tankschiff();
                        dieWerft.bezahlt(x.preis());
                        dieWerft.uebernimmt(x);
                    }
                    case 4 -> // ein Schiff streichen
                    {
                        Schiff x = auswahlDesSchiffesNachNummer(dieWerft); // CAN RETURN NULL!
                        if (x != null) {
                            x.streichen();
                            dieWerft.bezahltStreichen(x.PreisFuerStreichen());
                        }
                    }
                    case 5 -> // ein Schiff verschrotten
                    {
                        Schiff x = auswahlDesSchiffesNachNummer(dieWerft); // CAN RETURN NULL!
                        if (x != null) {
                            dieWerft.verstrottet(x);
                            dieWerft.bezahltVerschrotten(x.PreisFuerVerschrotten());
                        }
                    }
                    case 6 -> // Pause
                    {
                        InOut.printString("Pause");

                    }
                    case 7 -> // Spielende
                    {
                        throw new SpielendeException();
                    }
                    default -> {
                        InOut.printString("Unknown menu entry!");
                    }
                }
            }
        } catch (InOutException x) {
            InOut.printString("Fehleingabe, Spielende");
        } catch (SpielendeException x) {
            InOut.printString("Spielende");
        }  catch (KonkursException x) {
          InOut.printString("Spielende wegen Konkurs");
         }
    }

    private static Schiff auswahlDesSchiffesNachNummer(Werft werft) throws InOutException {
        int x = InOut.readInt("Welches Schiff wollen Sie auswählen?");
        return werft.getSchiffPerNummer(x);
    }
}