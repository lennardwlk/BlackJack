public class Hand {
    private DynArray<Card> hand;

    public Hand(){
        this.hand=hand;
    }

    public void addCard(Card c){
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
        if(this.hand.getLength()==5){
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

    public int wert(DynArray<Card> hand){
        int wert=0;
        for(int i = 0; i<this.hand.getLength(); i++){
            wert= wert+hand.getItem(i).getWert();
        }
        return wert;
    }
}
