/**
 * Generische KLasse Queue<ContentType>.
 * Konform programmiert mit den Methoden des Landes Niedersachsen bezueglich der gegebenen ergaenzenden Informationen
 * zu Abitur 2026 <br />
 * Objekte der generischen Klasse Queue (Warteschlange) verwalten beliebige
 * Objekte vom Typ ContentType nach dem First-In-First-Out-Prinzip, d.h., das
 * zuerst abgelegte Objekt wird als Erstes wieder entnommen. <br />
 * Alle Methoden haben eine konstante Laufzeit, unabhaengig von der Anzahl der verwalteten Objekte.
 *
 * @param <ContentType>
 * @author FG Informatik Gaußschule (und 12IF1)
 * @date '20-Apr-2026'
 */

public class Queue<ContentType> {
    /* Start Attribute */
    private Node head;
    private Node tail;

    /**
     * Klassenkonstruktor Queue()
     */
    public Queue() {

    }

    /**
     * Methode isEmpty(): boolean (Wahrheitswert).
     * Wenn die Schlange kein Element enthaelt, wird der Wert wahr zurueckgegeben, sonst der Wert falsch.
     *
     * @return boolean
     */


    /**
     * Methode head(): ContentType (Inhaltstyp).
     * Der Inhalt des vordersten Elements der Schlange wird zurueckgegeben, das Element aber nicht entnommen.
     *
     * @return ContentType
     */


    /**
     * Methode enqueue(inhalt: Inhaltstyp): void.
     * Ein neues Element mit dem angegebenen Inhalt wird am Ende an die Schlange angehaengt.
     *
     * @param inhalt: ContentType
     */

    /**
     * Methode dequeue(): ContentType (Inhaltstyp).
     * Das vorderste Element wird entnommen. Der Inhalt dieses Elements wird zurueckgegeben.
     *
     * @return ContentType
     */

    /* Start innere Klasse QueueNode (englisch: (nested) inner class)
    Vorteile innere Klassen zu benutzen:
    - logische Gruppierung von Klassen, die nur an einer Stelle verwendet werden.
    - Verstecken von privaten Klassen.
    - Foerderung der Lesbarkeit von Code

    Praktische Benutzung von inneren Klassen:
    - Innere Klassen koennen direkt Attribute etc. der aeusseren Klasse verwenden.
    - In der aeusseren Klasse ist eine Erzeugung von Objekten der inneren Klasse problemlos moeglich.
     */

    private class Node  {
        private  Node next;
        private ContentType content;

        /**
         * Klassenkonstruktor QueueNode
         *
         * @param content
         */
        public Node(ContentType content) {

        }

        /**
         * Methode setNext(next: QueueNode):void.
         * Setzt den Verweis auf den entsprechenden Nachfolgerknoten.
         *
         * @param next: QueueNode
         */

        /**
         * Methode getNext(): QueueNode.
         * Gibt den Nachfolgerknoten zurueck.
         *
         * @return QueueNode
         */

        /**
         * Methode getContent(): ContentType.
         * Gibt den Inhalt (Content) des Knotens zurueck.
         *
         * @return ContentType
         */
    }
    /* Ende der eingebetteten Klasse QueueNode */
}
