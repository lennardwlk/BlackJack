public class Player {
    private Hand hand = new Hand();
    Shoe shoe;

    /**
     * Erstellt einen neuen Spieler mit einer leeren Hand.
     */
    public Player(){
        this.hand= new Hand();
    }

    /**
     * Der Spieler zieht eine Karte vom Kartenstapel.
     *
     * @param shoe Kartenstapel, von dem gezogen wird
     */
    public void hit(Shoe shoe){
        this.hand.karteZiehen(shoe.getObersteKarte());
    }

    /**
     * Beendet den Zug des Spielers.
     */
    public void stand(){
        //beende Zug
        System.out.println("Der Zug wurde beendet!");
    }

    /**
     * Verdoppelt den Einsatz und zieht eine weitere Karte.
     * Als Erweiterung
     */
    public void doubleDown(){
        //Einsatz verdoppeln+Karte ziehen
        System.out.println("Der Einsatz wurde verdoppelt!");
        this.hand.karteZiehen(this.shoe.getObersteKarte());
    }

    /**
     * Gibt die aktuelle Hand des Spielers zurück.
     *
     * @return Hand des Spielers
     */
    public Hand getHand() {
        return hand;
    }
}