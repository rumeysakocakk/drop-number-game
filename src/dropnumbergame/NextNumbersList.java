// RUMEYSA ELİF KOÇAK 2321051044
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dropnumbergame;

public class NextNumbersList {

    // Kuyruk yapısını temsil eden düğüm sınıfı
    class NumberNode {
        int value;      // Hücrede tutulan sayı
        int col;         // Taşın düşeceği sütun
        NumberNode next; // Bir sonraki düğümü gösterir

        public NumberNode(int value, int col) {  // Yeni bir hamle düğümü oluşturulur
            this.value = value;
            this.col = col;
            this.next = null;
        }
    }

    private NumberNode head; // Listenin başı ilk hamle
    private NumberNode tail; // Listenin sonu

    // Liste başlangıçta boş olarak oluşturulur
    public NextNumbersList() {
        head = null;
        tail = null;
    }

    // Listeye yeni bir hamle eklenir sona eklenir
    public void add(int value, int col) {
        NumberNode newNode = new NumberNode(value, col);

        if (head == null) {
            // Liste boşsa, eklenen düğüm hem head hem tail olur
            head = newNode;
            tail = newNode;
        } else {
            // Liste boş değilse, sona eklenir ve tail güncellenir
            tail.next = newNode;
            tail = newNode;
        }
    }

    public NumberNode getNext() {  // Sıradaki hamle listeden çıkarılır ve döndürülür
        if (head == null) {
            // Liste boşsa hamle yoktur
            return null;
        }

        NumberNode temp = head; // Baştaki düğüm tutulur
        head = head.next;       // Head bir sonraki düğüme kaydırılır

        if (head == null) {
            // Son eleman da çıkarıldıysa liste tamamen boş olur
            tail = null;
        }

        return temp; // Eski head döndürülür
    }

    
    public boolean isEmpty() { // Listenin boş olup olmadığı kontrol edilir
        return head == null;
    }
    
    // Sıradaki hamle silinmeden sadece görüntülenir
    public NumberNode peek() {
        return head;
    }
}
