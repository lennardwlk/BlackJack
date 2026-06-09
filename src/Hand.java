/**
 * Bauplan für ein Hand-Objekt
 */

public class Hand {
    private DynArray<Card> hand;

    public Hand(){
        this.hand=new DynArray<Card>();
    }

    /**
     * Fügt der Hand eine Karte hinzu.
     *
     * @param c Karte, die zur Hand hinzugefügt wird
     */
    public void karteZiehen(Card c){
        this.hand.append(c);
    }

    /**
     * Überprüft, ob die Hand ein Blackjack ist.
     *
     * @return true, wenn Blackjack vorliegt, sonst false
     */
    public boolean checkBlackjack(){
        if(wert(this.hand)==21&&this.hand.getLength()==2){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Überprüft, ob die Hand ein Five Card Charlie ist.
     *
     * @return true, wenn fünf Karten ohne Bust vorliegen, sonst false
     */
    public boolean checkFiveCardCharlie(){
        if(this.hand.getLength()==5 && !checkBust()){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Überprüft, ob der Spieler über 21 Punkte hat.
     *
     * @return true, wenn Bust vorliegt, sonst false
     */
    public boolean checkBust(){
        //Überprüfung ob man einen zu hohen Kartenwert
        if(wert(this.hand)>21){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Wandelt die Hand in einen String um.
     *
     * @return Alle Kartennamen der Hand als String
     */
    public String toString(){
        //Hand wird zum String, um Ausgabe zu vereinfachen
        String s = "";

        for(int i = 0; i < hand.getLength(); i++){
            s += hand.getItem(i).getName() + " ";
        }
        return s;
    }

    /**
     * Berechnet den aktuellen Wert der Hand.
     *
     * @return Gesamtwert der Hand
     */
    public int wert(){
        return wert(this.hand);
    }

    /**
     * Berechnet den Wert einer übergebenen Hand.
     * Asse werden bei Bedarf von 11 auf 1 reduziert (Wenn ein Ass als 11 busten würde).
     *
     * @param hand Hand, deren Wert berechnet werden soll
     * @return Gesamtwert der Hand
     */
    public int wert(DynArray<Card> hand){
        int wert=0;
        int asse = 0;
        for(int i = 0; i<this.hand.getLength(); i++){       //Wert der Hand berechnen
            wert= wert+hand.getItem(i).getWert();
            if(hand.getItem(i).getWert() == 11){
                asse++;
            }
        }
        while(wert > 21 && asse > 0){
            wert -= 10; // Ass von 11 auf 1 reduzieren
            asse--;
        }
        return wert;
    }

    /**
     * Gibt die Anzahl der Karten in der Hand zurück.
     *
     * @return Anzahl der Karten
     */
    public int getAnzahlKarten(){
        return this.hand.getLength();
    }

    /**
     * Gibt die Karte an einer bestimmten Position zurück.
     *
     * @param i Position der Karte
     * @return Karte an der angegebenen Position
     */
    public Card karte(int i){
        return this.hand.getItem(i);
    }

    /**
     * Gibt die erste Karte der Hand zurück.
     *
     * @return Name der ersten Karte
     */
    public String ersteKarte(){
        //erste Karte aufrufen
        String name= karte(0).getName();
        return name;
    }

}
