public class Player {
    private Hand hand = new Hand();
    Shoe shoe;

    public Player(){
        this.hand= new Hand();
    }

    public void hit(Shoe shoe){
        this.hand.karteZiehen(shoe.getObersteKarte());
    }

    public void stand(){
        //beende Zug
        System.out.println("Der Zug wurde beendet!");
    }

    public void doubleDown(){
        //Einsatz verdoppeln+Karte ziehen
        System.out.println("Der Einsatz wurde verdoppelt!");
        this.hand.karteZiehen(this.shoe.getObersteKarte());
    }
    public Hand getHand() {
        return hand;
    }
}