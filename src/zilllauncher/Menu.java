/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zilllauncher;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Bergson
 */
public class Menu extends javax.swing.JFrame {
    private static Point point = new Point();
    private static JFrame frame = new JFrame();
    
    public void mousedrag(JFrame fram){
        frame = fram;
    }
    public void mousedragg(MouseEvent evt){
        Point p = frame.getLocation();
        frame.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }
    /**
     * Creates new form Menu
     */
    public Menu() throws FileNotFoundException, IOException {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        FileReader fr = new FileReader("C:/ZillianLauncher/contas.zlc");
        BufferedReader br = new BufferedReader(fr);
        jLabel1.setText("Bem-Vindo "+br.readLine()+"!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jogo4 = new javax.swing.JPanel();
        txt4 = new javax.swing.JLabel();
        capa4 = new javax.swing.JLabel();
        jogo3 = new javax.swing.JPanel();
        txt3 = new javax.swing.JLabel();
        capa3 = new javax.swing.JLabel();
        jogo2 = new javax.swing.JPanel();
        txt2 = new javax.swing.JLabel();
        capa2 = new javax.swing.JLabel();
        jogo1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        capa1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        opcao2 = new javax.swing.JPanel();
        txtopcao2 = new javax.swing.JLabel();
        opcao1 = new javax.swing.JPanel();
        txtopcao1 = new javax.swing.JLabel();
        opcao3 = new javax.swing.JPanel();
        txtopcao3 = new javax.swing.JLabel();
        opcao4 = new javax.swing.JPanel();
        txtopcao4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/home.png"))); // NOI18N
        jLabel2.setText("  INICIO - ZILLIAN LAUNCHER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(633, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 53, 960, -1));

        jogo4.setBackground(new java.awt.Color(0, 51, 102));
        jogo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt4.setBackground(new java.awt.Color(0, 51, 102));
        txt4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("JOGO");
        jogo4.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 40));

        capa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/capa.png"))); // NOI18N
        jogo4.add(capa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jogo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 140, 230));

        jogo3.setBackground(new java.awt.Color(0, 51, 102));
        jogo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt3.setBackground(new java.awt.Color(0, 51, 102));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("JOGO");
        jogo3.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 40));

        capa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/capa.png"))); // NOI18N
        jogo3.add(capa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 140, 230));

        jogo2.setBackground(new java.awt.Color(0, 51, 102));
        jogo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt2.setBackground(new java.awt.Color(0, 51, 102));
        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("JOGO");
        jogo2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 40));

        capa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/capa.png"))); // NOI18N
        jogo2.add(capa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 140, 230));

        jogo1.setBackground(new java.awt.Color(0, 51, 102));
        jogo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setBackground(new java.awt.Color(0, 51, 102));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("JOGO");
        jogo1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 40));

        capa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/capa.png"))); // NOI18N
        jogo1.add(capa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 980, 590));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ZILLIAN LAUNCHER");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/close.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem-Vindo usuário!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 420, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 100));

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcao2.setBackground(new java.awt.Color(0, 51, 102));
        opcao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcao2MouseClicked(evt);
            }
        });
        opcao2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtopcao2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtopcao2.setForeground(new java.awt.Color(255, 255, 255));
        txtopcao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/joystick.png"))); // NOI18N
        txtopcao2.setText("   JOGOS");
        opcao2.add(txtopcao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 50));

        jPanel3.add(opcao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 50));

        opcao1.setBackground(new java.awt.Color(40, 60, 103));
        opcao1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        opcao1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opcao1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtopcao1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtopcao1.setForeground(new java.awt.Color(255, 255, 255));
        txtopcao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/home.png"))); // NOI18N
        txtopcao1.setText("   INICIO");
        opcao1.add(txtopcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 50));

        jPanel3.add(opcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 50));

        opcao3.setBackground(new java.awt.Color(0, 51, 102));
        opcao3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtopcao3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtopcao3.setForeground(new java.awt.Color(255, 255, 255));
        txtopcao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/movie.png"))); // NOI18N
        txtopcao3.setText("   FILMES");
        opcao3.add(txtopcao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 50));

        jPanel3.add(opcao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 50));

        opcao4.setBackground(new java.awt.Color(0, 51, 102));
        opcao4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtopcao4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtopcao4.setForeground(new java.awt.Color(255, 255, 255));
        txtopcao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zilllauncher/img/movie.png"))); // NOI18N
        txtopcao4.setText("   SÉRIES");
        opcao4.add(txtopcao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 50));

        jPanel3.add(opcao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
         mousedragg(evt);
    }//GEN-LAST:event_formMouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void opcao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao2MouseClicked
        
        Jogos j;
        try {
            j = new Jogos();
            j.mousedrag(j);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_opcao2MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capa1;
    private javax.swing.JLabel capa2;
    private javax.swing.JLabel capa3;
    private javax.swing.JLabel capa4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jogo1;
    private javax.swing.JPanel jogo2;
    private javax.swing.JPanel jogo3;
    private javax.swing.JPanel jogo4;
    private javax.swing.JPanel opcao1;
    private javax.swing.JPanel opcao2;
    private javax.swing.JPanel opcao3;
    private javax.swing.JPanel opcao4;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txtopcao1;
    private javax.swing.JLabel txtopcao2;
    private javax.swing.JLabel txtopcao3;
    private javax.swing.JLabel txtopcao4;
    // End of variables declaration//GEN-END:variables
}