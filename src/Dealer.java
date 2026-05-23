public class Dealer {
    private Hand hand;
    private Shoe shoe;


    public Dealer(){
        this.hand=hand;
        this.shoe=shoe;
    }
    public void playHand(){

    }
    public void start(){

    }

    public void zieheZweiKarten(Shoe shoe){
        this.hand.karteZiehen(shoe.getObersteKarte());
        System.out.println("Karten Dealer:" + "\n");
        System.out.println("1. Karte: " + this.hand.ersteKarte());
        this.hand.karteZiehen(shoe.getObersteKarte());
        System.out.println("2. Karte: Verdeckt!");
    }

}
