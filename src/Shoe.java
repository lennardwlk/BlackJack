import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Shoe {
    private Stack<Card> cards;

    public void Shoe(){
        this.cards=kartenMischen();
    }

    public void Shoe(int n){

    }

    public void shuffle() {

    }
    public DynArray<Card> kartenEinlesen() {
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

    public Stack<Card> kartenMischen(){
        Random rand = new Random();
        Stack<Card> stapel = new Stack<>();
        for(int i=kartenEinlesen().getLength(); i>0; i--){
            int stelle=rand.nextInt(kartenEinlesen().getLength());
            stapel.push(kartenEinlesen().getItem(stelle));
            kartenEinlesen().delete(stelle);
        }
        return stapel;
    }
}

