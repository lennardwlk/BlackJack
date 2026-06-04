public class Dealer {
    private Hand hand;
    private Shoe shoe;


    public Dealer(){
        this.hand = new Hand();
    }

    public void hit(Shoe shoe){
        this.hand.karteZiehen(shoe.getObersteKarte());
    }

    public void playHand(Shoe shoe) {
        while (hand.wert() < 17) {
            hit(shoe);
        }
    }

    public Hand getHand() {
        return hand;
    }


}
