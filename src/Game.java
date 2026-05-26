public class Game {
    public static void main(String[] args) {
        Shoe stapel = new Shoe();
        stapel.getObersteKarte();

        Player player = new Player(stapel);

        //Shoe erstellen
        //Player und Dealer erstellen, beide bekommen Shoe übergeben
        //Player bekommt 2 Karten, Dealer bekommt 2 Karten (1 verdeckt)
        //Player kann hit, stand oder double wählen
        //Player Zug zuende: Dealer spielt seinen Zug
        //Zwischendurch bust bei beiden überprüfen
    }
}
