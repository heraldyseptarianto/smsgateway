/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsgateway;

import utils.koneksi;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.smslib.AGateway;
import org.smslib.IOutboundMessageNotification;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;

/**
 *
 * @author User
 */
public class F_NewSendMessage extends javax.swing.JFrame {

    /**
     * Creates new form F_NewSendMessage
     */
    private koneksi kon;
    DefaultListModel model = new DefaultListModel();
    private DefaultTableModel model2;
    private int selectedRowIndex;
//    public static int nilai;

    private String sta;

    public F_NewSendMessage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        txt_notujuan.setText("");
        txt_isipesan.setText("");
        pnl_broadcast.setVisible(false);
        pnl_darurat.setVisible(false);

        kon = new koneksi();
        jList1.setModel(model);
//        jProgressBar1.setValue(nilai);

        model2 = new DefaultTableModel();
        tbl_gempa.setModel(model2);
        model2.addColumn("No");
        model2.addColumn("Id");
        model2.addColumn("Kekuatan");
        model2.addColumn("Kedalaman");
        model2.addColumn("Lempeng Terangkat");
        model2.addColumn("Lokasi");
        model2.addColumn("Jarak");
        model2.addColumn("Potensi Tsunami");
        model2.addColumn("Peringatan");

        try {
            getTabelGempa();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(F_History.class.getName()).log(Level.SEVERE, null, ex);
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

        btngrp_jenispesan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_kembali = new javax.swing.JButton();
        btn_kirim = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        txt_notujuan = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_warga = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnl_broadcast = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_isipesan = new javax.swing.JTextArea();
        check_broadcast = new javax.swing.JCheckBox();
        check_darurat = new javax.swing.JCheckBox();
        pnl_darurat = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_gempa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(82, 66));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Kirim Pesan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(160, 52));

        btn_kembali.setBackground(new java.awt.Color(0, 0, 0));
        btn_kembali.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btn_kembali.setForeground(new java.awt.Color(51, 153, 255));
        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        btn_kirim.setBackground(new java.awt.Color(0, 0, 0));
        btn_kirim.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btn_kirim.setForeground(new java.awt.Color(51, 153, 255));
        btn_kirim.setText("Kirim");
        btn_kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kirimActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_kirim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_kirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nomor Tujuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        txt_notujuan.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_notujuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notujuanKeyTyped(evt);
            }
        });

        btn_tambah.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btn_tambah.setText("Tambah Nomor");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_notujuan)
            .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt_notujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_tambah))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Nomor Tujuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        jList1.setBackground(new java.awt.Color(204, 255, 204));
        jList1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        btn_warga.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btn_warga.setText("Tambah Nomor Warga");
        btn_warga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_wargaActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btn_hapus.setText("Hapus Nomor");
        btn_hapus.setPreferredSize(new java.awt.Dimension(163, 31));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_warga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_warga))
        );

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Jenis Pesan");

        pnl_broadcast.setBackground(new java.awt.Color(0, 51, 51));
        pnl_broadcast.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Broadcast", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        txt_isipesan.setColumns(20);
        txt_isipesan.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_isipesan.setRows(5);
        jScrollPane4.setViewportView(txt_isipesan);

        javax.swing.GroupLayout pnl_broadcastLayout = new javax.swing.GroupLayout(pnl_broadcast);
        pnl_broadcast.setLayout(pnl_broadcastLayout);
        pnl_broadcastLayout.setHorizontalGroup(
            pnl_broadcastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        pnl_broadcastLayout.setVerticalGroup(
            pnl_broadcastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        check_broadcast.setBackground(new java.awt.Color(0, 51, 51));
        btngrp_jenispesan.add(check_broadcast);
        check_broadcast.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        check_broadcast.setForeground(new java.awt.Color(51, 153, 255));
        check_broadcast.setText("Pesan Broadcast");
        check_broadcast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_broadcastActionPerformed(evt);
            }
        });

        check_darurat.setBackground(new java.awt.Color(0, 51, 51));
        btngrp_jenispesan.add(check_darurat);
        check_darurat.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        check_darurat.setForeground(new java.awt.Color(51, 153, 255));
        check_darurat.setText("Pesan Darurat");
        check_darurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_daruratActionPerformed(evt);
            }
        });

        pnl_darurat.setBackground(new java.awt.Color(0, 51, 51));
        pnl_darurat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Darurat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        tbl_gempa.setBackground(new java.awt.Color(204, 255, 204));
        tbl_gempa.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tbl_gempa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_gempa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_gempaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_gempa);

        javax.swing.GroupLayout pnl_daruratLayout = new javax.swing.GroupLayout(pnl_darurat);
        pnl_darurat.setLayout(pnl_daruratLayout);
        pnl_daruratLayout.setHorizontalGroup(
            pnl_daruratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
        pnl_daruratLayout.setVerticalGroup(
            pnl_daruratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_broadcast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_broadcast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_darurat)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_darurat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_broadcast, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_darurat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_broadcast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_darurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_broadcastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_broadcastActionPerformed
        // TODO add your handling code here:
        if (check_broadcast.isSelected()) {
            pnl_broadcast.setVisible(true);
            pnl_darurat.setVisible(false);
        } else {
            pnl_broadcast.setVisible(false);
            pnl_darurat.setVisible(true);
        }
    }//GEN-LAST:event_check_broadcastActionPerformed

    private void check_daruratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_daruratActionPerformed
        // TODO add your handling code here:
        if (check_darurat.isSelected()) {
            pnl_darurat.setVisible(true);
            pnl_broadcast.setVisible(false);
        } else {
            pnl_darurat.setVisible(false);
            pnl_broadcast.setVisible(true);
        }
    }//GEN-LAST:event_check_daruratActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        if (!txt_notujuan.getText().isEmpty()) {
            model.addElement(txt_notujuan.getText());
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        if (jList1.getSelectedIndex() > -1) {
            model.remove(jList1.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(null, "sorot nomor terlebih dahulu");
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_wargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_wargaActionPerformed
        // TODO add your handling code here:
        kon = new koneksi();
        try {
            addWarga();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_wargaActionPerformed

    private void btn_kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kirimActionPerformed
        // TODO add your handling code here:
        String txt = "";
        try {
            SendMessage app = new SendMessage();
            if (check_broadcast.isSelected()) {
                send(model, txt_isipesan.getText());
            } else if (check_darurat.isSelected()) {
                if ((tbl_gempa.getSelectedRow() >= 0)) {
                    if ((model2.getValueAt(selectedRowIndex, 8).toString().toUpperCase()).equals("BELUM")) {
                        txt = String.format("Perhatian, telah terjadi gampa berkuatan %s dengan kedalaman %s di %s. Untuk warga daerah sekitar dimohon untuk siaga karena gempa ini berpotensi terjadi tsunami. \nBMKG ",
                                model2.getValueAt(selectedRowIndex, 2).toString(),
                                model2.getValueAt(selectedRowIndex, 3).toString(),
                                model2.getValueAt(selectedRowIndex, 5).toString());
                        send(model, txt);
                        updateGempa(model2.getValueAt(selectedRowIndex, 1).toString());
                        getTabelGempa();
                    } else {
                        JOptionPane.showMessageDialog(null, "Sudah terkirim");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorot record terlebih dahulu");
                }
            }
            //PANGGIL FUNGSI SENDMESSAGE
            new F_Home().show();
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(F_History.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_kirimActionPerformed

    private void txt_notujuanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notujuanKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_notujuanKeyTyped

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        new F_Home().show();
        this.dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void tbl_gempaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gempaMouseClicked
        // TODO add your handling code here:
        selectedRowIndex = tbl_gempa.getSelectedRow();
    }//GEN-LAST:event_tbl_gempaMouseClicked

    public void addWarga() throws ClassNotFoundException {
        try {
            Statement stasql = (Statement) kon.Connect().createStatement();
            ResultSet runkueri = stasql.executeQuery("select * from warga"); //Database pesan, field no_tujuan dan isi_pesan
            while (runkueri.next()) {
                model.addElement(runkueri.getString("nomor"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void getTabelGempa() throws ClassNotFoundException {
        try {
            model2.setRowCount(0);
            int no = 1;
            Statement stasql = (Statement) kon.Connect().createStatement();
            ResultSet runkueri = stasql.executeQuery("select * from gempa"); //Database pesan, field no_tujuan dan isi_pesan
            while (runkueri.next()) {
                Object[] obj = new Object[9];
                obj[0] = no;
                obj[1] = runkueri.getString("id_gempa");
                obj[2] = runkueri.getString("kekuatan_gempa") + " SR";
                obj[3] = runkueri.getString("kedalaman_gempa") + " KM";
                String lempeng = runkueri.getString("lempeng_terangkat");
                if (lempeng.equals("0")) {
                    obj[4] = "Tidak";
                } else if (lempeng.equals("1")) {
                    obj[4] = "Ya";
                }
                obj[5] = runkueri.getString("lokasi_gempa");
                obj[6] = runkueri.getString("jarak_gempa") + " KM";
                String potensi = runkueri.getString("potensi_tsunami");
                if (potensi.equals("0")) {
                    obj[7] = "Tidak";
                } else if (potensi.equals("1")) {
                    obj[7] = "Ys";
                }
                obj[8] = runkueri.getString("pesan_peringatan");
                model2.addRow(obj);
                no++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void simpanPesan(String nomor, String pesan, String status) throws ClassNotFoundException {
        kon = new koneksi();
        try {
            Statement stasql = (Statement) kon.Connect().createStatement();
            int runkueri = stasql.executeUpdate("insert into pesan (id_pesan, no_tujuan, isi_pesan, waktu, status) VALUES (NULL, '" + nomor + "','" + pesan + "', now(),'" + status + "')"); //Database pesan, field no_tujuan dan isi_pesan
            stasql.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void updateGempa(String id) throws ClassNotFoundException {
        kon = new koneksi();
        try {
            Statement stasql = (Statement) kon.Connect().createStatement();
            int runkueri = stasql.executeUpdate("update gempa set pesan_peringatan = 'Sudah' where id_gempa = " + id);
            stasql.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void send(DefaultListModel nomor, String pesan) throws Exception {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/settingmodem.properties");
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            System.out.println(prop.getProperty("baudRate"));
            System.out.println(prop.getProperty("comPort"));
            System.out.println(prop.getProperty("model"));
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        OutboundNotification outboundNotification = new OutboundNotification();
        SerialModemGateway gateway = new SerialModemGateway("", prop.getProperty("comPort", "com9"), Integer.parseInt(prop.getProperty("baudRate", "9600")), "", prop.getProperty("model", "AirCard 312U"));
        gateway.setInbound(true);
        gateway.setOutbound(true);
        Service.getInstance().setOutboundMessageNotification(outboundNotification);
        Service.getInstance().addGateway(gateway);
        Service.getInstance().startService();

        for (int i = 0; i < nomor.getSize(); i++) {
//            try {
//                jProgressBar1.setValue(nomor.getSize() / i);
//                jProgressBar1.repaint();
////                progress.update(nomor.getSize()/i);
//            } catch (Exception e) {
//                jProgressBar1.setValue(0);
//                jProgressBar1.repaint();
//            }
            if (i % 20 == 0) {
                Service.getInstance().stopService();
                Service.getInstance().removeGateway(gateway);
                Service.getInstance().addGateway(gateway);
                Service.getInstance().startService();
                OutboundMessage msg = new OutboundMessage(String.valueOf(nomor.get(i)), pesan);
//                msg.setFlashSms(true);
                Service.getInstance().sendMessage(msg);
                System.out.println(msg);
                if (String.valueOf(msg.getMessageStatus()).equals("FAILED")) {
                    sta = "tidak terkirim";
                    System.out.println(String.valueOf(nomor.get(i)) + " gagal terkirim");
                } else if (String.valueOf(msg.getMessageStatus()).equals("SENT")) {
                    System.out.println(String.valueOf(nomor.get(i)) + " berhasil terkirim");
                    sta = "terkirim";
                }
            } else {
                OutboundMessage msg = new OutboundMessage(String.valueOf(nomor.get(i)), pesan);
//                msg.setFlashSms(true);
                Service.getInstance().sendMessage(msg);
                System.out.println(msg);
                if (String.valueOf(msg.getMessageStatus()).equals("FAILED")) {
                    sta = "tidak terkirim";
                    System.out.println(String.valueOf(nomor.get(i)) + " gagal terkirim");
                } else if (String.valueOf(msg.getMessageStatus()).equals("SENT")) {
                    System.out.println(String.valueOf(nomor.get(i)) + " berhasil terkirim");
                    sta = "terkirim";
                }
            }
            simpanPesan(String.valueOf(nomor.get(i)), pesan, sta);
            System.out.println("berhasil terkirim " + i);
        }
        Service.getInstance().stopService();
        Service.getInstance().removeGateway(gateway);
    }

    public class OutboundNotification implements IOutboundMessageNotification {
        public void process(AGateway gateway, OutboundMessage msg) {
            System.out.println("Outbound handler called from Gateway: " + gateway.getGatewayId());
            System.out.println(msg);
        }
    }

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
            java.util.logging.Logger.getLogger(F_NewSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_NewSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_NewSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_NewSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_NewSendMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_kirim;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_warga;
    private javax.swing.ButtonGroup btngrp_jenispesan;
    private javax.swing.JCheckBox check_broadcast;
    private javax.swing.JCheckBox check_darurat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnl_broadcast;
    private javax.swing.JPanel pnl_darurat;
    private javax.swing.JTable tbl_gempa;
    private javax.swing.JTextArea txt_isipesan;
    private javax.swing.JTextField txt_notujuan;
    // End of variables declaration//GEN-END:variables
}
