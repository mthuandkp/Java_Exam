/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLTaiKhoanKH;

import BUS.TaiKhoanBus;
import DTO.TaiKhoan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHTHUAN
 */
public class TimKiem extends javax.swing.JFrame {

    TaiKhoanBus tkbus = new TaiKhoanBus();

    /**
     * Creates new form TimKiem
     */
    public TimKiem() {
        initComponents();
        initialization();
        performEvent();
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
        jLabel1 = new javax.swing.JLabel();
        idValue = new javax.swing.JComboBox<>();
        userValue = new javax.swing.JTextField();
        userCheck = new javax.swing.JCheckBox();
        idCheck = new javax.swing.JCheckBox();
        statusCheck = new javax.swing.JCheckBox();
        statusValue = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tìm kiếm Tài Khoản");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 90));

        idValue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(idValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 270, -1));

        userValue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(userValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 270, -1));

        userCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        userCheck.setText("Tên đăng nhập");
        jPanel1.add(userCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        idCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idCheck.setText("Mã khách hàng");
        jPanel1.add(idCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        statusCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        statusCheck.setText("Trạng thái");
        jPanel1.add(statusCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        statusValue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(statusValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 270, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 830, 400));

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(102, 102, 102));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_50px.png"))); // NOI18N
        searchBtn.setText("Tìm Kiếm");
        searchBtn.setBorder(null);
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox idCheck;
    private javax.swing.JComboBox<String> idValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JCheckBox statusCheck;
    private javax.swing.JComboBox<String> statusValue;
    private javax.swing.JTable table;
    private javax.swing.JCheckBox userCheck;
    private javax.swing.JTextField userValue;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        loadCombobox();
        initTable();
    }

    private void loadCombobox() {
        ArrayList<TaiKhoan> data = tkbus.getAllData();

        for (TaiKhoan tk : data) {
            idValue.addItem(String.valueOf(tk.getMaKhachHang()));
        }

        statusValue.addItem("Đang hoạt dộng");
        statusValue.addItem("Bị khóa");
    }

    private void initTable() {
        String[] header = {"Tên đăng nhập", "Mã khách hàng", "Trạng thái"};
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();

        Arrays.stream(header).forEach(s -> {
            defaults.addColumn(s);
        });

        table.setRowHeight(25);
    }

    private void performEvent() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "Tìm Kiếm": {
                        int id = 0;
                        String username = "";
                        int status = -1;

                        if (userCheck.isSelected() && userValue.getText().compareTo("") == 0) {
                            JOptionPane.showMessageDialog(null, "Tên tài khoản cần tìm không được để trống");
                            return;
                        }

                        if (idCheck.isSelected()) {
                            id = Integer.valueOf(String.valueOf(idValue.getSelectedItem()));
                        }
                        if (userCheck.isSelected()) {
                            username = userValue.getText();
                        }
                        if (statusCheck.isSelected()) {
                            status = statusValue.getSelectedIndex();
                        }

                        ArrayList<TaiKhoan> data = tkbus.searchData(id, username, status);
                        loadDataTable(data);
                        break;
                    }
                }
            }

        };
        searchBtn.addActionListener(ac);
        searchBtn.setActionCommand(searchBtn.getActionCommand());
    }

    private void loadDataTable(ArrayList<TaiKhoan> data) {
        removeAllTableData();
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        
        
        for(TaiKhoan tk : data){
            Object []obj = new Object[3];
            obj[0] = tk.getTenDangNhap();
            obj[1] = tk.getMaKhachHang();
            obj[2] = tk.isTrangThai();
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
