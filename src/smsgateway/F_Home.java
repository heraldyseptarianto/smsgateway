/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsgateway;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author risnawan
 */
public class F_Home extends javax.swing.JFrame {

    /**
     * Creates new form F_Home
     */
    
    public F_Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        lbl_namaadmin.setText(F_Login.stradmin);
//==========NEW==========  
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/send.png"));
                ImageIcon icon = new ImageIcon(gambar);
                bSend.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/send.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/history.png"));
                ImageIcon icon = new ImageIcon(gambar);
                bHistory.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/history.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/regis.png"));
                ImageIcon icon = new ImageIcon(gambar);
                bRegistrasi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/regis.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/setting.png"));
                ImageIcon icon = new ImageIcon(gambar);
                bKonfig.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/setting.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
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
        bSend = new javax.swing.JButton();
        bHistory = new javax.swing.JButton();
        bRegistrasi = new javax.swing.JButton();
        bKonfig = new javax.swing.JButton();
        bNotifikasi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_namaadmin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        bGempa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        bSend.setBackground(new java.awt.Color(0, 0, 0));
        bSend.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bSend.setForeground(new java.awt.Color(51, 153, 255));
        bSend.setText("Kirim Pesan");
        bSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSendActionPerformed(evt);
            }
        });

        bHistory.setBackground(new java.awt.Color(0, 0, 0));
        bHistory.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bHistory.setForeground(new java.awt.Color(51, 153, 255));
        bHistory.setText("Riwayat Pesan");
        bHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHistoryActionPerformed(evt);
            }
        });

        bRegistrasi.setBackground(new java.awt.Color(0, 0, 0));
        bRegistrasi.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        bRegistrasi.setForeground(new java.awt.Color(51, 153, 255));
        bRegistrasi.setText("Registrasi Penduduk");
        bRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrasiActionPerformed(evt);
            }
        });

        bKonfig.setBackground(new java.awt.Color(0, 0, 0));
        bKonfig.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        bKonfig.setForeground(new java.awt.Color(51, 153, 255));
        bKonfig.setText("Konfigurasi Modem");
        bKonfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bKonfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKonfigActionPerformed(evt);
            }
        });

        bNotifikasi.setBackground(new java.awt.Color(0, 0, 0));
        bNotifikasi.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bNotifikasi.setForeground(new java.awt.Color(51, 153, 255));
        bNotifikasi.setText("Notifikasi Gempa");
        bNotifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNotifikasiActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(82, 66));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Menu");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Admin");

        lbl_namaadmin.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lbl_namaadmin.setForeground(new java.awt.Color(51, 153, 255));
        lbl_namaadmin.setText("Nama Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_namaadmin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(lbl_namaadmin))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(51, 153, 255));
        btn_logout.setText("Keluar");
        btn_logout.setPreferredSize(new java.awt.Dimension(70, 30));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bGempa.setBackground(new java.awt.Color(0, 0, 0));
        bGempa.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        bGempa.setForeground(new java.awt.Color(51, 153, 255));
        bGempa.setText("Simulasi data");
        bGempa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bGempa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGempaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bNotifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSend, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bKonfig, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGempa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSend, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNotifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bKonfig, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGempa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSendActionPerformed
        // TODO add your handling code here:
        new F_NewSendMessage().show();
        this.dispose();
    }//GEN-LAST:event_bSendActionPerformed

    private void bHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHistoryActionPerformed
        // TODO add your handling code here:
        new F_History().show();
        this.dispose();
    }//GEN-LAST:event_bHistoryActionPerformed

    private void bRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrasiActionPerformed
        // TODO add your handling code here:
        new F_Registrasi().show();
        this.dispose();
    }//GEN-LAST:event_bRegistrasiActionPerformed

    private void bKonfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKonfigActionPerformed
        // TODO add your handling code here:
        new F_Konfigurasi().show();
        this.dispose();
    }//GEN-LAST:event_bKonfigActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        new F_Login().show();
        this.dispose();        
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void bNotifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNotifikasiActionPerformed
        // TODO add your handling code here:
        new F_NotifikasiGempa().show();
        this.dispose();
    }//GEN-LAST:event_bNotifikasiActionPerformed

    private void bGempaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGempaActionPerformed
        // TODO add your handling code here:
        new F_InputGempa().show();
    }//GEN-LAST:event_bGempaActionPerformed

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
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGempa;
    private javax.swing.JButton bHistory;
    private javax.swing.JButton bKonfig;
    private javax.swing.JButton bNotifikasi;
    private javax.swing.JButton bRegistrasi;
    private javax.swing.JButton bSend;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_namaadmin;
    // End of variables declaration//GEN-END:variables
}
