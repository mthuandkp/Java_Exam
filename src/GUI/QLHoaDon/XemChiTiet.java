/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLHoaDon;

import BUS.ChiTietHoaDonBus;
import BUS.HoaDonBus;
import GUI.QLPhieuNhap.*;
import BUS.KhachHangBus;
import BUS.KhuyenMaiBus;
import BUS.NhanVienBus;
import BUS.SachBus;
import BUS.TaiKhoanBus;
import DTO.ChiTietHoaDon;
import DTO.HoaDon;
import DTO.NhanVien;
import ProcessingFunction.SendEmail;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHTHUAN
 */
public class XemChiTiet extends javax.swing.JFrame {

    ChiTietHoaDonBus cthdbus = new ChiTietHoaDonBus();
    HoaDonBus hdbus = new HoaDonBus();
    NhanVienBus nvbus = new NhanVienBus();
    KhachHangBus khbus = new KhachHangBus();
    KhuyenMaiBus kmbus = new KhuyenMaiBus();
    SachBus sachbus = new SachBus();
    TaiKhoanBus tkbus = new TaiKhoanBus();

    NhanVien nhanvien = null;

    /**
     * Creates new form XemChiTiet
     */
    public XemChiTiet() {
        initComponents();
        initialization();
    }

    public XemChiTiet(HoaDon bill, ArrayList<ChiTietHoaDon> data, NhanVien nv) {
        setNhanvien(nv);
        initComponents();
        initialization();
        performEvent(bill);
        loadContent(bill, data);
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        nameStaff = new javax.swing.JLabel();
        idSale = new javax.swing.JLabel();
        nameCus = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contentScroll = new javax.swing.JScrollPane();
        time = new javax.swing.JLabel();
        processBtn = new javax.swing.JButton();
        saleId = new javax.swing.JLabel();
        sumPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameStaff.setText("Tên nhân viên");
        background.add(nameStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 119, -1, -1));

        idSale.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idSale.setText("Mã hóa đơn");
        background.add(idSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        nameCus.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameCus.setText("Tên khách hàng");
        background.add(nameCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 156, -1, -1));

        date.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        date.setText("Ngày Lập");
        background.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        status.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        status.setText("Trạng Thái");
        background.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TIẾT HÓA ĐƠN");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1042, -1));

        contentScroll.setBackground(new java.awt.Color(255, 255, 255));
        contentScroll.setPreferredSize(new java.awt.Dimension(900, 452));
        background.add(contentScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 233, -1, 439));

        time.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        time.setText("Giờ Lập");
        background.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        processBtn.setBackground(new java.awt.Color(255, 255, 255));
        processBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        processBtn.setForeground(new java.awt.Color(255, 51, 51));
        processBtn.setText("Xử Lý Hóa Đơn");
        background.add(processBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        saleId.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        saleId.setText("Mã khuyến mãi");
        background.add(saleId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        sumPrice.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sumPrice.setForeground(new java.awt.Color(255, 0, 51));
        sumPrice.setText("Tổng :0");
        background.add(sumPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 440, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(XemChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemChiTiet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane contentScroll;
    private javax.swing.JLabel date;
    private javax.swing.JLabel idSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameCus;
    private javax.swing.JLabel nameStaff;
    private javax.swing.JButton processBtn;
    private javax.swing.JLabel saleId;
    private javax.swing.JLabel status;
    private javax.swing.JLabel sumPrice;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.contentScroll.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
    }

    private void loadContent(HoaDon bill, ArrayList<ChiTietHoaDon> data) {
        this.idSale.setText("Mã hóa đơn : " + String.valueOf(bill.getMaHoaDon()));
        nameCus.setText("Tên khách hàng : " + khbus.getNameById(bill.getMaKhachHang()));
        nameStaff.setText("Tên nhân viên : " + nvbus.getNameById(bill.getMaNhanVien()));
        saleId.setText("Mã khuyến mãi : " + bill.getMaKhuyenMai());
        date.setText("Ngày :" + bill.getNgayLap().toString());
        time.setText("Thời gian : " + bill.getGioLap().toString());
        String statusBill = "";
        switch (bill.getTrangThai()) {
            case 0: {
                statusBill = "Đang chờ xử lý";
                processBtn.setVisible(true);
                break;
            }
            case 1: {
                statusBill = "Đã xử lý";
                processBtn.setVisible(false);
                break;
            }
            case 2: {
                statusBill = "Đã nhận được";
                processBtn.setVisible(false);
                break;
            }
        }
        status.setText("Trạng thái : " + statusBill);

        Container con = new Container();
        for (ChiTietHoaDon ct : data) {
            JPanel p = new contentDetail(ct);
            con.add(p);
        }
        con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
        contentScroll.getViewport().setView(con);

        int sum = 0;
        int decreaseSale = kmbus.getDecreaseById(bill.getMaKhuyenMai());
        for (ChiTietHoaDon ct : data) {
            sum += ct.getSoLuong() * sachbus.getPriceBookFromId(ct.getMaSach()) * (1 - sachbus.getDereaseSale(ct.getMaSach()) / 100.0);
        }
        if (decreaseSale == 0) {
            sumPrice.setText("Tổng : " + ProcessingFunction.Other.convetNumberToMoney(String.valueOf(sum)));
            return;
        }
        int price = (int) (sum * (1 - decreaseSale / 100.0));

        sumPrice.setText("Tổng : "
                + ProcessingFunction.Other.convetNumberToMoney(String.valueOf(price))
                + "(" + ProcessingFunction.Other.convetNumberToMoney(String.valueOf(sum)) + ")");
    }

    private void performEvent(HoaDon bill) {
        processBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hdbus.updateStatus(bill.getMaHoaDon()) && hdbus.updateStaff(bill.getMaHoaDon(), nhanvien.getMaNhanVien())) {
                    String html = "<div style=\"width: 80%;margin-left: 10%;background-color: rgb(226, 224, 224);border-radius: 2rem;height: 20rem;\">\n"
                            + "<div style=\"background-color: cadetblue;height: 4rem;border-top-left-radius: 2rem;border-top-right-radius: 2rem;\">\n"
                            + "<h1 style=\"width: 100%;text-align: center;color: rgb(255, 255, 255);padding-top: 1rem;\">THONG BAO DON HANG DA DUOC XAC NHAN</h1>\n"
                            + "</div>\n"
                            + "<h1 style=\"width: 100%;text-align: center;color:blue;\">Don hang " + bill.getMaHoaDon() + " cua quy khac da duoc xac nhan</h1>\n"
                            + "</div>";
                    try {
                        SendEmail send = new SendEmail(tkbus.getNameById(bill.getMaKhachHang()), "Thong bao xac nhan", html);
                        send.run();

                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                    JOptionPane.showMessageDialog(null, "Cập nhật trạng thái thành công");
                    processBtn.setVisible(false);
                    status.setText("Trạng thái : Đã xử lý");
                    nameStaff.setText("Tên nhân Viên : " + nvbus.getNameById(nhanvien.getMaNhanVien()));
                    return;
                }
                JOptionPane.showMessageDialog(null, "Cập nhật trạng thái không thành công");
            }
        });
    }

}