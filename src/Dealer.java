public class Dealer {
    private Hand hand;
    private Shoe shoe;


    public Dealer(Shoe shoe){
        this.hand = new Hand();
        this.shoe = shoe;
    }

    public void playHand(){
        while(this.hand.wert() < 17){
             this.hand.karteZiehen(this.shoe.getObersteKarte());
        }
    }
    public void start(){

    }

    public void zieheZweiKarten(){
        this.hand.karteZiehen(this.shoe.getObersteKarte());
        System.out.println("Karten Dealer:\n");
        System.out.println("1. Karte: " + this.hand.ersteKarte());
        this.hand.karteZiehen(this.shoe.getObersteKarte());
        System.out.println("2. Karte: Verdeckt!");
    }

}
