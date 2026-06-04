import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Shoe {
    private Stack<Card> cards;

    public Shoe(){
        this.cards=kartenMischen();
    }

    private DynArray<Card> kartenEinlesen() {
        //einlesen der Karten
        DynArray<Card>karten = new DynArray<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Karten.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] daten = line.split(",");
                String name = daten[0];
                int wert = Integer.parseInt(daten[1]);
                char farbe = daten[2].charAt(0);
                Card c = new Card(name, wert, farbe);
                karten.append(c);
            }
            return karten;
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei!");
            e.printStackTrace();
            return null;
        }
    }

    private Stack<Card> kartenMischen(){
        //Karten mischen
        Random rand = new Random();
        Stack<Card> stapel = new Stack<>();
        DynArray<Card> ungemischt=kartenEinlesen();
        for(int i=ungemischt.getLength(); i>0; i--){
            int stelle=rand.nextInt(ungemischt.getLength());
            stapel.push(ungemischt.getItem(stelle));
            ungemischt.delete(stelle);
        }
        return stapel;
    }

    public Card getObersteKarte(){
        return this.cards.pop();
    }
}

