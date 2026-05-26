public class Hand {
    private DynArray<Card> hand;

    public Hand(){
        this.hand=new DynArray<>();
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
        if(wert(this.hand)>21){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "";
    }

    public int wert(){
        return wert(this.hand);
    }

    public int wert(DynArray<Card> hand){
        int wert=0;
        int asse = 0;
        for(int i = 0; i<this.hand.getLength(); i++){
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
        Hand hand = new Hand();
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
