public class Dealer {
    private Hand hand;
    private Shoe shoe;


    public Dealer(){
        this.hand = new Hand();
    }

    public void hit(Shoe shoe){
        this.hand.karteZiehen(shoe.getObersteKarte());
    }

    public void playHand(){
        while(this.hand.wert() < 17){
             this.hand.karteZiehen(this.shoe.getObersteKarte());
        }
    }
    public void start(){

    }
    public void playHand(Shoe shoe) {
        while (hand.wert() < 17) {
            hit(shoe);
        }
    }

    public Hand getHand() {
        return hand;
    }

    public void zieheZweiKarten(){
        this.hand.karteZiehen(this.shoe.getObersteKarte());
        System.out.println("Karten Dealer:\n");
        System.out.println("1. Karte: " + this.hand.ersteKarte());
        this.hand.karteZiehen(this.shoe.getObersteKarte());
        System.out.println("2. Karte: Verdeckt!");
    }

}
