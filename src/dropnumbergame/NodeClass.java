// RUMEYSA ELİF KOÇAK 2321051044
package dropnumbergame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class NodeClass {
    int value; // Hücrede tutulan sayı
    int row;   // Bulunduğu satır indeksi
    int col;   // Bulunduğu sütun indeksi

    NodeClass right; // Aynı satırda sağdaki düğüme bağlanır
    NodeClass down;  // Aynı sütunda alttaki düğüme bağlanır

    // Yeni bir taş oluşturulurken konum ve değer bilgisi atanır
    public NodeClass(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
        this.right = null; // başlangıçta sağ bağlantı yok
        this.down = null;  // başlangıçta alt bağlantı yok
    }
}
