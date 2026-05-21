import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Card {
    private String name;
    private int wert;
    private char farbe;

    public Card(){

    }

    public Card(String name, int wert, char farbe){
        this.name=name;
        this.wert=wert;
        this.farbe=farbe;
    }

    public String getName(){
        return this.name;
    }

    public int getWert(){
        return this.wert;
    }

    public char getFarbe(){
        return this.farbe;
    }




}
