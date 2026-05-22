public class Player {
    Hand hand = new Hand();
    Card card;
    Shoe shoe;

    public Player(){
        this.hand=hand;
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