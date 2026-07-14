// RUMEYSA ELİF KOÇAK 2321051044
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dropnumbergame;

public class MultiLinkedList {

    private final int ROWS = 7; // Oyun alanındaki satır sayısını belirler
    private final int COLS = 5; // Oyun alanındaki sütun sayısını belirler

    NodeClass head;  // Satır ve sütun başlıklarına ulaşmak için kullanılan başlangıç düğümü

    public MultiLinkedList() { // Nesne oluşturulduğunda satır ve sütun başlıkları hazırlanır
        createHeaders();
    }

    
private void createHeaders() { // Oyun başlarken satır ve sütun başlık düğümleri hazırlanır
    head = new NodeClass(-1, -1, -1); // Tüm sistemin başlangıç noktası oluşturulur
    NodeClass tempCol = null; 
    for (int c = 0; c < COLS; c++) { // Sütunlara ait başlıklar sağ tarafa doğru eklenir
        NodeClass colHeader = new NodeClass(-1, -1, c); // Bu sütun için başlık düğümü oluşturulur
        if (c == 0) {
            head.right = colHeader; // İlk sütun doğrudan başlangıç düğümüne bağlanır
        } else {
            tempCol.right = colHeader; // Diğer sütunlar sırayla bağlanır
        }
     tempCol = colHeader; // Son eklenen sütun güncellenir
    }

    // Satırlara ait başlıklar aşağı doğru eklenir
    NodeClass tempRow = null;
    for (int r = 0; r < ROWS; r++) {
        NodeClass rowHeader = new NodeClass(-1, r, -1); // Bu satır için başlık düğümü oluşturulur
          if (r == 0) {
            head.down = rowHeader; // İlk satır doğrudan başlangıç düğümüne bağlanır
        } else {
            tempRow.down = rowHeader; // Diğer satırlar alt alta eklenir
        }

        tempRow = rowHeader; // Son eklenen satır güncellenir
    }
}

   
    private NodeClass getRowHeader(int row) { // İstenen satıra karşılık gelen başlık düğümünü arar
    NodeClass current = head.down; // Satır başlıkları aşağı doğru bağlıdır, arama buradan başlar
    while (current != null) { // Aşağı doğru ilerleyerek tüm satırlar kontrol edilir
        if (current.row == row) {
            return current; // Eşleşen satır bulunursa geri döndürülür
        }
        current = current.down; // Bir sonraki satıra geçilir
    }
    return null; // Uygun satır bulunamazsa null döner
}
  
    private NodeClass getColumnHeader(int col) {  // Verilen sütuna ait başlık düğümünü bulur
    NodeClass current = head.right; // Sütun başlıkları sağ tarafta tutulur, oradan başlanır
    while (current != null) { // Tüm sütun başlıkları tek tek kontrol edilir
        if (current.col == col) {
            return current; // Aranan sütun bulunursa geri döndürülür
        }
        current = current.right; // Bir sonraki sütuna geçilir
    }
    return null; // Böyle bir sütun yoksa null döner
}
  
    
    public NodeClass findNode(int row, int col) {  // Verilen satır ve sütunda düğüm varsa bulur, yoksa null döner
    NodeClass rowHeader = getRowHeader(row); // Bu satıra ait başlık düğümü alınır
      if (rowHeader == null) {
    return null; // Satır yoksa arama yapılamaz
    }
    NodeClass current = rowHeader.right; // Satırda sağa doğru ilerlemek için başlanır

    while (current != null) { // Satırdaki düğümler tek tek kontrol edilir
        if (current.col == col) {
            return current; // Aynı sütundaki düğüm bulunursa geri döndürülür
        }
        current = current.right; // Bir sonraki düğüme geçilir
    }
    return null; // Hiç düğüm yoksa null döner
}

    private void insertNode(NodeClass newNode) { // Yeni düğümü hem satıra hem sütuna ekler
        insertIntoRow(newNode); // Satırdaki yerine yerleştirilir
        insertIntoColumn(newNode); // Sütundaki yerine yerleştirilir
    }

  
    private void insertIntoRow(NodeClass newNode) {  // Yeni düğümü kendi satırında doğru konuma yerleştirir
    NodeClass rowHeader = getRowHeader(newNode.row); // Bu satırın başlık düğümü alınır
    NodeClass prev = rowHeader; // Önceki düğümü tutmak için kullanılır
    NodeClass current = rowHeader.right; // Satırda sağa doğru ilerlemek için başlangıç alınır

    while (current != null && current.col < newNode.col) { // Sütun sırasına göre uygun yer bulunur
        prev = current; // Önceki düğüm ilerletilir
        current = current.right; // Bir sonraki düğüme geçilir
    }
    newNode.right = current; // Yeni düğümün sağ bağlantısı ayarlanır
    prev.right = newNode; // Yeni düğüm uygun yere bağlanır
}
   
    private void insertIntoColumn(NodeClass newNode) { // Yeni düğümü kendi sütununda doğru konuma yerleştirir
    NodeClass colHeader = getColumnHeader(newNode.col); // Bu sütunun başlık düğümü alınır
    NodeClass prev = colHeader; // Önceki düğümü takip etmek için tutulur
    NodeClass current = colHeader.down; // Sütunda aşağı doğru ilerlemek için başlangıç alınır

    while (current != null && current.row < newNode.row) { // Satır sırasına göre uygun yer bulunur
        prev = current; // Önceki düğüm aşağı kaydırılır
        current = current.down; // Bir alt düğüme geçilir
    }

    newNode.down = current; // Yeni düğümün alt bağlantısı ayarlanır
    prev.down = newNode; // Yeni düğüm doğru yere eklenir
}
   
    
    private void removeNode(NodeClass node) { // Verilen düğümü hem satırdan hem sütundan kaldırır
    removeFromRow(node); // Satırdaki bağlantısı koparılır
    removeFromColumn(node); // Sütundaki bağlantısı da kaldırılır
    node.right = null; // Sağ tarafla olan bağlantı sıfırlanır
    node.down = null; // Alt tarafla olan bağlantı sıfırlanır
}

    private void removeFromRow(NodeClass node) { // Verilen düğümü bulunduğu satırdan siler
    NodeClass rowHeader = getRowHeader(node.row); // Bu satırın başlık düğümü alınır
    NodeClass prev = rowHeader; // Önceki düğümü takip etmek için tutulur
    NodeClass current = rowHeader.right; // Satır boyunca ilerlemek için ilk düğüm alınır

    while (current != null) { // Satırdaki düğümler sırayla gezilir
        if (current == node) {
            prev.right = current.right; // Bu düğüm atlanarak listeden çıkarılır
            return; // Düğüm bulununca işlem tamamlanır
        }
        prev = current; // Önceki düğüm güncellenir
        current = current.right; // Bir sonraki düğüme geçilir
    }
}
  
    private void removeFromColumn(NodeClass node) { // Verilen düğümü bulunduğu sütundan çıkarır
    NodeClass colHeader = getColumnHeader(node.col); // Bu düğümün olduğu sütunun başlangıcı alınır
    NodeClass prev = colHeader; // Bir önceki düğümü tutmak için kullanılır
    NodeClass current = colHeader.down; // Sütunda aşağı doğru ilerlemek için ilk düğüm alınır

    while (current != null) { // Sütundaki tüm düğümler tek tek kontrol edilir
        if (current == node) {
            prev.down = current.down; // Bu düğüm atlanarak listeden çıkarılır
            return; // İşlem bitince çıkılır
        }
        prev = current; // Önceki düğüm aşağı kaydırılır
        current = current.down; // Bir alttaki düğüme geçilir
    }
}
      
    public int getColumnSize(int col) { // Verilen sütunda kaç tane taş olduğunu sayar
    int count = 0; // Toplam taş sayısını tutar
    NodeClass colHeader = getColumnHeader(col); // Bu sütuna ait başlık düğümü alınır
    NodeClass current = colHeader.down; // Sütundaki ilk taş alınır
    
    while (current != null) { // Sütundaki tüm taşlar gezilir
        count++; // Her taş için sayı artırılır
        current = current.down; // Bir alt taşa geçilir
    }
    return count; // Toplam taş sayısı döndürülür
}

    public boolean isColumnFull(int col) { // Seçilen sütunda boş yer kalıp kalmadığını kontrol eder
    return getColumnSize(col) >= ROWS; // Sütundaki taş sayısı maksimum satıra ulaştıysa artık yer yoktur
}
    
    public boolean isGameOver() { // Oyunun bitip bitmediğini kontrol eder
    for (int c = 0; c < COLS; c++) { // Tüm sütunlar sırayla kontrol edilir
        if (isColumnFull(c)) {
            return true; // Herhangi bir sütun doluysa oyun biter
        }
    }
    return false; // Hiçbir sütun dolu değilse oyun devam eder
}

   // Verilen sayıyı seçilen sütuna ekler, en alttaki boş yere yerleştirir ve varsa birleşmeleri yapar
    public void addTile(int value, int col) {
      if (col < 0 || col >= COLS || isColumnFull(col)) return; // Sütun geçersiz ya da doluysa işlem yapılmaz
      int currentCount = getColumnSize(col); // Sütunda kaç tane taş olduğunu bulur
      int targetRow = (ROWS - 1) - currentCount;  // Yeni taşın düşeceği en alt boş satır hesaplanır
      NodeClass newNode = new NodeClass(value, targetRow, col); // Yeni taş oluşturulur
      insertNode(newNode); // Taş listeye eklenir
     // Aynı sayılar birleştiği sürece kontrol devam eder
    while (mergeColumn(col)) {
    compactColumn(col);// Birleşmeden sonra oluşan boşlukları kapatmak için taşlar aşağı kaydırılır
    }
}
    
    private void compactColumn(int col) { // Sütundaki taşları aşağı indirerek aradaki boşlukları yok eder
    NodeClass colHeader = getColumnHeader(col); // Seçilen sütunun başlangıç düğümü alınır
    if (colHeader == null || colHeader.down == null) return; // Sütun boşsa işlem yapılmaz
    int nextAvailableRow = ROWS - 1; // Yerleştirme en alt satırdan başlar
    NodeClass temp = colHeader.down; // Sütundaki ilk eleman referans alınır

    while (temp.down != null) {
        temp = temp.down; // Listenin en altına kadar ilerlenir
    }

    while (temp != null) {
        NodeClass toMove = temp; // Yer değiştirilecek düğüm tutulur
        temp = getUpperNode(toMove, col); // Üstteki düğüm bulunur
        removeNode(toMove); // Düğüm mevcut konumundan kaldırılır

        toMove.row = nextAvailableRow; // Yeni satır konumu atanır
        toMove.col = col; // Sütun bilgisi korunur
        insertNode(toMove); // Güncellenmiş haliyle tekrar eklenir
        nextAvailableRow--; // Bir üst pozisyona geçilir
    }
}

    private NodeClass getUpperNode(NodeClass target, int col) { // Verilen düğümün aynı sütunda bir üstünde hangi düğüm olduğunu bulur
    NodeClass current = getColumnHeader(col); // Sütunun en başındaki düğümden başlanır

    if (current.down == target) return null; // Eğer target ilk elemandaysa üstünde başka düğüm yoktur
    
    while (current.down != null) {
        if (current.down == target) return current; // target'ın hemen üstündeki düğüm bulunur
        current = current.down; // Aşağı doğru ilerlenerek kontrol devam eder
    }
    return null; // target bulunamazsa null döner
}
   
    private boolean mergeColumn(int col) { // Sütun içinde aynı sayıya sahip ardışık taşları kontrol edip uygun olanları birleştirir
    NodeClass colHeader = getColumnHeader(col); // Sütunun başlangıç düğümü alınır
    if (colHeader == null) return false; // Sütun yoksa işlem yapılmaz
    NodeClass upper = colHeader.down; // İlk taş alınır

    while (upper != null && upper.down != null) {
        NodeClass lower = upper.down; // Altındaki taş alınır

        if (upper.value == lower.value) {
            lower.value = lower.value * 2; // Alt taşın değeri iki katına çıkar
            removeNode(upper);             // Üstteki taş silinir
            return true;                  // Birleşme oldu
        }
        upper = lower; // Bir alt çifte geçilir
    }
     return false; // Hiç birleşme yoksa false döner
}
    public int getValueAt(int row, int col) { // Belirtilen koordinattaki sayıyı döndürür, eğer hücre boşsa 0 verir.
        NodeClass node = findNode(row, col); // Bu konumdaki düğüm bulunur

        if (node == null) {
            return 0;  // Düğüm yoksa hücre boştur
        }
        return node.value; // Düğüm varsa içindeki sayı döndürülür
    }   
} 