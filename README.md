
## TO-DO / Bugs
- [ ] BUG: Error bei entfernung von einem Schiff nachdem es gesunken ist

# Schiffswerft Strategiespiel

Dies ist ein textbasiertes Strategiespiel in Java, in dem du eine Schiffs-Werft verwaltest und versuchst, deinen Kassastand zu maximieren, indem du Schiffe baust, betreibst und instand hältst.
## Spielbeschreibung

Du bist der Manager eines Schiffsunternehmens mit einer eigenen Werft. In deinem Unternehmen besitzt du Schiffe, die Gewinn einfahren, solange sie intakt sind. Deine Aufgabe ist es, Schiffe zu bauen, zu betreiben und rechtzeitig zu warten, um Verluste zu vermeiden.
## Schiffsarten und Kosten

    Frachtschiffe kosten 30 Mio EUR Baukosten.
    Tanker kosten 70 Mio EUR.
    Passagierschiffe kosten 150 Mio EUR.

## Monatliche Einnahmen

    Frachtschiffe bringen 0.2 Mio EUR pro Monat.
    Tanker bringen 0.5 Mio EUR pro Monat.
    Passagierschiffe bringen 1 Mio EUR pro Monat.

## Schiffsinstandhaltung

Jedes Schiff rostet im Betrieb. Der Rostfaktor beträgt 0.92 pro Monat. Ein Schiff sinkt, wenn weniger als 25% der Schiffshaut intakt sind. Bergungskosten bei einem sinkenden Schiff sind fünfmal der Neupreis des Schiffes.

Um den Verlust zu vermeiden, kannst du:

    - Das Schiff verschrotten (kostet 10% des Schiffspreises).
    - Das Schiff neu streichen Danach ist die Schiffshaut wieder 
      ( 100% minus ( 5% mal der Anzahl der bereits erfolgten Streichvorgänge)) intakt.

## Spielregeln

Das Spiel beginnt mit 500 Mio EUR Startkapital in der Kasse der Werft. In jedem Monat bringen fahrende Schiffe Gewinn in die Kasse. Sinkt ein Schiff, werden Bergungskosten abgezogen.

Jeden Monat kannst du entscheiden, ob du:

    Ein Frachtschiff bauen möchtest.
    Einen Tanker bauen möchtest.
    Ein Passagierschiff bauen möchtest.
    Ein bestimmtes Schiff neu streichen möchtest.
    Ein Schiff verschrotten möchtest.
    Nichts tun möchtest.

Das Spiel endet, wenn der Kassastand negativ wird.

Dein Ziel ist es, den Kassastand so hoch wie möglich zu treiben.
