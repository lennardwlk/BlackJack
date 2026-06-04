public class Hand {
    private DynArray<Card> hand;

    public Hand(){
        this.hand=new DynArray<Card>();
    }

    public void karteZiehen(Card c){
        this.hand.append(c);
    }

    public boolean checkBlackjack(){
        if(wert(this.hand)==21&&this.hand.getLength()==2){
            return true;
        } else{
            return false;
        }
    }

    public boolean checkFiveCardCharlie(){
        if(this.hand.getLength()==5 && !checkBust()){
            return true;
        } else{
            return false;
        }
    }

    public boolean checkBust(){
        //Überprüfung ob man einen zu hohen Kartenwert
        if(wert(this.hand)>21){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        //Hand wird zum String, um Ausgabe zu vereinfachen
        String s = "";

        for(int i = 0; i < hand.getLength(); i++){
            s += hand.getItem(i).getName() + " ";
        }
        return s;
    }

    public int wert(){
        return wert(this.hand);
    }

    public int wert(DynArray<Card> hand){
        int wert=0;
        int asse = 0;
        for(int i = 0; i<this.hand.getLength(); i++){       //Wert der Hand berechnen
            wert= wert+hand.getItem(i).getWert();
            if(hand.getItem(i).getWert() == 11){
                asse++;
            }
        }
        while(wert > 21 && asse > 0){
            wert -= 10; // Ass von 11 auf 1 reduzieren
            asse--;
        }
        return wert;
    }

    public int getAnzahlKarten(){
        return this.hand.getLength();
    }

    public Card karte(int i){
        return this.hand.getItem(i);
    }

    public String ersteKarte(){
        //erste Karte aufrufen
        String name= karte(0).getName();
        return name;
    }

    public String alleKarten(){
        Hand hand= new Hand();
        String name="";
        for(int i =0; i<hand.getAnzahlKarten();i++){
            name= name + karte(i).getName() + "\n";
        }
        return name;
    }
}
