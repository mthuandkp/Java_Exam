/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLKhachHang;

import BUS.KhachHangBus;
import DTO.KhachHang;
import DTO.NhanVien;
import ProcessingFunction.WriteExcel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHTHUAN
 */
public class QuanLyKhachHang extends javax.swing.JPanel {
    KhachHangBus khbus = new KhachHangBus();
    NhanVien nv = null;
    /**
     * Creates new form DefaultPanel
     */
    public QuanLyKhachHang() {
        initComponents();
        initialization();
        performEvent();
    }
    
    public QuanLyKhachHang(NhanVien nhanvien) {
        setNv(nhanvien);
        initComponents();
        initialization();
        performEvent();
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        exportExcelBtn = new javax.swing.JButton();
        exportPdfBtn2 = new javax.swing.JButton();
        editBtn1 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        statisticalBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1120, 660));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBackground(new java.awt.Color(254, 254, 254));
        table.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1030, 450));

        exportExcelBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exportExcelBtn.setForeground(new java.awt.Color(153, 51, 255));
        exportExcelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/export_csv_60px.png"))); // NOI18N
        exportExcelBtn.setText("Xuất Excel");
        exportExcelBtn.setBorder(null);
        add(exportExcelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, 180, -1));

        exportPdfBtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exportPdfBtn2.setForeground(new java.awt.Color(153, 51, 255));
        exportPdfBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_50px.png"))); // NOI18N
        exportPdfBtn2.setText("Tìm Kiếm");
        exportPdfBtn2.setBorder(null);
        add(exportPdfBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 180, -1));

        editBtn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        editBtn1.setForeground(new java.awt.Color(153, 51, 255));
        editBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh_64px.png"))); // NOI18N
        editBtn1.setText("Cập nhật");
        editBtn1.setBorder(null);
        add(editBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, -1));

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(153, 51, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_48px.png"))); // NOI18N
        deleteBtn.setText("Mở/Khóa");
        deleteBtn.setBorder(null);
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, -1));

        statisticalBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        statisticalBtn.setForeground(new java.awt.Color(153, 51, 255));
        statisticalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/area_chart_48px.png"))); // NOI18N
        statisticalBtn.setText("Thống kê");
        statisticalBtn.setBorder(null);
        add(statisticalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 180, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn1;
    private javax.swing.JButton exportExcelBtn;
    private javax.swing.JButton exportPdfBtn2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton statisticalBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        //Define size for JPanel
        this.setSize(1120, 660);
        initTable();
        loadTableData();
        
    }
    
    private void performEvent() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(e.getActionCommand()){
                   case "Mở/Khóa":{
                       if(nv == null || nv.getMaQuyen() != 1){
                           JOptionPane.showMessageDialog(null, "Bạn không đủ quyền để sử dụng chức năng này");
                           System.out.println(nv);
                            return;
                       }
                        new KhoaTaiKhoan().setVisible(true);
                        break;
                    }
                    case "Tìm Kiếm":{
                        new TimKiem().setVisible(true);
                        break;
                    }
                    case "Cập nhật":{
                        loadTableData();
                        JOptionPane.showMessageDialog(null, "Đã reload");
                        break;
                    }
                    case "Thống kê":{
                        new ThongKe().setVisible(true);
                        break;
                    }
                    case "Xuất Excel":{
                        WriteExcel write = new WriteExcel();
                        write.writeCustomer();
                        break;
                    }
                    
                }
            }
        };
        
        Arrays.stream(this.getComponents()).forEach(c ->{
            if(c instanceof JButton){
                ((JButton)c).addActionListener(ac);
                ((JButton)c).setActionCommand(((JButton)c).getActionCommand());
            }
        });
    }
    
    private void initTable() {
        String []header = {"Mã khách hàng","Tên khách hàng","Ngày sinh","Địa chỉ","Sdt","Tên đăng nhập","Mật khẩu","Trạng Thái"};
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        Arrays.stream(header).forEach(s -> {
            defaults.addColumn(s);
        });

        table.setRowHeight(25);
    }

    private void loadTableData() {
        removeAllTableData();
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        ArrayList <KhachHang> arrKH = khbus.getAllData();
        
        for(KhachHang arr: arrKH)
        {
            Object [] arrO = new Object[8];
            arrO[0] = arr.getMaKhachHang();
            arrO[1] = arr.getTenKhachHang();
            arrO[2] = arr.getNgaySinh().toString();
            arrO[3] = arr.getDiaChi();
            arrO[4] = arr.getSDT();
            arrO[5] = arr.getTenDangNhap();
            arrO[6] = arr.getMatKhau();
            arrO[7] = arr.isTrangThai();
            defaults.addRow(arrO);
        }
        
        
    }

    private void removeAllTableData() {
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        for (int i = defaults.getRowCount() - 1; i >= 0; i--) {
            defaults.removeRow(i);
        }
    }
}
