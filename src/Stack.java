
/**
 * Generische Klasse Stack<ContentType>
 * Konform programmiert mit den Methoden des Landes Niedersachsen bezueglich der gegebenen ergaenzenden Informationen
 * zu Abitur 2027. <br />
 *
 * Objekte der generischen Klasse Stack (Keller, Stapel) verwalten beliebige
 * Objekte vom Typ ContentType nach dem Last-In-First-Out-Prinzip, d. h., das
 * zuletzt abgelegte Objekt wird als Erstes wieder entnommen. Alle Methoden
 * haben eine konstante Laufzeit, unabhaengig von der Anzahl der verwalteten
 * Objekte.
 *
 * @param <ContentType>
 * @author Fachgruppe Informatik der Gaußschule
 */
public class Stack<ContentType> {
    /* Anfang der privaten Attribute der Klasse Stack */
    private Node top;

    /**
     * Konstruktor Stack<ContentType>
     */
    public Stack() {
        this.top = null;
    }

    /**
     * Methode isEmpty(): Wahrheitswert
     * Wenn die Schlange kein Element enthaelt, wird der Wert wahr zurueckgegeben, sonst der Wert falsch.
     */
    public boolean isEmpty(){
        if(this.top==null){
            return true;
        } else{
            return false;
        }
    }



    /**
     * Methode top(): Inhaltstyp <br />
     * Der Inhalt des obersten Elements des Stapels wird zurueckgegeben, das Element aber nicht entnommen.
     */

    public ContentType top(){
        if(this.isEmpty()) {
            return null;
        }
        return this.top.content;
    }


    /**
     * Methode push(inhalt: Inhaltstyp) <br />
     * Ein neues Element mit dem uebergebenen Inhalt wird oben auf den Stapel gelegt.
     *
     * @param content: Inhaltstyp
     */

    public void push(ContentType content){
        if(content!=null) {
            Node node = new Node(content);
            node.setNext(this.top);
            this.top = node;
        }
    }


    /**
     * Methode pop(): Inhaltstyp <br />
     * Das oberste Element des Stapels wird entnommen. Der Inhalt dieses Elements wird zurueckgegeben.
     *
     * @return Inhaltstyp
     */

    public ContentType pop() {
        if (this.top.getContent() == null) {
            return null;
        } else {
            ContentType speicher = this.top.getContent();
            this.top = this.top.getNext();
            return speicher;
        }
    }


    /* --------- Anfang der privaten inneren Klasse -------------- */
    public class Node {
        /* Anfang private Attribute der Klasse */
        private ContentType content = null;
        private Node nextNode = null;

        /**
         * Ein neues Objekt vom Typ StackNode<ContentType> wird erschaffen. <br />
         * Der Inhalt wird per Parameter gesetzt. Der Verweis ist leer.
         *
         * @param content der Inhalt des Knotens
         */
        public Node(ContentType content) {
            this.content = content;
            this.nextNode = null;
        }

        /**
         * Der Verweis wird auf das Objekt, das als Parameter uebergeben wird,
         * gesetzt.
         *
         * @param next der Nachfolger des Knotens
         */
        public void setNext(Node next) {
            this.nextNode = next;
        }

        /**
         *
         * @return das Objekt, auf das der aktuelle Verweis zeigt
         */
        public Node getNext() {
            return this.nextNode;
        }

        /**
         * @return das Inhaltsobjekt vom Typ ContentType
         */
        public ContentType getContent() {
            return this.content;
        }
    }
    /* ----------- Ende der privaten inneren Klasse -------------- */
}

