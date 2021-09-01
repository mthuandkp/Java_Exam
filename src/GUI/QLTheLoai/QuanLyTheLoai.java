/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLTheLoai;
import BUS.TheLoaiBus;
import DTO.NhanVien;
import DTO.TheLoai;
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
public class QuanLyTheLoai extends javax.swing.JPanel {
    TheLoaiBus theloaibus = new TheLoaiBus();
    NhanVien nv = null;
    /**
     * Creates new form DefaultPanel
     */
    public QuanLyTheLoai() {
        initComponents();
        initialization();
        performEvent();
    }
    
    public QuanLyTheLoai(NhanVien nhanvien) {
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
        editBtn1 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1120, 660));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1030, 450));

        editBtn1.setBackground(new java.awt.Color(255, 255, 255));
        editBtn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        editBtn1.setForeground(new java.awt.Color(153, 51, 255));
        editBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh_64px.png"))); // NOI18N
        editBtn1.setText("Cập nhật");
        editBtn1.setBorder(null);
        add(editBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 180, -1));

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addBtn.setForeground(new java.awt.Color(153, 51, 255));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        addBtn.setText("Thêm");
        addBtn.setBorder(null);
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 50));

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        editBtn.setForeground(new java.awt.Color(153, 51, 255));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit_48px.png"))); // NOI18N
        editBtn.setText("Sửa");
        editBtn.setBorder(null);
        add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, 50));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton editBtn1;
    private javax.swing.JScrollPane jScrollPane1;
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
                    case "Thêm":{
                        if(nv == null || nv.getMaQuyen() != 1){
                            JOptionPane.showMessageDialog(null, "Bạn không có đủ quyền để sử dụng chức năng này");
                            return;
                        }
                        new GUI.QLSach.theloai().setVisible(true);
                        break;
                    }
                    case "Sửa":{
                        if(nv == null || nv.getMaQuyen() != 1){
                            JOptionPane.showMessageDialog(null, "Bạn không có đủ quyền để sử dụng chức năng này");
                            return;
                        }
                        new SuaTheLoai().setVisible(true);
                        break;
                    }
                    case "Cập nhật":{
                        loadTableData();
                        JOptionPane.showMessageDialog(null, "Đã cập nhật");
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
        String []header = {"Mã thể loại","Tên thể loại"};
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        
        Arrays.stream(header).forEach(s -> {
            defaults.addColumn(s);
        });

        table.setRowHeight(25);
    }

    private void loadTableData() {
        removeAllTableData();
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        ArrayList<TheLoai> data = theloaibus.getAllType();
        
        for(TheLoai tl : data){
            Object []obj = new Object[3];
            obj[0] = tl.getMaTheLoai();
            obj[1] = tl.getTenTheLoai();
            defaults.addRow(obj);
        }
    }
    
    private void removeAllTableData() {
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        for (int i = defaults.getRowCount() - 1; i >= 0; i--) {
            defaults.removeRow(i);
        }
    }
    
   
}
