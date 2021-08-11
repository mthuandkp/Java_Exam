/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLKhuyenMai;

import DAO.KhuyenMaiDao;
import BUS.KhuyenMaiBus;
import DTO.KhuyenMai;
import ProcessingFunction.ConnectionDB;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ThemKhuyenMai extends javax.swing.JFrame {
    KhuyenMaiBus khuyenmaibus = new KhuyenMaiBus();
    ConnectionDB conn = new ConnectionDB();
    public ThemKhuyenMai() {
        initComponents();
        initialization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        makhuyenmai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ngayapdung = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phantramgiam = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        them = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        makhuyenmai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Mã Khuyến mãi");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Ngày Áp Dụng(0001-mm-dd)");

        ngayapdung.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Phần Trăm Giảm");

        phantramgiam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm Khuyến Mãi");

        them.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        them.setText("Thêm");
        them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themMouseClicked(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset.setText("Làm lại");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit.setText("Thoát");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(63, 63, 63)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phantramgiam, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngayapdung, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(exit)
                        .addGap(34, 34, 34)
                        .addComponent(reset)
                        .addGap(30, 30, 30)
                        .addComponent(them)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(makhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ngayapdung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(phantramgiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reset)
                        .addComponent(them)
                        .addComponent(exit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themMouseClicked
        // TODO add your handling code here:
        if (makhuyenmai.getText().compareTo("") ==0 ) {
            JOptionPane.showMessageDialog(null, "Mời nhập lại mã khuyến mãi!");
            makhuyenmai.requestFocus();
            return;
        }
        try {
            int tmp = Integer.valueOf(makhuyenmai.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã khuyến mãi phải là số!");
            makhuyenmai.requestFocus();
            return;
        }
        if (ngayapdung.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập ngày áp dụng!");
            ngayapdung.requestFocus();
            return;
        }
        try {
            LocalDate lc = LocalDate.parse(ngayapdung.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mời nhập lại định dạng ngày là yyyy-mm-dd");
            ngayapdung.requestFocus();
            return;
        }
        if (phantramgiam.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập phần trăm giảm!");
            phantramgiam.requestFocus();
            return;
        }
         try {
            int tmp = Integer.valueOf(phantramgiam.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Phần trăm giảm phải là số!");
            phantramgiam.requestFocus();
            return;
        }
        if (Integer.valueOf(phantramgiam.getText())<0 || Integer.valueOf(phantramgiam.getText()) >100 ) {
            JOptionPane.showMessageDialog(null, "Phần trăm giảm phải từ 0 đến 100%. Mời nhập lại!");
            phantramgiam.requestFocus();
            return;
        }
        if (khuyenmaibus.checkKM(makhuyenmai.getText())) {
            JOptionPane.showMessageDialog(null, "Mã khuyến mãi đã tồn tại, mời nhập lại!");
            makhuyenmai.setText("");
            makhuyenmai.requestFocus();
            return;
        }
        KhuyenMai km = new KhuyenMai(Integer.valueOf(makhuyenmai.getText()),
                                    LocalDate.parse(ngayapdung.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                                    Integer.valueOf(phantramgiam.getText()));
        boolean ok = khuyenmaibus.addKM(km);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            makhuyenmai.setText("");
            ngayapdung.setText("");
            phantramgiam.setText("");
            makhuyenmai.requestFocus();
            return;
        }
        JOptionPane.showMessageDialog(null, "Không thể thêm.Error!!!");
    }//GEN-LAST:event_themMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
       int a = JOptionPane.showConfirmDialog(null, "Bạn có thưc sự muốn thoát","",0);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        makhuyenmai.setText("");
        ngayapdung.setText("");
        phantramgiam.setText("");
    }//GEN-LAST:event_resetMouseClicked

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
            java.util.logging.Logger.getLogger(ThemKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton exit;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField makhuyenmai;
    private javax.swing.JTextField ngayapdung;
    private javax.swing.JTextField phantramgiam;
    private javax.swing.JButton reset;
    private javax.swing.JButton them;
    // End of variables declaration//GEN-END:variables
private void initialization() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}