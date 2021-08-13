/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.KhachHang;

import GUI.QLPhieuNhap.*;
import BUS.SachBus;
import DTO.ChiTietHoaDon;
import DTO.ChiTietPhieuNhap;
import DTO.Sach;
import ProcessingFunction.CopyImage;
import ProcessingFunction.Other;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author MINHTHUAN
 */
public class contentDetailCart extends javax.swing.JPanel {
    SachBus sachbus = new SachBus();
    /**
     * Creates new form contentDetail
     */
    public contentDetailCart() {
        initComponents();
    }
    
    public contentDetailCart(ChiTietHoaDon ct) {
        initComponents();
        this.setSize(900,1000);
        Sach s = sachbus.getBookById(ct.getMaSach());
        bookId.setText("Mã sách : " + String.valueOf(s.getMaSach()));
        bookName.setText("Tên sách : " + String.valueOf(s.getTenSach()));
        bookPrice.setText("Giá sách : " + String.valueOf(s.getGia()));
        bookDecrease.setText("Phần trăm giảm : " + String.valueOf(s.getPhanTramGiamGia()));
        bookNumberSelect.setValue(ct.getSoLuong());
        finallPrice.setText("Thành tiền : " 
                + Other.convetNumberToMoney(String.valueOf((int)(s.getGia()*ct.getSoLuong()*(1-s.getPhanTramGiamGia()/100.0))))
                +"("
                + Other.convetNumberToMoney(String.valueOf((int)(s.getGia()*ct.getSoLuong())))
                +")"
        );
        image.setSize(80, 100);
        image.setIcon(new ImageIcon(CopyImage.resizeImage("./src/Book_Image/" + s.getHinhAnh(), image)));
        bookNumberSelect.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //System.out.println(bookNumberSelect.getValue());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        bookId = new javax.swing.JLabel();
        bookName = new javax.swing.JLabel();
        bookNumber = new javax.swing.JLabel();
        bookDecrease = new javax.swing.JLabel();
        bookNumberSelect = new javax.swing.JSpinner();
        finallPrice = new javax.swing.JLabel();
        bookPrice = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book_Image/empty.png"))); // NOI18N

        bookId.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookId.setText("Mã sách");

        bookName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookName.setText("Tên Sách");

        bookNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookNumber.setText("Số lượng");

        bookDecrease.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bookDecrease.setText("% Giảm giá :");

        bookNumberSelect.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookNumberSelect.setEditor(new javax.swing.JSpinner.NumberEditor(bookNumberSelect, ""));

        finallPrice.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        finallPrice.setForeground(new java.awt.Color(255, 0, 51));
        finallPrice.setText("Thành tiền :");

        bookPrice.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookPrice.setText("Giá");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xóa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(bookNumberSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookDecrease, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(finallPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bookDecrease))
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addComponent(finallPrice))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookId)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNumber)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bookNumberSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookName)
                        .addGap(22, 22, 22)
                        .addComponent(bookPrice))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookDecrease;
    private javax.swing.JLabel bookId;
    private javax.swing.JLabel bookName;
    private javax.swing.JLabel bookNumber;
    private javax.swing.JSpinner bookNumberSelect;
    private javax.swing.JLabel bookPrice;
    private javax.swing.JLabel finallPrice;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
