public class Player {
    private Hand hand = new Hand();
    Shoe shoe;

    public Player(Shoe shoe){
        this.hand= new Hand();
        this.shoe = shoe;
    }

    public void hit(){
        this.hand.karteZiehen(this.shoe.getObersteKarte());
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
}