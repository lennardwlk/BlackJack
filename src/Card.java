/**
 * Bauplan für ein Karten-Objekt
 */

public class Card {
    private String name;
    private int wert;

    /**
     * Erstellt eine neue Karte mit Namen und Wert.
     *
     * @param name Bezeichnung der Karte (z. B. "Herz Ass")
     * @param wert Punktewert der Karte
     */
    public Card(String name, int wert){
        this.name=name;
        this.wert=wert;
    }

    /**
     * Gibt den Namen der Karte zurück.
     *
     * @return Name der Karte
     */
    public String getName(){
        return this.name;
    }

    /**
     * Gibt den Wert der Karte zurück.
     *
     * @return Kartenwert
     */
    public int getWert(){
        return this.wert;
    }




}
