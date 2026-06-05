/**
 * Bauplan für ein Dealer-Objekt
 */

public class Dealer {
    private Hand hand;
    private Shoe shoe;

    /**
     * Erstellt einen neuen Dealer mit einer leeren Hand.
     */
    public Dealer(){
        //Dealer bekommt ein Hand-Objekt
        this.hand = new Hand();
    }

    /**
     * Der Dealer zieht eine Karte vom Kartenstapel.
     *
     * @param shoe Kartenstapel, von dem gezogen wird
     */
    public void hit(Shoe shoe){
        //Dealer zieht eine Karte
        this.hand.karteZiehen(shoe.getObersteKarte());
    }

    /**
     * Führt den Spielzug des Dealers aus.
     * Der Dealer zieht so lange Karten, bis sein Wert mindestens 17 beträgt.
     *
     * @param shoe Kartenstapel, von dem gezogen wird
     */
    public void playHand(Shoe shoe) {
        //Überprüfung ob der Dealer zieht
        while (hand.wert() < 17) {
            hit(shoe);
        }
    }

    /**
     * Gibt die aktuelle Hand des Dealers zurück.
     *
     * @return Hand des Dealers
     */
    public Hand getHand() {
        return hand;
    }


}
