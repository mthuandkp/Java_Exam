/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import GUI.QLHoaDon.*;
import GUI.QLPhieuNhap.*;
import BUS.SachBus;
import DTO.ChiTietHoaDon;
import DTO.ChiTietPhieuNhap;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author MINHTHUAN
 */
public class contentDetailViewMore extends javax.swing.JPanel {
    SachBus sachbus = new SachBus();
    /**
     * Creates new form contentDetail
     */
    public contentDetailViewMore() {
        initComponents();
    }
    
    public contentDetailViewMore(ChiTietHoaDon ctpn) {
        initComponents();
        this.setSize(900,100);
        bookName.setText("Tên Sách :"+ sachbus.getNameById(ctpn.getMaSach()));
        bookNumber.setText("Số Lượng :"+String.valueOf(ctpn.getSoLuong()));
        bookPrice.setText("Giá :"+String.valueOf(sachbus.getPriceBookFromId(ctpn.getMaSach())));
        image.setSize(80, 100);
        image.setIcon(new ImageIcon(ProcessingFunction.CopyImage.resizeImage("./src/Book_Image/" + sachbus.getImageById(ctpn.getMaSach()), image)));
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
        image = new javax.swing.JLabel();
        bookPrice = new javax.swing.JLabel();
        bookName = new javax.swing.JLabel();
        bookNumber = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 100));

        bookPrice.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookPrice.setForeground(new java.awt.Color(255, 0, 51));
        bookPrice.setText("Giá");
        jPanel1.add(bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 330, -1));

        bookName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookName.setText("Tên Sách");
        jPanel1.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 730, -1));

        bookNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookNumber.setText("Số lượng");
        jPanel1.add(bookNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookName;
    private javax.swing.JLabel bookNumber;
    private javax.swing.JLabel bookPrice;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
