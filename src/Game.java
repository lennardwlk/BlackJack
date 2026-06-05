

import java.util.Scanner;
/**
 * Hier startet man das Spiel
 */
public class Game {

    /**
     * Startet das Blackjack-Spiel.
     *
     * @param args Kommandozeilenparameter
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean nochEinSpiel = true;

        while(nochEinSpiel){

            Shoe stapel = new Shoe();
            Dealer dealer = new Dealer();
            Player player = new Player();

            player.hit(stapel);
            player.hit(stapel);

            dealer.hit(stapel);
            dealer.hit(stapel);

            boolean rundeBeendet=false;

            while (!rundeBeendet) {
                System.out.println();
                System.out.println("Deine Karten: " + player.getHand());
                System.out.println("Wert: " + player.getHand().wert());
                System.out.println("Karten des Dealers: " + dealer.getHand().ersteKarte() + " [verdeckt]");
                //System.out.println("Wert: " + dealer.getHand().wert());

                if (player.getHand().checkBust()) {
                    System.out.println("Bust! Dealer gewinnt.");
                    rundeBeendet = true;
                    continue; //skipt den Rest der Schleife und die Schleife beginnt wieder von vorne
                }
                if (player.getHand().checkBlackjack()) {
                    System.out.println("Blackjack! Du gewinnst.");
                    rundeBeendet = true;
                    continue;
                }
                System.out.println("Hit oder Stand?");
                String eingabe = scanner.nextLine();

                if (eingabe.equalsIgnoreCase("hit")) {
                    player.hit(stapel);
                } else if (eingabe.equalsIgnoreCase("stand")) {
                    rundeBeendet = true;
                } else {
                    System.out.println("Ungültige Eingabe");
                }
            }

            if (!player.getHand().checkBust() && !player.getHand().checkBlackjack()) {

                if (dealer.getHand().checkBlackjack()) {
                    System.out.println("Karten des Dealers: " + dealer.getHand());
                    System.out.println("Dealer hat Blackjack! Du verlierst.");
                }
                else {
                    dealer.playHand(stapel);

                    System.out.println();
                    System.out.println("Karten des Dealers: " + dealer.getHand());
                    System.out.println("Dealer-Wert: " + dealer.getHand().wert());

                    gewinnerBestimmen(player, dealer);
                }
            }
            System.out.println();
            System.out.println("Nochmal spielen? (ja/nein)");
            nochEinSpiel = scanner.nextLine().equalsIgnoreCase("ja");
        }

        scanner.close();
    }



    /**
     * Vergleicht die Kartenwerte von Spieler und Dealer
     * und gibt den Gewinner aus.
     *
     * @param player Spieler des Spiels
     * @param dealer Dealer des Spiels
     */
    public static void gewinnerBestimmen(Player player, Dealer dealer) {

            int spieler = player.getHand().wert();
            int dealerWert = dealer.getHand().wert();

            if (dealerWert > 21) {
                System.out.println("Dealer Bust! Du gewinnst.");
            }
            else if (spieler > dealerWert) {
                System.out.println("Du gewinnst.");
            }
            else if (spieler < dealerWert) {
                System.out.println("Dealer gewinnt.");
            }
            else {
                System.out.println("Unentschieden.");
            }
        }


    /**
     * Fragt die Anzahl der Spieler ab.
     *
     * @param scanner Scanner für die Benutzereingabe
     * @return Anzahl der Spieler
     */
    private int abfrageAnzahl(Scanner scanner){
        System.out.println("Wie viele Spieler gibt es?");
        int anzahl = scanner.nextInt();
        scanner.nextLine();
        return anzahl;
    }

}
