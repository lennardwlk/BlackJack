import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shoe stapel = new Shoe();
        stapel.getObersteKarte();
        Dealer dealer= new Dealer(stapel);

        Player player = new Player(stapel);



        //Shoe erstellen
        //Player und Dealer erstellen, beide bekommen Shoe übergeben
        //Player bekommt 2 Karten, Dealer bekommt 2 Karten (1 verdeckt)
        //Player kann hit, stand oder double wählen
        //Player Zug zuende: Dealer spielt seinen Zug
        //Zwischendurch bust bei beiden überprüfen
    }

    private int abfrageAnzahl(Scanner scanner){
        System.out.println("Wie viele Spieler gibt es?");
        int anzahl = scanner.nextInt();
        scanner.nextLine();
        return anzahl;
    }

    private void kartenAusteilen(){

    }
}
