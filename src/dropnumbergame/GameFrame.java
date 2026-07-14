// RUMEYSA ELİF KOÇAK 2321051044
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dropnumbergame;

public class GameFrame extends javax.swing.JFrame {
private MultiLinkedList game;
private NextNumbersList list;
private javax.swing.JLabel[][] cells;
   

public GameFrame() {
initComponents();
game = new MultiLinkedList(); // Oyun yapısı başlatılır
list = new NextNumbersList();  // Gelecek hamleleri tutacak liste hazırlanır

cells = new javax.swing.JLabel[][] { // Arayüzdeki label'lar 2D diziye bağlanır board kontrolü için
    {lbl00, lbl01, lbl02, lbl03, lbl04},
    {lbl10, lbl11, lbl12, lbl13, lbl14},
    {lbl20, lbl21, lbl22, lbl23, lbl24},
    {lbl30, lbl31, lbl32, lbl33, lbl34},
    {lbl40, lbl41, lbl42, lbl43, lbl44},
    {lbl50, lbl51, lbl52, lbl53, lbl54},
    {lbl60, lbl61, lbl62, lbl63, lbl64}
};

initializeMoves();  // Başlangıç hamleleri yüklenir
updateBoard();  // İlk board görüntüsü hazırlanır
showNextNumber();  // İlk gelecek taş gösterilir
lblTitle.setText("Drop Number Game");
lblInfo.setText("Game Started! Click 'Next Move' to drop a tile.");
btnNext.setText("Next Move");
btnRestart.setText("Restart");
    }

 private void initializeMoves() {
    // Başlangıç hamlelerini ve temel dizilimi oluşturuyoruz
    list.add(2, 0); // 1. Sütun
    list.add(2, 3); // 4. Sütun
    list.add(4, 1); // 2. Sütun
    list.add(2, 2); // 3. Sütun
    list.add(4, 4); // 5. Sütun
    list.add(2, 1); // 2. Sütun
    list.add(4, 4); // 5. Sütun  Sütun içinde 8 değerine ulaşılıyor
    list.add(8, 0); // 1. Sütun
    list.add(8, 0);  // 1. Sütun  16 elde ediliyor
    list.add(32, 1); // 2. Sütun
    list.add(2, 2);  // 3. Sütun  4 değerine ulaşan  birleşme
    list.add(64, 2); // 3. Sütun
    list.add(16, 3); // 4. Sütun
    list.add(64, 1); // 2. Sütun
    list.add(32, 2); // 3. Sütun
    list.add(16, 0); // 1. Sütun
    list.add(16, 4); // 5. Sütun
    list.add(32, 2); // 3. Sütun
    list.add(64, 1); // 2. Sütun
    list.add(8, 3);  // 4. Sütun
    list.add(4, 3);  // 4. Sütun
    list.add(2, 3);  // 4. Sütun
    list.add(2, 3);  // 4. Sütun  Üst üste binip 4 oluyor
    list.add(2, 1);  // 2. Sütun  Zincirleme 4 ve 8 birleşmeleri burada başlıyor
    list.add(64, 2); // 3. Sütun
    list.add(32, 2); // 3. Sütun
    list.add(16, 2); // 3. Sütun
    list.add(8, 2);  // 3. Sütun
    list.add(8, 2);  // 3. Sütun
    list.add(4, 1);  // 2. Sütun  8 ve 16'lık son zincirleme
    list.add(8, 1);  // 2. Sütun
}
    
    
   private void showNextNumber() {
    NextNumbersList.NumberNode next = list.peek(); // Kuyruğun ilk elemanına bakılır 
    
    if (next != null) {
        // Sıradaki hamleyi listeden çekip ekranda gösteriyorum
        lblNext.setText("NEXT: Tile " + next.value + " Target Col: " + (next.col + 1));
    } else {
        lblNext.setText("No more moves."); // Liste boşsa artık hamle kalmadığını gösterir
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        pnlBoard = new javax.swing.JPanel();
        lbl00 = new javax.swing.JLabel();
        lbl01 = new javax.swing.JLabel();
        lbl02 = new javax.swing.JLabel();
        lbl03 = new javax.swing.JLabel();
        lbl04 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        lbl60 = new javax.swing.JLabel();
        lbl61 = new javax.swing.JLabel();
        lbl62 = new javax.swing.JLabel();
        lbl63 = new javax.swing.JLabel();
        lbl64 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        lblNext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitle.setText("Drop Number Game ");

        pnlBoard.setBackground(new java.awt.Color(255, 255, 255));
        pnlBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlBoard.setPreferredSize(new java.awt.Dimension(350, 500));
        pnlBoard.setLayout(new java.awt.GridLayout(7, 5, 5, 5));

        lbl00.setBackground(new java.awt.Color(255, 255, 255));
        lbl00.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl00.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl00.setOpaque(true);
        pnlBoard.add(lbl00);

        lbl01.setBackground(new java.awt.Color(255, 255, 255));
        lbl01.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl01.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl01.setOpaque(true);
        pnlBoard.add(lbl01);

        lbl02.setBackground(new java.awt.Color(255, 255, 255));
        lbl02.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl02.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl02.setOpaque(true);
        pnlBoard.add(lbl02);

        lbl03.setBackground(new java.awt.Color(255, 255, 255));
        lbl03.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl03.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl03.setOpaque(true);
        pnlBoard.add(lbl03);

        lbl04.setBackground(new java.awt.Color(255, 255, 255));
        lbl04.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl04.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl04.setOpaque(true);
        pnlBoard.add(lbl04);

        lbl10.setBackground(new java.awt.Color(255, 255, 255));
        lbl10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl10.setOpaque(true);
        pnlBoard.add(lbl10);

        lbl11.setBackground(new java.awt.Color(255, 255, 255));
        lbl11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl11.setOpaque(true);
        pnlBoard.add(lbl11);

        lbl12.setBackground(new java.awt.Color(255, 255, 255));
        lbl12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl12.setOpaque(true);
        pnlBoard.add(lbl12);

        lbl13.setBackground(new java.awt.Color(255, 255, 255));
        lbl13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl13.setOpaque(true);
        pnlBoard.add(lbl13);

        lbl14.setBackground(new java.awt.Color(255, 255, 255));
        lbl14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl14.setOpaque(true);
        pnlBoard.add(lbl14);

        lbl20.setBackground(new java.awt.Color(255, 255, 255));
        lbl20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl20.setOpaque(true);
        pnlBoard.add(lbl20);

        lbl21.setBackground(new java.awt.Color(255, 255, 255));
        lbl21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl21.setOpaque(true);
        pnlBoard.add(lbl21);

        lbl22.setBackground(new java.awt.Color(255, 255, 255));
        lbl22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl22.setOpaque(true);
        pnlBoard.add(lbl22);

        lbl23.setBackground(new java.awt.Color(255, 255, 255));
        lbl23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl23.setOpaque(true);
        pnlBoard.add(lbl23);

        lbl24.setBackground(new java.awt.Color(255, 255, 255));
        lbl24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl24.setOpaque(true);
        pnlBoard.add(lbl24);

        lbl30.setBackground(new java.awt.Color(255, 255, 255));
        lbl30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl30.setOpaque(true);
        pnlBoard.add(lbl30);

        lbl31.setBackground(new java.awt.Color(255, 255, 255));
        lbl31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl31.setOpaque(true);
        pnlBoard.add(lbl31);

        lbl32.setBackground(new java.awt.Color(255, 255, 255));
        lbl32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl32.setOpaque(true);
        pnlBoard.add(lbl32);

        lbl33.setBackground(new java.awt.Color(255, 255, 255));
        lbl33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl33.setOpaque(true);
        pnlBoard.add(lbl33);

        lbl34.setBackground(new java.awt.Color(255, 255, 255));
        lbl34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl34.setOpaque(true);
        pnlBoard.add(lbl34);

        lbl40.setBackground(new java.awt.Color(255, 255, 255));
        lbl40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl40.setOpaque(true);
        pnlBoard.add(lbl40);

        lbl41.setBackground(new java.awt.Color(255, 255, 255));
        lbl41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl41.setOpaque(true);
        pnlBoard.add(lbl41);

        lbl42.setBackground(new java.awt.Color(255, 255, 255));
        lbl42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl42.setOpaque(true);
        pnlBoard.add(lbl42);

        lbl43.setBackground(new java.awt.Color(255, 255, 255));
        lbl43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl43.setOpaque(true);
        pnlBoard.add(lbl43);

        lbl44.setBackground(new java.awt.Color(255, 255, 255));
        lbl44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl44.setOpaque(true);
        pnlBoard.add(lbl44);

        lbl50.setBackground(new java.awt.Color(255, 255, 255));
        lbl50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl50.setOpaque(true);
        pnlBoard.add(lbl50);

        lbl51.setBackground(new java.awt.Color(255, 255, 255));
        lbl51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl51.setOpaque(true);
        pnlBoard.add(lbl51);

        lbl52.setBackground(new java.awt.Color(255, 255, 255));
        lbl52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl52.setOpaque(true);
        pnlBoard.add(lbl52);

        lbl53.setBackground(new java.awt.Color(255, 255, 255));
        lbl53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl53.setOpaque(true);
        pnlBoard.add(lbl53);

        lbl54.setBackground(new java.awt.Color(255, 255, 255));
        lbl54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl54.setOpaque(true);
        pnlBoard.add(lbl54);

        lbl60.setBackground(new java.awt.Color(255, 255, 255));
        lbl60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl60.setOpaque(true);
        pnlBoard.add(lbl60);

        lbl61.setBackground(new java.awt.Color(255, 255, 255));
        lbl61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl61.setOpaque(true);
        pnlBoard.add(lbl61);

        lbl62.setBackground(new java.awt.Color(255, 255, 255));
        lbl62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl62.setOpaque(true);
        pnlBoard.add(lbl62);

        lbl63.setBackground(new java.awt.Color(255, 255, 255));
        lbl63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl63.setOpaque(true);
        pnlBoard.add(lbl63);

        lbl64.setBackground(new java.awt.Color(255, 255, 255));
        lbl64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl64.setOpaque(true);
        pnlBoard.add(lbl64);

        btnNext.setText("Next Move ");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addComponent(lblNext, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNext))
                .addGap(18, 18, 18)
                .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      NextNumbersList.NumberNode next = list.getNext();  // Kuyruktan sıradaki hamle alınır

    if (next == null) { // Hamle kalmadıysa oyun bitirilir ve buton kapatılır
        lblInfo.setText("STATUS: All moves completed successfully!");
        lblNext.setText("End of Game");
        btnNext.setEnabled(false);
        return;
    }

    game.addTile(next.value, next.col);  // Gelen taş belirtilen sütuna bırakılır
    updateBoard();  // Yeni duruma göre tablo yenilenir

    if (game.isGameOver()) {   // Sütun doluysa oyun durdurulur
        lblInfo.setText("GAME OVER! Column full. Click Restart"); // Oyun bittiğinde kullanıcıya ne yapacağını söyleyen uyarı mesajı
        lblInfo.setForeground(java.awt.Color.RED); 
        
        lblNext.setText("End of Game"); 
        btnNext.setEnabled(false); // Yeni hamle yapılmasını engelle
    } else {
        // Hangi sayıyı hangi sütuna attığımı takip etmek için bilgi yazdırıyorum
        lblInfo.setText("ACTION: Dropped " + next.value + " into Column " + (next.col + 1));
        lblInfo.setForeground(java.awt.Color.BLACK);
        
        // Bir sonraki gelecek olan sayıyı ekranda güncelle
        showNextNumber(); 
    }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
     // Oyun yapısını ve hamle listesini baştan oluşturuyorum
    game = new MultiLinkedList(); 
    list = new NextNumbersList();

    // Hamleleri başlangıçtaki sırasına göre tekrar yüklüyorum
    initializeMoves(); 
    
    // Ekranı temizleyip ilk görüntüyü getiriyorum
    updateBoard(); 
    
    // Gelecek olan ilk sayıyı ekranda gösteriyorum
    showNextNumber(); 
    
    // Oyun bittiğinde kapanan butonu tekrar aktif hale getiriyorum
    btnNext.setEnabled(true); 
    
    // Bilgi ekranını başlangıç durumuna döndürüyorum
    lblInfo.setText("Game Reset! Ready for moves.");
    }//GEN-LAST:event_btnRestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }
    private void updateBoard() {
        // Tüm grid dolaşılır
        for (int r = 0; r < 7; r++) {
            for (int c = 0; c < 5; c++) {
                int value = game.getValueAt(r, c); // O hücredeki değer alınır
                if (value == 0) { // Hücre boşsa yazı ve renk temizlenir
                    cells[r][c].setText("");
                    cells[r][c].setBackground(java.awt.Color.WHITE);
                } else {
                    cells[r][c].setText(String.valueOf(value));  // Hücre doluysa değer yazdırılır
                    // Sayıya göre görsel renk belirlenir
                    switch(value) {
                        case 2: cells[r][c].setBackground(new java.awt.Color(255, 255, 204)); break; // Açık Sarı
                        case 4: cells[r][c].setBackground(new java.awt.Color(255, 204, 102)); break; // Koyu Sarı
                        case 8: cells[r][c].setBackground(new java.awt.Color(153, 255, 153)); break; // Yeşil
                        case 16: cells[r][c].setBackground(new java.awt.Color(204, 153, 255)); break; // Mor
                       case 32: cells[r][c].setBackground(new java.awt.Color(224, 255, 224)); break;
                        case 64: cells[r][c].setBackground(new java.awt.Color(230, 230, 250)); break; // Lavender
                        case 128: cells[r][c].setBackground(new java.awt.Color(255, 51, 51)); break;  // Kırmızı
                        case 256: cells[r][c].setBackground(new java.awt.Color(255, 182, 193)); break; // Açık Pembe
                        default: cells[r][c].setBackground(new java.awt.Color(204, 204, 204)); break;
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRestart;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl03;
    private javax.swing.JLabel lbl04;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl60;
    private javax.swing.JLabel lbl61;
    private javax.swing.JLabel lbl62;
    private javax.swing.JLabel lbl63;
    private javax.swing.JLabel lbl64;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBoard;
    // End of variables declaration//GEN-END:variables
}
