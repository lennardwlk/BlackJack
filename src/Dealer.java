public class Dealer {
    private Hand hand;
    private Shoe shoe;


    public Dealer(){
        //Dealer bekommt ein Hand-Objekt
        this.hand = new Hand();
    }

    public void hit(Shoe shoe){
        //Dealer zieht eine Karte
        this.hand.karteZiehen(shoe.getObersteKarte());
    }

    public void playHand(Shoe shoe) {
        //Überprüfung ob der Dealer zieht
        while (hand.wert() < 17) {
            hit(shoe);
        }
    }

    public Hand getHand() {
        return hand;
    }


}
