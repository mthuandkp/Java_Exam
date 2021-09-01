/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLKhachHang;

import BUS.KhachHangBus;
import DTO.KhachHang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MINHTHUAN
 */
public class KhoaTaiKhoan extends javax.swing.JFrame {
    KhachHangBus khbus = new KhachHangBus();
    /**
     * Creates new form KhoaTaiKhoan
     */
    public KhoaTaiKhoan() {
        initComponents();
        initialization();
        event();
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
        jLabel6 = new javax.swing.JLabel();
        numberkh = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnchange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Mã khách hàng");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        numberkh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(numberkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 270, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Trạng thái");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        status.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 270, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mở/Khóa Tài Khoản");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 90));

        btnchange.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnchange.setText("Thay đổi");
        jPanel1.add(btnchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(KhoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhoaTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> numberkh;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        loadCombobox();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    private void loadCombobox() {
        ArrayList <KhachHang> arrKH = khbus.getAllData();
        numberkh.addItem("[Lựa Chọn]");
        for(KhachHang arr: arrKH)
        {
            numberkh.addItem(String.valueOf(arr.getMaKhachHang()));
        }
        
        status.addItem("Đang Hoạt Động");
        status.addItem("Bị Khóa");
    }

    private void event() {
       numberkh.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(numberkh.getSelectedIndex()==0)
               {
                   status.setSelectedIndex(0);
                   return;
               }
               int id  = Integer.valueOf(String.valueOf(numberkh.getSelectedItem()));
               KhachHang kh = khbus.getKHById(id);
               boolean st = kh.isTrangThai();
               status.setSelectedIndex((st==true)?0:1);
           }
           
       });
        btnchange.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(numberkh.getSelectedIndex()==0)
               {
                   JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng !! ");
                   return;
               }
               int id  = Integer.valueOf(String.valueOf(numberkh.getSelectedItem()));
               
               boolean st = status.getSelectedIndex()==0 ? true : false;
               boolean ok = khbus.Update(id, st);
               if(ok)
               {
                   JOptionPane.showMessageDialog(null, "Sửa thành công ");
                   return;
               }
               JOptionPane.showMessageDialog(null, "Không thể sửa");
           }
       });
    }
    
   
}
